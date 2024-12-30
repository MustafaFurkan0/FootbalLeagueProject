package main;

import main.main;
import Panels.PanelBorder;
import Text.*;
import Text.Hash;

import java.util.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class leaguPanel extends javax.swing.JPanel {

    public MyStack stack = new MyStack();
    public TeamList teamlist = new TeamList();
    public Match match = new Match();
    public Heap heap = new Heap();
    public Hash hash = new Hash(teamlist.size());
    int currentweek = 0;
    Team team1 = new Team("Besıktas", 1);
    Team team2 = new Team("Fenerbahce", 2);
    Team team3 = new Team("Galatasaray", 3);
    Team team4 = new Team("Samsunspor", 4);
    Team team5 = new Team("Bursaspor", 5);
    Team team6 = new Team("Barcelona", 6);
    Team team7 = new Team("Real Madrıd", 7);
    Team team8 = new Team("Lıverpool", 8);

    public leaguPanel() {
        initComponents();
        setOpaque(false);

        teamlist.addTeam(team1);
        teamlist.addTeam(team2);
        teamlist.addTeam(team3);
        teamlist.addTeam(team4);
        teamlist.addTeam(team5);
        teamlist.addTeam(team6);
        teamlist.addTeam(team7);
        teamlist.addTeam(team8);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leaguepanel = new Panels.PanelBorder();
        nextButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        leagueTable = new Text.leagueTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        resultTable = new Text.leagueTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        goalTable = new Text.leagueTable();
        leagueButton = new javax.swing.JButton();

        leaguepanel.setBackground(new java.awt.Color(81, 90, 90));

        nextButton.setBackground(new java.awt.Color(131, 145, 146));
        nextButton.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        nextButton.setForeground(new java.awt.Color(255, 255, 255));
        nextButton.setText("Next Week");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        leagueTable.setBackground(new java.awt.Color(131, 145, 146));
        leagueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team", "P", "Avg", "Form "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leagueTable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        leagueTable.setGridColor(new java.awt.Color(204, 204, 204));
        leagueTable.setRowHeight(50);
        jScrollPane4.setViewportView(leagueTable);
        if (leagueTable.getColumnModel().getColumnCount() > 0) {
            leagueTable.getColumnModel().getColumn(0).setResizable(false);
            leagueTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            leagueTable.getColumnModel().getColumn(1).setResizable(false);
            leagueTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            leagueTable.getColumnModel().getColumn(2).setResizable(false);
            leagueTable.getColumnModel().getColumn(2).setPreferredWidth(40);
            leagueTable.getColumnModel().getColumn(3).setResizable(false);
            leagueTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        resultTable.setBackground(new java.awt.Color(131, 145, 146));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Match Result", "1", "2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        resultTable.setRowHeight(50);
        jScrollPane5.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        }

        goalTable.setBackground(new java.awt.Color(131, 145, 146));
        goalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Goal Scorer", "Goal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        goalTable.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        goalTable.setRowHeight(48);
        jScrollPane6.setViewportView(goalTable);
        if (goalTable.getColumnModel().getColumnCount() > 0) {
            goalTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            goalTable.getColumnModel().getColumn(1).setResizable(false);
        }

        leagueButton.setBackground(new java.awt.Color(81, 90, 90));
        leagueButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-football-67.png"))); // NOI18N
        leagueButton.setBorder(null);
        leagueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leagueButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leaguepanelLayout = new javax.swing.GroupLayout(leaguepanel);
        leaguepanel.setLayout(leaguepanelLayout);
        leaguepanelLayout.setHorizontalGroup(
            leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leaguepanelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leaguepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(leaguepanelLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leaguepanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(leagueButton))
                            .addGroup(leaguepanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        leaguepanelLayout.setVerticalGroup(
            leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaguepanelLayout.createSequentialGroup()
                .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, leaguepanelLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(leagueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leaguepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(leaguepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        QueueTeam queue = new QueueTeam();
        heap.clear();
        DefaultTableModel model = (DefaultTableModel) leagueTable.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) resultTable.getModel();
        model1.setRowCount(0);

        int totalTeams = teamlist.size();
        if (totalTeams % 2 != 0) {
            throw new IllegalArgumentException("Takım sayısı çift olmalıdır.");
        }

        for (int i = 0; i < totalTeams / 2; i++) {
            Team team1 = teamlist.get(i);
            Team team2 = teamlist.get(totalTeams - 1 - i);
            queue.enqueue(new Match(team1, team2));
        }
        for (int i = 0; i < teamlist.size() / 2; i++) {
            Match match = queue.dequeue();
            stack.push(match);
            Team team1 = match.team1;
            Team team2 = match.team2;
            heap.add(team1);
            heap.add(team2);
        }

        match.rotateTeams(teamlist);
        TeamList listyeni = heap.getSortedListHeap();
        Node temp = listyeni.head;
        while (temp != null) {
            leagueTable.addRow(new Object[]{temp.team.name, temp.team.totalPoints, temp.team.goalDifference, temp.team.form});
            temp = temp.next; // Bir sonraki düğüme geç
        }
        for (int i = 0; i < 4; i++) {
            Match matchstack = stack.pop();
            resultTable.addRow(new Object[]{matchstack.team1.name, matchstack.getTeam1Score() + " - " + matchstack.getTeam2Score(), matchstack.team2.name});
        }


    }//GEN-LAST:event_nextButtonActionPerformed

    private void leagueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leagueButtonActionPerformed
        /*
        ArrayList<Team> teamsArray = new ArrayList<>();
        Node current = teamlist.getHead();
        while (current != null) {
            teamsArray.add(current.team);
            current = current.next;
        }
        ArrayList<Team> teamMix = match.rotateTeams(teamsArray);
        
        match.createFixtures(teamlist)
         */
    }//GEN-LAST:event_leagueButtonActionPerformed

    public JButton getNextButton() {
        return nextButton;
    }

    public JButton getLeagueButton() {
        return leagueButton;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Text.leagueTable goalTable;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton leagueButton;
    private Text.leagueTable leagueTable;
    private Panels.PanelBorder leaguepanel;
    private javax.swing.JButton nextButton;
    private Text.leagueTable resultTable;
    // End of variables declaration//GEN-END:variables
}
