package View;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFrameUsuario extends javax.swing.JFrame {

    private boolean editando = false;
    
    public JFrameUsuario() {
        initComponents();
        this.setTitle("Usuário");
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
        jLabelRegistroAtual = new javax.swing.JLabel();
        jLabelDe = new javax.swing.JLabel();
        jLabelRegistroTotal = new javax.swing.JLabel();
        jPanelUsuario = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelLogin = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldLogin = new javax.swing.JTextField();
        jCheckBoxAdministrador = new javax.swing.JCheckBox();
        jPasswordFieldSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNovo.setText("Novo");

        jButtonEditar.setText("Editar");

        jButtonExcluir.setText("Excluir");

        jButtonGravar.setText("Gravar");
        jButtonGravar.setEnabled(false);

        jButtonFechar.setText("Fechar");

        jButtonProximo.setText(">");

        jButtonAnterior.setText("<");

        jLabelRegistroAtual.setText("jLabel1");

        jLabelDe.setText("de");

        jLabelRegistroTotal.setText("jLabel3");

        jPanelUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário"));

        jLabelNome.setText("Nome");

        jLabelLogin.setText("Login");

        jLabelSenha.setText("Senha");

        jCheckBoxAdministrador.setText("Administrador");

        javax.swing.GroupLayout jPanelUsuarioLayout = new javax.swing.GroupLayout(jPanelUsuario);
        jPanelUsuario.setLayout(jPanelUsuarioLayout);
        jPanelUsuarioLayout.setHorizontalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogin)
                    .addComponent(jLabelSenha)
                    .addComponent(jLabelNome))
                .addGap(62, 62, 62)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNome)
                    .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jTextFieldLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxAdministrador))
                    .addComponent(jPasswordFieldSenha))
                .addContainerGap())
        );
        jPanelUsuarioLayout.setVerticalGroup(
            jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUsuarioLayout.createSequentialGroup()
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLogin)
                    .addComponent(jTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxAdministrador))
                .addGap(5, 5, 5)
                .addGroup(jPanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelRegistroAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRegistroTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonProximo))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonFechar)
                .addGap(69, 69, 69))
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
                        .addComponent(jPanelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    public JCheckBox getjCheckBoxAdministrador() {
        return jCheckBoxAdministrador;
    }

    public JLabel getjLabelRegistroAtual() {
        return jLabelRegistroAtual;
    }

    public JLabel getjLabelRegistroTotal() {
        return jLabelRegistroTotal;
    }

    public JPasswordField getjPasswordFieldSenha() {
        return jPasswordFieldSenha;
    }

    public JTextField getjTextFieldLogin() {
        return jTextFieldLogin;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }
    
    public void zerarCampos() {
        this.jTextFieldNome.setText("");
        this.jTextFieldLogin.setText("");
        this.jCheckBoxAdministrador.setSelected(false);
        this.jPasswordFieldSenha.setText("");
    }
    
    public void setarCampos(int indice) {
        if (indice < 0) {
            this.zerarCampos();
            this.cancelarEdicao();
        } else {
            this.getjTextFieldNome().setText(String.valueOf(Controller.Controller.usuarios.get(indice).getNome()));
            this.getjTextFieldLogin().setText(Controller.Controller.usuarios.get(indice).getLogin());
            this.getjPasswordFieldSenha().setText(Controller.Controller.usuarios.get(indice).getSenha());
            this.getjCheckBoxAdministrador().setSelected(Controller.Controller.usuarios.get(indice).ehAdministrador());
            this.getjButtonProximo().setEnabled(Controller.Controller.usuarios.size() > indice+1);
            this.getjButtonAnterior().setEnabled(indice > 0);
            this.jLabelRegistroAtual.setText((Controller.Controller.usuarios.isEmpty() ? "0" : String.valueOf(indice+1)));
            this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.usuarios.size()));
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
        this.getjTextFieldNome().setEnabled(true);
        this.getjTextFieldLogin().setEnabled(true);
        this.getjPasswordFieldSenha().setEnabled(false);
        this.jCheckBoxAdministrador.setEnabled(true);
        this.jLabelRegistroAtual.setText((Controller.Controller.usuarios.isEmpty() ? "0" : String.valueOf(Controller.Controller.iUsu+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.usuarios.size()));
    }
    
    public void cancelarEdicao() {
        this.editando = false;
        this.getjButtonNovo().setEnabled(true);
        this.getjButtonEditar().setEnabled(true);
        this.getjButtonExcluir().setEnabled(true);
        this.getjButtonGravar().setEnabled(false);
        this.getjButtonFechar().setText("Fechar");
        this.getjButtonProximo().setEnabled(Controller.Controller.usuarios.size() > Controller.Controller.iUsu+1);
        this.getjButtonAnterior().setEnabled(Controller.Controller.iUsu > 0);
        this.getjTextFieldNome().setEnabled(false);
        this.getjTextFieldLogin().setEnabled(false);
        this.getjPasswordFieldSenha().setEnabled(false);
        this.jCheckBoxAdministrador.setEnabled(false);
        this.jLabelRegistroAtual.setText((Controller.Controller.usuarios.isEmpty() ? "0" : String.valueOf(Controller.Controller.iUsu+1)));
        this.jLabelRegistroTotal.setText(String.valueOf(Controller.Controller.usuarios.size()));
    }
    
    public ArrayList getValuesBD() {
        ArrayList values = new ArrayList();
        values.add(this.jTextFieldLogin.getText());
        values.add(this.jCheckBoxAdministrador.isSelected() ? "T" : "F");
        values.add(this.jTextFieldNome.getText());
        return values;
    }
    
    public boolean validaCampos() {
        boolean validado = true;
        if (this.jTextFieldLogin.getText().equals("") ||
                (this.jTextFieldNome.getText().equals(""))) {
            validado = false;
            JOptionPane.showMessageDialog(null, "Informe todos os campos para cadastrar o usuário");
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
    private javax.swing.JCheckBox jCheckBoxAdministrador;
    private javax.swing.JLabel jLabelDe;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRegistroAtual;
    private javax.swing.JLabel jLabelRegistroTotal;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldLogin;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
