package main;

import Text.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class main extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private teamPanel teamPanel;
    private leaguPanel leaguepanel;

    public TeamList teamlist = new TeamList();
    private QueueTeam queue = new QueueTeam();
    private Match matchQueue = new Match();
    private ArrayList<Team> teams = new ArrayList<>();
    private Heap heap;
    private Match matchSimulator;
    private int currentweek = 0;
    public Hash hashTable;

    public BST bst = new BST();

    Team team1 = new Team("Besıktas", 1);
    Team team2 = new Team("Fenerbahce", 2);
    Team team3 = new Team("Galatasaray", 3);
    Team team4 = new Team("Samsunspor", 4);
    Team team5 = new Team("Bursaspor", 5);
    Team team6 = new Team("Barcelona", 6);
    Team team7 = new Team("Real Madrıd", 7);
    Team team8 = new Team("Lıverpool", 8);

    public main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        menu2.initMoving(main.this);
        teamPanel = new teamPanel();
        cardLayout = new CardLayout();
        mainPanel.setLayout(cardLayout);
        mainPanel.add(new leaguPanel(), "leaguePanel");
        mainPanel.add(new teamPanel(), "teamPanel");
        cardLayout.show(mainPanel, "leaguePanel");
        backLeague.setVisible(false);

        bst.insert(team1);
        bst.insert(team2);
        bst.insert(team3);
        bst.insert(team4);
        bst.insert(team5);
        bst.insert(team6);
        bst.insert(team7);
        bst.insert(team8);

    }

    public main(Hash hashTable, Heap heap, QueueTeam matchQueue) {
        initComponents();
        this.hashTable = (hashTable != null) ? hashTable : new Hash(10); // Eğer null ise yeni bir Hash nesnesi oluştur
        this.heap = heap;
        this.queue = matchQueue;
        this.currentweek = 1;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }

    public void showBackButton() {
        backLeague.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDialog1 = new javax.swing.JDialog();
        panelBorder1 = new Panels.PanelBorder();
        panelBorder2 = new Panels.PanelBorder();
        searchText = new Text.SearchText();
        teamSearchButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        menu2 = new Panels.menu();
        mainPanel = new javax.swing.JPanel();
        backLeague = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(81, 90, 90));
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(242, 242, 242));

        panelBorder2.setBackground(new java.awt.Color(204, 204, 204));

        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        teamSearchButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        teamSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-search-48.png"))); // NOI18N
        teamSearchButton.setBorder(null);
        teamSearchButton.setBorderPainted(false);
        teamSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(teamSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(teamSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(searchText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        quitButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        quitButton.setForeground(new java.awt.Color(131, 145, 146));
        quitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-log-out-32.png"))); // NOI18N
        quitButton.setBorder(null);
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 966, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        backLeague.setBackground(new java.awt.Color(242, 242, 242));
        backLeague.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-back-48.png"))); // NOI18N
        backLeague.setBorder(null);
        backLeague.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLeagueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(backLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelBorder1Layout.createSequentialGroup()
                            .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 85, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(backLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void simulateWeek() {
        // 1. Haftanın maçlarını oyna
        for (int i = 0; i < 8; i++) {
            Match match = queue.dequeue();
            if (match == null) {
                break; // Maç yoksa işlemi sonlandır
            }
            match.simulate();
            hashTable.ekle(i + 1, teamlist);

        }

        // 2. Heap sıralamasını güncelle
        TeamList result = new TeamList();
        result = hashTable.hashMethod(teamlist, currentweek);
        heap = new Heap();

        for (int i = 0; i < result.size(); i++) {
            heap.add(result.get(i));

        }
    }


    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed

    }//GEN-LAST:event_searchTextActionPerformed

    private void teamSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamSearchButtonActionPerformed

        mainPanel.removeAll(); // mainPanel'i temizle
        String text = searchText.getText(); // Arama metnini al
        teamPanel newTeamPanel = new teamPanel(); // Yeni bir TeamPanel oluştur

        newTeamPanel.setTeamName(text); // Arama metnini JLabel'a gönder
        newTeamPanel.getTeamButton().doClick();

        mainPanel.add(newTeamPanel, "teamPanel"); // Yeni paneli ekle
        mainPanel.repaint(); // Görsel yenileme
        mainPanel.revalidate(); // Düzeni yeniden yapılandır

        ((CardLayout) mainPanel.getLayout()).show(mainPanel, "teamPanel"); // CardLayout ile göster
        backLeague.setVisible(true); // Geri butonunu görünür yap

        searchText.setText("");
    }//GEN-LAST:event_teamSearchButtonActionPerformed


    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void backLeagueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLeagueActionPerformed
        mainPanel.removeAll();
        mainPanel.add(new leaguPanel(), "leaguPanel");
        mainPanel.repaint();
        mainPanel.revalidate();
        cardLayout.show(mainPanel, "leaguPanel");
        backLeague.setVisible(false);

    }//GEN-LAST:event_backLeagueActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });

        Hash hashTable = new Hash(10);
        Heap heap = new Heap();
        Match match = new Match();
        TeamList teamlist = new TeamList();
        QueueTeam matchQueue2 = new QueueTeam();

        Team team1 = new Team("Besıktas", 1);
        Team team2 = new Team("Fenerbahce", 2);
        Team team3 = new Team("Galatasaray", 3);
        Team team4 = new Team("Samsunspor", 4);
        Team team5 = new Team("Bursaspor", 5);
        Team team6 = new Team("Barcelona", 6);
        Team team7 = new Team("Real Madrıd", 7);
        Team team8 = new Team("Lıverpool", 8);

        teamlist.addTeam(team1);
        teamlist.addTeam(team2);
        teamlist.addTeam(team3);
        teamlist.addTeam(team4);
        teamlist.addTeam(team5);
        teamlist.addTeam(team6);
        teamlist.addTeam(team7);
        teamlist.addTeam(team8);

        match.createFixtures(teamlist, matchQueue2, hashTable);
        new main(hashTable, heap, matchQueue2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLeague;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel mainPanel;
    private Panels.menu menu2;
    private Panels.PanelBorder panelBorder1;
    private Panels.PanelBorder panelBorder2;
    private javax.swing.JButton quitButton;
    private Text.SearchText searchText;
    private javax.swing.JButton teamSearchButton;
    // End of variables declaration//GEN-END:variables

    public SearchText getSearchText() {
        return searchText;
    }

}
