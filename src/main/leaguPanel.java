package main;

import Text.*;
import Text.Hash;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class leaguPanel extends javax.swing.JPanel {

    public teamPanel teampanel = new teamPanel();
    public MyStack stack = new MyStack();
    public TeamList teamlist = new TeamList();
    public Match match = new Match();
    public Heap heap = new Heap();
    public Hash hash = new Hash(teamlist.size());
    int clickCount = 1;

    public leaguPanel() {
        initComponents();
        setOpaque(false);

        teamlist.addTeam(teampanel.team1);
        teamlist.addTeam(teampanel.team2);
        teamlist.addTeam(teampanel.team3);
        teamlist.addTeam(teampanel.team4);
        teamlist.addTeam(teampanel.team5);
        teamlist.addTeam(teampanel.team6);
        teamlist.addTeam(teampanel.team7);
        teamlist.addTeam(teampanel.team8);

        teampanel.team1.addPlayer(teampanel.playerList1);
        teampanel.team2.addPlayer(teampanel.playerList2);
        teampanel.team3.addPlayer(teampanel.playerList3);
        teampanel.team4.addPlayer(teampanel.playerList4);
        teampanel.team5.addPlayer(teampanel.playerList5);
        teampanel.team6.addPlayer(teampanel.playerList6);
        teampanel.team7.addPlayer(teampanel.playerList7);
        teampanel.team8.addPlayer(teampanel.playerList8);

        Node temp = teamlist.head;
        while (temp != null) {
            leagueTable.addRow(new Object[]{temp.team.name, temp.team.totalPoints, temp.team.scoreGoal, temp.team.concededGoal, 0, "-"});
            temp = temp.next;
        }
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
                "Team", "P", "+G", "-G", "Avg", "Form"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        leagueTable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        leagueTable.setRowHeight(50);
        jScrollPane4.setViewportView(leagueTable);
        if (leagueTable.getColumnModel().getColumnCount() > 0) {
            leagueTable.getColumnModel().getColumn(0).setResizable(false);
            leagueTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            leagueTable.getColumnModel().getColumn(1).setResizable(false);
            leagueTable.getColumnModel().getColumn(1).setPreferredWidth(30);
            leagueTable.getColumnModel().getColumn(2).setResizable(false);
            leagueTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            leagueTable.getColumnModel().getColumn(3).setResizable(false);
            leagueTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            leagueTable.getColumnModel().getColumn(4).setResizable(false);
            leagueTable.getColumnModel().getColumn(4).setPreferredWidth(30);
            leagueTable.getColumnModel().getColumn(5).setResizable(false);
            leagueTable.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        resultTable.setBackground(new java.awt.Color(131, 145, 146));
        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
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
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(20);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        }

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(131, 145, 146));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MATCH RESULT");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-football-67.png"))); // NOI18N

        javax.swing.GroupLayout leaguepanelLayout = new javax.swing.GroupLayout(leaguepanel);
        leaguepanel.setLayout(leaguepanelLayout);
        leaguepanelLayout.setHorizontalGroup(
            leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaguepanelLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(leaguepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        leaguepanelLayout.setVerticalGroup(
            leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leaguepanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 0, 0)
                .addGroup(leaguepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leaguepanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leaguepanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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
        jLabel1.setText("WEEK " + clickCount);
        QueueTeam queue = new QueueTeam();
        heap.clear();
        DefaultTableModel model = (DefaultTableModel) leagueTable.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) resultTable.getModel();
        model1.setRowCount(0);

        int totalTeams = teamlist.size();

        for (int i = 0; i < totalTeams / 2; i++) {
            Team team1 = teamlist.get(i);
            Team team2 = teamlist.get(totalTeams - 1 - i);
            queue.enqueue(new Match(team1, team2));
        }
        for (int i = 0; i < teamlist.size() / 2; i++) {
            match = queue.dequeue();
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
            leagueTable.addRow(new Object[]{temp.team.name, temp.team.totalPoints, temp.team.scoreGoal, temp.team.concededGoal, temp.team.getGoalDifference(), temp.team.form});
            temp = temp.next;
        }
        for (int i = 0; i < 4; i++) {
            Match matchstack = stack.pop();
            resultTable.addRow(new Object[]{matchstack.team1.name, matchstack.getTeam1Score() + " - " + matchstack.getTeam2Score(), matchstack.team2.name});
        }
        clickCount++;
        if (clickCount == 8) {
            nextButton.setEnabled(false);
            JOptionPane.showMessageDialog(null, "League Completed, Champion " + listyeni.head.team.name.toUpperCase(), "Celal Bayar League", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private Text.leagueTable leagueTable;
    private Panels.PanelBorder leaguepanel;
    private javax.swing.JButton nextButton;
    private Text.leagueTable resultTable;
    // End of variables declaration//GEN-END:variables
}
