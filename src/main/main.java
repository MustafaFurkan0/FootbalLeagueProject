package main;

import Text.*;
import java.awt.*;
import javax.swing.*;
import main.menu;

public class main extends javax.swing.JFrame {

    private CardLayout cardLayout;
    private CardLayout cardLayout1;
    private teamPanel teamPanel;
    private leaguPanel leaguepanel;

    public main() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        //menu.initMoving(main.this);
        teamPanel = new teamPanel();
        cardLayout = new CardLayout();
        cardLayout1 = new CardLayout();
        menuPanel.setLayout(cardLayout1);
        menuPanel.add(new menu(), "menu");
        cardLayout1.show(menuPanel, "menu");
        mainPanel.setLayout(cardLayout);
        mainPanel.add(new leaguPanel(), "leaguePanel");
        mainPanel.add(new teamPanel(), "teamPanel");
        cardLayout.show(mainPanel, "leaguePanel");
        backLeague.setVisible(false);
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
        mainPanel = new javax.swing.JPanel();
        backLeague = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();

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
            .addGap(0, 977, Short.MAX_VALUE)
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

        menuPanel.setBackground(new java.awt.Color(242, 242, 242));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                                .addGap(388, 388, 388)
                                .addComponent(backLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(quitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(backLeague, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed

    }//GEN-LAST:event_searchTextActionPerformed
    public SearchText getSearchText() {
        return searchText;
    }

    private void teamSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamSearchButtonActionPerformed

        mainPanel.removeAll();
        String text = searchText.getText();
        teamPanel newTeamPanel = new teamPanel();
        newTeamPanel.setTeamName(text);
        newTeamPanel.getTeamButton().doClick();
        mainPanel.add(newTeamPanel, "teamPanel");
        mainPanel.repaint();
        mainPanel.revalidate();
        ((CardLayout) mainPanel.getLayout()).show(mainPanel, "teamPanel");
        backLeague.setVisible(true);

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

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backLeague;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private Panels.PanelBorder panelBorder1;
    private Panels.PanelBorder panelBorder2;
    private javax.swing.JButton quitButton;
    private Text.SearchText searchText;
    private javax.swing.JButton teamSearchButton;
    // End of variables declaration//GEN-END:variables

}
