package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    
    private Connection con;

    public DAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lmanager", "root", "");            
        } catch (ClassNotFoundException | SQLException e) {
        }           
    }
    
    public int getTamanhoTabela(String tableName) {
        ResultSet rs = this.consultar(new String[]{tableName}, null, null, null, null, null);
        int contador = 0;
        try {
            while (rs.next()) {
                contador++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contador;
    }
    
    public boolean incluir(String tableName, String[] aFields, ArrayList aValues) {
        if (aValues == null || tableName == null) {
            return false;
        }
        String columns = "";
        String values = "";
        if (aFields != null) {
            columns += "(";
            for (int i = 0; i < aFields.length; i++) {
                columns += aFields[i] + (i < aValues.size() - 1 ? ", " : "");
            }
            columns += ")";
        }
        for (int i = 0; i < aValues.size(); i++) {
            values += (aValues.get(i) == null ? "null" : aValues.get(i).getClass().getName().equals("java.lang.String") ? "'" + aValues.get(i) + "'" : aValues.get(i));
            values += (i < aValues.size() - 1 ? ", " : "");
        }
        try {
        java.sql.Statement st = this.con.createStatement();
            if (!this.consultar(new String[]{tableName}, null, null, aFields, aValues, null).next()) {
                st.executeUpdate("insert into " + tableName + columns + " values (" + values + ")");
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean alterar(String tableName, String[] aAlterFields, ArrayList aValues, String[] compPK, ArrayList valPK) {
        if (aAlterFields == null || aValues == null || tableName == null) {
            return false;
        }
        String set = "";
        for (int i = 0; i < aAlterFields.length; i++) {
            if (aValues.get(i) != null) {
                set += aAlterFields[i] + " = " +
                        (aValues.get(i).getClass().getName().equals("java.lang.String") ? "'" + aValues.get(i) + "'" : aValues.get(i));
                set += (i < aValues.size() - 1 ? ", " : "");
            }
        }
        String where = this.clausulaWhere(compPK, valPK);
        where = (where.equals("") ? "" : " where ") + where;
        try {
            java.sql.Statement st = this.con.createStatement();
            if (!this.consultar(new String[]{tableName}, null, null, compPK, valPK, null).next()) {
                return false;
            } else {
                String query = "update " + tableName +
                        " set " + set +
                        " " + where;
                st.executeUpdate(query);
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean excluir(String tableName, String[] compPK, ArrayList valPK) {
        if (tableName == null) {
            return false;
        }
        String where = this.clausulaWhere(compPK, valPK);
        where = (where.equals("") ? "" : "where ") + where;
        try {
            java.sql.Statement st = this.con.createStatement();        
            if (!this.consultar(new String[]{tableName}, null, null, compPK, valPK, null).next()) {
                return false;
            } else {
                String query = "delete from " + tableName + " " + where;
                st.executeUpdate(query);  
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public ResultSet consultar(String[] tableName, ArrayList<String[]> joinWhere, String[] camposFiltro, String[] aFields, ArrayList aValues, int[] orderingBy) {
        if (tableName == null) {
            return null;
        }
        String campos = "";
        if (camposFiltro == null) {
            campos += "*";
        } else {
            for (int i = 0; i < camposFiltro.length; i++) {
               campos += camposFiltro[i] + (i < camposFiltro.length - 1 ? ", " : "");
            }
        }
        String from = "";
        for (int i = 0; i < tableName.length; i++) {
            from += tableName[i] + (i < tableName.length - 1 ? ", " : "");
        }
        String whereJoin = "";
        if (joinWhere != null) {
            whereJoin += "where (";
            for (int i = 0; i < joinWhere.size(); i++) {
                whereJoin += joinWhere.get(i)[0] + " = " + joinWhere.get(i)[1];
                if ((i < joinWhere.size() - 1) && (joinWhere.size() > 1)) {
                    whereJoin += "\n and ";
                }
            }
            whereJoin += ")";
        }
        String where = ((!whereJoin.equals("") && aFields != null) ? " and " : (aFields == null ? "" : "where ")) + this.clausulaWhere(aFields, aValues);
        String order = "";
        if (orderingBy != null) {
            order += "order by ";
            for (int i = 0; i < orderingBy.length; i++) {
                order += orderingBy[i] + (i < orderingBy.length - 1 ? ", " : "");
            }
        }
        String query = "select " + campos + "\n" +
                " from " + from + "\n" +
                whereJoin + " " + where + "\n" +
                order;
        try {
            java.sql.Statement st = this.con.createStatement();
            st.executeQuery(query);
            ResultSet rs = st.getResultSet();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public ResultSet consultar(String sql) {
        try {
            java.sql.Statement st = this.con.createStatement();
            st.executeQuery(sql);
            ResultSet rs = st.getResultSet();
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String clausulaWhere(String[] aFields, ArrayList aValues) { //De parêntesis a parêntesis
        String where = "";
        if (aFields != null && aFields != null) {
            where += "(";
            for (int i = 0; i < aFields.length; i++) {
                if (aValues.get(i) == null) {
                    where += aFields[i] + " is not null";
                } else {
                    where += aFields[i] + (aValues.get(i).getClass().getName().equals("java.lang.String") ? " = '" + aValues.get(i) + "'" :
                            (aValues.get(i).getClass().getName().equals("java.lang.Double") ? " >= " + (Double.parseDouble(String.valueOf(aValues.get(i)))-0.0001) + " and " + aFields[i] + " <= " + (Double.parseDouble(String.valueOf(aValues.get(i)))+0.0001) :
                            " = " + aValues.get(i)));
                }
                if ((i < aFields.length - 1) && (aFields.length > 1)) {
                    where += "\n and ";
                }
            }
            where += ")";
        }
        return where;
    }
    
    public String[] getCamposBD(String tableName, boolean incluirAtributosAI) {
        switch (tableName) {
            case "COMPUTADOR":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "ID_PROCESSADOR", "ID_MEMORIA", "ID_PLACA_VIDEO", "SISTEMA_OPERACIONAL", "TEM_WEBCAM", "TEM_WIRELESS"};                    
                } else {
                    return new String[]{"ID_PROCESSADOR", "ID_MEMORIA", "ID_PLACA_VIDEO", "SISTEMA_OPERACIONAL", "TEM_WEBCAM", "TEM_WIRELESS"};
                }
            case "JOGO":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "NOME", "DESCRICAO", "MIN_REQ_PROCESSADOR", "MIN_REQ_MEMORIA", "MIN_REQ_PLACA_VIDEO", "REQ_SISTEMA_OPERACIONAL", "REQ_SISTEMA_OPERACIONAL_1", "REQ_SISTEMA_OPERACIONAL_2", "PRECISA_WIRELESS", "PRECISA_WEBCAM", "PRECO"};
                } else {
                    return new String[]{"NOME", "DESCRICAO", "MIN_REQ_PROCESSADOR", "MIN_REQ_MEMORIA", "MIN_REQ_PLACA_VIDEO", "REQ_SISTEMA_OPERACIONAL", "REQ_SISTEMA_OPERACIONAL_1", "REQ_SISTEMA_OPERACIONAL_2", "PRECISA_WIRELESS", "PRECISA_WEBCAM", "PRECO"};
                }
            case "MEMORIA":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "VALOR_CAPACIDADE", "UNIDADE_CAPACIDADE", "TECNOLOGIA", "FABRICANTE"};
                } else {
                    return new String[]{"VALOR_CAPACIDADE", "UNIDADE_CAPACIDADE", "TECNOLOGIA", "FABRICANTE"};
                }
            case "PLACA_VIDEO":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "ID_PROCESSADOR", "ID_MEMORIA", "FABRICANTE"};
                } else {
                    return new String[]{"ID_PROCESSADOR", "ID_MEMORIA", "FABRICANTE"};
                }
            case "PROCESSADOR":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "VALOR_FREQUENCIA", "UNIDADE_FREQUENCIA", "NUMERO_NUCLEOS", "FABRICANTE"};
                } else {
                    return new String[]{"VALOR_FREQUENCIA", "UNIDADE_FREQUENCIA", "NUMERO_NUCLEOS", "FABRICANTE"};
                }
            case "USUARIOS":
                if (incluirAtributosAI) {
                    return new String[]{"ID", "LOGIN", "EH_ADMINISTRADOR", "NOME"};
                } else {
                    return new String[]{"LOGIN", "EH_ADMINISTRADOR", "NOME"};
                }
            default:
                return null;
        }
    }
    
    public boolean registroSendoUsado(String[] tableNames, ArrayList<String[]> joinWhere, String[] aFieldsProcurar, ArrayList aValuesProcurar) {
        ResultSet rs = this.consultar(tableNames, joinWhere, null, aFieldsProcurar, aValuesProcurar, null);
        try {
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}