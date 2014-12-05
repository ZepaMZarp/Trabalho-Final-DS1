package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFramePrincipal extends javax.swing.JFrame {
    
    private DefaultTableModel modelComputadores = new DefaultTableModel();

    public JFramePrincipal() {
        initComponents();
        this.setTitle("Bem vindo");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabelEstamosFelizes = new javax.swing.JLabel();
        jLabelEmQuePosso = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jPanelMinhaLAN = new javax.swing.JPanel();
        jLabelSeuComputador = new javax.swing.JLabel();
        jScrollPaneComputadores = new javax.swing.JScrollPane();
        jTableComputadores = new javax.swing.JTable();
        jButtonConsultarJogos = new javax.swing.JButton();
        jButtonComprarJogo = new javax.swing.JButton();
        jButtonLimparSelecao = new javax.swing.JButton();
        jButtonConsolidarSelecao = new javax.swing.JButton();
        jPanelMinhaConta = new javax.swing.JPanel();
        jButtonAlterarSenha = new javax.swing.JButton();
        jButtonGerenciarUsuarios = new javax.swing.JButton();
        jMenuBarPrincipal = new javax.swing.JMenuBar();
        jMenuGerenciarLAN = new javax.swing.JMenu();
        jMenuItemComprarJogo = new javax.swing.JMenuItem();
        jMenuItemConsultarJogos = new javax.swing.JMenuItem();
        jMenuGerenciar = new javax.swing.JMenu();
        jMenuItemGerenciarComputadores = new javax.swing.JMenuItem();
        jMenuItemGerenciarJogos = new javax.swing.JMenuItem();
        jMenuItemGerenciarMemorias = new javax.swing.JMenuItem();
        jMenuItemGerenciarPlacasVideo = new javax.swing.JMenuItem();
        jMenuItemGerenciarProcessadores = new javax.swing.JMenuItem();
        jMenuItemGerenciarUsuarios = new javax.swing.JMenuItem();
        jMenuMinhaConta = new javax.swing.JMenu();
        jMenuItemAlterarSenha = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelEstamosFelizes.setText("Estamos felizes em recebê-lo de volta,");

        jLabelEmQuePosso.setText("Em que posso ajudá-lo?");

        jLabelNome.setText("jLabel2");

        jPanelMinhaLAN.setBorder(javax.swing.BorderFactory.createTitledBorder("Minha LAN"));

        jLabelSeuComputador.setText("Selecione seu computador:");

        jTableComputadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sistema Operacional", "Processador", "Placa de Vídeo", "Memória"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPaneComputadores.setViewportView(jTableComputadores);

        jButtonConsultarJogos.setText("Consultar jogos disponíveis");

        jButtonComprarJogo.setText("Comprar um novo jogo");

        jButtonLimparSelecao.setText("Limpar Seleção");

        jButtonConsolidarSelecao.setText("Consolidar Seleção");

        javax.swing.GroupLayout jPanelMinhaLANLayout = new javax.swing.GroupLayout(jPanelMinhaLAN);
        jPanelMinhaLAN.setLayout(jPanelMinhaLANLayout);
        jPanelMinhaLANLayout.setHorizontalGroup(
            jPanelMinhaLANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhaLANLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMinhaLANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMinhaLANLayout.createSequentialGroup()
                        .addComponent(jButtonConsultarJogos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonComprarJogo))
                    .addGroup(jPanelMinhaLANLayout.createSequentialGroup()
                        .addComponent(jLabelSeuComputador)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonConsolidarSelecao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneComputadores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMinhaLANLayout.setVerticalGroup(
            jPanelMinhaLANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhaLANLayout.createSequentialGroup()
                .addGroup(jPanelMinhaLANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeuComputador)
                    .addComponent(jButtonLimparSelecao)
                    .addComponent(jButtonConsolidarSelecao))
                .addGap(6, 6, 6)
                .addComponent(jScrollPaneComputadores, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMinhaLANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConsultarJogos)
                    .addComponent(jButtonComprarJogo))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        jPanelMinhaConta.setBorder(javax.swing.BorderFactory.createTitledBorder("Minha Conta"));

        jButtonAlterarSenha.setText("Alterar minha senha");

        jButtonGerenciarUsuarios.setText("Gerenciar Usuários");

        javax.swing.GroupLayout jPanelMinhaContaLayout = new javax.swing.GroupLayout(jPanelMinhaConta);
        jPanelMinhaConta.setLayout(jPanelMinhaContaLayout);
        jPanelMinhaContaLayout.setHorizontalGroup(
            jPanelMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhaContaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGerenciarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelMinhaContaLayout.setVerticalGroup(
            jPanelMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMinhaContaLayout.createSequentialGroup()
                .addGroup(jPanelMinhaContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarSenha)
                    .addComponent(jButtonGerenciarUsuarios))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMinhaConta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelMinhaLAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmQuePosso)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabelEstamosFelizes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNome)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstamosFelizes)
                    .addComponent(jLabelNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmQuePosso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelMinhaLAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMinhaConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuGerenciarLAN.setText("Gerenciar LAN");

        jMenuItemComprarJogo.setText("Comprar um novo jogo");
        jMenuGerenciarLAN.add(jMenuItemComprarJogo);

        jMenuItemConsultarJogos.setText("Consultar jogos disponíveis");
        jMenuGerenciarLAN.add(jMenuItemConsultarJogos);

        jMenuGerenciar.setText("Gerenciar...");

        jMenuItemGerenciarComputadores.setText("Gerenciar Computadores");
        jMenuGerenciar.add(jMenuItemGerenciarComputadores);

        jMenuItemGerenciarJogos.setText("Gerenciar Jogos");
        jMenuGerenciar.add(jMenuItemGerenciarJogos);

        jMenuItemGerenciarMemorias.setText("Gerenciar Memórias");
        jMenuGerenciar.add(jMenuItemGerenciarMemorias);

        jMenuItemGerenciarPlacasVideo.setText("Gerenciar Placas de Vídeo");
        jMenuGerenciar.add(jMenuItemGerenciarPlacasVideo);

        jMenuItemGerenciarProcessadores.setText("Gerenciar Processadores");
        jMenuGerenciar.add(jMenuItemGerenciarProcessadores);

        jMenuItemGerenciarUsuarios.setText("Gerenciar Usuários");
        jMenuGerenciar.add(jMenuItemGerenciarUsuarios);

        jMenuGerenciarLAN.add(jMenuGerenciar);

        jMenuBarPrincipal.add(jMenuGerenciarLAN);

        jMenuMinhaConta.setText("Minha conta");

        jMenuItemAlterarSenha.setText("Alterar minha senha");
        jMenuMinhaConta.add(jMenuItemAlterarSenha);

        jMenuBarPrincipal.add(jMenuMinhaConta);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuSair.add(jMenuItemSair);

        jMenuBarPrincipal.add(jMenuSair);

        setJMenuBar(jMenuBarPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getjButtonConsolidarSelecao() {
        return jButtonConsolidarSelecao;
    }
    
    public DefaultTableModel getModelComputadores() {
        return modelComputadores;
    }

    public void setModelComputadores(DefaultTableModel modelComputadores) {
        this.modelComputadores = modelComputadores;
    }
    
    public JButton getjButtonLimparSelecao() {
        return jButtonLimparSelecao;
    }
    
    public JButton getjButtonAlterarSenha() {
        return jButtonAlterarSenha;
    }

    public JButton getjButtonComprarJogo() {
        return jButtonComprarJogo;
    }

    public JButton getjButtonConsultarJogos() {
        return jButtonConsultarJogos;
    }

    public JButton getjButtonGerenciarUsuarios() {
        return jButtonGerenciarUsuarios;
    }

    public JMenuItem getjMenuItemAlterarSenha() {
        return jMenuItemAlterarSenha;
    }

    public JMenuItem getjMenuItemComprarJogo() {
        return jMenuItemComprarJogo;
    }

    public JMenuItem getjMenuItemConsultarJogos() {
        return jMenuItemConsultarJogos;
    }

    public JMenuItem getjMenuItemGerenciarComputadores() {
        return jMenuItemGerenciarComputadores;
    }

    public JMenuItem getjMenuItemGerenciarJogos() {
        return jMenuItemGerenciarJogos;
    }

    public JMenuItem getjMenuItemGerenciarMemorias() {
        return jMenuItemGerenciarMemorias;
    }

    public JMenuItem getjMenuItemGerenciarPlacasVideo() {
        return jMenuItemGerenciarPlacasVideo;
    }

    public JMenuItem getjMenuItemGerenciarProcessadores() {
        return jMenuItemGerenciarProcessadores;
    }

    public JMenuItem getjMenuItemGerenciarUsuarios() {
        return jMenuItemGerenciarUsuarios;
    }

    public JMenuItem getjMenuItemSair() {
        return jMenuItemSair;
    }

    public JTable getjTableComputadores() {
        return jTableComputadores;
    }

    public JLabel getjLabelNome() {
        return jLabelNome;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlterarSenha;
    private javax.swing.JButton jButtonComprarJogo;
    private javax.swing.JButton jButtonConsolidarSelecao;
    private javax.swing.JButton jButtonConsultarJogos;
    private javax.swing.JButton jButtonGerenciarUsuarios;
    private javax.swing.JButton jButtonLimparSelecao;
    private javax.swing.JLabel jLabelEmQuePosso;
    private javax.swing.JLabel jLabelEstamosFelizes;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSeuComputador;
    private javax.swing.JMenuBar jMenuBarPrincipal;
    private javax.swing.JMenu jMenuGerenciar;
    private javax.swing.JMenu jMenuGerenciarLAN;
    private javax.swing.JMenuItem jMenuItemAlterarSenha;
    private javax.swing.JMenuItem jMenuItemComprarJogo;
    private javax.swing.JMenuItem jMenuItemConsultarJogos;
    private javax.swing.JMenuItem jMenuItemGerenciarComputadores;
    private javax.swing.JMenuItem jMenuItemGerenciarJogos;
    private javax.swing.JMenuItem jMenuItemGerenciarMemorias;
    private javax.swing.JMenuItem jMenuItemGerenciarPlacasVideo;
    private javax.swing.JMenuItem jMenuItemGerenciarProcessadores;
    private javax.swing.JMenuItem jMenuItemGerenciarUsuarios;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenu jMenuMinhaConta;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelMinhaConta;
    private javax.swing.JPanel jPanelMinhaLAN;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneComputadores;
    private javax.swing.JTable jTableComputadores;
    // End of variables declaration//GEN-END:variables
}
