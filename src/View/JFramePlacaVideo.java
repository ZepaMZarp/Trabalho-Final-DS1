package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFramePlacaVideo extends javax.swing.JFrame {

    private DefaultTableModel modelProc = new DefaultTableModel();
    private DefaultTableModel modelMem = new DefaultTableModel();
    private boolean editando = false;

    public JFramePlacaVideo() {
        initComponents();
        this.setTitle("Placa de Vídeo");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        jPanelPlacaVideo = new javax.swing.JPanel();
        jLabelFabricante = new javax.swing.JLabel();
        jTextFieldFabricante = new javax.swing.JTextField();
        jPanelMemoria = new javax.swing.JPanel();
        jScrollPaneMemoria = new javax.swing.JScrollPane();
        jTableMemoria = new javax.swing.JTable();
        jPanelProcessador = new javax.swing.JPanel();
        jScrollPaneProcessador = new javax.swing.JScrollPane();
        jTableProcessador = new javax.swing.JTable();

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

        jPanelPlacaVideo.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa de Vídeo"));

        jLabelFabricante.setText("Fabricante");

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

        javax.swing.GroupLayout jPanelPlacaVideoLayout = new javax.swing.GroupLayout(jPanelPlacaVideo);
        jPanelPlacaVideo.setLayout(jPanelPlacaVideoLayout);
        jPanelPlacaVideoLayout.setHorizontalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlacaVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPlacaVideoLayout.createSequentialGroup()
                        .addComponent(jLabelFabricante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPlacaVideoLayout.setVerticalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPlacaVideoLayout.createSequentialGroup()
                .addGroup(jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
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
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(443, 443, 443)
                                .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDe))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonProximo)
                            .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(56, Short.MAX_VALUE)))
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
                        .addGap(40, 40, 40)
                        .addComponent(jButtonProximo))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButtonAnterior)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonNovo))
                .addContainerGap())
            .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean isEditando() {
        return editando;
    }

    public void setEditando(boolean editando) {
        this.editando = editando;
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

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
    }

    public JTable getjTableMemoria() {
        return jTableMemoria;
    }

    public JTable getjTableProcessador() {
        return jTableProcessador;
    }

    public JTextField getjTextFieldFabricante() {
        return jTextFieldFabricante;
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
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            if (Controller.Controller.placasVideo.get(indice).getMemoria() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableMemoria().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.modelMem.getValueAt(i, 0))) == Controller.Controller.placasVideo.get(indice).getMemoria().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableMemoria().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            if (Controller.Controller.placasVideo.get(indice).getProcessador() != null) {
                int linhaSelecionar = 0;
                for (int i = 0; i < this.getjTableProcessador().getRowCount(); i++) {
                    if (Integer.parseInt(String.valueOf(this.modelProc.getValueAt(i, 0))) == Controller.Controller.placasVideo.get(indice).getProcessador().getId()) {
                        linhaSelecionar = i;
                        break;
                    }
                }
                this.getjTableProcessador().getSelectionModel().setSelectionInterval(linhaSelecionar, linhaSelecionar);
            }
            this.getjTextFieldFabricante().setText(Controller.Controller.placasVideo.get(indice).getFabricante());
            this.getjButtonProximo().setEnabled(Controller.Controller.placasVideo.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.getjTextFieldFabricante().setEnabled(false);
            this.getjTableMemoria().setEnabled(false);
            this.getjTableProcessador().setEnabled(false);
            this.jLabelRegistroAtual.setText((Controller.Controller.placasVideo.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.placasVideo.size()));
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
        this.getjTextFieldFabricante().setEnabled(true);
        this.getjTableMemoria().setEnabled(true);
        this.getjTableProcessador().setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.placasVideo.isEmpty() ? "0" : String.valueOf(Controller.Controller.iPV+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.placasVideo.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonProximo().setEnabled(Controller.Controller.placasVideo.size() > Controller.Controller.iPV+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iPV > 0);
        this.getjTextFieldFabricante().setEnabled(false);
        this.getjTableMemoria().setEnabled(false);
        this.getjTableProcessador().setEnabled(false);
        this.jLabelRegistroAtual.setText((Controller.Controller.placasVideo.isEmpty() ? "0" : String.valueOf(Controller.Controller.iPV+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.placasVideo.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(this.jTableProcessador.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelProc.getValueAt(this.jTableProcessador.getSelectedRow(), 0))) : null);
        values.add(this.jTableMemoria.getSelectedRow() >= 0 ? Integer.parseInt(String.valueOf(this.modelMem.getValueAt(this.jTableMemoria.getSelectedRow(), 0))) : null);
        values.add(this.jTextFieldFabricante.getText());
        return values;
    }
    
    public void zerarCampos() {
        jTextFieldFabricante.setText("");
        jTableMemoria.clearSelection();
        jTableProcessador.clearSelection();
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jTextFieldFabricante.getText().equals("") ||
                (this.jTableMemoria.getSelectedRow() < 0 && this.jTableMemoria.getRowCount() > 0) ||
                (this.jTableProcessador.getSelectedRow() < 0 && this.jTableProcessador.getRowCount() > 0)) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar a placa de vídeo");
        }
        return validado;
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonGravar;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonProximo;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelPlacaVideo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProcessador;
    private javax.swing.JScrollPane jScrollPaneMemoria;
    private javax.swing.JScrollPane jScrollPaneProcessador;
    private javax.swing.JTable jTableMemoria;
    private javax.swing.JTable jTableProcessador;
    private javax.swing.JTextField jTextFieldFabricante;
    // End of variables declaration//GEN-END:variables
}
