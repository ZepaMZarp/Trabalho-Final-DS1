package View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JFrameVerificacao extends javax.swing.JFrame {

    public JFrameVerificacao() {
        initComponents();
        this.setTitle("Resultado");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelSeuJogoRodara = new javax.swing.JLabel();
        jLabelPerformance = new javax.swing.JLabel();
        jSeparatorPrincipal = new javax.swing.JSeparator();
        jButtonVoltar = new javax.swing.JButton();
        jPanelRequerMelhor = new javax.swing.JPanel();
        jLabelListaRequer1 = new javax.swing.JLabel();
        jLabelListaRequer2 = new javax.swing.JLabel();
        jLabelListaRequer3 = new javax.swing.JLabel();
        jLabelListaRequer4 = new javax.swing.JLabel();
        jPanelComputadorAtende = new javax.swing.JPanel();
        jLabelListaAtende1 = new javax.swing.JLabel();
        jLabelListaAtende2 = new javax.swing.JLabel();
        jLabelListaAtende3 = new javax.swing.JLabel();
        jLabelListaAtende4 = new javax.swing.JLabel();
        jButtonComprar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSeuJogoRodara.setText("Seu jogo rodará com performance");

        jLabelPerformance.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabelPerformance.setText("jLabel2");

        jSeparatorPrincipal.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jButtonVoltar.setText("Voltar");

        jPanelRequerMelhor.setBorder(javax.swing.BorderFactory.createTitledBorder("O jogo requer melhor"));

        jLabelListaRequer1.setText("jLabel1");

        jLabelListaRequer2.setText("jLabel1");

        jLabelListaRequer3.setText("jLabel1");

        jLabelListaRequer4.setText("jLabel1");

        javax.swing.GroupLayout jPanelRequerMelhorLayout = new javax.swing.GroupLayout(jPanelRequerMelhor);
        jPanelRequerMelhor.setLayout(jPanelRequerMelhorLayout);
        jPanelRequerMelhorLayout.setHorizontalGroup(
            jPanelRequerMelhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequerMelhorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelRequerMelhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelListaRequer4)
                    .addComponent(jLabelListaRequer3)
                    .addComponent(jLabelListaRequer2)
                    .addComponent(jLabelListaRequer1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelRequerMelhorLayout.setVerticalGroup(
            jPanelRequerMelhorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRequerMelhorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelListaRequer1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaRequer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaRequer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaRequer4)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelComputadorAtende.setBorder(javax.swing.BorderFactory.createTitledBorder("Seu computador atende"));

        jLabelListaAtende1.setText("jLabel1");

        jLabelListaAtende2.setText("jLabel1");

        jLabelListaAtende3.setText("jLabel1");

        jLabelListaAtende4.setText("jLabel1");

        javax.swing.GroupLayout jPanelComputadorAtendeLayout = new javax.swing.GroupLayout(jPanelComputadorAtende);
        jPanelComputadorAtende.setLayout(jPanelComputadorAtendeLayout);
        jPanelComputadorAtendeLayout.setHorizontalGroup(
            jPanelComputadorAtendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComputadorAtendeLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanelComputadorAtendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelListaAtende4)
                    .addComponent(jLabelListaAtende3)
                    .addComponent(jLabelListaAtende2)
                    .addComponent(jLabelListaAtende1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelComputadorAtendeLayout.setVerticalGroup(
            jPanelComputadorAtendeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelComputadorAtendeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelListaAtende1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaAtende2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaAtende3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelListaAtende4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonComprar.setText("Comprar");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelSeuJogoRodara)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPerformance)
                        .addContainerGap(394, Short.MAX_VALUE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelRequerMelhor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparatorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonComprar)
                            .addComponent(jPanelComputadorAtende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeuJogoRodara)
                    .addComponent(jLabelPerformance))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelRequerMelhor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelComputadorAtende, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jSeparatorPrincipal)))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVoltar)
                    .addComponent(jButtonComprar))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JLabel getjLabelListaAtende1() {
        return jLabelListaAtende1;
    }

    public void setjLabelListaAtende1(JLabel jLabelListaAtende1) {
        this.jLabelListaAtende1 = jLabelListaAtende1;
    }

    public JLabel getjLabelListaAtende2() {
        return jLabelListaAtende2;
    }

    public void setjLabelListaAtende2(JLabel jLabelListaAtende2) {
        this.jLabelListaAtende2 = jLabelListaAtende2;
    }

    public JLabel getjLabelListaAtende3() {
        return jLabelListaAtende3;
    }

    public void setjLabelListaAtende3(JLabel jLabelListaAtende3) {
        this.jLabelListaAtende3 = jLabelListaAtende3;
    }

    public JLabel getjLabelListaAtende4() {
        return jLabelListaAtende4;
    }

    public void setjLabelListaAtende4(JLabel jLabelListaAtende4) {
        this.jLabelListaAtende4 = jLabelListaAtende4;
    }

    public JLabel getjLabelListaRequer1() {
        return jLabelListaRequer1;
    }

    public void setjLabelListaRequer1(JLabel jLabelListaRequer1) {
        this.jLabelListaRequer1 = jLabelListaRequer1;
    }

    public JLabel getjLabelListaRequer2() {
        return jLabelListaRequer2;
    }

    public void setjLabelListaRequer2(JLabel jLabelListaRequer2) {
        this.jLabelListaRequer2 = jLabelListaRequer2;
    }

    public JLabel getjLabelListaRequer3() {
        return jLabelListaRequer3;
    }

    public void setjLabelListaRequer3(JLabel jLabelListaRequer3) {
        this.jLabelListaRequer3 = jLabelListaRequer3;
    }

    public JLabel getjLabelListaRequer4() {
        return jLabelListaRequer4;
    }

    public void setjLabelListaRequer4(JLabel jLabelListaRequer4) {
        this.jLabelListaRequer4 = jLabelListaRequer4;
    }
    
    public JButton getjButtonComprar() {
        return jButtonComprar;
    }
    
    public JButton getjButtonVoltar() {
        return jButtonVoltar;
    }

    public JLabel getjLabelListaAtende(int numLabel) {
        switch (numLabel) {
            case 1:
                return this.getjLabelListaAtende1();
            case 2:
                return this.getjLabelListaAtende2();
            case 3:
                return this.getjLabelListaAtende3();
            case 4:
                return this.getjLabelListaAtende4();
            default:
                return null;
        }
    }

    public JLabel getjLabelListaRequer(int numLabel) {
        switch (numLabel) {
            case 1:
                return this.getjLabelListaRequer1();
            case 2:
                return this.getjLabelListaRequer2();
            case 3:
                return this.getjLabelListaRequer3();
            case 4:
                return this.getjLabelListaRequer4();
            default:
                return null;
        }
    }

    public JLabel getjLabelPerformance() {
        return jLabelPerformance;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelListaAtende1;
    private javax.swing.JLabel jLabelListaAtende2;
    private javax.swing.JLabel jLabelListaAtende3;
    private javax.swing.JLabel jLabelListaAtende4;
    private javax.swing.JLabel jLabelListaRequer1;
    private javax.swing.JLabel jLabelListaRequer2;
    private javax.swing.JLabel jLabelListaRequer3;
    private javax.swing.JLabel jLabelListaRequer4;
    private javax.swing.JLabel jLabelPerformance;
    private javax.swing.JLabel jLabelSeuJogoRodara;
    private javax.swing.JPanel jPanelComputadorAtende;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelRequerMelhor;
    private javax.swing.JSeparator jSeparatorPrincipal;
    // End of variables declaration//GEN-END:variables
}
