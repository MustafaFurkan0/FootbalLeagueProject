package main;

import Text.*;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class teamPanel extends javax.swing.JPanel {

    Team team;
    PlayerList tempList;
    Node temp;
    private Hash hash = new Hash(10);
    public Match match = new Match();

    String nameArray[] = new String[11];
    String positionArray[] = new String[11];
    int ıdArray[] = new int[11];
    int goalArray[] = new int[11];

    public PlayerList playerList1 = new PlayerList();
    public PlayerList playerList2 = new PlayerList();
    public PlayerList playerList3 = new PlayerList();
    public PlayerList playerList4 = new PlayerList();
    public PlayerList playerList5 = new PlayerList();
    public PlayerList playerList6 = new PlayerList();
    public PlayerList playerList7 = new PlayerList();
    public PlayerList playerList8 = new PlayerList();
    public BST bst = new BST();
    public PlayerList playerlist = new PlayerList();

    public Team team1 = new Team("Besıktas", 1);
    public Team team2 = new Team("Fenerbahce", 2);
    public Team team3 = new Team("Galatasaray", 3);
    public Team team4 = new Team("Samsunspor", 4);
    public Team team5 = new Team("Bursaspor", 5);
    public Team team6 = new Team("Real Madrıd", 6);
    public Team team7 = new Team("Lıverpool", 7);
    public Team team8 = new Team("Barcelona", 8);

    Player team1player1 = new Player(team1, 34, "Mert Günok", "Goalkeeper");
    Player team1player2 = new Player(team1, 2, "Jonas Svensson", "Right Back");
    Player team1player3 = new Player(team1, 14, "Felix Uduokhai", "Center Back");
    Player team1player4 = new Player(team1, 53, "Emirhan Topçu", "Center Back");
    Player team1player5 = new Player(team1, 26, "Arthur Masuaku", "Left Back");
    Player team1player6 = new Player(team1, 6, "Al-Musrati", "Defensive Midfield");
    Player team1player7 = new Player(team1, 8, "Salih Uçan", "Central Midfield");
    Player team1player8 = new Player(team1, 83, "Gedson Fernandes", "Central Midfield");
    Player team1player9 = new Player(team1, 27, "Rafa Silva", "Left Wing");
    Player team1player10 = new Player(team1, 9, "Semih Kılıçsoy", "Striker");
    Player team1player11 = new Player(team1, 23, "Ernest Muçi", "Right Wing");

    Player team2player1 = new Player(team2, 40, "Dominik Livakovic", "Goalkeeper");
    Player team2player2 = new Player(team2, 2, "Çağlar Söyüncü", "Center Back");
    Player team2player3 = new Player(team2, 6, "Alexander Djiku", "Center Back");
    Player team2player4 = new Player(team2, 16, "Mert Müldür", "Right Back");
    Player team2player5 = new Player(team2, 24, "Jayden Oosterwolde", "Left Back");
    Player team2player6 = new Player(team2, 5, "İsmail Yüksek", "Defensive Midfield");
    Player team2player7 = new Player(team2, 10, "Dusan Tadic", "Attacking Midfield");
    Player team2player8 = new Player(team2, 13, "Fred", "Central Midfield");
    Player team2player9 = new Player(team2, 53, "Sebastian Szymanski", "Left Wing");
    Player team2player10 = new Player(team2, 9, "Edin Dzeko", "Striker");
    Player team2player11 = new Player(team2, 97, "Allan Saint-Maximin", "Right Wing");

    Player team3player1 = new Player(team3, 1, "Fernando Muslera", "Goalkeeper");
    Player team3player2 = new Player(team3, 4, "Ismail Jakobs", "Left Back");
    Player team3player3 = new Player(team3, 6, "Davinson Sanchez", "Center Back");
    Player team3player4 = new Player(team3, 23, "Kaan Ayhan", "Center Back");
    Player team3player5 = new Player(team3, 42, "Abdülkerim Bardakçı", "Left Center Back");
    Player team3player6 = new Player(team3, 20, "Gabriel Sara", "Central Midfield");
    Player team3player7 = new Player(team3, 34, "Lucas Torreira", "Defensive Midfield");
    Player team3player8 = new Player(team3, 10, "Dries Mertens", "Attacking Midfield");
    Player team3player9 = new Player(team3, 11, "Yunus Akgün", "Right Wing");
    Player team3player10 = new Player(team3, 45, "Victor Osimhen", "Striker");
    Player team3player11 = new Player(team3, 53, "Barış Alper Yılmaz", "Left Wing");

    Player team4player1 = new Player(team4, 1, "Okan Kocuk", "Goalkeeper");
    Player team4player2 = new Player(team4, 4, "Rick Van Drongelen", "Center Back");
    Player team4player3 = new Player(team4, 16, "Marc Bola", "Left Back");
    Player team4player4 = new Player(team4, 18, "Zeki Yavru", "Right Back");
    Player team4player5 = new Player(team4, 37, "Lubo Satka", "Center Back");
    Player team4player6 = new Player(team4, 6, "Youssef Ait Bennasser", "Defensive Midfield");
    Player team4player7 = new Player(team4, 10, "Olivier Ntcham", "Attacking Midfield");
    Player team4player8 = new Player(team4, 21, "Carlo Holse", "Right Wing");
    Player team4player9 = new Player(team4, 7, "Arbnor Muja", "Left Wing");
    Player team4player10 = new Player(team4, 9, "Marius Mouandilmadji", "Striker");
    Player team4player11 = new Player(team4, 14, "Landry Dimata", "Striker");

    Player team5player1 = new Player(team5, 1, "Anıl Atağ", "Goalkeeper");
    Player team5player2 = new Player(team5, 3, "Abdullah Tazgel", "Left Back");
    Player team5player3 = new Player(team5, 5, "Taha Can Velioğlu", "Center Back");
    Player team5player4 = new Player(team5, 22, "Eren Tunalı", "Right Back");
    Player team5player5 = new Player(team5, 27, "Mehmet Yiğit", "Center Back");
    Player team5player6 = new Player(team5, 9, "Ahmet İlhan Özek", "Right Wing");
    Player team5player7 = new Player(team5, 11, "İlhan Depe", "Left Wing");
    Player team5player8 = new Player(team5, 15, "Yiğit Ali Bayrak", "Attacking Midfield");
    Player team5player9 = new Player(team5, 35, "Musa Çağıran", "Defensive Midfield");
    Player team5player10 = new Player(team5, 10, "Muhammet Demir", "Striker");
    Player team5player11 = new Player(team5, 16, "Sedat Cengiz", "Central Midfield");

    Player team6player1 = new Player(team6, 1, "Thibaut Courtois", "Goalkeeper");
    Player team6player2 = new Player(team6, 2, "Dani Carvajal", "Right Back");
    Player team6player3 = new Player(team6, 3, "Eder Militao", "Center Back");
    Player team6player4 = new Player(team6, 22, "Antonio Rüdiger", "Center Back");
    Player team6player5 = new Player(team6, 8, "Federico Valverde", "Central Midfield");
    Player team6player6 = new Player(team6, 14, "Aurelien Tchouameni", "Defensive Midfield");
    Player team6player7 = new Player(team6, 15, "Arda Güler", "Attacking Midfield");
    Player team6player8 = new Player(team6, 20, "Francisco Garcia", "Left Back");
    Player team6player9 = new Player(team6, 7, "Junior Vinicius", "Left Wing");
    Player team6player10 = new Player(team6, 9, "Kylian Mbappe", "Striker");
    Player team6player11 = new Player(team6, 11, "Rodrygo", "Right Wing");

    Player team7player1 = new Player(team7, 1, "Alisson", "Goalkeeper");
    Player team7player2 = new Player(team7, 4, "Virgil van Dijk", "Center Back");
    Player team7player3 = new Player(team7, 5, "Ibrahima Konate", "Center Back");
    Player team7player4 = new Player(team7, 26, "Andrew Robertson", "Left Back");
    Player team7player5 = new Player(team7, 66, "Trent Alexander-Arnold", "Right Back");
    Player team7player6 = new Player(team7, 7, "Luis Diaz", "Left Wing");
    Player team7player7 = new Player(team7, 8, "Dominik Szoboszlai", "Central Midfield");
    Player team7player8 = new Player(team7, 10, "Alexis Mac Allister", "Central Midfield");
    Player team7player9 = new Player(team7, 20, "Diogo Jota", "Right Wing");
    Player team7player10 = new Player(team7, 38, "Ryan Gravenberch", "Central Midfield");
    Player team7player11 = new Player(team7, 11, "Mohamed Salah", "Right Wing");

    Player team8player1 = new Player(team8, 1, "Marc-Andre ter Stegen", "Goalkeeper");
    Player team8player2 = new Player(team8, 2, "Pau Cubarsi", "Right Back");
    Player team8player3 = new Player(team8, 3, "Alejandro Balde", "Left Back");
    Player team8player4 = new Player(team8, 5, "Inigo Martinez", "Center Back");
    Player team8player5 = new Player(team8, 23, "Jules Kounde", "Center Back");
    Player team8player6 = new Player(team8, 8, "Pedri", "Central Midfield");
    Player team8player7 = new Player(team8, 17, "Marc Casado", "Central Midfield");
    Player team8player8 = new Player(team8, 9, "Robert Lewandowski", "Striker");
    Player team8player9 = new Player(team8, 11, "Raphinha", "Right Wing");
    Player team8player10 = new Player(team8, 19, "Lamine Yamal", "Left Wing");
    Player team8player11 = new Player(team8, 20, "Dani Olmo", "Attacking Midfield");

    public teamPanel() {
        initComponents();
        setOpaque(false);
        playerPanel.setVisible(true);

        playerList1.addPlayer(team1player1);
        playerList1.addPlayer(team1player2);
        playerList1.addPlayer(team1player3);
        playerList1.addPlayer(team1player4);
        playerList1.addPlayer(team1player5);
        playerList1.addPlayer(team1player6);
        playerList1.addPlayer(team1player7);
        playerList1.addPlayer(team1player8);
        playerList1.addPlayer(team1player9);
        playerList1.addPlayer(team1player10);
        playerList1.addPlayer(team1player11);

        playerList2.addPlayer(team2player1);
        playerList2.addPlayer(team2player2);
        playerList2.addPlayer(team2player3);
        playerList2.addPlayer(team2player4);
        playerList2.addPlayer(team2player5);
        playerList2.addPlayer(team2player6);
        playerList2.addPlayer(team2player7);
        playerList2.addPlayer(team2player8);
        playerList2.addPlayer(team2player9);
        playerList2.addPlayer(team2player10);
        playerList2.addPlayer(team2player11);

        playerList3.addPlayer(team3player1);
        playerList3.addPlayer(team3player2);
        playerList3.addPlayer(team3player3);
        playerList3.addPlayer(team3player4);
        playerList3.addPlayer(team3player5);
        playerList3.addPlayer(team3player6);
        playerList3.addPlayer(team3player7);
        playerList3.addPlayer(team3player8);
        playerList3.addPlayer(team3player9);
        playerList3.addPlayer(team3player10);
        playerList3.addPlayer(team3player11);

        playerList4.addPlayer(team4player1);
        playerList4.addPlayer(team4player2);
        playerList4.addPlayer(team4player3);
        playerList4.addPlayer(team4player4);
        playerList4.addPlayer(team4player5);
        playerList4.addPlayer(team4player6);
        playerList4.addPlayer(team4player7);
        playerList4.addPlayer(team4player8);
        playerList4.addPlayer(team4player9);
        playerList4.addPlayer(team4player10);
        playerList4.addPlayer(team4player11);

        playerList5.addPlayer(team5player1);
        playerList5.addPlayer(team5player2);
        playerList5.addPlayer(team5player3);
        playerList5.addPlayer(team5player4);
        playerList5.addPlayer(team5player5);
        playerList5.addPlayer(team5player6);
        playerList5.addPlayer(team5player7);
        playerList5.addPlayer(team5player8);
        playerList5.addPlayer(team5player9);
        playerList5.addPlayer(team5player10);
        playerList5.addPlayer(team5player11);

        playerList6.addPlayer(team6player1);
        playerList6.addPlayer(team6player2);
        playerList6.addPlayer(team6player3);
        playerList6.addPlayer(team6player4);
        playerList6.addPlayer(team6player5);
        playerList6.addPlayer(team6player6);
        playerList6.addPlayer(team6player7);
        playerList6.addPlayer(team6player8);
        playerList6.addPlayer(team6player9);
        playerList6.addPlayer(team6player10);
        playerList6.addPlayer(team6player11);

        playerList7.addPlayer(team7player1);
        playerList7.addPlayer(team7player2);
        playerList7.addPlayer(team7player3);
        playerList7.addPlayer(team7player4);
        playerList7.addPlayer(team7player5);
        playerList7.addPlayer(team7player6);
        playerList7.addPlayer(team7player7);
        playerList7.addPlayer(team7player8);
        playerList7.addPlayer(team7player9);
        playerList7.addPlayer(team7player10);
        playerList7.addPlayer(team7player11);

        playerList8.addPlayer(team8player1);
        playerList8.addPlayer(team8player2);
        playerList8.addPlayer(team8player3);
        playerList8.addPlayer(team8player4);
        playerList8.addPlayer(team8player5);
        playerList8.addPlayer(team8player6);
        playerList8.addPlayer(team8player7);
        playerList8.addPlayer(team8player8);
        playerList8.addPlayer(team8player9);
        playerList8.addPlayer(team8player10);
        playerList8.addPlayer(team8player11);

        bst.insert(team1);
        bst.insert(team2);
        bst.insert(team3);
        bst.insert(team4);
        bst.insert(team5);
        bst.insert(team6);
        bst.insert(team7);
        bst.insert(team8);

        hash.put(team1.name, playerList1);
        hash.put(team2.name, playerList2);
        hash.put(team3.name, playerList3);
        hash.put(team4.name, playerList4);
        hash.put(team5.name, playerList5);
        hash.put(team6.name, playerList6);
        hash.put(team7.name, playerList7);
        hash.put(team8.name, playerList7);

    }

    public void setTakeTeam(Text.BST.BstNode node) {
        this.playerlist = node.team.getPlayers();
    }

    public PlayerList getTakeTeam() {
        return playerlist;
    }

    public String getTeamName() {
        return teamName.getText();
    }

    public void setTeamName(String name) {
        teamName.setText(name);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LigPanel = new Panels.PanelBorder();
        teampanel = new Panels.PanelBorder();
        jScrollPane1 = new javax.swing.JScrollPane();
        teamTable = new Text.teamTable();
        player1Check = new javax.swing.JCheckBox();
        teamName = new javax.swing.JLabel();
        player2Check = new javax.swing.JCheckBox();
        player3Check = new javax.swing.JCheckBox();
        player4Check = new javax.swing.JCheckBox();
        player5Check = new javax.swing.JCheckBox();
        player6Check = new javax.swing.JCheckBox();
        player8Check = new javax.swing.JCheckBox();
        player9Check = new javax.swing.JCheckBox();
        player10Check = new javax.swing.JCheckBox();
        player11Check = new javax.swing.JCheckBox();
        player7Check = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        playerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        playerName = new javax.swing.JLabel();
        playerPosition = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        playerID = new javax.swing.JLabel();
        teamButton = new javax.swing.JButton();

        LigPanel.setBackground(new java.awt.Color(81, 90, 90));

        javax.swing.GroupLayout LigPanelLayout = new javax.swing.GroupLayout(LigPanel);
        LigPanel.setLayout(LigPanelLayout);
        LigPanelLayout.setHorizontalGroup(
            LigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LigPanelLayout.setVerticalGroup(
            LigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        teampanel.setBackground(new java.awt.Color(81, 90, 90));

        teamTable.setBackground(new java.awt.Color(131, 145, 146));
        teamTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Position", "Player Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        teamTable.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        teamTable.setRowHeight(38);
        jScrollPane1.setViewportView(teamTable);
        if (teamTable.getColumnModel().getColumnCount() > 0) {
            teamTable.getColumnModel().getColumn(0).setResizable(false);
            teamTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            teamTable.getColumnModel().getColumn(1).setResizable(false);
            teamTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        player1Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1CheckActionPerformed(evt);
            }
        });

        teamName.setBackground(new java.awt.Color(131, 145, 146));
        teamName.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        teamName.setForeground(new java.awt.Color(255, 255, 255));
        teamName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        player2Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2CheckActionPerformed(evt);
            }
        });

        player3Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3CheckActionPerformed(evt);
            }
        });

        player4Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4CheckActionPerformed(evt);
            }
        });

        player5Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player5CheckActionPerformed(evt);
            }
        });

        player6Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player6CheckActionPerformed(evt);
            }
        });

        player8Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player8CheckActionPerformed(evt);
            }
        });

        player9Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player9CheckActionPerformed(evt);
            }
        });

        player10Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player10CheckActionPerformed(evt);
            }
        });

        player11Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player11CheckActionPerformed(evt);
            }
        });

        player7Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player7CheckActionPerformed(evt);
            }
        });

        jPanel3.setOpaque(false);

        playerPanel.setBackground(new java.awt.Color(131, 145, 146));

        jLabel1.setBackground(new java.awt.Color(131, 145, 146));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Player Detail");

        jLabel3.setBackground(new java.awt.Color(131, 145, 146));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 77, 102));
        jLabel3.setText("Name       :");

        jLabel4.setBackground(new java.awt.Color(131, 145, 146));
        jLabel4.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 77, 102));
        jLabel4.setText("Position   :");

        playerName.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        playerName.setForeground(new java.awt.Color(255, 255, 255));

        playerPosition.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        playerPosition.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(131, 145, 146));
        jLabel7.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 77, 102));
        jLabel7.setText("Player ID :");

        playerID.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        playerID.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout playerPanelLayout = new javax.swing.GroupLayout(playerPanel);
        playerPanel.setLayout(playerPanelLayout);
        playerPanelLayout.setHorizontalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(playerPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(playerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        playerPanelLayout.setVerticalGroup(
            playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playerPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(playerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(playerID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(playerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(playerPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(playerPanelLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(playerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );

        teamButton.setBackground(new java.awt.Color(81, 90, 90));
        teamButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-football-team-64.png"))); // NOI18N
        teamButton.setBorder(null);
        teamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teampanelLayout = new javax.swing.GroupLayout(teampanel);
        teampanel.setLayout(teampanelLayout);
        teampanelLayout.setHorizontalGroup(
            teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teampanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(player10Check)
                                .addComponent(player11Check))
                            .addComponent(player4Check))
                        .addComponent(player2Check)
                        .addComponent(player3Check)
                        .addComponent(player1Check)
                        .addComponent(player5Check, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(player6Check))
                    .addComponent(player7Check)
                    .addComponent(player8Check)
                    .addComponent(player9Check))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teampanelLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(teamButton)
                .addContainerGap())
        );
        teampanelLayout.setVerticalGroup(
            teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teampanelLayout.createSequentialGroup()
                .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teampanelLayout.createSequentialGroup()
                        .addComponent(teamButton)
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teampanelLayout.createSequentialGroup()
                        .addComponent(teamName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(teampanelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(player1Check)
                        .addGap(18, 18, 18)
                        .addComponent(player2Check, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(player3Check)
                        .addGap(18, 18, 18)
                        .addGroup(teampanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teampanelLayout.createSequentialGroup()
                                .addComponent(player4Check)
                                .addGap(18, 18, 18)
                                .addComponent(player5Check)
                                .addGap(18, 18, 18)
                                .addComponent(player6Check)
                                .addGap(18, 18, 18)
                                .addComponent(player7Check)
                                .addGap(18, 18, 18)
                                .addComponent(player8Check)
                                .addGap(18, 18, 18)
                                .addComponent(player9Check)
                                .addGap(18, 18, 18)
                                .addComponent(player10Check)
                                .addGap(18, 18, 18)
                                .addComponent(player11Check))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(teampanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(teampanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void player1CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1CheckActionPerformed
        if (player1Check.isSelected()) {
            int i = 0;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player1CheckActionPerformed

    private void player2CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2CheckActionPerformed
        if (player2Check.isSelected()) {
            int i = 1;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player2CheckActionPerformed

    private void player3CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3CheckActionPerformed
        if (player3Check.isSelected()) {
            int i = 2;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player3CheckActionPerformed

    private void player4CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4CheckActionPerformed
        if (player4Check.isSelected()) {
            int i = 3;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player4CheckActionPerformed

    private void player5CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player5CheckActionPerformed
        if (player5Check.isSelected()) {
            int i = 4;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player5CheckActionPerformed

    private void player6CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player6CheckActionPerformed
        if (player6Check.isSelected()) {
            int i = 5;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player6CheckActionPerformed

    private void player7CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player7CheckActionPerformed
        if (player7Check.isSelected()) {
            int i = 6;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player7CheckActionPerformed

    private void player8CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player8CheckActionPerformed
        if (player8Check.isSelected()) {
            int i = 7;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player8CheckActionPerformed

    private void player9CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player9CheckActionPerformed
        if (player9Check.isSelected()) {
            int i = 8;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player9CheckActionPerformed

    private void player10CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player10CheckActionPerformed
        if (player10Check.isSelected()) {
            int i = 9;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player10CheckActionPerformed

    private void player11CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player11CheckActionPerformed
        if (player11Check.isSelected()) {
            int i = 10;
            playerID.setText(Integer.toString(ıdArray[i]));
            playerName.setText(nameArray[i]);
            playerPosition.setText(positionArray[i]);
        } else {
            playerID.setText("");
            playerName.setText("");
            playerPosition.setText("");
        }
    }//GEN-LAST:event_player11CheckActionPerformed

    private void teamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamButtonActionPerformed
        String name = teamName.getText();
        team = bst.search(name).team;
        tempList = hash.get(team.getName());
        updateTeamTable(tempList);
    }//GEN-LAST:event_teamButtonActionPerformed

    public void updateTeamTable(PlayerList playerList) {
        DefaultTableModel model = (DefaultTableModel) teamTable.getModel();
        model.setRowCount(0);
        temp = playerList.head;
        int i = 0;

        while (temp != null) {
            teamTable.addRow(new Object[]{temp.player.getPosition(), temp.player.getPlayerName()});
            nameArray[i] = temp.player.getPlayerName();
            positionArray[i] = temp.player.getPosition();
            ıdArray[i] = temp.player.getPlayerId();
            goalArray[i] = temp.player.getGoalsScored();
            temp = temp.next;
            i++;
        }
    }

    public JButton getTeamButton() {
        return teamButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Panels.PanelBorder LigPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox player10Check;
    private javax.swing.JCheckBox player11Check;
    private javax.swing.JCheckBox player1Check;
    private javax.swing.JCheckBox player2Check;
    private javax.swing.JCheckBox player3Check;
    private javax.swing.JCheckBox player4Check;
    private javax.swing.JCheckBox player5Check;
    private javax.swing.JCheckBox player6Check;
    private javax.swing.JCheckBox player7Check;
    private javax.swing.JCheckBox player8Check;
    private javax.swing.JCheckBox player9Check;
    private javax.swing.JLabel playerID;
    private javax.swing.JLabel playerName;
    private javax.swing.JPanel playerPanel;
    private javax.swing.JLabel playerPosition;
    private javax.swing.JButton teamButton;
    private javax.swing.JLabel teamName;
    private Text.teamTable teamTable;
    private Panels.PanelBorder teampanel;
    // End of variables declaration//GEN-END:variables
}
