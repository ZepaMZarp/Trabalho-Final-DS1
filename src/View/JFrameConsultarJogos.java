package View;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class JFrameConsultarJogos extends javax.swing.JFrame {

    private DefaultTableModel modelProc = new DefaultTableModel();
    private DefaultTableModel modelMem = new DefaultTableModel();
    private DefaultTableModel modelPV = new DefaultTableModel();

    public JFrameConsultarJogos() {
        initComponents();
        this.setTitle("Consultar Jogos");
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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

    public JCheckBox getjCheckBoxFiltrarDescricao() {
        return jCheckBoxFiltrarDescricao;
    }

    public JCheckBox getjCheckBoxFiltrarMemoria() {
        return jCheckBoxFiltrarMemoria;
    }

    public JCheckBox getjCheckBoxFiltrarNome() {
        return jCheckBoxFiltrarNome;
    }

    public JCheckBox getjCheckBoxFiltrarPlacaVideo() {
        return jCheckBoxFiltrarPlacaVideo;
    }

    public JCheckBox getjCheckBoxFiltrarPreco1() {
        return jCheckBoxFiltrarPreco1;
    }

    public JCheckBox getjCheckBoxFiltrarPreco2() {
        return jCheckBoxFiltrarPreco2;
    }

    public JCheckBox getjCheckBoxFiltrarProcessador() {
        return jCheckBoxFiltrarProcessador;
    }

    public JCheckBox getjCheckBoxPrecisaWebcam() {
        return jCheckBoxPrecisaWebcam;
    }

    public JCheckBox getjCheckBoxPrecisaWireless() {
        return jCheckBoxPrecisaWireless;
    }

    public JComboBox getjComboBoxDescricao() {
        return jComboBoxDescricao;
    }

    public JComboBox getjComboBoxNome() {
        return jComboBoxNome;
    }

    public JComboBox getjComboBoxPreco1() {
        return jComboBoxPreco1;
    }

    public JComboBox getjComboBoxPreco2() {
        return jComboBoxPreco2;
    }

    public JTextField getjTextFieldDescricao() {
        return jTextFieldDescricao;
    }

    public JTextField getjTextFieldNome() {
        return jTextFieldNome;
    }

    public JTextField getjTextFieldPreco1() {
        return jTextFieldPreco1;
    }

    public JTextField getjTextFieldPreco2() {
        return jTextFieldPreco2;
    }

    public JButton getjButtonConsultar() {
        return jButtonConsultar;
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

    public JButton getjButtonVoltar() {
        return jButtonVoltar;
    }

    public JCheckBox getjCheckBoxFiltrarWebcam() {
        return jCheckBoxFiltrarWebcam;
    }

    public JCheckBox getjCheckBoxFiltrarWireless() {
        return jCheckBoxFiltrarWireless;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelFiltros = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jComboBoxNome = new javax.swing.JComboBox();
        jTextFieldNome = new javax.swing.JTextField();
        jCheckBoxFiltrarNome = new javax.swing.JCheckBox();
        jCheckBoxFiltrarDescricao = new javax.swing.JCheckBox();
        jTextFieldDescricao = new javax.swing.JTextField();
        jComboBoxDescricao = new javax.swing.JComboBox();
        jLabelDescricao = new javax.swing.JLabel();
        jPanelPlacaVideo = new javax.swing.JPanel();
        jScrollPanePlacaVideo = new javax.swing.JScrollPane();
        jTablePlacaVideo = new javax.swing.JTable();
        jCheckBoxFiltrarPlacaVideo = new javax.swing.JCheckBox();
        jPanelMemoria = new javax.swing.JPanel();
        jScrollPaneMemoria = new javax.swing.JScrollPane();
        jTableMemoria = new javax.swing.JTable();
        jCheckBoxFiltrarMemoria = new javax.swing.JCheckBox();
        jPanelProcessador = new javax.swing.JPanel();
        jScrollPaneProcessador = new javax.swing.JScrollPane();
        jTableProcessador = new javax.swing.JTable();
        jCheckBoxFiltrarProcessador = new javax.swing.JCheckBox();
        jLabelPreco = new javax.swing.JLabel();
        jComboBoxPreco1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldPreco1 = new javax.swing.JTextField();
        jCheckBoxFiltrarPreco1 = new javax.swing.JCheckBox();
        jComboBoxPreco2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldPreco2 = new javax.swing.JTextField();
        jCheckBoxFiltrarPreco2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jButtonConsultar = new javax.swing.JButton();
        jPanelAcessorios = new javax.swing.JPanel();
        jCheckBoxPrecisaWebcam = new javax.swing.JCheckBox();
        jCheckBoxPrecisaWireless = new javax.swing.JCheckBox();
        jCheckBoxFiltrarWebcam = new javax.swing.JCheckBox();
        jCheckBoxFiltrarWireless = new javax.swing.JCheckBox();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelFiltros.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione seus filtros para fazer a pesquisa"));

        jLabelNome.setText("Nome:");

        jComboBoxNome.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Começa com...", "Termina com...", "Contém...", "Exatamente..." }));
        jComboBoxNome.setEnabled(false);

        jTextFieldNome.setEnabled(false);

        jCheckBoxFiltrarNome.setText("Filtrar");
        jCheckBoxFiltrarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarNomeActionPerformed(evt);
            }
        });

        jCheckBoxFiltrarDescricao.setText("Filtrar");
        jCheckBoxFiltrarDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarDescricaoActionPerformed(evt);
            }
        });

        jTextFieldDescricao.setEnabled(false);

        jComboBoxDescricao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Começa com...", "Termina com...", "Contém...", "Exatamente..." }));
        jComboBoxDescricao.setEnabled(false);

        jLabelDescricao.setText("Descricao:");

        jPanelPlacaVideo.setBorder(javax.swing.BorderFactory.createTitledBorder("Que contenha a Placa de Vídeo..."));

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
        jTablePlacaVideo.setEnabled(false);
        jScrollPanePlacaVideo.setViewportView(jTablePlacaVideo);

        jCheckBoxFiltrarPlacaVideo.setText("Filtrar");
        jCheckBoxFiltrarPlacaVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarPlacaVideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPlacaVideoLayout = new javax.swing.GroupLayout(jPanelPlacaVideo);
        jPanelPlacaVideo.setLayout(jPanelPlacaVideoLayout);
        jPanelPlacaVideoLayout.setHorizontalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlacaVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPlacaVideoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxFiltrarPlacaVideo))
                    .addComponent(jScrollPanePlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelPlacaVideoLayout.setVerticalGroup(
            jPanelPlacaVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPlacaVideoLayout.createSequentialGroup()
                .addComponent(jCheckBoxFiltrarPlacaVideo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPanePlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMemoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Que contenha a Memória..."));

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
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMemoria.setEnabled(false);
        jScrollPaneMemoria.setViewportView(jTableMemoria);

        jCheckBoxFiltrarMemoria.setText("Filtrar");
        jCheckBoxFiltrarMemoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarMemoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMemoriaLayout = new javax.swing.GroupLayout(jPanelMemoria);
        jPanelMemoria.setLayout(jPanelMemoriaLayout);
        jPanelMemoriaLayout.setHorizontalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMemoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMemoriaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxFiltrarMemoria))
                    .addComponent(jScrollPaneMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelMemoriaLayout.setVerticalGroup(
            jPanelMemoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMemoriaLayout.createSequentialGroup()
                .addComponent(jCheckBoxFiltrarMemoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelProcessador.setBorder(javax.swing.BorderFactory.createTitledBorder("Que contenha o Processador..."));

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
        jTableProcessador.setEnabled(false);
        jScrollPaneProcessador.setViewportView(jTableProcessador);

        jCheckBoxFiltrarProcessador.setText("Filtrar");
        jCheckBoxFiltrarProcessador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarProcessadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelProcessadorLayout = new javax.swing.GroupLayout(jPanelProcessador);
        jPanelProcessador.setLayout(jPanelProcessadorLayout);
        jPanelProcessadorLayout.setHorizontalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelProcessadorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jCheckBoxFiltrarProcessador))
                    .addComponent(jScrollPaneProcessador, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelProcessadorLayout.setVerticalGroup(
            jPanelProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProcessadorLayout.createSequentialGroup()
                .addComponent(jCheckBoxFiltrarProcessador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelPreco.setText("Preço:");

        jComboBoxPreco1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maior que...", "Menor que...", "Maior ou igual a...", "Menor ou igual a...", "Exatamente igual a...", "Diferente de..." }));
        jComboBoxPreco1.setEnabled(false);

        jLabel2.setText("R$");

        jTextFieldPreco1.setEnabled(false);

        jCheckBoxFiltrarPreco1.setText("Filtrar");
        jCheckBoxFiltrarPreco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarPreco1ActionPerformed(evt);
            }
        });

        jComboBoxPreco2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Maior que...", "Menor que...", "Maior ou igual a...", "Menor ou igual a...", "Exatamente igual a...", "Diferente de..." }));
        jComboBoxPreco2.setEnabled(false);

        jLabel3.setText("R$");

        jTextFieldPreco2.setEnabled(false);

        jCheckBoxFiltrarPreco2.setText("Filtrar");
        jCheckBoxFiltrarPreco2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarPreco2ActionPerformed(evt);
            }
        });

        jLabel4.setText("e...");

        jButtonConsultar.setText("Consultar");

        jPanelAcessorios.setBorder(javax.swing.BorderFactory.createTitledBorder("Acessórios"));

        jCheckBoxPrecisaWebcam.setText("Precisa de Webcam");
        jCheckBoxPrecisaWebcam.setEnabled(false);

        jCheckBoxPrecisaWireless.setText("Precisa de Wireless");
        jCheckBoxPrecisaWireless.setEnabled(false);

        jCheckBoxFiltrarWebcam.setText("Filtrar");
        jCheckBoxFiltrarWebcam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarWebcamActionPerformed(evt);
            }
        });

        jCheckBoxFiltrarWireless.setText("Filtrar");
        jCheckBoxFiltrarWireless.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxFiltrarWirelessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcessoriosLayout = new javax.swing.GroupLayout(jPanelAcessorios);
        jPanelAcessorios.setLayout(jPanelAcessoriosLayout);
        jPanelAcessoriosLayout.setHorizontalGroup(
            jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcessoriosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxPrecisaWebcam)
                    .addComponent(jCheckBoxFiltrarWebcam))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxFiltrarWireless)
                    .addComponent(jCheckBoxPrecisaWireless))
                .addGap(21, 21, 21))
        );
        jPanelAcessoriosLayout.setVerticalGroup(
            jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAcessoriosLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcessoriosLayout.createSequentialGroup()
                        .addGroup(jPanelAcessoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBoxFiltrarWebcam)
                            .addComponent(jCheckBoxFiltrarWireless))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxPrecisaWebcam))
                    .addComponent(jCheckBoxPrecisaWireless, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jButtonVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanelFiltrosLayout = new javax.swing.GroupLayout(jPanelFiltros);
        jPanelFiltros.setLayout(jPanelFiltrosLayout);
        jPanelFiltrosLayout.setHorizontalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMemoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDescricao)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxNome, 0, 110, Short.MAX_VALUE)
                            .addComponent(jComboBoxDescricao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(jTextFieldDescricao))))
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxFiltrarDescricao)
                                    .addComponent(jCheckBoxFiltrarNome))
                                .addGap(18, 18, 18)
                                .addComponent(jPanelAcessorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jComboBoxPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxFiltrarPreco1))
                            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBoxFiltrarPreco2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFiltrosLayout.setVerticalGroup(
            jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jComboBoxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFiltrarNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDescricao)
                            .addComponent(jComboBoxDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFiltrarDescricao))
                        .addGap(15, 15, 15)
                        .addComponent(jPanelMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addComponent(jPanelAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltrosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFiltrosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPreco)
                            .addComponent(jComboBoxPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldPreco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFiltrarPreco1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldPreco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxFiltrarPreco2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultar)
                            .addComponent(jButtonVoltar))
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jCheckBoxFiltrarPreco2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarPreco2ActionPerformed
        jComboBoxPreco2.setEnabled(jCheckBoxFiltrarPreco2.isSelected());
        jTextFieldPreco2.setEnabled(jCheckBoxFiltrarPreco2.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarPreco2ActionPerformed

    private void jCheckBoxFiltrarPreco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarPreco1ActionPerformed
        jComboBoxPreco1.setEnabled(jCheckBoxFiltrarPreco1.isSelected());
        jTextFieldPreco1.setEnabled(jCheckBoxFiltrarPreco1.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarPreco1ActionPerformed

    private void jCheckBoxFiltrarProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarProcessadorActionPerformed
        if (jCheckBoxFiltrarProcessador.isSelected()) {
            jTableProcessador.setEnabled(true);
        } else {
            jTableProcessador.setEnabled(false);
            jTableProcessador.clearSelection();
        }
    }//GEN-LAST:event_jCheckBoxFiltrarProcessadorActionPerformed

    private void jCheckBoxFiltrarMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarMemoriaActionPerformed
        if (jCheckBoxFiltrarMemoria.isSelected()) {
            jTableMemoria.setEnabled(true);
        } else {
            jTableMemoria.setEnabled(false);
            jTableMemoria.clearSelection();
        }
    }//GEN-LAST:event_jCheckBoxFiltrarMemoriaActionPerformed

    private void jCheckBoxFiltrarPlacaVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarPlacaVideoActionPerformed
        if (jCheckBoxFiltrarPlacaVideo.isSelected()) {
            jTablePlacaVideo.setEnabled(true);
        } else {
            jTablePlacaVideo.setEnabled(false);
            jTablePlacaVideo.clearSelection();
        }
    }//GEN-LAST:event_jCheckBoxFiltrarPlacaVideoActionPerformed

    private void jCheckBoxFiltrarDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarDescricaoActionPerformed
        jComboBoxDescricao.setEnabled(jCheckBoxFiltrarDescricao.isSelected());
        jTextFieldDescricao.setEnabled(jCheckBoxFiltrarDescricao.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarDescricaoActionPerformed

    private void jCheckBoxFiltrarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarNomeActionPerformed
        jComboBoxNome.setEnabled(jCheckBoxFiltrarNome.isSelected());
        jTextFieldNome.setEnabled(jCheckBoxFiltrarNome.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarNomeActionPerformed

    private void jCheckBoxFiltrarWebcamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarWebcamActionPerformed
        jCheckBoxPrecisaWebcam.setEnabled(jCheckBoxFiltrarWebcam.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarWebcamActionPerformed

    private void jCheckBoxFiltrarWirelessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxFiltrarWirelessActionPerformed
        jCheckBoxPrecisaWireless.setEnabled(jCheckBoxFiltrarWireless.isSelected());
    }//GEN-LAST:event_jCheckBoxFiltrarWirelessActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxFiltrarDescricao;
    private javax.swing.JCheckBox jCheckBoxFiltrarMemoria;
    private javax.swing.JCheckBox jCheckBoxFiltrarNome;
    private javax.swing.JCheckBox jCheckBoxFiltrarPlacaVideo;
    private javax.swing.JCheckBox jCheckBoxFiltrarPreco1;
    private javax.swing.JCheckBox jCheckBoxFiltrarPreco2;
    private javax.swing.JCheckBox jCheckBoxFiltrarProcessador;
    private javax.swing.JCheckBox jCheckBoxFiltrarWebcam;
    private javax.swing.JCheckBox jCheckBoxFiltrarWireless;
    private javax.swing.JCheckBox jCheckBoxPrecisaWebcam;
    private javax.swing.JCheckBox jCheckBoxPrecisaWireless;
    private javax.swing.JComboBox jComboBoxDescricao;
    private javax.swing.JComboBox jComboBoxNome;
    private javax.swing.JComboBox jComboBoxPreco1;
    private javax.swing.JComboBox jComboBoxPreco2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelDescricao;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JPanel jPanelAcessorios;
    private javax.swing.JPanel jPanelFiltros;
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
    private javax.swing.JTextField jTextFieldDescricao;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco1;
    private javax.swing.JTextField jTextFieldPreco2;
    // End of variables declaration//GEN-END:variables
}
