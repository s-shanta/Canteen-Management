/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmanagement;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author nipuxo
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOS­ING);
        Toolkit.getDefaultToolkit().getSystemEve­ntQueue().postEvent(winClosingEvent);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(650, 350));
        setResizable(false);

        panel1.setMinimumSize(new java.awt.Dimension(600, 600));
        panel1.setName(""); // NOI18N
        panel1.setPreferredSize(new java.awt.Dimension(50, 50));
        panel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\015_kiwiburger-565x329_5.jpg")); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 100, 60);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel3.setText("KACCHI");
        panel1.add(jLabel3);
        jLabel3.setBounds(150, 320, 80, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\Coffee.jpg")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        panel1.add(jLabel4);
        jLabel4.setBounds(370, 50, 90, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\chickn).jpg")); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panel1.add(jLabel5);
        jLabel5.setBounds(250, 50, 90, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\1211253719265.jpg")); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        panel1.add(jLabel6);
        jLabel6.setBounds(140, 50, 90, 60);

        jLabel7.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\tea-005.jpg")); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        panel1.add(jLabel7);
        jLabel7.setBounds(500, 50, 90, 60);

        jLabel8.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\dessert_cake_pastry_sweet_80885_2560x1600.jpg")); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        panel1.add(jLabel8);
        jLabel8.setBounds(20, 460, 90, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\cutlet11.jpg")); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        panel1.add(jLabel9);
        jLabel9.setBounds(20, 150, 100, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\pizza.jpg")); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        panel1.add(jLabel10);
        jLabel10.setBounds(370, 150, 90, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\french).jpg")); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        panel1.add(jLabel11);
        jLabel11.setBounds(140, 150, 100, 60);

        jLabel12.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\kacchi.jpg")); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        panel1.add(jLabel12);
        jLabel12.setBounds(140, 260, 90, 60);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("MENU");
        panel1.add(jLabel1);
        jLabel1.setBounds(210, 10, 130, 30);

        jLabel13.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\download (1).jpg")); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        panel1.add(jLabel13);
        jLabel13.setBounds(500, 150, 90, 60);

        jLabel14.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\noodles.jpg")); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        panel1.add(jLabel14);
        jLabel14.setBounds(260, 150, 90, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\daal-soup.jpg")); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        panel1.add(jLabel15);
        jLabel15.setBounds(20, 350, 90, 70);

        jLabel16.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel16.setText("BURGER");
        panel1.add(jLabel16);
        jLabel16.setBounds(30, 110, 80, 20);

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel17.setText("CHICKEN");
        panel1.add(jLabel17);
        jLabel17.setBounds(250, 110, 90, 20);

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("TEA");
        panel1.add(jLabel18);
        jLabel18.setBounds(520, 110, 50, 20);

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel19.setText("FRENCH FRY");
        panel1.add(jLabel19);
        jLabel19.setBounds(130, 210, 120, 20);

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setText("COFFEE");
        panel1.add(jLabel20);
        jLabel20.setBounds(380, 110, 80, 20);

        jLabel21.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\donuts).jpg")); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        panel1.add(jLabel21);
        jLabel21.setBounds(140, 460, 90, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\rcfriedrice.jpg")); // NOI18N
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        panel1.add(jLabel22);
        jLabel22.setBounds(370, 260, 100, 60);

        jLabel23.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\chicken biriani.jpg")); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        panel1.add(jLabel23);
        jLabel23.setBounds(20, 260, 90, 60);

        jLabel24.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\khichuri).jpg")); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        panel1.add(jLabel24);
        jLabel24.setBounds(260, 260, 90, 60);

        jLabel25.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\vat chickn.jpg")); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        panel1.add(jLabel25);
        jLabel25.setBounds(500, 260, 90, 60);

        jLabel26.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel26.setText("CUTLET");
        panel1.add(jLabel26);
        jLabel26.setBounds(30, 210, 80, 20);

        jLabel27.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel27.setText("BIRIYANI");
        panel1.add(jLabel27);
        jLabel27.setBounds(20, 320, 100, 20);

        jLabel28.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\pudding.jpg")); // NOI18N
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        panel1.add(jLabel28);
        jLabel28.setBounds(380, 350, 90, 70);

        jLabel30.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\Porota_Dibosh.jpg")); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        panel1.add(jLabel30);
        jLabel30.setBounds(140, 350, 90, 70);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel1.add(jButton1);
        jButton1.setBounds(250, 570, 100, 30);

        jLabel31.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\vietnamese-dinner11.jpg")); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        panel1.add(jLabel31);
        jLabel31.setBounds(500, 350, 90, 70);

        jLabel29.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\sharma.jpg")); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        panel1.add(jLabel29);
        jLabel29.setBounds(380, 460, 90, 80);

        jLabel32.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\sandwich-production.jpg")); // NOI18N
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        panel1.add(jLabel32);
        jLabel32.setBounds(260, 350, 90, 70);

        jLabel33.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\mountain-dew-diet-regular-pepsi-dr-pepper-23847520.jpg")); // NOI18N
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        panel1.add(jLabel33);
        jLabel33.setBounds(500, 460, 100, 70);

        jLabel34.setIcon(new javax.swing.ImageIcon("F:\\2.1 projectfood\\FoodManagement\\FOOD RESIZE\\icecream).jpg")); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        panel1.add(jLabel34);
        jLabel34.setBounds(260, 460, 100, 80);

        jLabel35.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel35.setText("NOODLES");
        panel1.add(jLabel35);
        jLabel35.setBounds(260, 210, 90, 20);

        jLabel36.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel36.setText("PIZZA");
        panel1.add(jLabel36);
        jLabel36.setBounds(380, 210, 80, 20);

        jLabel37.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel37.setText("SAMOOSA");
        panel1.add(jLabel37);
        jLabel37.setBounds(500, 210, 90, 20);

        jLabel38.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel38.setText("KHICHURI");
        panel1.add(jLabel38);
        jLabel38.setBounds(260, 320, 100, 20);

        jLabel39.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel39.setText("FRIED RICE");
        panel1.add(jLabel39);
        jLabel39.setBounds(370, 320, 110, 20);

        jLabel40.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel40.setText("DONUT");
        panel1.add(jLabel40);
        jLabel40.setBounds(150, 540, 80, 20);

        jLabel41.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel41.setText("DAAL");
        panel1.add(jLabel41);
        jLabel41.setBounds(30, 420, 80, 20);

        jLabel42.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel42.setText("PAROTA");
        panel1.add(jLabel42);
        jLabel42.setBounds(140, 420, 90, 20);

        jLabel43.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel43.setText("SANDWICH");
        panel1.add(jLabel43);
        jLabel43.setBounds(250, 420, 100, 20);

        jLabel44.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel44.setText("PUDDING");
        panel1.add(jLabel44);
        jLabel44.setBounds(380, 420, 80, 20);

        jLabel45.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel45.setText("ROLL");
        panel1.add(jLabel45);
        jLabel45.setBounds(530, 420, 60, 20);

        jLabel46.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel46.setText("RICE");
        panel1.add(jLabel46);
        jLabel46.setBounds(520, 320, 50, 20);

        jLabel47.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel47.setText("PETIS");
        panel1.add(jLabel47);
        jLabel47.setBounds(150, 110, 80, 20);

        jLabel48.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel48.setText("ICECREAM");
        panel1.add(jLabel48);
        jLabel48.setBounds(250, 540, 100, 20);

        jLabel49.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel49.setText("SHAWARMA");
        panel1.add(jLabel49);
        jLabel49.setBounds(370, 540, 110, 20);

        jLabel50.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel50.setText("DRINKS");
        panel1.add(jLabel50);
        jLabel50.setBounds(520, 530, 80, 20);

        jLabel51.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel51.setText("CAKE");
        panel1.add(jLabel51);
        jLabel51.setBounds(30, 540, 80, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         this.dispose();
        Starter ob1=new Starter();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
         this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel34MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
           this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
          this.dispose();
        Stock ob1=new Stock();
        ob1.setVisible(true);
        ob1.repaint();
    }//GEN-LAST:event_jLabel33MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Panel panel1;
    // End of variables declaration//GEN-END:variables
}