/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.coffee_mangement.view;

/**
 *
 * @author asus
 */
public class Menu_Managerment extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu_Managerment() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        PanelAll338 = new javax.swing.JPanel();
        PanelNorth338 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbbDishGroup338 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtSearchMenu338 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PanelCenter338 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDish338 = new javax.swing.JTable();
        PanelSouth338 = new javax.swing.JPanel();
        btnAddDish338 = new javax.swing.JButton();
        btnEditDish338 = new javax.swing.JButton();
        btnDeleteDish338 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý thực đơn");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        PanelAll338.setBackground(new java.awt.Color(69, 32, 16));
        PanelAll338.setOpaque(false);

        PanelNorth338.setBackground(new java.awt.Color(69, 32, 16));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/menu_managerment.png"))); // NOI18N
        jLabel3.setText("QUẢN LÝ THỰC ĐƠN");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));
        jLabel3.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/cup_drink.png"))); // NOI18N
        jLabel1.setText("Nhóm món:");

        cbbDishGroup338.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbbDishGroup338.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbbDishGroup338.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbDishGroup338ItemStateChanged(evt);
            }
        });
        cbbDishGroup338.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbDishGroup338ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/search_32.png"))); // NOI18N
        jLabel4.setText("Tìm kiếm: ");
        jLabel4.setToolTipText("");

        txtSearchMenu338.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearchMenu338.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMenu338KeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/cff_220.png"))); // NOI18N

        javax.swing.GroupLayout PanelNorth338Layout = new javax.swing.GroupLayout(PanelNorth338);
        PanelNorth338.setLayout(PanelNorth338Layout);
        PanelNorth338Layout.setHorizontalGroup(
            PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNorth338Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelNorth338Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelNorth338Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(4, 4, 4)
                            .addComponent(cbbDishGroup338, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(181, 181, 181)
                    .addComponent(jLabel4)
                    .addGap(4, 4, 4)
                    .addComponent(txtSearchMenu338, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 106, Short.MAX_VALUE)))
        );
        PanelNorth338Layout.setVerticalGroup(
            PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelNorth338Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelNorth338Layout.createSequentialGroup()
                    .addGap(7, 12, Short.MAX_VALUE)
                    .addGroup(PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelNorth338Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(6, 6, 6)
                            .addGroup(PanelNorth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addGroup(PanelNorth338Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(cbbDishGroup338, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSearchMenu338, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 2, Short.MAX_VALUE)))
        );

        PanelCenter338.setBackground(new java.awt.Color(69, 32, 16));

        tbDish338.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbDish338.setForeground(new java.awt.Color(51, 0, 51));
        tbDish338.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDish338.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDish338MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDish338);

        javax.swing.GroupLayout PanelCenter338Layout = new javax.swing.GroupLayout(PanelCenter338);
        PanelCenter338.setLayout(PanelCenter338Layout);
        PanelCenter338Layout.setHorizontalGroup(
            PanelCenter338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 832, Short.MAX_VALUE)
            .addGroup(PanelCenter338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCenter338Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelCenter338Layout.setVerticalGroup(
            PanelCenter338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
            .addGroup(PanelCenter338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelCenter338Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        PanelSouth338.setBackground(new java.awt.Color(69, 32, 16));

        btnAddDish338.setBackground(new java.awt.Color(255, 255, 255));
        btnAddDish338.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAddDish338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/file_add.png"))); // NOI18N
        btnAddDish338.setText("THÊM");
        btnAddDish338.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAddDish338.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddDish338.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDish338ActionPerformed(evt);
            }
        });

        btnEditDish338.setBackground(new java.awt.Color(255, 255, 255));
        btnEditDish338.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditDish338.setForeground(new java.awt.Color(51, 0, 51));
        btnEditDish338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/document_edit.png"))); // NOI18N
        btnEditDish338.setText("SỬA");
        btnEditDish338.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnEditDish338.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEditDish338.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDish338ActionPerformed(evt);
            }
        });

        btnDeleteDish338.setBackground(new java.awt.Color(255, 255, 255));
        btnDeleteDish338.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDeleteDish338.setForeground(new java.awt.Color(51, 0, 51));
        btnDeleteDish338.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/file_delete.png"))); // NOI18N
        btnDeleteDish338.setText("XÓA");
        btnDeleteDish338.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDeleteDish338.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDeleteDish338.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDish338ActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(74, 211, 149));
        jLabel5.setFont(new java.awt.Font("VNI-Park", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("YMach Cafe");

        jLabel10.setBackground(new java.awt.Color(69, 32, 16));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/logo_130.png"))); // NOI18N
        jLabel10.setOpaque(true);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/java/coffee_mangement/image/cup_110.png"))); // NOI18N

        javax.swing.GroupLayout PanelSouth338Layout = new javax.swing.GroupLayout(PanelSouth338);
        PanelSouth338.setLayout(PanelSouth338Layout);
        PanelSouth338Layout.setHorizontalGroup(
            PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSouth338Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelSouth338Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(btnAddDish338, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(166, 166, 166)
                            .addComponent(btnEditDish338, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136)
                            .addComponent(btnDeleteDish338, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelSouth338Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(329, 329, 329)
                            .addComponent(jLabel5)
                            .addGap(13, 13, 13)
                            .addComponent(jLabel10)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        PanelSouth338Layout.setVerticalGroup(
            PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
            .addGroup(PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelSouth338Layout.createSequentialGroup()
                    .addGap(0, 6, Short.MAX_VALUE)
                    .addGroup(PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAddDish338)
                        .addComponent(btnEditDish338, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDeleteDish338, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(9, 9, 9)
                    .addGroup(PanelSouth338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelSouth338Layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelSouth338Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel5))
                        .addComponent(jLabel10))
                    .addGap(0, 6, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelAll338Layout = new javax.swing.GroupLayout(PanelAll338);
        PanelAll338.setLayout(PanelAll338Layout);
        PanelAll338Layout.setHorizontalGroup(
            PanelAll338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelNorth338, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelCenter338, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelSouth338, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelAll338Layout.setVerticalGroup(
            PanelAll338Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAll338Layout.createSequentialGroup()
                .addComponent(PanelNorth338, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelCenter338, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelSouth338, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(PanelAll338, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbbDishGroup338ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbDishGroup338ItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDishGroup338ItemStateChanged

    private void cbbDishGroup338ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbDishGroup338ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbDishGroup338ActionPerformed

    private void txtSearchMenu338KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMenu338KeyReleased

    }//GEN-LAST:event_txtSearchMenu338KeyReleased

    private void tbDish338MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDish338MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbDish338MouseClicked

    private void btnAddDish338ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDish338ActionPerformed

    }//GEN-LAST:event_btnAddDish338ActionPerformed

    private void btnEditDish338ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDish338ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditDish338ActionPerformed

    private void btnDeleteDish338ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDish338ActionPerformed

    }//GEN-LAST:event_btnDeleteDish338ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Managerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Managerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Managerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Managerment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Managerment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAll338;
    private javax.swing.JPanel PanelCenter338;
    private javax.swing.JPanel PanelNorth338;
    private javax.swing.JPanel PanelSouth338;
    private javax.swing.JButton btnAddDish338;
    private javax.swing.JButton btnDeleteDish338;
    private javax.swing.JButton btnEditDish338;
    private javax.swing.JComboBox<String> cbbDishGroup338;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDish338;
    private javax.swing.JTextField txtSearchMenu338;
    // End of variables declaration//GEN-END:variables
}
