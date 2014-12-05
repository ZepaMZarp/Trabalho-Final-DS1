package View;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFrameComprarJogo extends javax.swing.JFrame {
    
    private DefaultTableModel modelJogos = new DefaultTableModel();

    public JFrameComprarJogo() {
        initComponents();
        this.setTitle("Comprar um novo jogo");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelAntesDeComprar = new javax.swing.JLabel();
        jPanelEscolhaJogo = new javax.swing.JPanel();
        jScrollPaneJogos = new javax.swing.JScrollPane();
        jTableJogos = new javax.swing.JTable();
        jButtonFazerVerificacao = new javax.swing.JButton();
        jButtonFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAntesDeComprar.setText("Antes de comprar, vejamos se seu computador oferece os requisitos...");

        jPanelEscolhaJogo.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha um dos jogos disponíveis"));

        jTableJogos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPaneJogos.setViewportView(jTableJogos);

        jButtonFazerVerificacao.setText("Fazer a Verificação");

        jButtonFechar.setText("Fechar");

        javax.swing.GroupLayout jPanelEscolhaJogoLayout = new javax.swing.GroupLayout(jPanelEscolhaJogo);
        jPanelEscolhaJogo.setLayout(jPanelEscolhaJogoLayout);
        jPanelEscolhaJogoLayout.setHorizontalGroup(
            jPanelEscolhaJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEscolhaJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPaneJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEscolhaJogoLayout.createSequentialGroup()
                        .addComponent(jButtonFazerVerificacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelEscolhaJogoLayout.setVerticalGroup(
            jPanelEscolhaJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaJogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPaneJogos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelEscolhaJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFazerVerificacao)
                    .addComponent(jButtonFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelEscolhaJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabelAntesDeComprar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelAntesDeComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelEscolhaJogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel getModelJogos() {
        return modelJogos;
    }

    public void setModelJogos(DefaultTableModel modelJogos) {
        this.modelJogos = modelJogos;
    }
    
    public JButton getjButtonFazerVerificacao() {
        return jButtonFazerVerificacao;
    }

    public JButton getjButtonFechar() {
        return jButtonFechar;
    }

    public JTable getjTableJogos() {
        return jTableJogos;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFazerVerificacao;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JLabel jLabelAntesDeComprar;
    private javax.swing.JPanel jPanelEscolhaJogo;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneJogos;
    private javax.swing.JTable jTableJogos;
    // End of variables declaration//GEN-END:variables
}
