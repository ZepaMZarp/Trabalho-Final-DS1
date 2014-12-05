package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFrameMemoria extends javax.swing.JFrame {
    
    private boolean editando = false;

    public JFrameMemoria() {
        initComponents();
        this.setTitle("Memória");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonGravar = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();
        jButtonProximo = new javax.swing.JButton();
        jButtonAnterior = new javax.swing.JButton();
        jPanelMemoria = new javax.swing.JPanel();
        jLabelCapacidade = new javax.swing.JLabel();
        jComboBoxCapacidade = new javax.swing.JComboBox();
        jLabelTecnologia = new javax.swing.JLabel();
        jLabelFabricante = new javax.swing.JLabel();
        jTextFieldFabricante = new javax.swing.JTextField();
        jTextFieldTecnologia = new javax.swing.JTextField();
        jSpinnerCapacidade = new javax.swing.JSpinner();
        jLabelRegistroAtual = new javax.swing.JLabel();
        jLabelDe = new javax.swing.JLabel();
        jLabelRegistroTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNovo.setText("Novo");

        jButtonEditar.setText("Editar");

        jButtonExcluir.setText("Excluir");

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);

        jButtonFechar.setText("Fechar");

        jButtonProximo.setText(">");

        jButtonAnterior.setText("<");

        jPanelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Memória"));

        jLabelCapacidade.setText("Capacidade (Armazenamento)");

        jComboBoxCapacidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GB", "MB", "KB" }));

        jLabelTecnologia.setText("Tecnologia");

        jLabelFabricante.setText("Fabricante");

        jSpinnerCapacidade.setModel(new javax.swing.SpinnerNumberModel());

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTecnologia)
                    .addComponent(jLabelFabricante)
                    .addComponent(jLabelCapacidade))
                .addGap(13, 13, 13)
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jTextFieldTecnologia)
                            .addComponent(jSpinnerCapacidade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCapacidade)
                    .addComponent(jSpinnerCapacidade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTecnologia)
                    .addComponent(jTextFieldTecnologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFabricante))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jLabelRegistroAtual.setText("jLabel1");

        jLabelDe.setText("de");

        jLabelRegistroTotal.setText("jLabel3");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonProximo))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonGravar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFechar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRegistroAtual)
                    .addComponent(jLabelDe)
                    .addComponent(jLabelRegistroTotal))
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonProximo)
                            .addComponent(jButtonAnterior)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFechar)
                    .addComponent(jButtonGravar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    public JComboBox getjComboBoxCapacidade() {
        return jComboBoxCapacidade;
    }

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
    }

    public JSpinner getjSpinnerCapacidade() {
        return jSpinnerCapacidade;
    }

    public JTextField getjTextFieldFabricante() {
        return jTextFieldFabricante;
    }

    public JTextField getjTextFieldTecnologia() {
        return jTextFieldTecnologia;
    }
    
    public void zerarCampos() {
        this.jSpinnerCapacidade.setValue(0);
        this.jComboBoxCapacidade.setSelectedIndex(0);
        this.jTextFieldTecnologia.setText("");
        this.jTextFieldFabricante.setText("");
    }
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            this.getjSpinnerCapacidade().setValue(Integer.parseInt(String.valueOf(Controller.Controller.memorias.get(indice).getValorCapacidade())));
            this.getjComboBoxCapacidade().setSelectedItem(Controller.Controller.memorias.get(indice).getUnidadeCapacidade());
            this.getjTextFieldTecnologia().setText(Controller.Controller.memorias.get(indice).getTecnologia());
            this.getjTextFieldFabricante().setText(Controller.Controller.memorias.get(indice).getFabricante());
            this.getjButtonProximo().setEnabled(Controller.Controller.memorias.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.jLabelRegistroAtual.setText((Controller.Controller.memorias.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.memorias.size()));
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
        this.getjSpinnerCapacidade().setEnabled(true);
        this.getjTextFieldFabricante().setEnabled(true);
        this.getjTextFieldTecnologia().setEnabled(true);
        this.getjComboBoxCapacidade().setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.memorias.isEmpty() ? "0" : String.valueOf(Controller.Controller.iMem+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.memorias.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonProximo().setEnabled(Controller.Controller.memorias.size() > Controller.Controller.iMem+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iMem > 0);
        this.getjSpinnerCapacidade().setEnabled(false);
        this.getjTextFieldFabricante().setEnabled(false);
        this.getjTextFieldTecnologia().setEnabled(false);
        this.getjComboBoxCapacidade().setEnabled(false);
        this.jLabelRegistroAtual.setText((Controller.Controller.memorias.isEmpty() ? "0" : String.valueOf(Controller.Controller.iMem+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.memorias.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(this.jSpinnerCapacidade.getValue());
        values.add(String.valueOf(this.jComboBoxCapacidade.getSelectedItem()));
        values.add(this.jTextFieldTecnologia.getText());
        values.add(this.jTextFieldFabricante.getText());
        return values;
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jSpinnerCapacidade.getValue().equals(0) ||
                (this.jTextFieldTecnologia.getText().equals("")) ||
                (this.jTextFieldFabricante.getText().equals(""))) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar a memória");
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
    private javax.swing.JComboBox jComboBoxCapacidade;
    private javax.swing.JLabel jLabelCapacidade;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JLabel jLabelTecnologia;
    private javax.swing.JPanel jPanelMemoria;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JSpinner jSpinnerCapacidade;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldTecnologia;
    // End of variables declaration//GEN-END:variables
}
