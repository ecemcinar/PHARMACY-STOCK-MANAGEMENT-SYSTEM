/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UserStarting extends javax.swing.JFrame {

    DefaultTableModel derma_table;
    DefaultTableModel baby_table;
    DefaultTableModel med_table;
    
    DefaultTableModel chart_table;
    public UserStarting() {
        initComponents();
         derma_table= (DefaultTableModel) derma.getModel();
         baby_table=(DefaultTableModel) baby.getModel();
         med_table=(DefaultTableModel) panelMed.getModel();
         
         chart_table =(DefaultTableModel) chart.getModel();
        panelMomBaby.setVisible(false);
        panelCart.setVisible(false);
        panelDerma.setVisible(true);
        panel_Med.setVisible(false);
        fill_derma();
        
        
        
        //add
        /*
        
        String[] temp =new String[chart_table.getColumnCount()];
        System.out.println(temp.length);
        for(int i = 0; i < chart_table.getColumnCount(); i++) {
           temp[i]= main_table.getValueAt(parent_Main.getSelectedRow(), i).toString();
        }
         
        */
        
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        opt = new javax.swing.JPanel();
        buttonEditAcc = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        buttonCart = new javax.swing.JButton();
        buttonMomBaby = new javax.swing.JButton();
        buttonMed = new javax.swing.JButton();
        buttonDerma = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        main = new javax.swing.JPanel();
        panelDerma = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        derma = new javax.swing.JTable();
        add_derma = new javax.swing.JButton();
        panelMomBaby = new javax.swing.JPanel();
        add_baby = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        baby = new javax.swing.JTable();
        panel_Med = new javax.swing.JPanel();
        add_med = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        panelMed = new javax.swing.JTable();
        panelCart = new javax.swing.JPanel();
        deleteChart = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        chart = new javax.swing.JTable();
        buttonPurch = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opt.setBackground(new java.awt.Color(255, 204, 204));

        buttonEditAcc.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        buttonEditAcc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/edit-2-line.png"))); // NOI18N
        buttonEditAcc.setText("EDIT ACCOUNT");
        buttonEditAcc.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        buttonEditAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditAccActionPerformed(evt);
            }
        });

        buttonLogout.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        buttonLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/logout-box-r-line.png"))); // NOI18N
        buttonLogout.setText("LOGOUT");
        buttonLogout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        buttonLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLogoutMouseClicked(evt);
            }
        });

        buttonCart.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        buttonCart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/shopping-cart-2-line.png"))); // NOI18N
        buttonCart.setText("MY CART");
        buttonCart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        buttonCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCartActionPerformed(evt);
            }
        });

        buttonMomBaby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/motherbabycarepng.png"))); // NOI18N
        buttonMomBaby.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white));
        buttonMomBaby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMomBabyMouseClicked(evt);
            }
        });

        buttonMed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/medicine1.png"))); // NOI18N
        buttonMed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white));
        buttonMed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMedMouseClicked(evt);
            }
        });

        buttonDerma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/skincare.png"))); // NOI18N
        buttonDerma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonDermaMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel1.setText("Dermacosmetics");

        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel3.setText("Medicament");

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jLabel4.setText("Mother&Baby Care");

        javax.swing.GroupLayout optLayout = new javax.swing.GroupLayout(opt);
        opt.setLayout(optLayout);
        optLayout.setHorizontalGroup(
            optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonMomBaby, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonMed, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDerma, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(optLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonEditAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        optLayout.setVerticalGroup(
            optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optLayout.createSequentialGroup()
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDerma)
                    .addGroup(optLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)))
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonMed, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel3)))
                .addGroup(optLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonMomBaby, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(optLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(208, 208, 208)))
                .addComponent(buttonCart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonEditAcc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main.setBackground(new java.awt.Color(255, 204, 153));
        main.setLayout(new javax.swing.OverlayLayout(main));

        panelDerma.setBackground(new java.awt.Color(79, 145, 145));
        panelDerma.setForeground(new java.awt.Color(102, 102, 255));
        panelDerma.setMaximumSize(new java.awt.Dimension(1719, 825));
        panelDerma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelDermaMouseClicked(evt);
            }
        });

        derma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Price", "Stock", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(derma);
        if (derma.getColumnModel().getColumnCount() > 0) {
            derma.getColumnModel().getColumn(0).setPreferredWidth(10);
            derma.getColumnModel().getColumn(1).setPreferredWidth(400);
            derma.getColumnModel().getColumn(2).setPreferredWidth(10);
            derma.getColumnModel().getColumn(3).setPreferredWidth(10);
            derma.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        add_derma.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add_derma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/shopping-bag-3-line.png"))); // NOI18N
        add_derma.setText("ADD TO CART");
        add_derma.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.darkGray, java.awt.Color.white));
        add_derma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_dermaMouseClicked(evt);
            }
        });
        add_derma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_dermaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDermaLayout = new javax.swing.GroupLayout(panelDerma);
        panelDerma.setLayout(panelDermaLayout);
        panelDermaLayout.setHorizontalGroup(
            panelDermaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDermaLayout.createSequentialGroup()
                .addGap(972, 972, 972)
                .addComponent(add_derma, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 76, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDermaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        panelDermaLayout.setVerticalGroup(
            panelDermaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDermaLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(add_derma)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(panelDerma);

        panelMomBaby.setBackground(new java.awt.Color(164, 164, 221));
        panelMomBaby.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMomBabyMouseClicked(evt);
            }
        });

        add_baby.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add_baby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/shopping-bag-3-line.png"))); // NOI18N
        add_baby.setText("ADD TO CHART");
        add_baby.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white));
        add_baby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_babyActionPerformed(evt);
            }
        });

        baby.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "price", "Stock", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(baby);
        if (baby.getColumnModel().getColumnCount() > 0) {
            baby.getColumnModel().getColumn(0).setPreferredWidth(10);
            baby.getColumnModel().getColumn(1).setPreferredWidth(400);
            baby.getColumnModel().getColumn(2).setPreferredWidth(10);
            baby.getColumnModel().getColumn(3).setPreferredWidth(10);
            baby.getColumnModel().getColumn(4).setPreferredWidth(20);
        }

        javax.swing.GroupLayout panelMomBabyLayout = new javax.swing.GroupLayout(panelMomBaby);
        panelMomBaby.setLayout(panelMomBabyLayout);
        panelMomBabyLayout.setHorizontalGroup(
            panelMomBabyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMomBabyLayout.createSequentialGroup()
                .addGroup(panelMomBabyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_baby, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        panelMomBabyLayout.setVerticalGroup(
            panelMomBabyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMomBabyLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(add_baby)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );

        main.add(panelMomBaby);

        panel_Med.setBackground(new java.awt.Color(120, 157, 182));
        panel_Med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_MedMouseClicked(evt);
            }
        });

        add_med.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        add_med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homework/shopping-bag-3-line.png"))); // NOI18N
        add_med.setText("ADD TO CART");
        add_med.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_medMouseClicked(evt);
            }
        });
        add_med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_medActionPerformed(evt);
            }
        });

        panelMed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Active Chemical", "Pres. Type", "Price", "Color", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(panelMed);
        if (panelMed.getColumnModel().getColumnCount() > 0) {
            panelMed.getColumnModel().getColumn(0).setPreferredWidth(10);
            panelMed.getColumnModel().getColumn(1).setPreferredWidth(400);
            panelMed.getColumnModel().getColumn(4).setPreferredWidth(10);
            panelMed.getColumnModel().getColumn(6).setPreferredWidth(10);
        }

        javax.swing.GroupLayout panel_MedLayout = new javax.swing.GroupLayout(panel_Med);
        panel_Med.setLayout(panel_MedLayout);
        panel_MedLayout.setHorizontalGroup(
            panel_MedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MedLayout.createSequentialGroup()
                .addGroup(panel_MedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_med))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        panel_MedLayout.setVerticalGroup(
            panel_MedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_MedLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(add_med)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE))
        );

        main.add(panel_Med);

        panelCart.setBackground(new java.awt.Color(168, 120, 120));
        panelCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelCartMouseClicked(evt);
            }
        });

        deleteChart.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        deleteChart.setText("Delete Chart");
        deleteChart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white));
        deleteChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteChartActionPerformed(evt);
            }
        });

        chart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Barcode", "Name", "Active Chemical", "Pres. Type", "Price", "Color", "Quantity", "Category", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(chart);
        if (chart.getColumnModel().getColumnCount() > 0) {
            chart.getColumnModel().getColumn(0).setPreferredWidth(10);
            chart.getColumnModel().getColumn(1).setPreferredWidth(400);
            chart.getColumnModel().getColumn(4).setPreferredWidth(10);
            chart.getColumnModel().getColumn(6).setPreferredWidth(10);
            chart.getColumnModel().getColumn(7).setPreferredWidth(20);
        }

        buttonPurch.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        buttonPurch.setText("Purchase");
        buttonPurch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.gray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.white));
        buttonPurch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPurchMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelCartLayout = new javax.swing.GroupLayout(panelCart);
        panelCart.setLayout(panelCartLayout);
        panelCartLayout.setHorizontalGroup(
            panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartLayout.createSequentialGroup()
                .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(buttonPurch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 94, Short.MAX_VALUE))
        );
        panelCartLayout.setVerticalGroup(
            panelCartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCartLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(buttonPurch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteChart)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE))
        );

        main.add(panelCart);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(opt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditAccActionPerformed
        
        EditAccount ea = new EditAccount();
        ea.setVisible(true);
        panelCart.setVisible(false);
        panelDerma.setVisible(false);
        panelMomBaby.setVisible(false);
        panel_Med.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_buttonEditAccActionPerformed

    private void buttonCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCartActionPerformed
        panelCart.setVisible(true);
        panelDerma.setVisible(false);
        
        panelMomBaby.setVisible(false);
        panel_Med.setVisible(false);
    }//GEN-LAST:event_buttonCartActionPerformed

    private void buttonLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLogoutMouseClicked
          this.dispose();
    }//GEN-LAST:event_buttonLogoutMouseClicked

    private void buttonDermaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDermaMouseClicked
        panelDerma.setVisible(true);
        panelCart.setVisible(false);
        panelMomBaby.setVisible(false);
        
        
        panel_Med.setVisible(false);
        while (derma_table.getRowCount()>0) {
             for (int i = 0; i < derma_table.getRowCount(); i++) {
                 derma_table.removeRow(i);     
             }
        }
        fill_derma();
    }//GEN-LAST:event_buttonDermaMouseClicked

    private void buttonMomBabyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMomBabyMouseClicked
        panelMomBaby.setVisible(true);
        panelCart.setVisible(false);
      
        panelDerma.setVisible(false);
        
        
        panel_Med.setVisible(false);
        while (baby_table.getRowCount()>0) {
             for (int i = 0; i < baby_table.getRowCount(); i++) {
                 baby_table.removeRow(i);     
             }
        }
        fill_baby();
        
    }//GEN-LAST:event_buttonMomBabyMouseClicked

    private void buttonMedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMedMouseClicked
        
        while (med_table.getRowCount()>0) {
             for (int i = 0; i < med_table.getRowCount(); i++) {
                 med_table.removeRow(i);     
             }
        }
        fill_med();
        panel_Med.setVisible(true);
        
        panelMomBaby.setVisible(false);
        panelCart.setVisible(false);
        
        panelDerma.setVisible(false);
    }//GEN-LAST:event_buttonMedMouseClicked
    public void fill_derma() // write dermacosmetic to table
    {
        ArrayList<Dermacosmetic> dermaa =FileOperations.readDermacosmeticList();
        for (Dermacosmetic product : dermaa) {
                 derma_table.insertRow(derma.getRowCount(), new Object[]{
                 product.getBarcode(),product.getProductName(),product.getPrice(),product.getStockQ(),product.getCategory()
            }); 
        }
    }
    public void fill_med() // write medicament products to table
    {
        ArrayList<Medicament> med =FileOperations.readMedicamentList();
        for (Medicament product : med) {
                 med_table.insertRow(panelMed.getRowCount(), new Object[]{
                 product.getBarcode(),product.getProductName(),product.getActiveChemical(),product.getPrescriptionType(),product.getPrice(),product.getColor(),product.getStockQ()
            }); 
        }
    }
            
    public void fill_baby() // write mother baby care producst to table
    {
        ArrayList<BabyMotherCare> dermaa =FileOperations.readMotherBabyCareList();
        for (BabyMotherCare product : dermaa) {
                 baby_table.insertRow(baby.getRowCount(), new Object[]{
                 product.getBarcode(),product.getProductName(),product.getPrice(),product.getStockQ(),product.getCategory()
            }); 
        }
    }
    
    private void buttonDermaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDermaMouseEntered
        
    }//GEN-LAST:event_buttonDermaMouseEntered

    private void add_babyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_babyActionPerformed
        if(baby.getSelectedRowCount()>1)
        {
            // prevent selecting too many products on table
            JOptionPane.showMessageDialog(UserStarting.this, "You selected too many items.");
            baby.clearSelection();
            return;
        }
        if(baby.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(UserStarting.this, "Please Select Any Row From Table");
            return;
        }
        
             for (int i = 0; i < chart_table.getRowCount(); i++) {
                 if(baby_table.getValueAt(baby.getSelectedRow(), 0).toString().equalsIgnoreCase(chart_table.getValueAt(i, 0).toString()))
                 {
                     JOptionPane.showMessageDialog(UserStarting.this, "This Prodcut Has Been Already Added");
                     baby.clearSelection();
                     return;
                 
                     
             }
        }
        
        
            String[] temp =new String[chart_table.getColumnCount()];
            if(!baby_table.getValueAt(baby.getSelectedRow(), 3).toString().equals("0")){ 
            for(int i = 0; i < baby_table.getColumnCount(); i++) {
                temp[i]= baby_table.getValueAt(baby.getSelectedRow(), i).toString();
        }
            chart_table.insertRow(chart_table.getRowCount(), new Object[]{
                //barcode,name,active,pres,price,color,quan,categ,type
                 temp[0],temp[1]," "," ",temp[2]," ",1,temp[4],"Mother And Baby Care"
            }); 
            baby.clearSelection();
            }
            else
            {// when stock==0, it cannot be selected
                JOptionPane.showMessageDialog(UserStarting.this, "No stock");
            }
            
    }//GEN-LAST:event_add_babyActionPerformed

    private void add_dermaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_dermaMouseClicked
        if(derma.getSelectedRowCount()>1)
        {
            
            JOptionPane.showMessageDialog(UserStarting.this, "You selected too many items.");
            derma.clearSelection();
            return;
        }
        if(derma.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(UserStarting.this, "Please Select Any Row From Table");
            return;
        }
        
             for (int i = 0; i < chart_table.getRowCount(); i++) {
                 
                 if(derma_table.getValueAt(derma.getSelectedRow(), 0).toString().equalsIgnoreCase(chart_table.getValueAt(i, 0).toString()))
                 {
                     JOptionPane.showMessageDialog(UserStarting.this, "This Prodcut Has Been Already Added");
                     derma.clearSelection();
                     return;
                 
                     
             }
        }
        
            String[] temp =new String[chart_table.getColumnCount()];
            if(!derma_table.getValueAt(derma.getSelectedRow(), 3).toString().equals("0"))
            {
            for(int i = 0; i < derma_table.getColumnCount(); i++) {
                temp[i]= derma_table.getValueAt(derma.getSelectedRow(), i).toString();
        }
            
            chart_table.insertRow(chart_table.getRowCount(), new Object[]{
                //barcode,name,price,stock,category
                //barcode,name,active,pres,price,color,quan,categ,type
                
                 temp[0],temp[1]," "," ",temp[2]," ",1,temp[4],"Dermacosmetic"
            }); 
            derma.clearSelection();
            }
            else
            {
                JOptionPane.showMessageDialog(UserStarting.this, "No stock");
            }
        
    }//GEN-LAST:event_add_dermaMouseClicked

    private void add_medMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_medMouseClicked
        
        if(panelMed.getSelectedRowCount()>1)
        {
            
            JOptionPane.showMessageDialog(UserStarting.this, "You selected too many items.");
            panelMed.clearSelection();
            return;
        }
        if(panelMed.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(UserStarting.this, "Please Select Any Row From Table");
            return;
        }
        
             for (int i = 0; i < chart_table.getRowCount(); i++) {
                 if(med_table.getValueAt(panelMed.getSelectedRow(), 0).toString().equalsIgnoreCase(chart_table.getValueAt(i, 0).toString()))
                 {
                     JOptionPane.showMessageDialog(UserStarting.this, "This Prodcut Has Been Already Added");
                     return;
                 }
                     
             }
            
            String[] temp =new String[chart_table.getColumnCount()];
            if(!med_table.getValueAt(panelMed.getSelectedRow(), 6).toString().equals("0")){
            for(int i = 0; i < panelMed.getColumnCount(); i++) {
                temp[i]= med_table.getValueAt(panelMed.getSelectedRow(), i).toString();
        }
            chart_table.insertRow(chart_table.getRowCount(), new Object[]{
                //barcode,name,active,pres,price,color,quan,categ,type
                 temp[0],temp[1],temp[2],temp[3],temp[4],temp[5],1," ","Medicament"
            }); 
            panelMed.clearSelection();
            }
            else
            {   // when stock==0, it cannot be selected
                JOptionPane.showMessageDialog(UserStarting.this, "No stock");
            }
        
    }//GEN-LAST:event_add_medMouseClicked

    private void deleteChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteChartActionPerformed
        if(chart.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(UserStarting.this, "Please Select Any Row From Table");
            return;
        }
        chart_table.removeRow(chart.getSelectedRow());
    }//GEN-LAST:event_deleteChartActionPerformed

    private void panelCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCartMouseClicked
        chart.clearSelection();
    }//GEN-LAST:event_panelCartMouseClicked

    private void panel_MedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_MedMouseClicked
        panelMed.clearSelection();
    }//GEN-LAST:event_panel_MedMouseClicked

    private void panelMomBabyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMomBabyMouseClicked
        baby.clearSelection();
    }//GEN-LAST:event_panelMomBabyMouseClicked

    private void panelDermaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelDermaMouseClicked
        derma.clearSelection();
    }//GEN-LAST:event_panelDermaMouseClicked

    private void add_dermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_dermaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_dermaActionPerformed

    private void add_medActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_medActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_medActionPerformed
    static ArrayList<String> typeList = new ArrayList<>();
    static Queue<Product> purchaseList = new LinkedList<>();
    private void buttonPurchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPurchMouseClicked
        int i=0;
        while(i<chart_table.getRowCount()){
            if(chart_table.getValueAt(i, 8).toString().equalsIgnoreCase("Dermacosmetic")){
                //barcode0,name1,active2,pres3,price4,color5,quan6,categ7,type8
                //barcode,productName, price,stockQ,category
                Dermacosmetic dc = new Dermacosmetic(chart_table.getValueAt(i,0).toString(),chart_table.getValueAt(i,1).toString(),Double.parseDouble(chart_table.getValueAt(i,4).toString()),1,chart_table.getValueAt(i,7).toString());
                purchaseList.add((Product)dc);
                typeList.add("Dermacosmetic");
            }
            else if(chart_table.getValueAt(i, 8).toString().equalsIgnoreCase("Medicament")){
                //barcode0,name1,active2,pres3,price4,color5,quan6,categ7,type8
                //barcode0,productName1,activeChemical2,prescriptionType3,price4,color5,stockQ6
                Medicament med = new Medicament(chart_table.getValueAt(i,0).toString(),chart_table.getValueAt(i,1).toString(),chart_table.getValueAt(i,2).toString(),chart_table.getValueAt(i,3).toString(),Double.parseDouble(chart_table.getValueAt(i,4).toString()),chart_table.getValueAt(i,5).toString(),Integer.parseInt(chart_table.getValueAt(i,6).toString()));
                purchaseList.add((Product)med);
                typeList.add("Medicament");
            }
            if(chart_table.getValueAt(i, 8).toString().equalsIgnoreCase("Mother And Baby Care")){
                //barcode0,name1,active2,pres3,price4,color5,quan6,categ7,type8
                //barcode,productName, price,stockQ,category
                BabyMotherCare bmc = new BabyMotherCare(chart_table.getValueAt(i,0).toString(),chart_table.getValueAt(i,1).toString(),Double.parseDouble(chart_table.getValueAt(i,4).toString()),1,chart_table.getValueAt(i,7).toString());
                purchaseList.add((Product)bmc);
                typeList.add("Mother And Baby Care");
            }
            i++;
        }
        this.dispose();
        Purchase pch = new Purchase();
        pch.setVisible(true);
        
    }//GEN-LAST:event_buttonPurchMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserStarting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_baby;
    private javax.swing.JButton add_derma;
    private javax.swing.JButton add_med;
    private javax.swing.JTable baby;
    private javax.swing.JButton buttonCart;
    private javax.swing.JButton buttonDerma;
    private javax.swing.JButton buttonEditAcc;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonMed;
    private javax.swing.JButton buttonMomBaby;
    private javax.swing.JButton buttonPurch;
    private javax.swing.JTable chart;
    private javax.swing.JButton deleteChart;
    private javax.swing.JTable derma;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel main;
    private javax.swing.JPanel opt;
    private javax.swing.JPanel panelCart;
    private javax.swing.JPanel panelDerma;
    private javax.swing.JTable panelMed;
    private javax.swing.JPanel panelMomBaby;
    private javax.swing.JPanel panel_Med;
    // End of variables declaration//GEN-END:variables
}
