/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GameController;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JOptionPane;
import model.Scenario;

/**
 *
 * @author RuN
 */
public class StartPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    private ForcePanel forcePanel;
    private final MainFrame frame;
    private final Scenario scenario1;
    private final Scenario scenario2;
    private final GameController controller;
    private final NewBattlePanel examplePanel;
    
    /**
     * Creates new form StartPanel
     * @param frame
     */
    public StartPanel(MainFrame frame) {
        super();
        
        this.frame = frame;
        
        examplePanel = new NewBattlePanel();
        frame.getContentPane().add(examplePanel);
        examplePanel.setVisible(false);
        
        scenario1 = new Scenario();
        scenario1.initScenario1();
        
        scenario2 = new Scenario();
        scenario2.initScenario2();
        
        controller = new GameController();
        
        initComponents();
        setSize(800, 600);
        scenario1Button.setVisible(false);
        scenario2Button.setVisible(false);
        scenario3Button.setVisible(false);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        Graphics2D g2 = (Graphics2D)g;

        g2.drawRect(300, 120, 199, 400);
        g2.drawRect(303, 123, 193, 394);
    }
    
    private void createForcePanel()
    {
        // Create ForcePanel
        forcePanel = new ForcePanel(frame, controller);
        frame.getContentPane().add(forcePanel);
        forcePanel.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        loadGameButton = new javax.swing.JButton();
        scenario1Button = new javax.swing.JButton();
        scenario2Button = new javax.swing.JButton();
        scenario3Button = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));

        titleLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 0, 0));
        titleLabel.setText("三国志");

        newGameButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        newGameButton.setForeground(new java.awt.Color(102, 0, 0));
        newGameButton.setText("新游戏");
        newGameButton.setFocusable(false);
        newGameButton.setMaximumSize(new java.awt.Dimension(133, 64));
        newGameButton.setMinimumSize(new java.awt.Dimension(133, 64));
        newGameButton.setPreferredSize(new java.awt.Dimension(133, 64));
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        loadGameButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        loadGameButton.setForeground(new java.awt.Color(102, 0, 0));
        loadGameButton.setText("读取");
        loadGameButton.setFocusable(false);
        loadGameButton.setMaximumSize(new java.awt.Dimension(133, 64));
        loadGameButton.setMinimumSize(new java.awt.Dimension(133, 64));
        loadGameButton.setPreferredSize(new java.awt.Dimension(133, 64));
        loadGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadGameButtonActionPerformed(evt);
            }
        });

        scenario1Button.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        scenario1Button.setForeground(new java.awt.Color(102, 0, 0));
        scenario1Button.setText("英雄集结");
        scenario1Button.setFocusable(false);
        scenario1Button.setMaximumSize(new java.awt.Dimension(133, 64));
        scenario1Button.setMinimumSize(new java.awt.Dimension(133, 64));
        scenario1Button.setPreferredSize(new java.awt.Dimension(133, 64));
        scenario1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scenario1ButtonActionPerformed(evt);
            }
        });

        scenario2Button.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        scenario2Button.setForeground(new java.awt.Color(102, 0, 0));
        scenario2Button.setText("群雄割据");
        scenario2Button.setFocusable(false);
        scenario2Button.setMaximumSize(new java.awt.Dimension(133, 64));
        scenario2Button.setMinimumSize(new java.awt.Dimension(133, 64));
        scenario2Button.setPreferredSize(new java.awt.Dimension(133, 64));
        scenario2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scenario2ButtonActionPerformed(evt);
            }
        });

        scenario3Button.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        scenario3Button.setForeground(new java.awt.Color(102, 0, 0));
        scenario3Button.setText("赤壁之战");
        scenario3Button.setFocusable(false);
        scenario3Button.setMaximumSize(new java.awt.Dimension(133, 64));
        scenario3Button.setMinimumSize(new java.awt.Dimension(133, 64));
        scenario3Button.setPreferredSize(new java.awt.Dimension(133, 64));
        scenario3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scenario3ButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(102, 0, 0));
        exitButton.setText("退出");
        exitButton.setFocusable(false);
        exitButton.setMaximumSize(new java.awt.Dimension(133, 64));
        exitButton.setMinimumSize(new java.awt.Dimension(133, 64));
        exitButton.setPreferredSize(new java.awt.Dimension(133, 64));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 0, 0));
        jButton1.setText("战斗演示");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scenario3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scenario2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(scenario1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(titleLabel)
                        .addGap(13, 13, 13)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(80, 80, 80)
                        .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scenario1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scenario2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scenario3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        newGameButton.setVisible(false);
        loadGameButton.setVisible(false);
        scenario1Button.setVisible(true);
        scenario2Button.setVisible(true);
        scenario3Button.setVisible(true);
        exitButton.setText("返回");
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void loadGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadGameButtonActionPerformed
        JOptionPane.showMessageDialog(frame,"暂不支持载入游戏。", "", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_loadGameButtonActionPerformed

    private void scenario1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scenario1ButtonActionPerformed
        controller.loadScenario(scenario1);
        createForcePanel();
        this.setVisible(false);
    }//GEN-LAST:event_scenario1ButtonActionPerformed

    private void scenario2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scenario2ButtonActionPerformed
        controller.loadScenario(scenario2);
        createForcePanel();
        this.setVisible(false);
    }//GEN-LAST:event_scenario2ButtonActionPerformed

    private void scenario3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scenario3ButtonActionPerformed
        JOptionPane.showMessageDialog(frame,"暂不支持此剧本。", "", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_scenario3ButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        switch (exitButton.getText()){
            case "退出": System.exit(0);
                         break;
            case "返回": newGameButton.setVisible(true);
                         loadGameButton.setVisible(true);
                         scenario1Button.setVisible(false);
                         scenario2Button.setVisible(false);
                         scenario3Button.setVisible(false);
                         exitButton.setText("退出");
                         break;
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        examplePanel.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton loadGameButton;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton scenario1Button;
    private javax.swing.JButton scenario2Button;
    private javax.swing.JButton scenario3Button;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
