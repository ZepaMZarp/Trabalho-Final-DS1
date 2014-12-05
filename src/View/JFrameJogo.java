package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFrameJogo extends javax.swing.JFrame {

    private DefaultTableModel modelDisponiveis = new DefaultTableModel();
    private DefaultTableModel modelEscolhidos = new DefaultTableModel();
    private DefaultTableModel modelProc = new DefaultTableModel();
    private DefaultTableModel modelMem = new DefaultTableModel();
    private DefaultTableModel modelPV = new DefaultTableModel();
    private boolean editando = false;
   
    public JFrameJogo() {
        initComponents();
        this.jTableDisponiveis.setModel(this.modelDisponiveis);
        this.jTableEscolhidos.setModel(this.modelEscolhidos);
        this.setTitle("Jogo");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JButton getjButtonAdd() {
        return jButtonAdd;
    }

    public JButton getjButtonAnterior() {
        return jButtonAnterior;
    }

    public JButton getjButtonEditar() {
        return jButtonEditar;
    }

    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    public JButton getjButtonFechar() {
        return jButtonFechar;
    }

    public JButton getjButtonGravar() {
        return jButtonGravar;
    }

    public JButton getjButtonNovo() {
        return jButtonNovo;
    }

    public JButton getjButtonProximo() {
        return jButtonProximo;
    }

    public JButton getjButtonRemover() {
        return jButtonRemover;
    }

    public JCheckBox getjCheckBoxPrecisaWebcam() {
        return jCheckBoxPrecisaWebcam;
    }

    public JCheckBox getjCheckBoxPrecisaWireless() {
        return jCheckBoxPrecisaWireless;
    }

    public JTable getjTableDisponiveis() {
        return jTableDisponiveis;
    }

    public JTable getjTableEscolhidos() {
        return jTableEscolhidos;
    }

    public JTable getjTableMemoria() {
        return jTableMemoria;
    }

    public JTable getjTablePlacaVideo() {
        return jTablePlacaVideo;
    }

    public JTable getjTableProcessador() {
        return jTableProcessador;
    }

    public JTextArea getjTextAreaDescricao() {
        return jTextAreaDescricao;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JTextField getjTextFieldPreco() {
        return jTextFieldPreco;
    }

    public JCheckBox getjCheckBoxAdicioneNovo() {
        return jCheckBoxAdicioneNovo;
    }

    public JTextField getjTextFieldAdicioneNovo() {
        return jTextFieldAdicioneNovo;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

    public boolean isEditando() {
        return editando;
    }

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public void setjLabelRegistroAtual(JLabel jLabelRegistroAtual) {
        this.jLabelRegistroAtual = jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
    }

    public void setjLabelRegistroTotal(JLabel jLabelRegistroTotal) {
        this.jLabelRegistroTotal = jLabelRegistroTotal;
    }

    public DefaultTableModel getModelDisponiveis() {
        return modelDisponiveis;
    }

    public void setModelDisponiveis(DefaultTableModel modelDisponiveis) {
        this.modelDisponiveis = modelDisponiveis;
    }

    public DefaultTableModel getModelEscolhidos() {
        return modelEscolhidos;
    }

    public void setModelEscolhidos(DefaultTableModel modelEscolhidos) {
        this.modelEscolhidos = modelEscolhidos;
    }

    public DefaultTableModel getModelProc() {
        return modelProc;
    }

    public void setModelProc(DefaultTableModel modelProc) {
        this.modelProc = modelProc;
    }

    public DefaultTableModel getModelMem() {
        return modelMem;
    }

    public void setModelMem(DefaultTableModel modelMem) {
        this.modelMem = modelMem;
    }

    public DefaultTableModel getModelPV() {
        return modelPV;
    }

    public void setModelPV(DefaultTableModel modelPV) {
        this.modelPV = modelPV;
    }
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            for (int i = 0 ; i < this.modelEscolhidos.getRowCount(); i++) {
                this.modelEscolhidos.removeRow(i);
            }
            if (Controller.Controller.jogos.get(indice).getReqSistemasOperacionais() != null) {
                String[][] dados = new String[3][1];
                for (int i = 0; i < Controller.Controller.jogos.get(indice).getReqSistemasOperacionais().length; i++) {
                    try {
                        if (Controller.Controller.jogos.get(indice) != null && !Controller.Controller.jogos.get(indice).getReqSistemasOperacionais()[i].equals("null")) {
                            dados[i][0] = Controller.Controller.jogos.get(indice).getReqSistemasOperacionais()[i];
                        }                        
                    } catch (NullPointerException e) {
                        i++;
                    }
                }
                this.modelEscolhidos = new DefaultTableModel(dados, new String[]{"Escolhidos"});
                for (int i = 0; i < this.modelEscolhidos.getRowCount(); i++) {
                    if (this.modelEscolhidos.getValueAt(i, 0) == null) {
                        this.modelEscolhidos.removeRow(i);
                        i--;
                    }
                }
                this.jTableEscolhidos.setModel(this.modelEscolhidos);                
            }
            if (Controller.Controller.jogos.get(indice).getMinReqMemoria() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableMemoria().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.modelMem.getValueAt(i, 0))) == Controller.Controller.jogos.get(indice).getMinReqMemoria().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableMemoria().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            if (Controller.Controller.jogos.get(indice).getMinReqProcessador() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableProcessador().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.modelProc.getValueAt(i, 0))) == Controller.Controller.jogos.get(indice).getMinReqProcessador().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableProcessador().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            if (Controller.Controller.jogos.get(indice).getMinReqPlacaVideo()!= null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTablePlacaVideo().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.modelPV.getValueAt(i, 0))) == Controller.Controller.jogos.get(indice).getMinReqPlacaVideo().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTablePlacaVideo().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            this.getjTextFieldNome().setText(Controller.Controller.jogos.get(indice).getNome());
            this.getjTextAreaDescricao().setText(Controller.Controller.jogos.get(indice).getDescricao());
            this.getjCheckBoxPrecisaWebcam().setSelected(Controller.Controller.jogos.get(indice).precisaWebcam());
            this.getjCheckBoxPrecisaWireless().setSelected(Controller.Controller.jogos.get(indice).precisaWireless());
            this.getjTextFieldPreco().setText(String.valueOf(Controller.Controller.jogos.get(indice).getPreco()));
            this.getjButtonProximo().setEnabled(Controller.Controller.jogos.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.getjTextFieldNome().setEnabled(false);
            this.getjTextAreaDescricao().setEnabled(false);
            this.getjCheckBoxPrecisaWebcam().setEnabled(false);
            this.getjCheckBoxPrecisaWireless().setEnabled(false);
            this.getjTextFieldPreco().setEnabled(false);
            this.getjTableDisponiveis().setEnabled(false);
            this.getjTableEscolhidos().setEnabled(false);
            this.getjCheckBoxAdicioneNovo().setEnabled(false);
            this.getjTableMemoria().setEnabled(false);
            this.getjTablePlacaVideo().setEnabled(false);
            this.getjTableProcessador().setEnabled(false);
            this.jTabbedPanePrincipal.setEnabled(true);
            this.jLabelRegistroAtual.setText((Controller.Controller.jogos.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.jogos.size()));
            this.repaint();
        }
    }
    
    public void editarCampos() {
        this.editando = true;
        this.getjButtonNovo().setEnabled(false);
        this.getjButtonEditar().setEnabled(false);
        this.getjButtonExcluir().setEnabled(false);
        this.getjButtonGravar().setEnabled(true);
        this.getjButtonFechar().setText("Cancelar");
        this.getjButtonAdd().setEnabled(true);
        this.getjButtonRemover().setEnabled(true);
        this.getjButtonProximo().setEnabled(false);
        this.getjButtonAnterior().setEnabled(false);
        this.getjTextFieldNome().setEnabled(true);
        this.getjTextAreaDescricao().setEnabled(true);
        this.getjCheckBoxPrecisaWebcam().setEnabled(true);
        this.getjCheckBoxPrecisaWireless().setEnabled(true);
        this.getjTextFieldPreco().setEnabled(true);
        this.getjTableDisponiveis().setEnabled(true);
        this.getjTableEscolhidos().setEnabled(true);
        this.getjCheckBoxAdicioneNovo().setEnabled(true);
        this.getjTableMemoria().setEnabled(true);
        this.getjTablePlacaVideo().setEnabled(true);
        this.getjTableProcessador().setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.jogos.isEmpty() ? "0" : String.valueOf(Controller.Controller.iJogo+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.jogos.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonAdd().setEnabled(false);
        this.getjButtonRemover().setEnabled(false);
        this.getjButtonProximo().setEnabled(Controller.Controller.jogos.size() > Controller.Controller.iJogo+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iJogo > 0);
        this.getjTextFieldNome().setEnabled(false);
        this.getjTextAreaDescricao().setEnabled(false);
        this.getjCheckBoxPrecisaWebcam().setEnabled(false);
        this.getjCheckBoxPrecisaWireless().setEnabled(false);
        this.getjTextFieldPreco().setEnabled(false);
        this.getjTableDisponiveis().setEnabled(false);
        this.getjTableEscolhidos().setEnabled(false);
        this.getjCheckBoxAdicioneNovo().setEnabled(false);
        this.getjTableMemoria().setEnabled(false);
        this.getjTablePlacaVideo().setEnabled(false);
        this.getjTableProcessador().setEnabled(false);
        this.jTabbedPanePrincipal.setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.jogos.isEmpty() ? "0" : String.valueOf(Controller.Controller.iJogo+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.jogos.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(this.jTextFieldNome.getText());
        values.add(this.jTextAreaDescricao.getText());
        values.add(this.jTableProcessador.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelProc.getValueAt(this.jTableProcessador.getSelectedRow(), 0))) : null);
        values.add(this.jTableMemoria.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelMem.getValueAt(this.jTableMemoria.getSelectedRow(), 0))) : null);
        values.add(this.jTablePlacaVideo.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelPV.getValueAt(this.jTablePlacaVideo.getSelectedRow(), 0))) : null);
        values.add(String.valueOf(this.jTableEscolhidos.getRowCount() > 0 ? this.modelEscolhidos.getValueAt(0, 0) : null));
        values.add(String.valueOf(this.jTableEscolhidos.getRowCount() > 1 ? this.modelEscolhidos.getValueAt(1, 0) : null));
        values.add(String.valueOf(this.jTableEscolhidos.getRowCount() > 2 ? this.modelEscolhidos.getValueAt(2, 0) : null));
        values.add(this.jCheckBoxPrecisaWireless.isSelected() ? "T" : "F");
        values.add(this.jCheckBoxPrecisaWebcam.isSelected() ? "T" : "F");        
        values.add(this.jTextFieldPreco.getText());
        return values;
    }
    
    public void zerarCampos() {
        jTextFieldNome.setText("");
        jTextAreaDescricao.setText("");
        jCheckBoxPrecisaWebcam.setSelected(false);
        jCheckBoxPrecisaWireless.setSelected(false);
        jTextFieldPreco.setText("");
        for (int i = 0; i < this.jTableEscolhidos.getRowCount(); i++) {
            Object linha = this.modelEscolhidos.getValueAt(i, 0);
            this.modelEscolhidos.removeRow(i);
            this.modelDisponiveis.addRow(new Object[]{linha});
        }
        jTextFieldAdicioneNovo.setText("");
        jCheckBoxAdicioneNovo.setSelected(false);
        jTableDisponiveis.clearSelection();
        jTableEscolhidos.clearSelection();
        jTableMemoria.clearSelection();
        jTablePlacaVideo.clearSelection();
        jTableProcessador.clearSelection();
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jTextFieldNome.getText().equals("") ||
                (this.jTextAreaDescricao.getText().equals("")) ||
                (this.jTextFieldPreco.getText().equals("")) ||
                (this.jTableEscolhidos.getRowCount() == 0) ||
                (this.jTableMemoria.getSelectedRow() < 0 && this.jTableMemoria.getRowCount() > 0) ||
                (this.jTableProcessador.getSelectedRow() < 0 && this.jTableProcessador.getRowCount() > 0) ||
                (this.jTablePlacaVideo.getSelectedRow() < 0 && this.jTablePlacaVideo.getRowCount() > 0)) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar o jogo");
        }
        Double preco1 = 0.0;
        if (this.jTextFieldPreco.getText().contains(",")) {
            String[] aux = this.jTextFieldPreco.getText().split(",");
            this.jTextFieldPreco.setText(aux[0]+"."+aux[1]);
        }
        try {
            preco1 = Double.parseDouble(this.jTextFieldPreco.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para o campo Preço", "Erro", JOptionPane.ERROR_MESSAGE);
            validado = false;            
        }
        return validado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelRegistroAtual = new javax.swing.JLabel();
        jLabelDe = new javax.swing.JLabel();
        jLabelRegistroTotal = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanelInformacoesBasicas = new javax.swing.JPanel();
        jPanelJogoInformacoesBasicas = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDescricao = new javax.swing.JLabel();
        jScrollPaneDescricao = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();
        jCheckBoxPrecisaWebcam = new javax.swing.JCheckBox();
        jCheckBoxPrecisaWireless = new javax.swing.JCheckBox();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jPanelSistemasOperacionais = new javax.swing.JPanel();
        jScrollPaneDisponiveis = new javax.swing.JScrollPane();
        jTableDisponiveis = new javax.swing.JTable();
        jScrollPaneEscolhidos = new javax.swing.JScrollPane();
        jTableEscolhidos = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonRemover = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAdicioneNovo = new javax.swing.JTextField();
        jCheckBoxAdicioneNovo = new javax.swing.JCheckBox();
        jPanelRequisitosMinimos = new javax.swing.JPanel();
        jPanelJogoRequisitosMinimos = new javax.swing.JPanel();
        jPanelMemoria = new javax.swing.JPanel();
        jScrollPaneMemoria = new javax.swing.JScrollPane();
        jTableMemoria = new javax.swing.JTable();
        jPanelProcessador = new javax.swing.JPanel();
        jScrollPaneProcessador = new javax.swing.JScrollPane();
        jTableProcessador = new javax.swing.JTable();
        jPanelPlacaVideo = new javax.swing.JPanel();
        jScrollPanePlacaVideo = new javax.swing.JScrollPane();
        jTablePlacaVideo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRegistroAtual.setText("jLabel1");

        jLabelDe.setText("de");

        jLabelRegistroTotal.setText("jLabel3");

        jButtonNovo.setText("Novo");

        jButtonEditar.setText("Editar");

        jButtonExcluir.setText("Excluir");

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);

        jButtonFechar.setText("Fechar");

        jButtonProximo.setText(">");

        jButtonAnterior.setText("<");

        jPanelJogoInformacoesBasicas.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogo - Informações Básicas"));
        jPanelJogoInformacoesBasicas.setPreferredSize(new java.awt.Dimension(461, 437));

        jLabelNome.setText("Nome");

        jLabelDescricao.setText("Descrição");

        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setLineWrap(true);
        jTextAreaDescricao.setRows(5);
        jTextAreaDescricao.setTabSize(4);
        jScrollPaneDescricao.setViewportView(jTextAreaDescricao);

        jCheckBoxPrecisaWebcam.setText("Precisa Webcam");

        jCheckBoxPrecisaWireless.setText("Precisa Wireless");

        jLabelPreco.setText("Preço (R$)");

        jPanelSistemasOperacionais.setBorder(javax.swing.BorderFactory.createTitledBorder("Sistemas Operacionais Aceitos (No máximo 3)"));

        jTableDisponiveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disponíveis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneDisponiveis.setViewportView(jTableDisponiveis);

        jTableEscolhidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Escolhidos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneEscolhidos.setViewportView(jTableEscolhidos);

        jButtonAdd.setText("Add >");

        jButtonRemover.setText("< Remover");

        jLabel1.setText("ou...");

        jTextFieldAdicioneNovo.setEnabled(false);

        jCheckBoxAdicioneNovo.setText("Adicione um novo:");
        jCheckBoxAdicioneNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAdicioneNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSistemasOperacionaisLayout = new javax.swing.GroupLayout(jPanelSistemasOperacionais);
        jPanelSistemasOperacionais.setLayout(jPanelSistemasOperacionaisLayout);
        jPanelSistemasOperacionaisLayout.setHorizontalGroup(
            jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                        .addComponent(jCheckBoxAdicioneNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAdicioneNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                        .addGroup(jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonRemover)
                            .addComponent(jLabel1))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPaneEscolhidos, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSistemasOperacionaisLayout.setVerticalGroup(
            jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                .addGroup(jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSistemasOperacionaisLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPaneDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                        .addGroup(jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelSistemasOperacionaisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneEscolhidos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelSistemasOperacionaisLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButtonAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelSistemasOperacionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAdicioneNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxAdicioneNovo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelJogoInformacoesBasicasLayout = new javax.swing.GroupLayout(jPanelJogoInformacoesBasicas);
        jPanelJogoInformacoesBasicas.setLayout(jPanelJogoInformacoesBasicasLayout);
        jPanelJogoInformacoesBasicasLayout.setHorizontalGroup(
            jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogoInformacoesBasicasLayout.createSequentialGroup()
                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJogoInformacoesBasicasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelPreco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPaneDescricao)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelJogoInformacoesBasicasLayout.createSequentialGroup()
                                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxPrecisaWebcam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxPrecisaWireless)))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(jPanelJogoInformacoesBasicasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelSistemasOperacionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelJogoInformacoesBasicasLayout.setVerticalGroup(
            jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogoInformacoesBasicasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelDescricao)
                    .addComponent(jScrollPaneDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxPrecisaWebcam)
                    .addComponent(jCheckBoxPrecisaWireless))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelJogoInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelSistemasOperacionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelInformacoesBasicasLayout = new javax.swing.GroupLayout(jPanelInformacoesBasicas);
        jPanelInformacoesBasicas.setLayout(jPanelInformacoesBasicasLayout);
        jPanelInformacoesBasicasLayout.setHorizontalGroup(
            jPanelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(jPanelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInformacoesBasicasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelJogoInformacoesBasicas, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelInformacoesBasicasLayout.setVerticalGroup(
            jPanelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 459, Short.MAX_VALUE)
            .addGroup(jPanelInformacoesBasicasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelInformacoesBasicasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelJogoInformacoesBasicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPanePrincipal.addTab("Informações Básicas", jPanelInformacoesBasicas);

        jPanelJogoRequisitosMinimos.setBorder(javax.swing.BorderFactory.createTitledBorder("Jogo - Requisitos Mínimos"));

        jPanelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Memória"));

        jTableMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fabricante", "Tecnologia", "Armazenamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneMemoria.setViewportView(jTableMemoria);

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        jPanelProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));

        jTableProcessador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fabricante", "Núm. Núcleos", "Frequência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneProcessador.setViewportView(jTableProcessador);

        javax.swing.GroupLayout jPanelProcessadorLayout = new javax.swing.GroupLayout(jPanelProcessador);
        jPanelProcessador.setLayout(jPanelProcessadorLayout);
        jPanelProcessadorLayout.setHorizontalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelProcessadorLayout.setVerticalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPaneProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        jPanelPlacaVideo.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa de Vídeo"));

        jTablePlacaVideo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fabricante", "Memória", "Processador"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPanePlacaVideo.setViewportView(jTablePlacaVideo);

        javax.swing.GroupLayout jPanelPlacaVideoLayout = new javax.swing.GroupLayout(jPanelPlacaVideo);
        jPanelPlacaVideo.setLayout(jPanelPlacaVideoLayout);
        jPanelPlacaVideoLayout.setHorizontalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlacaVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPanePlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPlacaVideoLayout.setVerticalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlacaVideoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPanePlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240))
        );

        javax.swing.GroupLayout jPanelJogoRequisitosMinimosLayout = new javax.swing.GroupLayout(jPanelJogoRequisitosMinimos);
        jPanelJogoRequisitosMinimos.setLayout(jPanelJogoRequisitosMinimosLayout);
        jPanelJogoRequisitosMinimosLayout.setHorizontalGroup(
            jPanelJogoRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJogoRequisitosMinimosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJogoRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogoRequisitosMinimosLayout.createSequentialGroup()
                        .addComponent(jPanelProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanelJogoRequisitosMinimosLayout.createSequentialGroup()
                        .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelJogoRequisitosMinimosLayout.createSequentialGroup()
                        .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelJogoRequisitosMinimosLayout.setVerticalGroup(
            jPanelJogoRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJogoRequisitosMinimosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelRequisitosMinimosLayout = new javax.swing.GroupLayout(jPanelRequisitosMinimos);
        jPanelRequisitosMinimos.setLayout(jPanelRequisitosMinimosLayout);
        jPanelRequisitosMinimosLayout.setHorizontalGroup(
            jPanelRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
            .addGroup(jPanelRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRequisitosMinimosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelJogoRequisitosMinimos, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanelRequisitosMinimosLayout.setVerticalGroup(
            jPanelRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
            .addGroup(jPanelRequisitosMinimosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelRequisitosMinimosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanelJogoRequisitosMinimos, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jTabbedPanePrincipal.addTab("Requisitos Mínimos", jPanelRequisitosMinimos);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonFechar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroAtual)
                    .addComponent(jLabelDe)
                    .addComponent(jLabelRegistroTotal))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jButtonAnterior)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jButtonProximo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNovo)
                            .addComponent(jButtonEditar)
                            .addComponent(jButtonExcluir)
                            .addComponent(jButtonGravar)
                            .addComponent(jButtonFechar))
                        .addGap(58, 58, 58))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 565, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAdicioneNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAdicioneNovoActionPerformed
        this.jTextFieldAdicioneNovo.setEnabled(this.jCheckBoxAdicioneNovo.isSelected());
        this.jTableDisponiveis.setEnabled(!this.jCheckBoxAdicioneNovo.isSelected());
        if (this.jCheckBoxAdicioneNovo.isSelected()) {
            this.jTableDisponiveis.clearSelection();
        }
    }//GEN-LAST:event_jCheckBoxAdicioneNovoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JButton jButtonRemover;
    private javax.swing.JCheckBox jCheckBoxAdicioneNovo;
    private javax.swing.JCheckBox jCheckBoxPrecisaWebcam;
    private javax.swing.JCheckBox jCheckBoxPrecisaWireless;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JPanel jPanelInformacoesBasicas;
    private javax.swing.JPanel jPanelJogoInformacoesBasicas;
    private javax.swing.JPanel jPanelJogoRequisitosMinimos;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelPlacaVideo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProcessador;
    private javax.swing.JPanel jPanelRequisitosMinimos;
    private javax.swing.JPanel jPanelSistemasOperacionais;
    private javax.swing.JScrollPane jScrollPaneDescricao;
    private javax.swing.JScrollPane jScrollPaneDisponiveis;
    private javax.swing.JScrollPane jScrollPaneEscolhidos;
    private javax.swing.JScrollPane jScrollPaneMemoria;
    private javax.swing.JScrollPane jScrollPanePlacaVideo;
    private javax.swing.JScrollPane jScrollPaneProcessador;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTable jTableDisponiveis;
    private javax.swing.JTable jTableEscolhidos;
    private javax.swing.JTable jTableMemoria;
    private javax.swing.JTable jTablePlacaVideo;
    private javax.swing.JTable jTableProcessador;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextField jTextFieldAdicioneNovo;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables
}