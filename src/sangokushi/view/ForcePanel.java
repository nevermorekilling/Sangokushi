package sangokushi.view;

import sangokushi.controller.GameController;
import javax.swing.JOptionPane;
import sangokushi.data.Database;
import sangokushi.model.Force;
import sangokushi.model.Player;
import sangokushi.Sangokushi;
/**
 * View Component for force selection stage.
 * @since 26/12/2014
 * @author RuN
 */
public class ForcePanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    private final Player player;
    private final Database db;
    private Force playerForce;
    /**
     * Creates new form MainPanel
     */
    public ForcePanel() {
        initComponents();

        player = Player.getInstance();
        db = Database.getInstance();
        playerForce = null;
    }
    
    public void updateForcePanel(){
        GameController controller = GameController.getInstance();
        String[] listData = new String[controller.getNumForces() - 1];     // removes neutralForce for selection
        for (int i = 0; i < controller.getNumForces() - 1; i++){
            listData[i] = controller.getForceName(i);
        }
        forceList.setListData(listData);
    }
    
    private void changeDescription() {
        forceName.setText(player.getPlayerName());
        cityName.setText(player.getForcePanelCityName());
        goldValue.setText(player.getGold() + "");
        grainValue.setText(player.getFood() + "");
        soldierValue.setText(player.getSoldiers() + "");
        populationValue.setText(player.getPopulation() + " 万");
    }
    
    private void selectForce(int choice) {
        playerForce = db.getForceList().get(choice);
        player.setPlayerForce(playerForce);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forceName = new javax.swing.JLabel();
        forceLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        forceList = new javax.swing.JList();
        goldValue = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        map = new javax.swing.JLabel();
        soldierLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        cityName = new javax.swing.JLabel();
        grainValue = new javax.swing.JLabel();
        populationLabel = new javax.swing.JLabel();
        grainLabel = new javax.swing.JLabel();
        populationValue = new javax.swing.JLabel();
        goldLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        soldierValue = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        forceName.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        forceName.setText("无");

        forceLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        forceLabel.setText("势力:");

        forceList.setFont(new java.awt.Font("Microsoft YaHei", 0, 16)); // NOI18N
        forceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        forceList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forceList.setVisibleRowCount(7);
        forceList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forceListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(forceList);

        goldValue.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        goldValue.setText("0");

        nextButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        nextButton.setForeground(new java.awt.Color(102, 0, 0));
        nextButton.setText("继续");
        nextButton.setFocusable(false);
        nextButton.setMaximumSize(new java.awt.Dimension(133, 64));
        nextButton.setMinimumSize(new java.awt.Dimension(133, 64));
        nextButton.setPreferredSize(new java.awt.Dimension(133, 64));
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/forceSelectionBackground.png"))); // NOI18N
        map.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        map.setOpaque(true);
        map.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mapMouseClicked(evt);
            }
        });

        soldierLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        soldierLabel.setText("兵力：");

        titleLabel.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(102, 0, 0));
        titleLabel.setText("选择势力");

        cityName.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        cityName.setText("无");

        grainValue.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        grainValue.setText("0");

        populationLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        populationLabel.setText("人口：");

        grainLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        grainLabel.setText("粮草：");

        populationValue.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        populationValue.setText("0          ");

        goldLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        goldLabel.setText("金钱：");

        cityLabel.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        cityLabel.setText("城市:");

        soldierValue.setFont(new java.awt.Font("Microsoft YaHei", 0, 13)); // NOI18N
        soldierValue.setText("0");

        backButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(102, 0, 0));
        backButton.setText("返回");
        backButton.setFocusable(false);
        backButton.setMaximumSize(new java.awt.Dimension(133, 64));
        backButton.setMinimumSize(new java.awt.Dimension(133, 64));
        backButton.setPreferredSize(new java.awt.Dimension(133, 64));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(map))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(forceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(forceName, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addComponent(cityLabel)
                                .addGap(6, 6, 6)
                                .addComponent(cityName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(goldLabel)
                                            .addComponent(grainLabel)
                                            .addComponent(soldierLabel)
                                            .addComponent(populationLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(goldValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(grainValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(soldierValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(populationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(map)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(forceLabel)
                            .addComponent(forceName)
                            .addComponent(cityLabel)
                            .addComponent(cityName))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goldLabel)
                                .addGap(18, 18, 18)
                                .addComponent(grainLabel)
                                .addGap(18, 18, 18)
                                .addComponent(soldierLabel)
                                .addGap(18, 18, 18)
                                .addComponent(populationLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(goldValue)
                                .addGap(18, 18, 18)
                                .addComponent(grainValue)
                                .addGap(18, 18, 18)
                                .addComponent(soldierValue)
                                .addGap(18, 18, 18)
                                .addComponent(populationValue)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nextButtonActionPerformed
    {//GEN-HEADEREND:event_nextButtonActionPerformed
        if (playerForce == null) {
            JOptionPane.showMessageDialog(MainFrame.getInstance(), "请先选择一个势力。", "三国志", JOptionPane.PLAIN_MESSAGE);
        } else {
            MainFrame.optionPanel.setVisible(true);
            MainFrame.optionPanel.updateOptionPanel();
            this.setVisible(false);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void mapMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_mapMouseClicked
    {//GEN-HEADEREND:event_mapMouseClicked
        player.setPlayerForce(null);
        changeDescription();
    }//GEN-LAST:event_mapMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MainFrame.startPanel.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void forceListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forceListMouseClicked
        selectForce(forceList.getSelectedIndex());
        changeDescription();
    }//GEN-LAST:event_forceListMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel cityName;
    private javax.swing.JLabel forceLabel;
    private javax.swing.JList forceList;
    private javax.swing.JLabel forceName;
    private javax.swing.JLabel goldLabel;
    private javax.swing.JLabel goldValue;
    private javax.swing.JLabel grainLabel;
    private javax.swing.JLabel grainValue;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel map;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel populationLabel;
    private javax.swing.JLabel populationValue;
    private javax.swing.JLabel soldierLabel;
    private javax.swing.JLabel soldierValue;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
