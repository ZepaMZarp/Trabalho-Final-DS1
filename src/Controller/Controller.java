package Controller;

import DAO.DAO;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Controller implements ActionListener {
    public static Usuario usuarioLogado;
    public static Computador computadorAtual = null;
    private final DAO dao;
    private Jogo jogoEscolhido = null;
    
    private final JFrameAlterarSenha jFrameAlterarSenha;
    private final JFrameComprarJogo jFrameComprarJogo;
    private final JFrameComputador jFrameComputador;
    private final JFrameConsultarJogos jFrameConsultarJogos;
    private final JFrameInicial jFrameInicial;
    private final JFrameJogo jFrameJogo;
    private final JFrameMemoria jFrameMemoria;
    private final JFramePlacaVideo jFramePlacaVideo;
    private final JFramePrincipal jFramePrincipal;
    private final JFrameProcessador jFrameProcessador;
    private final JFrameResultadoPesquisa jFrameResultadoPesquisa;
    private final JFrameUsuario jFrameUsuario;
    private final JFrameVerificacao jFrameVerificacao;
    
    public static ArrayList<Computador> computadores = new ArrayList<>();
    public static ArrayList<Jogo> jogos = new ArrayList<>();
    public static ArrayList<Memoria> memorias = new ArrayList<>();
    public static ArrayList<PlacaVideo> placasVideo = new ArrayList<>();
    public static ArrayList<Processador> processadores = new ArrayList<>();
    public static ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public static int iComp = 0;
    public static int iJogo = 0;
    public static int iMem = 0;
    public static int iPV = 0;
    public static int iProc = 0;
    public static int iUsu = 0;
    
    public Controller() throws SQLException {
        this.dao = new DAO();
        
        this.jFrameAlterarSenha = new JFrameAlterarSenha();
        this.jFrameComprarJogo = new JFrameComprarJogo();
        this.jFrameComputador = new JFrameComputador();
        this.jFrameConsultarJogos = new JFrameConsultarJogos();
        this.jFrameInicial = new JFrameInicial();
        this.jFrameJogo = new JFrameJogo();
        this.jFrameMemoria = new JFrameMemoria();
        this.jFramePlacaVideo = new JFramePlacaVideo();
        this.jFramePrincipal = new JFramePrincipal();
        this.jFrameProcessador = new JFrameProcessador();
        this.jFrameResultadoPesquisa = new JFrameResultadoPesquisa();
        this.jFrameUsuario = new JFrameUsuario();
        this.jFrameVerificacao = new JFrameVerificacao();
        
        this.adicionarActionListeners();
        this.jFrameInicial.setVisible(true);
    }

    private void adicionarActionListeners() {
        this.jFrameAlterarSenha.getjButtonConfirmar().addActionListener(this);
        this.jFrameAlterarSenha.getjButtonVoltar().addActionListener(this);
        
        this.jFrameComprarJogo.getjButtonFazerVerificacao().addActionListener(this);
        this.jFrameComprarJogo.getjButtonFechar().addActionListener(this);
        
        this.jFrameComputador.getjButtonAnterior().addActionListener(this);
        this.jFrameComputador.getjButtonEditar().addActionListener(this);
        this.jFrameComputador.getjButtonExcluir().addActionListener(this);
        this.jFrameComputador.getjButtonFechar().addActionListener(this);
        this.jFrameComputador.getjButtonGravar().addActionListener(this);
        this.jFrameComputador.getjButtonNovo().addActionListener(this);
        this.jFrameComputador.getjButtonProximo().addActionListener(this);
        
        this.jFrameConsultarJogos.getjButtonConsultar().addActionListener(this);
        this.jFrameConsultarJogos.getjButtonVoltar().addActionListener(this);
        
        this.jFrameInicial.getjButtonEntrar().addActionListener(this);
        this.jFrameInicial.getjButtonSair().addActionListener(this);
        
        this.jFrameJogo.getjButtonAdd().addActionListener(this);
        this.jFrameJogo.getjButtonAnterior().addActionListener(this);
        this.jFrameJogo.getjButtonEditar().addActionListener(this);
        this.jFrameJogo.getjButtonExcluir().addActionListener(this);
        this.jFrameJogo.getjButtonFechar().addActionListener(this);
        this.jFrameJogo.getjButtonGravar().addActionListener(this);
        this.jFrameJogo.getjButtonNovo().addActionListener(this);
        this.jFrameJogo.getjButtonProximo().addActionListener(this);
        this.jFrameJogo.getjButtonRemover().addActionListener(this);
        
        this.jFrameMemoria.getjButtonAnterior().addActionListener(this);
        this.jFrameMemoria.getjButtonEditar().addActionListener(this);
        this.jFrameMemoria.getjButtonExcluir().addActionListener(this);
        this.jFrameMemoria.getjButtonFechar().addActionListener(this);
        this.jFrameMemoria.getjButtonGravar().addActionListener(this);
        this.jFrameMemoria.getjButtonNovo().addActionListener(this);
        this.jFrameMemoria.getjButtonProximo().addActionListener(this);
        
        this.jFramePlacaVideo.getjButtonAnterior().addActionListener(this);
        this.jFramePlacaVideo.getjButtonEditar().addActionListener(this);
        this.jFramePlacaVideo.getjButtonExcluir().addActionListener(this);
        this.jFramePlacaVideo.getjButtonFechar().addActionListener(this);
        this.jFramePlacaVideo.getjButtonGravar().addActionListener(this);
        this.jFramePlacaVideo.getjButtonNovo().addActionListener(this);
        this.jFramePlacaVideo.getjButtonProximo().addActionListener(this);
        
        this.jFramePrincipal.getjButtonAlterarSenha().addActionListener(this);
        this.jFramePrincipal.getjButtonComprarJogo().addActionListener(this);
        this.jFramePrincipal.getjButtonConsolidarSelecao().addActionListener(this);        
        this.jFramePrincipal.getjButtonConsultarJogos().addActionListener(this);
        this.jFramePrincipal.getjButtonGerenciarUsuarios().addActionListener(this);
        this.jFramePrincipal.getjButtonLimparSelecao().addActionListener(this);
        this.jFramePrincipal.getjMenuItemAlterarSenha().addActionListener(this);
        this.jFramePrincipal.getjMenuItemComprarJogo().addActionListener(this);
        this.jFramePrincipal.getjMenuItemConsultarJogos().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarComputadores().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarJogos().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarMemorias().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarPlacasVideo().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarProcessadores().addActionListener(this);
        this.jFramePrincipal.getjMenuItemGerenciarUsuarios().addActionListener(this);
        this.jFramePrincipal.getjMenuItemSair().addActionListener(this);
        
        this.jFrameProcessador.getjButtonAnterior().addActionListener(this);
        this.jFrameProcessador.getjButtonEditar().addActionListener(this);
        this.jFrameProcessador.getjButtonExcluir().addActionListener(this);
        this.jFrameProcessador.getjButtonFechar().addActionListener(this);
        this.jFrameProcessador.getjButtonGravar().addActionListener(this);
        this.jFrameProcessador.getjButtonNovo().addActionListener(this);
        this.jFrameProcessador.getjButtonProximo().addActionListener(this);
        
        this.jFrameResultadoPesquisa.getjButtonVoltar().addActionListener(this);
        
        this.jFrameUsuario.getjButtonAnterior().addActionListener(this);
        this.jFrameUsuario.getjButtonEditar().addActionListener(this);
        this.jFrameUsuario.getjButtonExcluir().addActionListener(this);
        this.jFrameUsuario.getjButtonFechar().addActionListener(this);
        this.jFrameUsuario.getjButtonGravar().addActionListener(this);
        this.jFrameUsuario.getjButtonNovo().addActionListener(this);
        this.jFrameUsuario.getjButtonProximo().addActionListener(this);
        
        this.jFrameVerificacao.getjButtonComprar().addActionListener(this);
        this.jFrameVerificacao.getjButtonVoltar().addActionListener(this);
    }
    
    public int getIndiceArray(Object[] array, Object registro) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(registro)) {
                return i;
            }
        }
        return -1;
    }
    
    public void compararComputadorJogo() {
        ArrayList<String> listaRequer = new ArrayList<>();
        ArrayList<String> listaAtende = new ArrayList<>();
        int contRequer = 0;
        int contAtende = 0;
        boolean atendeSO = false;
        for (int i = 0; i < 3; i++) {
            if (this.jogoEscolhido.getReqSistemasOperacionais()[i].equals(Controller.computadorAtual.getSistemaOperacional())) {
                atendeSO = true;
                break;
            }
        }
        String[] unidadesMem = new String[]{"KB", "MB", "GB"};
        String[] unidadesProc = new String[]{"MHz", "GHz"};
        double valMemConvPC;
        double valProcConvPC;
        double valPVMemConvPC;
        double valPVProcConvPC;
        int indiceJogo = this.getIndiceArray(unidadesMem, this.jogoEscolhido.getMinReqMemoria().getUnidadeCapacidade());
        int indicePC = this.getIndiceArray(unidadesMem, Controller.computadorAtual.getMemoria().getUnidadeCapacidade());                    
        if (indiceJogo != indicePC) {
            if (indiceJogo > indicePC) {
                valMemConvPC = Controller.computadorAtual.getMemoria().getValorCapacidade() / Math.pow(1024, (indiceJogo - indicePC));
            } else {
                valMemConvPC = Controller.computadorAtual.getMemoria().getValorCapacidade() * Math.pow(1024, (indicePC - indiceJogo));
            }
        } else {
            valMemConvPC = this.jogoEscolhido.getMinReqMemoria().getValorCapacidade();
        }        
        indiceJogo = this.getIndiceArray(unidadesProc, this.jogoEscolhido.getMinReqProcessador().getUnidadeFrequencia());
        indicePC = this.getIndiceArray(unidadesProc, Controller.computadorAtual.getProcessador().getUnidadeFrequencia());                    
        if (indiceJogo != indicePC) {
            if (indiceJogo > indicePC) {
                valProcConvPC = Controller.computadorAtual.getProcessador().getValorFrequencia() / Math.pow(1024, (indiceJogo - indicePC));
            } else {
                valProcConvPC = Controller.computadorAtual.getProcessador().getValorFrequencia() * Math.pow(1024, (indicePC - indiceJogo));
            }
        } else {
            valProcConvPC = this.jogoEscolhido.getMinReqProcessador().getValorFrequencia();
        }
        indiceJogo = this.getIndiceArray(unidadesMem, this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getUnidadeCapacidade());
        indicePC = this.getIndiceArray(unidadesMem, Controller.computadorAtual.getPlacaVideo().getMemoria().getUnidadeCapacidade());                    
        if (indiceJogo != indicePC) {
            if (indiceJogo > indicePC) {
                valPVMemConvPC = Controller.computadorAtual.getPlacaVideo().getMemoria().getValorCapacidade() / Math.pow(1024, (indiceJogo - indicePC));
            } else {
                valPVMemConvPC = Controller.computadorAtual.getPlacaVideo().getMemoria().getValorCapacidade() * Math.pow(1024, (indicePC - indiceJogo));
            }
        } else {
            valPVMemConvPC = this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getValorCapacidade();
        }
        indiceJogo = this.getIndiceArray(unidadesProc, this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getUnidadeFrequencia());
        indicePC = this.getIndiceArray(unidadesProc, Controller.computadorAtual.getPlacaVideo().getProcessador().getUnidadeFrequencia());                    
        if (indiceJogo != indicePC) {
            if (indiceJogo > indicePC) {
                valPVProcConvPC = Controller.computadorAtual.getPlacaVideo().getProcessador().getValorFrequencia()/ Math.pow(1024, (indiceJogo - indicePC));
            } else {
                valPVProcConvPC = Controller.computadorAtual.getPlacaVideo().getProcessador().getValorFrequencia()* Math.pow(1024, (indicePC - indiceJogo));
            }
        } else {
            valPVProcConvPC = this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getValorFrequencia();
        }        
        if (atendeSO) {
            if (this.jogoEscolhido.getMinReqMemoria().getValorCapacidade() <= valMemConvPC) {
                listaAtende.add("Memória (" + Controller.computadorAtual.getMemoria().getValorCapacidade() + Controller.computadorAtual.getMemoria().getUnidadeCapacidade() + " x " + this.jogoEscolhido.getMinReqMemoria().getValorCapacidade() + this.jogoEscolhido.getMinReqMemoria().getUnidadeCapacidade() + ")");
                contAtende++;
            } else {
                listaRequer.add("Memória (" + Controller.computadorAtual.getMemoria().getValorCapacidade() + Controller.computadorAtual.getMemoria().getUnidadeCapacidade() + " x " + this.jogoEscolhido.getMinReqMemoria().getValorCapacidade() + this.jogoEscolhido.getMinReqMemoria().getUnidadeCapacidade() + ")");
                contRequer++;
            }
            if (this.jogoEscolhido.getMinReqProcessador().getValorFrequencia() <= valProcConvPC) {
                listaAtende.add("Processador (" + Controller.computadorAtual.getProcessador().getValorFrequencia() + Controller.computadorAtual.getProcessador().getUnidadeFrequencia() + " x " + this.jogoEscolhido.getMinReqProcessador().getValorFrequencia() + this.jogoEscolhido.getMinReqProcessador().getUnidadeFrequencia() + ")");
                contAtende += 2;
            } else {
                listaRequer.add("Processador (" + Controller.computadorAtual.getProcessador().getValorFrequencia() + Controller.computadorAtual.getProcessador().getUnidadeFrequencia() + " x " + this.jogoEscolhido.getMinReqProcessador().getValorFrequencia() + this.jogoEscolhido.getMinReqProcessador().getUnidadeFrequencia() + ")");
                contRequer += 2;
            }
            if (this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getValorCapacidade() <= valPVMemConvPC) {
                listaAtende.add("Memória - Placa de Vídeo (" + Controller.computadorAtual.getPlacaVideo().getMemoria().getValorCapacidade() + Controller.computadorAtual.getPlacaVideo().getMemoria().getUnidadeCapacidade() + " x " + this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getValorCapacidade() + this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getUnidadeCapacidade() + ")");
                contAtende++;
            } else {
                listaRequer.add("Memória - Placa de Vídeo (" + Controller.computadorAtual.getPlacaVideo().getMemoria().getValorCapacidade() + Controller.computadorAtual.getPlacaVideo().getMemoria().getUnidadeCapacidade() + " x " + this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getValorCapacidade() + this.jogoEscolhido.getMinReqPlacaVideo().getMemoria().getUnidadeCapacidade() + ")");
                contRequer++;
            }
            if (this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getValorFrequencia() <= valPVProcConvPC) {
                listaAtende.add("Processador - Placa de Vídeo (" + Controller.computadorAtual.getPlacaVideo().getProcessador().getValorFrequencia() + Controller.computadorAtual.getPlacaVideo().getProcessador().getUnidadeFrequencia() + " x " + this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getValorFrequencia() + this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getUnidadeFrequencia() + ")");
                contAtende += 2;
            } else {
                listaRequer.add("Processador - Placa de Vídeo (" + Controller.computadorAtual.getPlacaVideo().getProcessador().getValorFrequencia() + Controller.computadorAtual.getPlacaVideo().getProcessador().getUnidadeFrequencia() + " x " + this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getValorFrequencia() + this.jogoEscolhido.getMinReqPlacaVideo().getProcessador().getUnidadeFrequencia() + ")");
                contRequer += 2;
            }            
        } else {
            listaRequer.add("Sistema Operacional");
        }
        if (contRequer == 0 && contAtende == 0) {
            this.jFrameVerificacao.getjLabelPerformance().setText("NULA");
        } else if (contRequer > contAtende) {
            if (contRequer >= contAtende + 3) {
                this.jFrameVerificacao.getjLabelPerformance().setText("MUITO RUIM");
            } else {
                this.jFrameVerificacao.getjLabelPerformance().setText("RUIM");
            }
        } else if (contAtende >= contRequer) {
            if (contAtende >= contRequer + 3) {
                this.jFrameVerificacao.getjLabelPerformance().setText("MUITO BOA");
            } else {
                this.jFrameVerificacao.getjLabelPerformance().setText("BOA");
            }
        } else if (contRequer == contAtende && contRequer != 0) {
            this.jFrameVerificacao.getjLabelPerformance().setText("MÉDIA");
        }
        for (int i = 0; i < listaRequer.size(); i++) {
            this.jFrameVerificacao.getjLabelListaRequer(i+1).setText(listaRequer.get(i));
        }
        for (int i = listaRequer.size(); i < 4; i++) {
            this.jFrameVerificacao.getjLabelListaRequer(i+1).setText("");
        }
        for (int i = 0; i < listaAtende.size(); i++) {
            this.jFrameVerificacao.getjLabelListaAtende(i+1).setText(listaAtende.get(i));
        }        
        for (int i = listaAtende.size(); i < 4; i++) {
            this.jFrameVerificacao.getjLabelListaAtende(i+1).setText("");
        }
    }
    
    public void atualizarTabelaInicial() {
        Object[][] dados = new Object[Controller.computadores.size()][4];
        for (int i = 0; i < Controller.computadores.size(); i++) {
            dados[i][0] = Controller.computadores.get(i).getSistemaOperacional();
            dados[i][1] = Controller.computadores.get(i).getProcessador().getFabricante() + " - " + Controller.computadores.get(i).getProcessador().getValorFrequencia() + " " + Controller.computadores.get(i).getProcessador().getUnidadeFrequencia();
            dados[i][2] = Controller.computadores.get(i).getPlacaVideo().getFabricante() + " - " + Controller.computadores.get(i).getPlacaVideo().getProcessador().getValorFrequencia() + " " + Controller.computadores.get(i).getProcessador().getUnidadeFrequencia();
            dados[i][3] = Controller.computadores.get(i).getMemoria().getTecnologia() + " - " + Controller.computadores.get(i).getMemoria().getValorCapacidade() + " " + Controller.computadores.get(i).getMemoria().getUnidadeCapacidade();
        }
        this.jFramePrincipal.setModelComputadores(new DefaultTableModel(dados, new Object[]{"Sistema Operacional", "Processador", "Placa de Vídeo", "Memória"}));
        this.jFramePrincipal.getjTableComputadores().setModel(this.jFramePrincipal.getModelComputadores());                    
    }
    
    public Usuario validarLogin(String login, String senha) {
        Usuario usuario = null;
        ArrayList values = new ArrayList();
        values.add(login);
        values.add(senha);
        ResultSet tabela = this.dao.consultar(new String[]{"USUARIOS"}, null, null, new String[]{"LOGIN", "SENHA"}, values, new int[]{1});
        try {
            if (tabela.next()) {
                if (tabela.getString("EH_ADMINISTRADOR").equals("T")) {
                    usuario = new Administrador(tabela.getInt("ID"), tabela.getString("LOGIN"), tabela.getString("SENHA"), tabela.getString("NOME"));
                } else {
                    usuario = new Vendedor(tabela.getInt("ID"), tabela.getString("LOGIN"), tabela.getString("SENHA"), tabela.getString("NOME"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
    public void setComputadores() {
        Controller.computadores.clear();
        ArrayList<String[]> joinWhere = new ArrayList<>();
        joinWhere.add(new String[]{"C.ID_PROCESSADOR", "P.ID"});
        joinWhere.add(new String[]{"C.ID_MEMORIA", "M.ID"});
        joinWhere.add(new String[]{"C.ID_PLACA_VIDEO", "PV.ID"});
        ResultSet rs = this.dao.consultar(new String[]{"COMPUTADOR C", "MEMORIA M", "PLACA_VIDEO PV", "PROCESSADOR P"}, joinWhere, new String[]{"C.ID, C.ID_PROCESSADOR, C.ID_MEMORIA, C.ID_PLACA_VIDEO", "C.SISTEMA_OPERACIONAL", "C.TEM_WEBCAM", "C.TEM_WIRELESS", "M.ID", "M.VALOR_CAPACIDADE", "M.UNIDADE_CAPACIDADE", "M.TECNOLOGIA", "M.FABRICANTE",
        "PV.ID", "PV.ID_PROCESSADOR", "PV.ID_MEMORIA", "PV.FABRICANTE", "P.ID", "P.VALOR_FREQUENCIA", "P.UNIDADE_FREQUENCIA", "P.NUMERO_NUCLEOS", "P.FABRICANTE"}, null, null, null);               
        try {
            while (rs.next()) {
                Controller.computadores.add(new Computador(rs.getInt("C.ID"), new Processador(rs.getInt("P.ID"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")),
                        new Memoria(rs.getInt("M.ID"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")),
                        new PlacaVideo(rs.getInt("PV.ID"), new Processador(rs.getInt("PV.ID_PROCESSADOR"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")),
                                new Memoria(rs.getInt("PV.ID_MEMORIA"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")),
                                rs.getString("PV.FABRICANTE")),
                        rs.getString("C.SISTEMA_OPERACIONAL"), (rs.getString("C.TEM_WEBCAM").equals("T")), (rs.getString("C.TEM_WIRELESS").equals("T"))));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setJogos() {
        Controller.jogos.clear();
        ArrayList<String[]> joinWhere = new ArrayList<>();
        joinWhere.add(new String[]{"J.MIN_REQ_PROCESSADOR", "P.ID"});
        joinWhere.add(new String[]{"J.MIN_REQ_MEMORIA", "M.ID"});
        joinWhere.add(new String[]{"J.MIN_REQ_PLACA_VIDEO", "PV.ID"});
        ResultSet rs = this.dao.consultar(new String[]{"JOGO J", "MEMORIA M", "PLACA_VIDEO PV", "PROCESSADOR P"}, joinWhere, new String[]{"J.ID", "J.NOME", "J.DESCRICAO", "J.MIN_REQ_PROCESSADOR", "J.MIN_REQ_MEMORIA", "J.MIN_REQ_PLACA_VIDEO",
            "J.REQ_SISTEMA_OPERACIONAL", "J.REQ_SISTEMA_OPERACIONAL_1", "J.REQ_SISTEMA_OPERACIONAL_2", "J.PRECISA_WIRELESS", "J.PRECISA_WEBCAM", "J.PRECO", "M.ID", "M.VALOR_CAPACIDADE", "M.UNIDADE_CAPACIDADE", "M.TECNOLOGIA", "M.FABRICANTE",
            "PV.ID", "PV.ID_PROCESSADOR", "PV.ID_MEMORIA", "PV.FABRICANTE", "P.ID", "P.VALOR_FREQUENCIA", "P.UNIDADE_FREQUENCIA", "P.NUMERO_NUCLEOS", "P.FABRICANTE"}, null, null, null);               
        try {
            while (rs.next()) {
                String[] so = new String[]{rs.getString("J.REQ_SISTEMA_OPERACIONAL"), rs.getString("J.REQ_SISTEMA_OPERACIONAL_1"), rs.getString("J.REQ_SISTEMA_OPERACIONAL_2")};
                Controller.jogos.add(new Jogo(rs.getInt("J.ID"), rs.getString("J.NOME"), rs.getString("J.DESCRICAO"),
                        new Processador(rs.getInt("P.ID"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")),
                        new Memoria(rs.getInt("M.ID"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")),
                        new PlacaVideo(rs.getInt("PV.ID"), new Processador(rs.getInt("PV.ID_PROCESSADOR"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")),
                                new Memoria(rs.getInt("PV.ID_MEMORIA"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")),
                                rs.getString("PV.FABRICANTE")),
                        so, (rs.getString("J.PRECISA_WIRELESS").equals("T")), (rs.getString("J.PRECISA_WEBCAM").equals("T")), rs.getFloat("J.PRECO")));
            }
            
            rs = this.dao.consultar(new String[]{"COMPUTADOR C"}, null, new String[]{"distinct C.SISTEMA_OPERACIONAL as SO"}, null, null, new int[]{1});
            Object[][] dados = new Object[this.dao.getTamanhoTabela("COMPUTADOR")][1];
            while(rs.next()) {
                dados[rs.getRow()-1][0] = rs.getString("SO");
            }
            this.jFrameJogo.setModelDisponiveis(new DefaultTableModel(dados, new Object[]{"Disponíveis"}));
            this.jFrameJogo.getjTableDisponiveis().setModel(this.jFrameJogo.getModelDisponiveis());
            for (int i = 0; i < this.jFrameJogo.getModelDisponiveis().getRowCount(); i++) {
                if (dados[i][0] == null) {
                    this.jFrameJogo.getModelDisponiveis().removeRow(i);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void setMemorias() {
        Controller.memorias.clear();
        ResultSet rs = this.dao.consultar(new String[]{"MEMORIA M"}, null, new String[]{"M.ID", "M.VALOR_CAPACIDADE", "M.UNIDADE_CAPACIDADE", "M.TECNOLOGIA", "M.FABRICANTE"}, null, null, null);
        try {
            while (rs.next()) {
                Controller.memorias.add(new Memoria(rs.getInt("M.ID"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void setPlacasVideo() {
        Controller.placasVideo.clear();
        ArrayList<String[]> joinWhere = new ArrayList<>();
        joinWhere.add(new String[]{"PV.ID_PROCESSADOR", "P.ID"});
        joinWhere.add(new String[]{"PV.ID_MEMORIA", "M.ID"});
        ResultSet rs = this.dao.consultar(new String[]{"PROCESSADOR P", "PLACA_VIDEO PV", "MEMORIA M"}, joinWhere, new String[]{"PV.ID", "PV.ID_PROCESSADOR", "PV.ID_MEMORIA", "PV.FABRICANTE",
            "P.ID, P.VALOR_FREQUENCIA", "P.UNIDADE_FREQUENCIA", "P.NUMERO_NUCLEOS", "P.FABRICANTE", "M.ID", "M.VALOR_CAPACIDADE", "M.UNIDADE_CAPACIDADE", "M.TECNOLOGIA", "M.FABRICANTE"}, null, null, null);
        try {
            while (rs.next()) {
                Controller.placasVideo.add(new PlacaVideo(rs.getInt("PV.ID"), 
                        new Processador(rs.getInt("PV.ID_PROCESSADOR"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")),
                        new Memoria(rs.getInt("PV.ID_MEMORIA"), rs.getInt("M.VALOR_CAPACIDADE"), rs.getString("M.UNIDADE_CAPACIDADE"), rs.getString("M.TECNOLOGIA"), rs.getString("M.FABRICANTE")),
                    rs.getString("PV.FABRICANTE")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }
    
    public void setProcessadores() {
        Controller.processadores.clear();
        ResultSet rs = this.dao.consultar(new String[]{"PROCESSADOR P"}, null, new String[]{"P.ID, P.VALOR_FREQUENCIA", "P.UNIDADE_FREQUENCIA", "P.NUMERO_NUCLEOS", "P.FABRICANTE"}, null, null, null);
        try {
            while (rs.next()) {
                Controller.processadores.add(new Processador(rs.getInt("P.ID"), rs.getFloat("P.VALOR_FREQUENCIA"), rs.getString("P.UNIDADE_FREQUENCIA"), rs.getInt("P.NUMERO_NUCLEOS"), rs.getString("P.FABRICANTE")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }                        
    }
    
    public void setUsuarios() {
        Controller.usuarios.clear();
        ResultSet rs = this.dao.consultar(new String[]{"USUARIOS U"}, null, new String[]{"U.ID", "U.LOGIN", "U.SENHA", "U.EH_ADMINISTRADOR", "U.NOME"}, null, null, null);
        try {
            while (rs.next()) {
                if (rs.getInt("U.ID") == Controller.usuarioLogado.getId()) {
                    Controller.usuarios.add(new Usuario(rs.getInt("U.ID"), rs.getString("U.LOGIN"), rs.getString("U.SENHA"), rs.getString("U.NOME"), (rs.getString("U.EH_ADMINISTRADOR").equals("T"))));
                } else {
                    Controller.usuarios.add(new Usuario(rs.getInt("U.ID"), rs.getString("U.LOGIN"), null, rs.getString("U.NOME"), (rs.getString("U.EH_ADMINISTRADOR").equals("T"))));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }                                
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
        if (source == this.jFrameAlterarSenha.getjButtonConfirmar()) {
            boolean valida = true;
            if (this.jFrameAlterarSenha.getjPasswordFieldSenhaAtual().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta informar a senha atual");
                valida = false;
            }
            if (this.jFrameAlterarSenha.getjPasswordFieldNovaSenha().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta informar a nova senha");
                valida = false;
            }
            if (valida) {
                if (!this.jFrameAlterarSenha.getjPasswordFieldSenhaAtual().getText().equals(Controller.usuarioLogado.getSenha())) {
                    JOptionPane.showMessageDialog(null, "A senha atual não confere");
                    valida = false;
                }
                if (valida) {
                    if (this.jFrameAlterarSenha.getjPasswordFieldNovaSenha().getText().equals(this.jFrameAlterarSenha.getjPasswordFieldConfirmarSenha().getText())) {
                        ArrayList values = new ArrayList();
                        values.add(this.jFrameAlterarSenha.getjPasswordFieldNovaSenha().getText());
                        ArrayList values2 = new ArrayList();
                        values2.add(Controller.usuarioLogado.getId());
                        this.dao.alterar("USUARIOS", new String[]{"SENHA"}, values, new String[]{"ID"}, values2);
                        Controller.usuarioLogado.setSenha(String.valueOf(this.jFrameAlterarSenha.getjPasswordFieldNovaSenha().getText()));
                        JOptionPane.showMessageDialog(null, "Senha alterada com sucesso");
                        this.jFrameAlterarSenha.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "A nova senha e sua confirmação não conferem");
                    }
                }
            }
        } else if (source == this.jFrameAlterarSenha.getjButtonVoltar()) {
            this.jFrameAlterarSenha.dispose();
        } else if (source == this.jFrameComprarJogo.getjButtonFazerVerificacao()) {
            if (this.jFrameComprarJogo.getjTableJogos().getSelectedRow() >= 0 && Controller.computadorAtual != null) {
                this.jogoEscolhido = Controller.jogos.get(this.jFrameComprarJogo.getjTableJogos().getSelectedRow());
                this.compararComputadorJogo();
                this.jFrameVerificacao.setVisible(true); 
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecione " + (this.jFrameComprarJogo.getjTableJogos().getSelectedRow() < 0 ? "um dos jogos" : "") +
                        (Controller.computadorAtual == null && this.jFrameComprarJogo.getjTableJogos().getSelectedRow() < 0 ? " e " : "") + 
                        (Controller.computadorAtual == null ? "um computador" : "") + " para verificar as compatibilidades", "Comprar Jogo", JOptionPane.WARNING_MESSAGE);
            }
        } else if (source == this.jFrameComprarJogo.getjButtonFechar()) {
            this.jFrameComprarJogo.dispose();
        } else if (source == this.jFrameComputador.getjButtonAnterior() || source == this.jFrameJogo.getjButtonAnterior() || source == this.jFrameMemoria.getjButtonAnterior() || source == this.jFramePlacaVideo.getjButtonAnterior() || source == this.jFrameProcessador.getjButtonAnterior() || source == this.jFrameUsuario.getjButtonAnterior()) {
            if (source == this.jFrameComputador.getjButtonAnterior()) {
                Controller.iComp--;
                this.jFrameComputador.getjButtonProximo().setEnabled(true);
                this.jFrameComputador.getjButtonAnterior().setEnabled(Controller.iComp > 0);
                this.jFrameComputador.setarCampos(Controller.iComp);
            } else if (source == this.jFrameJogo.getjButtonAnterior()) {
                Controller.iJogo--;
                this.jFrameJogo.getjButtonProximo().setEnabled(true);
                this.jFrameJogo.getjButtonAnterior().setEnabled(Controller.iJogo > 0);
                this.jFrameJogo.setarCampos(Controller.iJogo);                
            } else if (source == this.jFrameMemoria.getjButtonAnterior()) {
                Controller.iMem--;
                this.jFrameMemoria.getjButtonProximo().setEnabled(true);
                this.jFrameMemoria.getjButtonAnterior().setEnabled(Controller.iMem > 0);
                this.jFrameMemoria.setarCampos(Controller.iMem);                
            } else if (source == this.jFramePlacaVideo.getjButtonAnterior()) {
                Controller.iPV--;
                this.jFramePlacaVideo.getjButtonProximo().setEnabled(true);
                this.jFramePlacaVideo.getjButtonAnterior().setEnabled(Controller.iPV > 0);
                this.jFramePlacaVideo.setarCampos(Controller.iPV);                
            } else if (source == this.jFrameProcessador.getjButtonAnterior()) {
                Controller.iProc--;
                this.jFrameProcessador.getjButtonProximo().setEnabled(true);
                this.jFrameProcessador.getjButtonAnterior().setEnabled(Controller.iProc > 0);
                this.jFrameProcessador.setarCampos(Controller.iProc);                
            } else if (source == this.jFrameUsuario.getjButtonAnterior()) {
                Controller.iUsu--;
                this.jFrameUsuario.getjButtonProximo().setEnabled(true);
                this.jFrameUsuario.getjButtonAnterior().setEnabled(Controller.iUsu > 0);
                this.jFrameUsuario.setarCampos(Controller.iUsu);                
            }
        } else if (source == this.jFrameComputador.getjButtonEditar() || source == this.jFrameJogo.getjButtonEditar() || source == this.jFrameMemoria.getjButtonEditar() || source == this.jFramePlacaVideo.getjButtonEditar() || source == this.jFrameProcessador.getjButtonEditar() || source == this.jFrameUsuario.getjButtonEditar()) {
            if (source == this.jFrameComputador.getjButtonEditar()) {
                if (!Controller.computadores.isEmpty()) {
                    this.jFrameComputador.editarCampos();
                }
            } else if (source == this.jFrameJogo.getjButtonEditar()) {
                if (!Controller.jogos.isEmpty()) {
                    this.jFrameJogo.editarCampos();
                }                
            } else if (source == this.jFrameMemoria.getjButtonEditar()) {
                if (!Controller.memorias.isEmpty()) {
                    this.jFrameMemoria.editarCampos();
                }                
            } else if (source == this.jFramePlacaVideo.getjButtonEditar()) {
                if (!Controller.placasVideo.isEmpty()) {
                    this.jFramePlacaVideo.editarCampos();
                }                
            } else if (source == this.jFrameProcessador.getjButtonEditar()) {
                if (!Controller.processadores.isEmpty()) {
                    this.jFrameProcessador.editarCampos();
                }                
            } else if (source == this.jFrameUsuario.getjButtonEditar()) {
                if (!Controller.usuarios.isEmpty()) {
                    this.jFrameUsuario.editarCampos();
                }                
            }
        } else if (source == this.jFrameComputador.getjButtonExcluir() || source == this.jFrameJogo.getjButtonExcluir() || source == this.jFrameMemoria.getjButtonExcluir() || source == this.jFramePlacaVideo.getjButtonExcluir() || source == this.jFrameProcessador.getjButtonExcluir() || source == this.jFrameUsuario.getjButtonExcluir()) {
            if (source == this.jFrameComputador.getjButtonExcluir()) {
                if (!Controller.computadores.isEmpty()) {
                    if (Controller.computadorAtual != null && Controller.computadores.get(Controller.iComp).getId() == Controller.computadorAtual.getId()) {
                        JOptionPane.showMessageDialog(null, "Este computador está sendo usado e não pode ser excluído!", "Excluir Computador", JOptionPane.WARNING_MESSAGE);
                    } else {
                        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o computador selecionado?", "Excluir Computador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            ArrayList values = new ArrayList();
                            values.add(Controller.computadores.get(Controller.iComp).getId());
                            this.dao.excluir("COMPUTADOR", new String[]{"ID"}, values);
                            Controller.computadores.remove(Controller.iComp);
                            Controller.iComp = (Controller.iComp == Controller.computadores.size() ? Controller.iComp-1 : Controller.iComp);
                            this.jFrameComputador.setarCampos(Controller.iComp);
                            JOptionPane.showMessageDialog(null, "Computador Excluído!", "Excluir Computador", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } else if (source == this.jFrameJogo.getjButtonExcluir()) {
                if (!Controller.jogos.isEmpty()) {
                    int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o jogo selecionado?", "Excluir Jogo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        ArrayList values = new ArrayList();
                        values.add(Controller.jogos.get(Controller.iJogo).getId());
                        this.dao.excluir("JOGO", new String[]{"ID"}, values);
                        Controller.jogos.remove(Controller.iJogo);
                        Controller.iJogo = (Controller.iJogo == Controller.jogos.size() ? Controller.iJogo-1 : Controller.iJogo);
                        this.jFrameJogo.setarCampos(Controller.iJogo);
                        JOptionPane.showMessageDialog(null, "Jogo Excluído!", "Excluir Jogo", JOptionPane.INFORMATION_MESSAGE);
                    }
                }                
            } else if (source == this.jFrameMemoria.getjButtonExcluir()) {
                if (!Controller.memorias.isEmpty()) {
                    ArrayList aValues = new ArrayList();
                    aValues.add(Controller.memorias.get(Controller.iMem).getId());
                    if (!this.dao.registroSendoUsado(new String[]{"PLACA_VIDEO PV"}, null, new String[]{"PV.ID_MEMORIA"}, aValues) &&
                            !this.dao.registroSendoUsado(new String[]{"JOGO J"}, null, new String[]{"J.MIN_REQ_MEMORIA"}, aValues) &&
                            !this.dao.registroSendoUsado(new String[]{"COMPUTADOR C"}, null, new String[]{"C.ID_MEMORIA"}, aValues)) {
                        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir a memória selecionada?", "Excluir Memória", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            ArrayList values = new ArrayList();
                            values.add(Controller.memorias.get(Controller.iMem).getId());
                            this.dao.excluir("MEMORIA", new String[]{"ID"}, values);
                            Controller.memorias.remove(Controller.iMem);
                            Controller.iMem = (Controller.iMem == Controller.memorias.size() ? Controller.iMem-1 : Controller.iMem);
                            this.jFrameMemoria.setarCampos(Controller.iMem);
                            JOptionPane.showMessageDialog(null, "Memória Excluída!", "Excluir Memória", JOptionPane.INFORMATION_MESSAGE);
                        }                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Esta memória está sendo usada em outro registro e não pode ser excluída!", "Excluir Memória", JOptionPane.WARNING_MESSAGE);
                    }
                }                
            } else if (source == this.jFramePlacaVideo.getjButtonExcluir()) {
                if (!Controller.placasVideo.isEmpty()) {
                    ArrayList aValues = new ArrayList();
                    aValues.add(Controller.placasVideo.get(Controller.iPV).getId());
                    if (!this.dao.registroSendoUsado(new String[]{"JOGO J"}, null, new String[]{"J.MIN_REQ_PLACA_VIDEO"}, aValues) &&
                            !this.dao.registroSendoUsado(new String[]{"COMPUTADOR C"}, null, new String[]{"C.ID_PLACA_VIDEO"}, aValues)) {
                        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir a placa de vídeo selecionada?", "Excluir Placa de Vídeo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            ArrayList values = new ArrayList();
                            values.add(Controller.placasVideo.get(Controller.iPV).getId());
                            this.dao.excluir("PLACA_VIDEO", new String[]{"ID"}, values);
                            Controller.placasVideo.remove(Controller.iPV);
                            Controller.iPV = (Controller.iPV == Controller.placasVideo.size() ? Controller.iPV-1 : Controller.iPV);
                            this.jFramePlacaVideo.setarCampos(Controller.iPV);
                            JOptionPane.showMessageDialog(null, "Placa de Vídeo Excluída!", "Excluir Placa de Vídeo", JOptionPane.INFORMATION_MESSAGE);
                        }                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Esta placa de vídeo está sendo usada em outro registro e não pode ser excluída!", "Excluir Placa de Vídeo", JOptionPane.WARNING_MESSAGE);
                    }
                }                
            } else if (source == this.jFrameProcessador.getjButtonExcluir()) {
                if (!Controller.processadores.isEmpty()) {
                    ArrayList aValues = new ArrayList();
                    aValues.add(Controller.processadores.get(Controller.iProc).getId());
                    if (!this.dao.registroSendoUsado(new String[]{"PLACA_VIDEO PV"}, null, new String[]{"PV.ID_PROCESSADOR"}, aValues) &&
                            !this.dao.registroSendoUsado(new String[]{"JOGO J"}, null, new String[]{"J.MIN_REQ_PROCESSADOR"}, aValues) &&
                            !this.dao.registroSendoUsado(new String[]{"COMPUTADOR C"}, null, new String[]{"C.ID_PROCESSADOR"}, aValues)) {
                        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o processador selecionado?", "Excluir Processador", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            ArrayList values = new ArrayList();
                            values.add(Controller.processadores.get(Controller.iProc).getId());
                            this.dao.excluir("PROCESSADOR", new String[]{"ID"}, values);
                            Controller.processadores.remove(Controller.iProc);
                            Controller.iProc = (Controller.iProc == Controller.processadores.size() ? Controller.iProc-1 : Controller.iProc);
                            this.jFrameProcessador.setarCampos(Controller.iProc);
                            JOptionPane.showMessageDialog(null, "Processador Excluído!", "Excluir Processador", JOptionPane.INFORMATION_MESSAGE);
                        }                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Este processador está sendo usado em outro registro e não pode ser excluído!", "Excluir Processador", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } else if (source == this.jFrameUsuario.getjButtonExcluir()) {
                if (!Controller.usuarios.isEmpty()) {
                    if (Controller.usuarios.get(Controller.iUsu).getId() != Controller.usuarioLogado.getId()) {
                        int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer excluir o usuário selecionado?", "Excluir Usuário", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if (resposta == JOptionPane.YES_OPTION) {
                            ArrayList values = new ArrayList();
                            values.add(Controller.usuarios.get(Controller.iUsu).getId());
                            this.dao.excluir("USUARIOS", new String[]{"ID"}, values);
                            Controller.usuarios.remove(Controller.iUsu);
                            Controller.iUsu = (Controller.iUsu == Controller.usuarios.size() ? Controller.iUsu-1 : Controller.iUsu);
                            this.jFrameUsuario.setarCampos(Controller.iUsu);
                            JOptionPane.showMessageDialog(null, "Usuário Excluído!", "Excluir Usuário", JOptionPane.INFORMATION_MESSAGE);
                        }                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Você não pode excluir você mesmo...", "Excluir Usuário", JOptionPane.WARNING_MESSAGE);
                    }
                }
            }
        } else if (source == this.jFrameComputador.getjButtonFechar() || source == this.jFrameJogo.getjButtonFechar() || source == this.jFrameMemoria.getjButtonFechar() || source == this.jFramePlacaVideo.getjButtonFechar() || source == this.jFrameProcessador.getjButtonFechar() || source == this.jFrameUsuario.getjButtonFechar()) {
            if (source == this.jFrameComputador.getjButtonFechar()) {
                if (this.jFrameComputador.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFrameComputador.dispose();
                    Controller.iComp = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFrameComputador.cancelarEdicao();
                        Controller.iComp = (Controller.iComp >= Controller.computadores.size() ? Controller.computadores.size() - 1 : Controller.iComp);
                        this.jFrameComputador.setarCampos(Controller.iComp);
                    }
                }
                this.atualizarTabelaInicial();
            } else if (source == this.jFrameJogo.getjButtonFechar()) {
                if (this.jFrameJogo.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFrameJogo.dispose();
                    Controller.iJogo = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFrameJogo.cancelarEdicao();
                        Controller.iJogo = (Controller.iJogo >= Controller.jogos.size() ? Controller.jogos.size() - 1 : Controller.iJogo);
                        this.jFrameJogo.setarCampos(Controller.iJogo);
                    }
                }                
            } else if (source == this.jFrameMemoria.getjButtonFechar()) {
                if (this.jFrameMemoria.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFrameMemoria.dispose();
                    Controller.iMem = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFrameMemoria.cancelarEdicao();
                        Controller.iMem = (Controller.iMem >= Controller.memorias.size() ? Controller.memorias.size() - 1 : Controller.iMem);
                        this.jFrameMemoria.setarCampos(Controller.iMem);
                    }
                }                
            } else if (source == this.jFramePlacaVideo.getjButtonFechar()) {
                if (this.jFramePlacaVideo.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFramePlacaVideo.dispose();
                    Controller.iPV = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFramePlacaVideo.cancelarEdicao();
                        Controller.iPV = (Controller.iPV >= Controller.placasVideo.size() ? Controller.placasVideo.size() - 1 : Controller.iPV);
                        this.jFramePlacaVideo.setarCampos(Controller.iPV);
                    }
                }                
            } else if (source == this.jFrameProcessador.getjButtonFechar()) {
                if (this.jFrameProcessador.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFrameProcessador.dispose();
                    Controller.iProc = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFrameProcessador.cancelarEdicao();
                        Controller.iProc = (Controller.iProc >= Controller.processadores.size() ? Controller.processadores.size() - 1 : Controller.iProc);
                        this.jFrameProcessador.setarCampos(Controller.iProc);
                    }
                }                
            } else if (source == this.jFrameUsuario.getjButtonFechar()) {
                if (this.jFrameUsuario.getjButtonFechar().getText().equals("Fechar")) {
                    this.jFrameUsuario.dispose();
                    Controller.iUsu = 0;
                } else {
                    int resposta = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja cancelar a edição?", "Cancelar", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (resposta == JOptionPane.YES_OPTION) {
                        this.jFrameUsuario.cancelarEdicao();
                        Controller.iUsu = (Controller.iUsu >= Controller.usuarios.size() ? Controller.usuarios.size() - 1 : Controller.iUsu);
                        this.jFrameUsuario.setarCampos(Controller.iUsu);
                    }
                }                
            }
        } else if (source == this.jFrameComputador.getjButtonGravar() || source == this.jFrameJogo.getjButtonGravar() || source == this.jFrameMemoria.getjButtonGravar() || source == this.jFramePlacaVideo.getjButtonGravar() || source == this.jFrameProcessador.getjButtonGravar() || source == this.jFrameUsuario.getjButtonGravar()) {
            if (source == this.jFrameComputador.getjButtonGravar() && this.jFrameComputador.validaCampos()) {
                if (this.jFrameComputador.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.computadores.get(Controller.iComp).getId());
                    try {
                        if (!this.dao.consultar(new String[]{"COMPUTADOR"}, null, null, this.dao.getCamposBD("COMPUTADOR", false), this.jFrameComputador.getValuesBD(), null).next()) {
                            this.dao.alterar("COMPUTADOR", this.dao.getCamposBD("COMPUTADOR", false), this.jFrameComputador.getValuesBD(), new String[]{"ID"}, values);
                            this.setComputadores();
                            JOptionPane.showMessageDialog(null, "Computador alterado com sucesso!", "Editar Computador", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este computador já existe", "Editar Computador", JOptionPane.INFORMATION_MESSAGE);
                            this.jFrameComputador.setarCampos(Controller.iComp);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (this.dao.incluir("COMPUTADOR", this.dao.getCamposBD("COMPUTADOR", false), this.jFrameComputador.getValuesBD())) {
                        this.setComputadores();
                        JOptionPane.showMessageDialog(null, "Computador adicionado com sucesso!", "Novo Computador", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este computador já existia e não precisou ser adicionado", "Novo Computador", JOptionPane.INFORMATION_MESSAGE);
                        Controller.iComp = (Controller.iComp == Controller.computadores.size() ? Controller.iComp-1 : Controller.iComp);
                        this.jFrameComputador.setarCampos(Controller.iComp);
                    }
                }
                this.jFrameComputador.cancelarEdicao();
            } else if (source == this.jFrameJogo.getjButtonGravar() && this.jFrameJogo.validaCampos()) {
                if (this.jFrameJogo.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.jogos.get(Controller.iJogo).getId());
                    try {
                        if (!this.dao.consultar(new String[]{"JOGO"}, null, null, this.dao.getCamposBD("JOGO", false), this.jFrameJogo.getValuesBD(), null).next()) {
                            this.dao.alterar("JOGO", this.dao.getCamposBD("JOGO", false), this.jFrameJogo.getValuesBD(), new String[]{"ID"}, values);
                            this.setJogos();
                            JOptionPane.showMessageDialog(null, "Jogo alterado com sucesso!", "Editar Jogo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este jogo já existe", "Editar Jogo", JOptionPane.INFORMATION_MESSAGE);
                            this.jFrameJogo.setarCampos(Controller.iJogo);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (this.dao.incluir("JOGO", this.dao.getCamposBD("JOGO", false), this.jFrameJogo.getValuesBD())) {
                        this.setJogos();
                        JOptionPane.showMessageDialog(null, "Jogo adicionado com sucesso!", "Novo Jogo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este jogo já existia e não precisou ser adicionado", "Novo Jogo", JOptionPane.INFORMATION_MESSAGE);
                        Controller.iJogo = (Controller.iJogo == Controller.jogos.size() ? Controller.iJogo-1 : Controller.iJogo);
                        this.jFrameJogo.setarCampos(Controller.iJogo);
                    }
                }
                this.jFrameJogo.cancelarEdicao();                
            } else if (source == this.jFrameMemoria.getjButtonGravar() && this.jFrameMemoria.validaCampos()) {
                if (this.jFrameMemoria.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.memorias.get(Controller.iMem).getId());
                    try {
                        if (!this.dao.consultar(new String[]{"MEMORIA"}, null, null, this.dao.getCamposBD("MEMORIA", false), this.jFrameMemoria.getValuesBD(), null).next()) {
                            this.dao.alterar("MEMORIA", this.dao.getCamposBD("MEMORIA", false), this.jFrameMemoria.getValuesBD(), new String[]{"ID"}, values);
                            this.setMemorias();
                            JOptionPane.showMessageDialog(null, "Memória alterada com sucesso!", "Editar Memória", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta memória já existe", "Editar Memória", JOptionPane.INFORMATION_MESSAGE);
                            this.jFrameMemoria.setarCampos(Controller.iMem);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (this.dao.incluir("MEMORIA", this.dao.getCamposBD("MEMORIA", false), this.jFrameMemoria.getValuesBD())) {
                        this.setMemorias();
                        JOptionPane.showMessageDialog(null, "Memória adicionada com sucesso!", "Nova Memória", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Esta memória já existia e não precisou ser adicionada", "Nova Memória", JOptionPane.INFORMATION_MESSAGE);
                        Controller.iMem = (Controller.iMem == Controller.memorias.size() ? Controller.iMem-1 : Controller.iMem);
                        this.jFrameMemoria.setarCampos(Controller.iMem);
                    }
                }
                this.jFrameMemoria.cancelarEdicao();                                
            } else if (source == this.jFramePlacaVideo.getjButtonGravar() && this.jFramePlacaVideo.validaCampos()) {
                if (this.jFramePlacaVideo.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.placasVideo.get(Controller.iPV).getId());
                    try {
                        if (!this.dao.consultar(new String[]{"PLACA_VIDEO"}, null, null, this.dao.getCamposBD("PLACA_VIDEO", false), this.jFramePlacaVideo.getValuesBD(), null).next()) {
                            this.dao.alterar("PLACA_VIDEO", this.dao.getCamposBD("PLACA_VIDEO", false), this.jFramePlacaVideo.getValuesBD(), new String[]{"ID"}, values);
                            this.setPlacasVideo();
                            JOptionPane.showMessageDialog(null, "Placa de Vídeo alterada com sucesso!", "Editar Placa de Vídeo", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Esta placa de vídeo já existe", "Editar Placa de Vídeo", JOptionPane.INFORMATION_MESSAGE);
                            this.jFramePlacaVideo.setarCampos(Controller.iPV);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (this.dao.incluir("PLACA_VIDEO", this.dao.getCamposBD("PLACA_VIDEO", false), this.jFramePlacaVideo.getValuesBD())) {
                        this.setPlacasVideo();
                        JOptionPane.showMessageDialog(null, "Placa de Vídeo adicionada com sucesso!", "Nova Placa de Vídeo", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Esta placa de vídeo já existia e não precisou ser adicionada", "Nova Placa de Vídeo", JOptionPane.INFORMATION_MESSAGE);
                        Controller.iPV = (Controller.iPV == Controller.placasVideo.size() ? Controller.iPV-1 : Controller.iPV);
                        this.jFramePlacaVideo.setarCampos(Controller.iPV);
                    }
                }
                this.jFramePlacaVideo.cancelarEdicao();                                
            } else if (source == this.jFrameProcessador.getjButtonGravar() && this.jFrameProcessador.validaCampos()) {
                if (this.jFrameProcessador.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.processadores.get(Controller.iProc).getId());
                    try {
                        if (!this.dao.consultar(new String[]{"PROCESSADOR"}, null, null, this.dao.getCamposBD("PROCESSADOR", false), this.jFrameProcessador.getValuesBD(), null).next()) {
                            this.dao.alterar("PROCESSADOR", this.dao.getCamposBD("PROCESSADOR", false), this.jFrameProcessador.getValuesBD(), new String[]{"ID"}, values);
                            this.setProcessadores();
                            JOptionPane.showMessageDialog(null, "Processador alterado com sucesso!", "Editar Processador", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este processador já existe", "Editar Processador", JOptionPane.INFORMATION_MESSAGE);
                            this.jFrameProcessador.setarCampos(Controller.iProc);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    if (this.dao.incluir("PROCESSADOR", this.dao.getCamposBD("PROCESSADOR", false), this.jFrameProcessador.getValuesBD())) {
                        this.setProcessadores();
                        JOptionPane.showMessageDialog(null, "Processador adicionado com sucesso!", "Novo Processador", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Este processador já existia e não precisou ser adicionado", "Novo Processador", JOptionPane.INFORMATION_MESSAGE);
                        Controller.iProc = (Controller.iProc == Controller.processadores.size() ? Controller.iProc-1 : Controller.iProc);
                        this.jFrameProcessador.setarCampos(Controller.iProc);
                    }
                }
                this.jFrameProcessador.cancelarEdicao();                                
            } else if (source == this.jFrameUsuario.getjButtonGravar() && this.jFrameUsuario.validaCampos()) {
                ArrayList values2 = new ArrayList();
                values2.add(this.jFrameUsuario.getjTextFieldLogin().getText());
                if (this.jFrameUsuario.isEditando()) {
                    ArrayList values = new ArrayList();
                    values.add(Controller.usuarios.get(Controller.iUsu).getId());
                    try {
                        boolean loginJaExiste = false;
                        ResultSet rs = this.dao.consultar(new String[]{"USUARIOS"}, null, null, new String[]{"LOGIN"}, values2, null);
                        if (rs.next()) {
                            while (rs.next()) {
                                if (rs.getString("LOGIN").equals(Controller.usuarios.get(Controller.iUsu).getLogin())) {
                                    loginJaExiste = true;
                                    break;
                                }
                            }
                        }
                        if (loginJaExiste) {
                            JOptionPane.showMessageDialog(null, "Este login já existe. Por favor, escolha outro", "Editar Usuário", JOptionPane.WARNING_MESSAGE);
                            this.jFrameUsuario.setarCampos(Controller.iUsu);
                        } else {
                            this.dao.alterar("USUARIOS", this.dao.getCamposBD("USUARIOS", false), this.jFrameUsuario.getValuesBD(), new String[]{"ID"}, values);
                            this.setUsuarios();
                            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!" + (Controller.usuarios.get(iUsu).getId() == Controller.usuarioLogado.getId() ? " Suas alterações serão vistas a partir de seu próximo login!" : ""), "Editar Usuário", JOptionPane.INFORMATION_MESSAGE);                                
                        }                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    try {
                        if (!this.dao.consultar(new String[]{"USUARIOS"}, null, null, new String[]{"LOGIN"}, values2, null).next()) {
                            ArrayList valores = this.jFrameUsuario.getValuesBD();
                            valores.add("DS1");
                            this.dao.incluir("USUARIOS", new String[]{"LOGIN", "EH_ADMINISTRADOR", "NOME", "SENHA"}, valores);
                            this.setUsuarios();
                            JOptionPane.showMessageDialog(null, "Usuário adicionado com sucesso!", "Novo Usuário", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Este login já existe. Por favor, escolha outro", "Novo Usuário", JOptionPane.WARNING_MESSAGE);
                            Controller.iUsu = (Controller.iUsu == Controller.usuarios.size() ? Controller.iUsu-1 : Controller.iUsu);
                            this.jFrameUsuario.setarCampos(Controller.iUsu);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                this.jFrameUsuario.cancelarEdicao();
            }
        } else if (source == this.jFrameComputador.getjButtonNovo() || source == this.jFrameJogo.getjButtonNovo() || source == this.jFrameMemoria.getjButtonNovo() || source == this.jFramePlacaVideo.getjButtonNovo() || source == this.jFrameProcessador.getjButtonNovo() || source == this.jFrameUsuario.getjButtonNovo()) {
            if (source == this.jFrameComputador.getjButtonNovo()) {
                Controller.iComp = Controller.computadores.size(); 
                this.jFrameComputador.zerarCampos();
                this.jFrameComputador.editarCampos();                
                this.jFrameComputador.setEditando(false);
                this.jFrameComputador.getjLabelRegistroAtual().setText(String.valueOf(Controller.computadores.size() + 1));
                this.jFrameComputador.getjLabelRegistroTotal().setText(this.jFrameComputador.getjLabelRegistroAtual().getText());
            } else if (source == this.jFrameJogo.getjButtonNovo()) {
                Controller.iJogo = Controller.jogos.size(); 
                this.jFrameJogo.zerarCampos();
                this.jFrameJogo.editarCampos();                
                this.jFrameJogo.setEditando(false);
                this.jFrameJogo.getjLabelRegistroAtual().setText(String.valueOf(Controller.jogos.size() + 1));
                this.jFrameJogo.getjLabelRegistroTotal().setText(this.jFrameJogo.getjLabelRegistroAtual().getText());                
            } else if (source == this.jFrameMemoria.getjButtonNovo()) {
                Controller.iMem = Controller.memorias.size(); 
                this.jFrameMemoria.zerarCampos();
                this.jFrameMemoria.editarCampos();                
                this.jFrameMemoria.setEditando(false);
                this.jFrameMemoria.getjLabelRegistroAtual().setText(String.valueOf(Controller.memorias.size() + 1));
                this.jFrameMemoria.getjLabelRegistroTotal().setText(this.jFrameMemoria.getjLabelRegistroAtual().getText());
            } else if (source == this.jFramePlacaVideo.getjButtonNovo()) {
                Controller.iPV = Controller.placasVideo.size(); 
                this.jFramePlacaVideo.zerarCampos();
                this.jFramePlacaVideo.editarCampos();                
                this.jFramePlacaVideo.setEditando(false);
                this.jFramePlacaVideo.getjLabelRegistroAtual().setText(String.valueOf(Controller.placasVideo.size() + 1));
                this.jFramePlacaVideo.getjLabelRegistroTotal().setText(this.jFramePlacaVideo.getjLabelRegistroAtual().getText());
            } else if (source == this.jFrameProcessador.getjButtonNovo()) {
                Controller.iProc = Controller.processadores.size(); 
                this.jFrameProcessador.zerarCampos();
                this.jFrameProcessador.editarCampos();                
                this.jFrameProcessador.setEditando(false);
                this.jFrameProcessador.getjLabelRegistroAtual().setText(String.valueOf(Controller.processadores.size() + 1));
                this.jFrameProcessador.getjLabelRegistroTotal().setText(this.jFrameProcessador.getjLabelRegistroAtual().getText());
            } else if (source == this.jFrameUsuario.getjButtonNovo()) {
                Controller.iUsu = Controller.usuarios.size(); 
                this.jFrameUsuario.zerarCampos();
                this.jFrameUsuario.editarCampos();                
                this.jFrameUsuario.setEditando(false);
                this.jFrameUsuario.getjLabelRegistroAtual().setText(String.valueOf(Controller.usuarios.size() + 1));
                this.jFrameUsuario.getjLabelRegistroTotal().setText(this.jFrameUsuario.getjLabelRegistroAtual().getText());
            }
        } else if (source == this.jFrameComputador.getjButtonProximo() || source == this.jFrameJogo.getjButtonProximo() || source == this.jFrameMemoria.getjButtonProximo() || source == this.jFramePlacaVideo.getjButtonProximo() || source == this.jFrameProcessador.getjButtonProximo() || source == this.jFrameUsuario.getjButtonProximo()) {
            if (source == this.jFrameComputador.getjButtonProximo()) {
                Controller.iComp++;
                this.jFrameComputador.getjButtonAnterior().setEnabled(true);
                this.jFrameComputador.getjButtonProximo().setEnabled(Controller.iComp < Controller.computadores.size() - 1);
                this.jFrameComputador.setarCampos(Controller.iComp);
            } else if (source == this.jFrameJogo.getjButtonProximo()) {
                Controller.iJogo++;
                this.jFrameJogo.getjButtonAnterior().setEnabled(true);
                this.jFrameJogo.getjButtonProximo().setEnabled(Controller.iJogo < Controller.jogos.size() - 1);
                this.jFrameJogo.setarCampos(Controller.iJogo);                
            } else if (source == this.jFrameMemoria.getjButtonProximo()) {
                Controller.iMem++;
                this.jFrameMemoria.getjButtonAnterior().setEnabled(true);
                this.jFrameMemoria.getjButtonProximo().setEnabled(Controller.iMem < Controller.memorias.size() - 1);
                this.jFrameMemoria.setarCampos(Controller.iMem);
            } else if (source == this.jFramePlacaVideo.getjButtonProximo()) {
                Controller.iPV++;
                this.jFramePlacaVideo.getjButtonAnterior().setEnabled(true);
                this.jFramePlacaVideo.getjButtonProximo().setEnabled(Controller.iPV < Controller.placasVideo.size() - 1);
                this.jFramePlacaVideo.setarCampos(Controller.iPV);
            } else if (source == this.jFrameProcessador.getjButtonProximo()) {
                Controller.iProc++;
                this.jFrameProcessador.getjButtonAnterior().setEnabled(true);
                this.jFrameProcessador.getjButtonProximo().setEnabled(Controller.iProc < Controller.processadores.size() - 1);
                this.jFrameProcessador.setarCampos(Controller.iProc);
            } else if (source == this.jFrameUsuario.getjButtonProximo()) {
                Controller.iUsu++;
                this.jFrameUsuario.getjButtonAnterior().setEnabled(true);
                this.jFrameUsuario.getjButtonProximo().setEnabled(Controller.iUsu < Controller.usuarios.size() - 1);
                this.jFrameUsuario.setarCampos(Controller.iUsu);
            }
        } else if (source == this.jFrameConsultarJogos.getjButtonConsultar()) {
            boolean validado = true;
            String sql = "select * from JOGO J"
                    + " left join PROCESSADOR P on P.ID = J.MIN_REQ_PROCESSADOR"
                    + " left join MEMORIA M on M.ID = J.MIN_REQ_MEMORIA"
                    + " left join PLACA_VIDEO PV on PV.ID = J.MIN_REQ_PLACA_VIDEO"
                    + " left join PROCESSADOR PVP on PV.ID_PROCESSADOR = PVP.ID"
                    + " left join MEMORIA PVM on PV.ID_MEMORIA = PVM.ID"
                    + " where J.ID is not null";
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarNome().isSelected()) {
                String operador = "";
                switch (this.jFrameConsultarJogos.getjComboBoxNome().getSelectedIndex()) {
                    case 0: operador = "like '" + this.jFrameConsultarJogos.getjTextFieldNome().getText() + "%'";
                        break;
                    case 1: operador = "like '%" + this.jFrameConsultarJogos.getjTextFieldNome().getText() + "'";
                        break;
                    case 2: operador = "like '%" + this.jFrameConsultarJogos.getjTextFieldNome().getText() + "%'";
                        break;
                    case 3: operador = "= '" + this.jFrameConsultarJogos.getjTextFieldNome().getText() + "'";
                        break;                        
                }
                sql += " and J.NOME " + operador; 
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarDescricao().isSelected()) {
                String operador = "";
                switch (this.jFrameConsultarJogos.getjComboBoxDescricao().getSelectedIndex()) {
                    case 0: operador = "like '" + this.jFrameConsultarJogos.getjTextFieldDescricao().getText() + "%'";
                        break;
                    case 1: operador = "like '%" + this.jFrameConsultarJogos.getjTextFieldDescricao().getText() + "'";
                        break;
                    case 2: operador = "like '%" + this.jFrameConsultarJogos.getjTextFieldDescricao().getText() + "%'";
                        break;
                    case 3: operador = "= '" + this.jFrameConsultarJogos.getjTextFieldDescricao().getText() + "'";
                        break;                        
                }
                sql += " and J.DESCRICAO " + operador;
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarMemoria().isSelected() &&
                    this.jFrameConsultarJogos.getjTableMemoria().getSelectedRow() >= 0) {
                sql += " and J.MIN_REQ_MEMORIA = " + this.jFrameConsultarJogos.getModelMem().getValueAt(this.jFrameConsultarJogos.getjTableMemoria().getSelectedRow(), 0);
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarProcessador().isSelected() &&
                    this.jFrameConsultarJogos.getjTableProcessador().getSelectedRow() >= 0) {
                sql += " and J.MIN_REQ_PROCESSADOR = " + this.jFrameConsultarJogos.getModelProc().getValueAt(this.jFrameConsultarJogos.getjTableProcessador().getSelectedRow(), 0);
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarPlacaVideo().isSelected() &&
                    this.jFrameConsultarJogos.getjTablePlacaVideo().getSelectedRow() >= 0) {
                sql += " and J.MIN_REQ_PLACA_VIDEO = " + this.jFrameConsultarJogos.getModelPV().getValueAt(this.jFrameConsultarJogos.getjTablePlacaVideo().getSelectedRow(), 0);
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarPreco1().isSelected()) {
                if (this.jFrameConsultarJogos.getjTextFieldPreco1().getText().contains(",")) {
                    String aux[] = this.jFrameConsultarJogos.getjTextFieldPreco1().getText().split(",");
                    this.jFrameConsultarJogos.getjTextFieldPreco1().setText(aux[0]+"."+aux[1]);
                }                
                Double preco1 = 0.0;
                try {
                    preco1 = Double.parseDouble(this.jFrameConsultarJogos.getjTextFieldPreco1().getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido para o Primeiro Preço", "Erro", JOptionPane.ERROR_MESSAGE);
                    validado = false;
                }
                String operador = "";
                switch (this.jFrameConsultarJogos.getjComboBoxPreco1().getSelectedIndex()) {
                    case 0: operador = " > ";
                        break;
                    case 1: operador = " < ";
                        break;
                    case 2: operador = " >= ";
                        break;
                    case 3: operador = " <= ";
                        break;
                    case 4: operador = " = ";
                        break;
                    case 5: operador = " <> ";
                        break;
                }
                sql += " and J.PRECO" + operador + preco1;
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarPreco2().isSelected()) {
                if (this.jFrameConsultarJogos.getjTextFieldPreco2().getText().contains(",")) {
                    String aux[] = this.jFrameConsultarJogos.getjTextFieldPreco2().getText().split(",");
                    this.jFrameConsultarJogos.getjTextFieldPreco2().setText(aux[0]+"."+aux[1]);
                }                
                Double preco2 = 0.0;
                try {
                    preco2 = Double.parseDouble(this.jFrameConsultarJogos.getjTextFieldPreco2().getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Valor inválido para o Segundo Preço", "Erro", JOptionPane.ERROR_MESSAGE);
                    validado = false;
                }
                String operador = "";
                switch (this.jFrameConsultarJogos.getjComboBoxPreco2().getSelectedIndex()) {
                    case 0: operador = " > ";
                        break;
                    case 1: operador = " < ";
                        break;
                    case 2: operador = " >= ";
                        break;
                    case 3: operador = " <= ";
                        break;
                    case 4: operador = " = ";
                        break;
                    case 5: operador = " <> ";
                        break;
                }
                sql += " and J.PRECO" + operador + preco2;
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarWebcam().isSelected()) {
                if (this.jFrameConsultarJogos.getjCheckBoxPrecisaWebcam().isSelected()) {
                    sql += " and J.PRECISA_WEBCAM = 'T'";
                } else {
                    sql += " and J.PRECISA_WEBCAM = 'F'";
                }
            }
            if (this.jFrameConsultarJogos.getjCheckBoxFiltrarWireless().isSelected()) {
                if (this.jFrameConsultarJogos.getjCheckBoxPrecisaWireless().isSelected()) {
                    sql += " and J.PRECISA_WIRELESS = 'T'";
                } else {
                    sql += " and J.PRECISA_WIRELESS = 'F'";
                }
            }
            sql += " order by J.NOME";
            if (validado) {
                ResultSet rs = this.dao.consultar(sql);            
                try {
                    int contagem = 0;
                    DecimalFormat fmt = new DecimalFormat("0.00");
                    ArrayList<String[]> valores = new ArrayList<>();
                    while (rs.next()) {
                        valores.add(new String[]{rs.getString("J.NOME"),
                            rs.getString("P.FABRICANTE") + " - " + rs.getString("P.VALOR_FREQUENCIA") + " " + rs.getString("P.UNIDADE_FREQUENCIA") + " " + rs.getInt("P.NUMERO_NUCLEOS") + "Core",
                            rs.getString("M.TECNOLOGIA") + " - " + rs.getInt("M.VALOR_CAPACIDADE") + " " + rs.getString("M.UNIDADE_CAPACIDADE"),
                            rs.getString("PV.FABRICANTE") + " - " + rs.getString("PVP.VALOR_FREQUENCIA") + " " + rs.getString("PVP.UNIDADE_FREQUENCIA") + " " + rs.getInt("PVM.VALOR_CAPACIDADE") + rs.getString("PVM.UNIDADE_CAPACIDADE"),
                            "R$ " + fmt.format(rs.getDouble("J.PRECO"))});
                        contagem++;
                    }
                    if (contagem == 0) {
                        JOptionPane.showMessageDialog(null, "Sua pesquisa não retornou nenhum resultado", "Consultar Jogos", JOptionPane.INFORMATION_MESSAGE);                    
                    } else {
                        Object[][] dados = new Object[valores.size()][5];
                        for (int i = 0; i < valores.size(); i++) {
                            dados[i][0] = valores.get(i)[0];
                            dados[i][1] = valores.get(i)[1];
                            dados[i][2] = valores.get(i)[2];
                            dados[i][3] = valores.get(i)[3];
                            dados[i][4] = valores.get(i)[4];
                        }
                        this.jFrameResultadoPesquisa.getModelPesquisa().getDataVector().clear();
                        this.jFrameResultadoPesquisa.setModelPesquisa(new DefaultTableModel(dados, new String[]{"Jogo", "Processador Mínimo", "Memória Mínima", "Placa de Vídeo Mínima", "Preço"}));
                        this.jFrameResultadoPesquisa.getjTablePesquisa().setModel(this.jFrameResultadoPesquisa.getModelPesquisa());
                        this.jFrameResultadoPesquisa.setVisible(true);            
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
        } else if (source == this.jFrameConsultarJogos.getjButtonVoltar()) {
            this.jFrameConsultarJogos.dispose();
        } else if (source == this.jFrameInicial.getjButtonEntrar()) {
            boolean valida = true;
            if (this.jFrameInicial.getjTextFieldLogin().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta informar o login");
                valida = false;
            }
            if (this.jFrameInicial.getjPasswordFieldSenha().getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta informar a senha");
                valida = false;
            }
            if (valida) {
                Controller.usuarioLogado = this.validarLogin(String.valueOf(this.jFrameInicial.getjTextFieldLogin().getText()), String.valueOf(this.jFrameInicial.getjPasswordFieldSenha().getText()));
                if (Controller.usuarioLogado == null) {
                    JOptionPane.showMessageDialog(null, "Login e/ou senha incorreto(s)", "Erro", JOptionPane.WARNING_MESSAGE);
                } else {
                    this.jFrameInicial.dispose();
                    this.jFramePrincipal.getjLabelNome().setText(Controller.usuarioLogado.getNome());
                    this.jFramePrincipal.getjButtonGerenciarUsuarios().setVisible(Controller.usuarioLogado.ehAdministrador());
                    this.jFramePrincipal.getjMenuItemGerenciarUsuarios().setVisible(this.jFramePrincipal.getjButtonGerenciarUsuarios().isVisible());
                    this.jFramePrincipal.getjMenuItemGerenciarJogos().setVisible(Controller.usuarioLogado.ehAdministrador());
                    this.jFramePrincipal.getjMenuItemGerenciarProcessadores().setVisible(Controller.usuarioLogado.ehAdministrador());
                    this.jFramePrincipal.getjMenuItemGerenciarMemorias().setVisible(Controller.usuarioLogado.ehAdministrador());
                    this.jFramePrincipal.getjMenuItemGerenciarPlacasVideo().setVisible(Controller.usuarioLogado.ehAdministrador());
                    this.setComputadores();
                    this.atualizarTabelaInicial();
                    this.jFramePrincipal.setVisible(true);
                }
            }            
        } else if (source == this.jFrameInicial.getjButtonSair()) {
            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resposta == JOptionPane.YES_OPTION) {
                this.jFrameInicial.dispose();
                System.exit(0x0);
            }
        } else if (source == this.jFrameJogo.getjButtonAdd()) {
            if (this.jFrameJogo.getjTableEscolhidos().getRowCount() < 3) {
                if (this.jFrameJogo.getjCheckBoxAdicioneNovo().isSelected() && !this.jFrameJogo.getjTextFieldAdicioneNovo().getText().equals("")) {
                    boolean jaInserido = false;
                    for (int i = 0; i < this.jFrameJogo.getModelEscolhidos().getRowCount(); i++) {
                        if (String.valueOf(this.jFrameJogo.getModelEscolhidos().getValueAt(i, 0)).toUpperCase().equals(this.jFrameJogo.getjTextFieldAdicioneNovo().getText().toUpperCase())) {
                            jaInserido = true;
                            break;
                        }
                    }
                    if (!jaInserido) {
                        this.jFrameJogo.getModelEscolhidos().insertRow(this.jFrameJogo.getjTableEscolhidos().getRowCount(), new Object[]{this.jFrameJogo.getjTextFieldAdicioneNovo().getText()});
                    }
                } else if (!this.jFrameJogo.getjCheckBoxAdicioneNovo().isSelected() && this.jFrameJogo.getjTableDisponiveis().getSelectedRow() >= 0) {
                    int linhaEscolhida = this.jFrameJogo.getjTableDisponiveis().getSelectedRow();
                    boolean jaInserido = false;
                    for (int i = 0; i < this.jFrameJogo.getModelEscolhidos().getRowCount(); i++) {
                        if (String.valueOf(this.jFrameJogo.getModelEscolhidos().getValueAt(i, 0)).toUpperCase().equals(String.valueOf(this.jFrameJogo.getModelDisponiveis().getValueAt(linhaEscolhida, 0)).toUpperCase())) {
                            jaInserido = true;
                            break;
                        }
                    }
                    if (!jaInserido) {
                        this.jFrameJogo.getModelEscolhidos().insertRow(this.jFrameJogo.getjTableEscolhidos().getRowCount(), new Object[]{this.jFrameJogo.getModelDisponiveis().getValueAt(linhaEscolhida, 0)});
                        this.jFrameJogo.getModelDisponiveis().removeRow(linhaEscolhida);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Você já adicionou o máximo de 3 sistemas operacionais para este jogo", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } else if (source == this.jFrameJogo.getjButtonRemover()) {
            if (this.jFrameJogo.getjTableEscolhidos().getSelectedRow() >= 0) {
                int linhaEscolhida = this.jFrameJogo.getjTableEscolhidos().getSelectedRow();
                boolean jaInserido = false;
                for (int i = 0; i < this.jFrameJogo.getModelDisponiveis().getRowCount(); i++) {
                    if (String.valueOf(this.jFrameJogo.getModelEscolhidos().getValueAt(linhaEscolhida, 0)).toUpperCase().equals(String.valueOf(this.jFrameJogo.getModelDisponiveis().getValueAt(i, 0)).toUpperCase())) {
                        jaInserido = true;
                        break;
                    }
                }
                if (!jaInserido) {
                    this.jFrameJogo.getModelDisponiveis().insertRow(this.jFrameJogo.getjTableDisponiveis().getRowCount(), new Object[]{this.jFrameJogo.getModelEscolhidos().getValueAt(linhaEscolhida, 0)});
                }
                this.jFrameJogo.getModelEscolhidos().removeRow(linhaEscolhida);                
            }
        } else if (source == this.jFramePrincipal.getjButtonAlterarSenha() || source == this.jFramePrincipal.getjMenuItemAlterarSenha()) {
            this.jFrameAlterarSenha.zerarCampos();
            this.jFrameAlterarSenha.setVisible(true);
        } else if (source == this.jFramePrincipal.getjButtonComprarJogo() || source == this.jFramePrincipal.getjMenuItemComprarJogo()) {
            this.setJogos();
            Object[][] dados = new Object[Controller.jogos.size()][2];
            DecimalFormat fmt = new DecimalFormat("0.00");
            for (int i = 0; i < Controller.jogos.size(); i++) {
                dados[i][0] = Controller.jogos.get(i).getNome();
                dados[i][1] = "R$ " + fmt.format(Controller.jogos.get(i).getPreco());
            }
            this.jFrameComprarJogo.setModelJogos(new DefaultTableModel(dados, new Object[]{"Nome", "Preço"}));
            this.jFrameComprarJogo.getjTableJogos().setModel(this.jFrameComprarJogo.getModelJogos());
            this.jFrameComprarJogo.setVisible(true);
        } else if (source == this.jFramePrincipal.getjButtonConsultarJogos() || source == this.jFramePrincipal.getjMenuItemConsultarJogos()) {
            this.setMemorias();
            this.setProcessadores();
            this.setPlacasVideo();
            Object[][] dados = new Object[Controller.memorias.size()][4];
            for (int i = 0; i < Controller.memorias.size(); i++) {                    
                dados[i][0] = Controller.memorias.get(i).getId();
                dados[i][1] = Controller.memorias.get(i).getFabricante();
                dados[i][2] = Controller.memorias.get(i).getTecnologia();
                dados[i][3] = Controller.memorias.get(i).getValorCapacidade() + " " + Controller.memorias.get(i).getUnidadeCapacidade();
            }
            this.jFrameConsultarJogos.setModelMem(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Tecnologia", "Armazenamento"}));
            this.jFrameConsultarJogos.getjTableMemoria().setModel(this.jFrameConsultarJogos.getModelMem());

            dados = new Object[Controller.processadores.size()][4];
            for (int i = 0; i < Controller.processadores.size(); i++) {
                dados[i][0] = Controller.processadores.get(i).getId();
                dados[i][1] = Controller.processadores.get(i).getFabricante();
                dados[i][2] = Controller.processadores.get(i).getNumNucleos();
                dados[i][3] = Controller.processadores.get(i).getValorFrequencia() + " " + Controller.processadores.get(i).getUnidadeFrequencia();
            }
            this.jFrameConsultarJogos.setModelProc(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Núm. Núcleos", "Frequência"}));
            this.jFrameConsultarJogos.getjTableProcessador().setModel(this.jFrameConsultarJogos.getModelProc());

            dados = new Object[Controller.placasVideo.size()][4];
            for (int i = 0; i < Controller.placasVideo.size(); i++) {
                dados[i][0] = Controller.placasVideo.get(i).getId();
                dados[i][1] = Controller.placasVideo.get(i).getFabricante();
                dados[i][2] = Controller.placasVideo.get(i).getProcessador().getFabricante() + " - " + Controller.placasVideo.get(i).getProcessador().getValorFrequencia() + " " + Controller.placasVideo.get(i).getProcessador().getUnidadeFrequencia();
                dados[i][3] = Controller.placasVideo.get(i).getMemoria().getTecnologia() + " - " + Controller.placasVideo.get(i).getMemoria().getValorCapacidade() + " " + Controller.placasVideo.get(i).getMemoria().getUnidadeCapacidade();
            }
            this.jFrameConsultarJogos.setModelPV(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Processador", "Memória"}));
            this.jFrameConsultarJogos.getjTablePlacaVideo().setModel(this.jFrameConsultarJogos.getModelPV());                
            
            this.jFrameConsultarJogos.setVisible(true);
        } else if (source == this.jFramePrincipal.getjButtonGerenciarUsuarios() || source == this.jFramePrincipal.getjMenuItemGerenciarUsuarios()) {
            this.setUsuarios();
            Controller.iUsu = (Controller.usuarios.isEmpty() ? -1 : 0);
            this.jFrameUsuario.cancelarEdicao();
            this.jFrameUsuario.setarCampos(Controller.iUsu);
            this.jFrameUsuario.setVisible(true);
        } else if (source == this.jFramePrincipal.getjButtonConsolidarSelecao()) {
            if (this.jFramePrincipal.getjTableComputadores().getSelectedRow() >= 0) {
                Controller.computadorAtual = Controller.computadores.get(this.jFramePrincipal.getjTableComputadores().getSelectedRow());
                JOptionPane.showMessageDialog(null, "O computador selecionado foi adicionado na memória do sistema!", "Computador consolidado", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (source == this.jFramePrincipal.getjMenuItemGerenciarComputadores()) {
            this.setMemorias();
            this.setProcessadores();
            this.setPlacasVideo();
            this.setComputadores();
            Object[][] dados = new Object[Controller.memorias.size()][4];
            for (int i = 0; i < Controller.memorias.size(); i++) {                    
                dados[i][0] = Controller.memorias.get(i).getId();
                dados[i][1] = Controller.memorias.get(i).getFabricante();
                dados[i][2] = Controller.memorias.get(i).getTecnologia();
                dados[i][3] = Controller.memorias.get(i).getValorCapacidade() + Controller.memorias.get(i).getUnidadeCapacidade();
            }
            this.jFrameComputador.setModelMem(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Tecnologia", "Armazenamento"}));
            this.jFrameComputador.getjTableMemoria().setModel(this.jFrameComputador.getModelMem());

            dados = new Object[Controller.processadores.size()][4];
            for (int i = 0; i < Controller.processadores.size(); i++) {
                dados[i][0] = Controller.processadores.get(i).getId();
                dados[i][1] = Controller.processadores.get(i).getFabricante();
                dados[i][2] = Controller.processadores.get(i).getNumNucleos();
                dados[i][3] = Controller.processadores.get(i).getValorFrequencia() + " " + Controller.processadores.get(i).getUnidadeFrequencia();
            }
            this.jFrameComputador.setModelProc(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Núm. Núcleos", "Frequência"}));
            this.jFrameComputador.getjTableProcessador().setModel(this.jFrameComputador.getModelProc());

            dados = new Object[Controller.placasVideo.size()][4];
            for (int i = 0; i < Controller.placasVideo.size(); i++) {
                dados[i][0] = Controller.placasVideo.get(i).getId();
                dados[i][1] = Controller.placasVideo.get(i).getFabricante();
                dados[i][2] = Controller.placasVideo.get(i).getProcessador().getFabricante() + " - " + Controller.placasVideo.get(i).getProcessador().getValorFrequencia() + " " + Controller.placasVideo.get(i).getProcessador().getUnidadeFrequencia();
                dados[i][3] = Controller.placasVideo.get(i).getMemoria().getTecnologia() + " - " + Controller.placasVideo.get(i).getMemoria().getValorCapacidade() + " " + Controller.placasVideo.get(i).getMemoria().getUnidadeCapacidade();
            }
            this.jFrameComputador.setModelPV(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Processador", "Memória"}));
            this.jFrameComputador.getjTablePlacaVideo().setModel(this.jFrameComputador.getModelPV());
            Controller.iComp = (Controller.computadores.isEmpty() ? -1 : 0);
            this.jFrameComputador.cancelarEdicao();
            this.jFrameComputador.setarCampos(Controller.iComp);
            this.jFrameComputador.setVisible(true);
        } else if (source == this.jFramePrincipal.getjMenuItemGerenciarJogos()) {
            this.setJogos();
            this.setMemorias();
            this.setProcessadores();
            this.setPlacasVideo();
            Object[][] dados = new Object[Controller.memorias.size()][4];
            for (int i = 0; i < Controller.memorias.size(); i++) {                    
                dados[i][0] = Controller.memorias.get(i).getId();
                dados[i][1] = Controller.memorias.get(i).getFabricante();
                dados[i][2] = Controller.memorias.get(i).getTecnologia();
                dados[i][3] = Controller.memorias.get(i).getValorCapacidade() + Controller.memorias.get(i).getUnidadeCapacidade();
            }
            this.jFrameJogo.setModelMem(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Tecnologia", "Armazenamento"}));
            this.jFrameJogo.getjTableMemoria().setModel(this.jFrameJogo.getModelMem());

            dados = new Object[Controller.processadores.size()][4];
            for (int i = 0; i < Controller.processadores.size(); i++) {
                dados[i][0] = Controller.processadores.get(i).getId();
                dados[i][1] = Controller.processadores.get(i).getFabricante();
                dados[i][2] = Controller.processadores.get(i).getNumNucleos();
                dados[i][3] = Controller.processadores.get(i).getValorFrequencia() + " " + Controller.processadores.get(i).getUnidadeFrequencia();
            }
            this.jFrameJogo.setModelProc(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Núm. Núcleos", "Frequência"}));
            this.jFrameJogo.getjTableProcessador().setModel(this.jFrameJogo.getModelProc());

            dados = new Object[Controller.placasVideo.size()][4];
            for (int i = 0; i < Controller.placasVideo.size(); i++) {
                dados[i][0] = Controller.placasVideo.get(i).getId();
                dados[i][1] = Controller.placasVideo.get(i).getFabricante();
                dados[i][2] = Controller.placasVideo.get(i).getProcessador().getFabricante() + " - " + Controller.placasVideo.get(i).getProcessador().getValorFrequencia() + " " + Controller.placasVideo.get(i).getProcessador().getUnidadeFrequencia();
                dados[i][3] = Controller.placasVideo.get(i).getMemoria().getTecnologia() + " - " + Controller.placasVideo.get(i).getMemoria().getValorCapacidade() + " " + Controller.placasVideo.get(i).getMemoria().getUnidadeCapacidade();
            }
            this.jFrameJogo.setModelPV(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Processador", "Memória"}));
            this.jFrameJogo.getjTablePlacaVideo().setModel(this.jFrameJogo.getModelPV());                
            Controller.iJogo = (Controller.jogos.isEmpty() ? -1 : 0);
            this.jFrameJogo.cancelarEdicao();
            this.jFrameJogo.setarCampos(Controller.iJogo);
            this.jFrameJogo.setVisible(true);
        } else if (source == this.jFramePrincipal.getjMenuItemGerenciarMemorias()) {
            this.setMemorias();
            Controller.iMem = (Controller.memorias.isEmpty() ? -1 : 0);
            this.jFrameMemoria.cancelarEdicao();
            this.jFrameMemoria.setarCampos(Controller.iMem);
            this.jFrameMemoria.setVisible(true);
        } else if (source == this.jFramePrincipal.getjMenuItemGerenciarPlacasVideo()) {
            this.setPlacasVideo();
            this.setProcessadores();
            this.setMemorias();
            Object[][] dados = new Object[Controller.memorias.size()][4];
            for (int i = 0; i < Controller.memorias.size(); i++) {                    
                dados[i][0] = Controller.memorias.get(i).getId();
                dados[i][1] = Controller.memorias.get(i).getFabricante();
                dados[i][2] = Controller.memorias.get(i).getTecnologia();
                dados[i][3] = Controller.memorias.get(i).getValorCapacidade() + Controller.memorias.get(i).getUnidadeCapacidade();
            }
            this.jFramePlacaVideo.setModelMem(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Tecnologia", "Armazenamento"}));
            this.jFramePlacaVideo.getjTableMemoria().setModel(this.jFramePlacaVideo.getModelMem());

            dados = new Object[Controller.processadores.size()][4];
            for (int i = 0; i < Controller.processadores.size(); i++) {
                dados[i][0] = Controller.processadores.get(i).getId();
                dados[i][1] = Controller.processadores.get(i).getFabricante();
                dados[i][2] = Controller.processadores.get(i).getNumNucleos();
                dados[i][3] = Controller.processadores.get(i).getValorFrequencia() + " " + Controller.processadores.get(i).getUnidadeFrequencia();
            }
            this.jFramePlacaVideo.setModelProc(new DefaultTableModel(dados, new Object[]{"ID", "Fabricante", "Núm. Núcleos", "Frequência"}));
            this.jFramePlacaVideo.getjTableProcessador().setModel(this.jFramePlacaVideo.getModelProc());
            Controller.iPV = (Controller.placasVideo.isEmpty() ? -1 : 0);
            this.jFramePlacaVideo.cancelarEdicao();
            this.jFramePlacaVideo.setarCampos(Controller.iPV);
            this.jFramePlacaVideo.setVisible(true);
        } else if (source == this.jFramePrincipal.getjMenuItemGerenciarProcessadores()) {
            this.setProcessadores();
            Controller.iProc = (Controller.processadores.isEmpty() ? -1 : 0);
            this.jFrameProcessador.cancelarEdicao();
            this.jFrameProcessador.setarCampos(Controller.iProc);
            this.jFrameProcessador.setVisible(true);
        } else if (source == this.jFramePrincipal.getjMenuItemSair()) {            
            int resposta = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Sair", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (resposta == JOptionPane.YES_OPTION) {
                this.jFramePrincipal.dispose();
                System.exit(0x0);
            }
        } else if (source == this.jFramePrincipal.getjButtonLimparSelecao()) {
            this.jFramePrincipal.getjTableComputadores().clearSelection();
            if (Controller.computadorAtual != null) {
                Controller.computadorAtual = null;
                JOptionPane.showMessageDialog(null, "Seu computador foi removido da memória do sistema!", "Computador removido", JOptionPane.INFORMATION_MESSAGE);
            }            
        } else if (source == this.jFrameResultadoPesquisa.getjButtonVoltar()) {
            this.jFrameResultadoPesquisa.dispose();
        } else if (source == this.jFrameVerificacao.getjButtonComprar()) {
            if (((this.getIndiceArray(new String[]{"RUIM", "MUITO RUIM", "NULA"}, this.jFrameVerificacao.getjLabelPerformance().getText()) >= 0) &&
                JOptionPane.showConfirmDialog(null, "Você tem certeza que quer comprar o jogo? Ele apresentou uma performance " + this.jFrameVerificacao.getjLabelPerformance().getText() + " na nossa verificação...", "Deseja realmente comprar?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) ||
                this.getIndiceArray(new String[]{"RUIM", "MUITO RUIM", "NULA"}, this.jFrameVerificacao.getjLabelPerformance().getText()) < 0) {
                DecimalFormat fmt = new DecimalFormat("0.00");
                JOptionPane.showMessageDialog(null, "Jogo comprado! Você recebeu uma nova conta de R$" + fmt.format(this.jogoEscolhido.getPreco()));
                this.jFrameVerificacao.dispose();                    
            }
        } else if (source == this.jFrameVerificacao.getjButtonVoltar()) {
            this.jFrameVerificacao.dispose();
        }
    }
}