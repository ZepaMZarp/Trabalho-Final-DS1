package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFrameProcessador extends javax.swing.JFrame {

    private boolean editando = false;

    public JFrameProcessador() {
        initComponents();
        this.setTitle("Processadores");
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
        jPanelProcessador = new javax.swing.JPanel();
        jLabelFrequencia = new javax.swing.JLabel();
        jTextFieldFrequencia = new javax.swing.JTextField();
        jComboBoxFrequencia = new javax.swing.JComboBox();
        jLabelNumNucleos = new javax.swing.JLabel();
        jSpinnerNumNucleos = new javax.swing.JSpinner();
        jLabelFabricante = new javax.swing.JLabel();
        jTextFieldFabricante = new javax.swing.JTextField();
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

        jPanelProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Processador"));

        jLabelFrequencia.setText("Frequência (Velocidade)");

        jComboBoxFrequencia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "GHz", "MHz" }));

        jLabelNumNucleos.setText("Núm. Núcleos");

        jSpinnerNumNucleos.setModel(new javax.swing.SpinnerNumberModel());
        jSpinnerNumNucleos.setPreferredSize(new java.awt.Dimension(26, 20));

        jLabelFabricante.setText("Fabricante");

        javax.swing.GroupLayout jPanelProcessadorLayout = new javax.swing.GroupLayout(jPanelProcessador);
        jPanelProcessador.setLayout(jPanelProcessadorLayout);
        jPanelProcessadorLayout.setHorizontalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNumNucleos)
                    .addComponent(jLabelFabricante)
                    .addComponent(jLabelFrequencia))
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcessadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jTextFieldFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcessadorLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerNumNucleos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldFrequencia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelProcessadorLayout.setVerticalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFrequencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerNumNucleos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumNucleos))
                .addGap(7, 7, 7)
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addGap(28, 28, 28)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFechar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonProximo))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonProximo)
                            .addComponent(jButtonAnterior)))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRegistroAtual)
                            .addComponent(jLabelDe)
                            .addComponent(jLabelRegistroTotal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    public JComboBox getjComboBoxFrequencia() {
        return jComboBoxFrequencia;
    }

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
    }

    public JSpinner getjSpinnerNumNucleos() {
        return jSpinnerNumNucleos;
    }

    public JTextField getjTextFieldFabricante() {
        return jTextFieldFabricante;
    }

    public JTextField getjTextFieldFrequencia() {
        return jTextFieldFrequencia;
    }
    
    public void zerarCampos() {
        this.jTextFieldFrequencia.setText("");
        this.jComboBoxFrequencia.setSelectedIndex(0);
        this.jSpinnerNumNucleos.setValue(0);
        this.jTextFieldFabricante.setText("");        
    }
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            this.getjTextFieldFrequencia().setText(String.valueOf(Controller.Controller.processadores.get(indice).getValorFrequencia()));
            this.getjComboBoxFrequencia().setSelectedItem(Controller.Controller.processadores.get(indice).getUnidadeFrequencia());
            this.getjSpinnerNumNucleos().setValue(Controller.Controller.processadores.get(indice).getNumNucleos());
            this.getjTextFieldFabricante().setText(Controller.Controller.processadores.get(indice).getFabricante());
            this.getjButtonProximo().setEnabled(Controller.Controller.processadores.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.jLabelRegistroAtual.setText((Controller.Controller.processadores.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.processadores.size()));
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
        this.getjTextFieldFrequencia().setEnabled(true);
        this.getjTextFieldFabricante().setEnabled(true);
        this.getjSpinnerNumNucleos().setEnabled(true);
        this.getjComboBoxFrequencia().setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.processadores.isEmpty() ? "0" : String.valueOf(Controller.Controller.iProc+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.processadores.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonProximo().setEnabled(Controller.Controller.processadores.size() > Controller.Controller.iProc+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iProc > 0);
        this.getjTextFieldFrequencia().setEnabled(false);
        this.getjTextFieldFabricante().setEnabled(false);
        this.getjSpinnerNumNucleos().setEnabled(false);
        this.getjComboBoxFrequencia().setEnabled(false);
        this.jLabelRegistroAtual.setText((Controller.Controller.processadores.isEmpty() ? "0" : String.valueOf(Controller.Controller.iProc+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.processadores.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(this.jTextFieldFrequencia.getText());
        values.add(String.valueOf(this.jComboBoxFrequencia.getSelectedItem()));
        values.add(Integer.parseInt(String.valueOf(this.jSpinnerNumNucleos.getValue())));
        values.add(this.jTextFieldFabricante.getText());
        return values;
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jTextFieldFrequencia.getText().equals("") ||
                (Integer.parseInt(String.valueOf(Integer.parseInt(String.valueOf(this.jSpinnerNumNucleos.getValue())))) <= 0) ||
                (this.jTextFieldFabricante.getText().equals(""))) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar o processador");
        }
        Double frequencia = 0.0;
        if (this.jTextFieldFrequencia.getText().contains(",")) {
            String[] aux = this.jTextFieldFrequencia.getText().split(",");
            this.jTextFieldFrequencia.setText(aux[0]+"."+aux[1]);
        }
        try {
            frequencia = Double.parseDouble(this.jTextFieldFrequencia.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valor inválido para o campo Frequência", "Erro", JOptionPane.ERROR_MESSAGE);
            validado = false;            
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
    private javax.swing.JComboBox jComboBoxFrequencia;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelFabricante;
    private javax.swing.JLabel jLabelFrequencia;
    private javax.swing.JLabel jLabelNumNucleos;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelProcessador;
    private javax.swing.JSpinner jSpinnerNumNucleos;
    private javax.swing.JTextField jTextFieldFabricante;
    private javax.swing.JTextField jTextFieldFrequencia;
    // End of variables declaration//GEN-END:variables
}
