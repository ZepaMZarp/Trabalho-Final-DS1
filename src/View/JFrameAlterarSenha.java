package View;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class JFrameAlterarSenha extends javax.swing.JFrame {

    public JFrameAlterarSenha() {
        initComponents();
        this.setTitle("Alterar Senha");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jButtonConfirmar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jLabelParaLembrar = new javax.swing.JLabel();
        jLabelEscolhaUma = new javax.swing.JLabel();
        jLabelNuncaDisponibilize = new javax.swing.JLabel();
        jLabelSenhaAtual = new javax.swing.JLabel();
        jLabelNovaSenha = new javax.swing.JLabel();
        jLabelConfirmarSenha = new javax.swing.JLabel();
        jPasswordFieldSenhaAtual = new javax.swing.JPasswordField();
        jPasswordFieldNovaSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar Senha"));

        jButtonConfirmar.setText("Confirmar");

        jButtonVoltar.setText("Voltar");

        jLabelParaLembrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelParaLembrar.setText("Para lembrar sempre:");

        jLabelEscolhaUma.setText("- Escolha uma senha de fácil identificação sua (e somente sua);");

        jLabelNuncaDisponibilize.setText("- Nunca disponibilize sua senha para terceiros.");

        jLabelSenhaAtual.setText("Senha atual");

        jLabelNovaSenha.setText("Nova senha");

        jLabelConfirmarSenha.setText("Confirmar nova senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelParaLembrar)
                        .addComponent(jLabelNuncaDisponibilize)
                        .addComponent(jLabelEscolhaUma)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNovaSenha)
                                .addComponent(jLabelSenhaAtual)
                                .addComponent(jLabelConfirmarSenha))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPasswordFieldSenhaAtual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldNovaSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(jLabelParaLembrar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabelEscolhaUma)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelNuncaDisponibilize)
                    .addGap(23, 23, 23)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSenhaAtual)
                        .addComponent(jPasswordFieldSenhaAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNovaSenha)
                        .addComponent(jPasswordFieldNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelConfirmarSenha)
                        .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonConfirmar)
                        .addComponent(jButtonVoltar))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JPasswordField getjPasswordFieldConfirmarSenha() {
        return jPasswordFieldConfirmarSenha;
    }

    public JPasswordField getjPasswordFieldNovaSenha() {
        return jPasswordFieldNovaSenha;
    }

    public JPasswordField getjPasswordFieldSenhaAtual() {
        return jPasswordFieldSenhaAtual;
    }

    public JButton getjButtonConfirmar() {
        return jButtonConfirmar;
    }

    public JButton getjButtonVoltar() {
        return jButtonVoltar;
    }
    
    public void zerarCampos() {
        this.jPasswordFieldConfirmarSenha.setText("");
        this.jPasswordFieldNovaSenha.setText("");
        this.jPasswordFieldSenhaAtual.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfirmar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelEscolhaUma;
    private javax.swing.JLabel jLabelNovaSenha;
    private javax.swing.JLabel jLabelNuncaDisponibilize;
    private javax.swing.JLabel jLabelParaLembrar;
    private javax.swing.JLabel jLabelSenhaAtual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldNovaSenha;
    private javax.swing.JPasswordField jPasswordFieldSenhaAtual;
    // End of variables declaration//GEN-END:variables
}
