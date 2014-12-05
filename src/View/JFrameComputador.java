package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFrameComputador extends javax.swing.JFrame {
    
    private DefaultTableModel modelProc = new DefaultTableModel();
    private DefaultTableModel modelMem = new DefaultTableModel();
    private DefaultTableModel modelPV = new DefaultTableModel();
    private boolean editando = false;

    public JFrameComputador() {
        initComponents();        
        this.setTitle("Computador");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.jTableMemoria.setModel(this.modelMem);
        this.jTableProcessador.setModel(this.modelProc);
        this.jTablePlacaVideo.setModel(this.modelPV);
    }

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
    }

    public void setModelProc(DefaultTableModel modelProc) {
        this.modelProc = modelProc;
    }

    public void setModelMem(DefaultTableModel modelMem) {
        this.modelMem = modelMem;
    }

    public void setModelPV(DefaultTableModel modelPV) {
        this.modelPV = modelPV;
    }
    
    public DefaultTableModel getModelMem() {
        return modelMem;
    }

    public DefaultTableModel getModelPV() {
        return modelPV;
    }

    public DefaultTableModel getModelProc() {
        return modelProc;
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

    public JCheckBox getjCheckBoxWebcam() {
        return jCheckBoxWebcam;
    }

    public JCheckBox getjCheckBoxWireless() {
        return jCheckBoxWireless;
    }

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
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

    public JTextField getjTextFieldSistemaOperacional() {
        return jTextFieldSistemaOperacional;
    }
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            if (Controller.Controller.computadores.get(indice).getMemoria() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableMemoria().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.getModelMem().getValueAt(i, 0))) == Controller.Controller.computadores.get(indice).getMemoria().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableMemoria().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            if (Controller.Controller.computadores.get(indice).getProcessador() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableProcessador().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.getModelProc().getValueAt(i, 0))) == Controller.Controller.computadores.get(indice).getProcessador().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableProcessador().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            if (Controller.Controller.computadores.get(indice).getPlacaVideo()!= null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTablePlacaVideo().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.getModelPV().getValueAt(i, 0))) == Controller.Controller.computadores.get(indice).getPlacaVideo().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTablePlacaVideo().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            this.getjTextFieldSistemaOperacional().setText(Controller.Controller.computadores.get(indice).getSistemaOperacional());
            this.getjCheckBoxWebcam().setSelected(Controller.Controller.computadores.get(indice).temWebcam());
            this.getjCheckBoxWireless().setSelected(Controller.Controller.computadores.get(indice).temWireless());                    
            this.getjButtonProximo().setEnabled(Controller.Controller.computadores.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.getjTextFieldSistemaOperacional().setEnabled(false);
            this.getjCheckBoxWebcam().setEnabled(false);
            this.getjCheckBoxWireless().setEnabled(false);
            this.getjTableMemoria().setEnabled(false);
            this.getjTablePlacaVideo().setEnabled(false);
            this.getjTableProcessador().setEnabled(false);
            this.getjLabelRegistroAtual().setText((Controller.Controller.computadores.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.getjLabelRegistroTotal().setText(String.valueOf(Controller.Controller.computadores.size()));
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
        this.getjButtonProximo().setEnabled(false);
        this.getjButtonAnterior().setEnabled(false);
        this.getjTextFieldSistemaOperacional().setEnabled(true);
        this.getjCheckBoxWebcam().setEnabled(true);
        this.getjCheckBoxWireless().setEnabled(true);
        this.getjTableMemoria().setEnabled(true);
        this.getjTablePlacaVideo().setEnabled(true);
        this.getjTableProcessador().setEnabled(true);
        this.getjLabelRegistroAtual().setText((Controller.Controller.computadores.isEmpty() ? "0" : String.valueOf(Controller.Controller.iComp+1)));
        this.getjLabelRegistroTotal().setText(String.valueOf(Controller.Controller.computadores.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonProximo().setEnabled(Controller.Controller.computadores.size() > Controller.Controller.iComp+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iComp > 0);
        this.getjTextFieldSistemaOperacional().setEnabled(false);
        this.getjCheckBoxWebcam().setEnabled(false);
        this.getjCheckBoxWireless().setEnabled(false);
        this.getjTableMemoria().setEnabled(false);
        this.getjTablePlacaVideo().setEnabled(false);
        this.getjTableProcessador().setEnabled(false);
        this.getjLabelRegistroAtual().setText((Controller.Controller.computadores.isEmpty() ? "0" : String.valueOf(Controller.Controller.iComp+1)));
        this.getjLabelRegistroTotal().setText(String.valueOf(Controller.Controller.computadores.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(jTableProcessador.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelProc.getValueAt(this.jTableProcessador.getSelectedRow(), 0))) : null);
        values.add(jTableMemoria.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelMem.getValueAt(this.jTableMemoria.getSelectedRow(), 0))) : null);
        values.add(jTablePlacaVideo.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelPV.getValueAt(this.jTablePlacaVideo.getSelectedRow(), 0))) : null);
        values.add(String.valueOf(this.jTextFieldSistemaOperacional.getText()));
        values.add(this.jCheckBoxWebcam.isSelected() ? "T" : "F");
        values.add(this.jCheckBoxWireless.isSelected() ? "T" : "F");
        return values;
    }
    
    public void zerarCampos() {
        jTextFieldSistemaOperacional.setText("");
        jCheckBoxWebcam.setSelected(false);
        jCheckBoxWireless.setSelected(false);
        jTableMemoria.clearSelection();
        jTablePlacaVideo.clearSelection();
        jTableProcessador.clearSelection();
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jTextFieldSistemaOperacional.getText().equals("") ||
                (this.jTableMemoria.getSelectedRow() < 0 && this.jTableMemoria.getRowCount() > 0) ||
                (this.jTableProcessador.getSelectedRow() < 0 && this.jTableProcessador.getRowCount() > 0) ||
                (this.jTablePlacaVideo.getSelectedRow() < 0 && this.jTablePlacaVideo.getRowCount() > 0)) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar o computador");
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
        jPanelComputador = new javax.swing.JPanel();
        jLabelSistemaOperacional = new javax.swing.JLabel();
        jTextFieldSistemaOperacional = new javax.swing.JTextField();
        jCheckBoxWireless = new javax.swing.JCheckBox();
        jCheckBoxWebcam = new javax.swing.JCheckBox();
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

        jPanelComputador.setBorder(javax.swing.BorderFactory.createTitledBorder("Computador"));

        jLabelSistemaOperacional.setText("Sistema Operacional");

        jCheckBoxWireless.setText("Wireless");

        jCheckBoxWebcam.setText("Webcam");

        jPanelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Memória (Escolha uma)"));

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

        jPanelProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador (Escolha um)"));

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

        jPanelPlacaVideo.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa de Vídeo (Escolha uma)"));

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

        javax.swing.GroupLayout jPanelComputadorLayout = new javax.swing.GroupLayout(jPanelComputador);
        jPanelComputador.setLayout(jPanelComputadorLayout);
        jPanelComputadorLayout.setHorizontalGroup(
            jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComputadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelComputadorLayout.createSequentialGroup()
                        .addComponent(jPanelProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanelComputadorLayout.createSequentialGroup()
                        .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelComputadorLayout.createSequentialGroup()
                        .addGroup(jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelComputadorLayout.createSequentialGroup()
                                    .addComponent(jCheckBoxWireless)
                                    .addGap(18, 18, 18)
                                    .addComponent(jCheckBoxWebcam))
                                .addGroup(jPanelComputadorLayout.createSequentialGroup()
                                    .addComponent(jLabelSistemaOperacional)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelComputadorLayout.setVerticalGroup(
            jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComputadorLayout.createSequentialGroup()
                .addGroup(jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSistemaOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSistemaOperacional))
                .addGap(6, 6, 6)
                .addGroup(jPanelComputadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxWireless)
                    .addComponent(jCheckBoxWebcam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFechar))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelComputador, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonProximo))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroAtual)
                    .addComponent(jLabelDe)
                    .addComponent(jLabelRegistroTotal))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelComputador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jButtonAnterior)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonNovo))
                .addGap(16, 16, 16))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jButtonProximo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 524, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JCheckBox jCheckBoxWebcam;
    private javax.swing.JCheckBox jCheckBoxWireless;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JLabel jLabelSistemaOperacional;
    private javax.swing.JPanel jPanelComputador;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelPlacaVideo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProcessador;
    private javax.swing.JScrollPane jScrollPaneMemoria;
    private javax.swing.JScrollPane jScrollPanePlacaVideo;
    private javax.swing.JScrollPane jScrollPaneProcessador;
    private javax.swing.JTable jTableMemoria;
    private javax.swing.JTable jTablePlacaVideo;
    private javax.swing.JTable jTableProcessador;
    private javax.swing.JTextField jTextFieldSistemaOperacional;
    // End of variables declaration//GEN-END:variables
}
