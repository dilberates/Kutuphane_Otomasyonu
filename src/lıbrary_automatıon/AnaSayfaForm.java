
package lıbrary_automatıon;

public class AnaSayfaForm extends javax.swing.JFrame {

    public AnaSayfaForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        uyeListeleme = new javax.swing.JButton();
        uyeEkle = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kitapEkle = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        kitapGoruntuleme = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        oduncVer = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        oduncTakip = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        kullaniciEkle = new javax.swing.JButton();
        kullaniciIslemleri = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(600, 200, 0, 0));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        uyeListeleme.setBackground(new java.awt.Color(255, 255, 255));
        uyeListeleme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uyeListeleme.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\uyeIslemleri.png")); // NOI18N
        uyeListeleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeListelemeActionPerformed(evt);
            }
        });

        uyeEkle.setBackground(new java.awt.Color(255, 255, 255));
        uyeEkle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        uyeEkle.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\uyeEkle.png")); // NOI18N
        uyeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeEkleActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("ÜYE EKLE");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("ÜYE İŞLEMLERİ");

        kitapEkle.setBackground(new java.awt.Color(255, 255, 255));
        kitapEkle.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\kitapEkle.png")); // NOI18N
        kitapEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapEkleActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("KİTAP EKLE");

        kitapGoruntuleme.setBackground(new java.awt.Color(255, 255, 255));
        kitapGoruntuleme.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\kitaplarıGoruntule.png")); // NOI18N
        kitapGoruntuleme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapGoruntulemeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("KITAPLARI GÖRÜNTÜLE");

        oduncVer.setBackground(new java.awt.Color(255, 255, 255));
        oduncVer.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\oduncVer.png")); // NOI18N
        oduncVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oduncVerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("KULLANICI İŞLEMLERİ");

        oduncTakip.setBackground(new java.awt.Color(255, 255, 255));
        oduncTakip.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\oduncTakip.png")); // NOI18N
        oduncTakip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oduncTakipActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("ÖDÜNÇ TAKİP");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setText("ANA SAYFA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(71, 71, 71))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kullaniciEkle.setBackground(new java.awt.Color(255, 255, 255));
        kullaniciEkle.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\kullaniciEkle.png")); // NOI18N
        kullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciEkleActionPerformed(evt);
            }
        });

        kullaniciIslemleri.setBackground(new java.awt.Color(255, 255, 255));
        kullaniciIslemleri.setIcon(new javax.swing.ImageIcon("C:\\Users\\user\\Desktop\\LIBRARY_AUTOMATION\\icons\\kullaniciIslemleri.png")); // NOI18N
        kullaniciIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kullaniciIslemleriActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("ÖDÜNÇ VER");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("KULLANICI EKLE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uyeListeleme)
                                    .addComponent(uyeEkle)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel2)))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(kitapEkle)
                                            .addComponent(kitapGoruntuleme))
                                        .addGap(84, 84, 84)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(oduncVer)
                                                .addGap(68, 68, 68)
                                                .addComponent(kullaniciEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(oduncTakip, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(77, 77, 77)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(kullaniciIslemleri, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(134, 134, 134)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uyeEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oduncVer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kitapEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullaniciEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oduncTakip, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(uyeListeleme, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(kullaniciIslemleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(kitapGoruntuleme, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uyeListelemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeListelemeActionPerformed
        UyeIslemleriForm uyeListeleme=new UyeIslemleriForm();
        uyeListeleme.setVisible(true);
    }//GEN-LAST:event_uyeListelemeActionPerformed

    private void uyeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeEkleActionPerformed
        UyeEkleForm uyeEkle=new UyeEkleForm();
        uyeEkle.setVisible(true);
        
    }//GEN-LAST:event_uyeEkleActionPerformed

    private void kitapEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapEkleActionPerformed
        KitapEkleForm kitapEkle=new KitapEkleForm();
        kitapEkle.setVisible(true);
    }//GEN-LAST:event_kitapEkleActionPerformed

    private void kitapGoruntulemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapGoruntulemeActionPerformed
        KitapGoruntuleForm kitapGoruntule=new KitapGoruntuleForm();
        kitapGoruntule.setVisible(true);
    }//GEN-LAST:event_kitapGoruntulemeActionPerformed

    private void oduncVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oduncVerActionPerformed
       OduncVerForm oduncVer=new OduncVerForm();
       oduncVer.setVisible(true);
    }//GEN-LAST:event_oduncVerActionPerformed

    private void oduncTakipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oduncTakipActionPerformed
      OduncTakipForm oduncTakip=new OduncTakipForm();
      oduncTakip.setVisible(true);
    }//GEN-LAST:event_oduncTakipActionPerformed

    private void kullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciEkleActionPerformed
    KullaniciEkleForm kullaniciEkle=new KullaniciEkleForm();
    kullaniciEkle.setVisible(true);
    }//GEN-LAST:event_kullaniciEkleActionPerformed

    private void kullaniciIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kullaniciIslemleriActionPerformed
        KullaniciİslemleriForm kullaniciİslemleri=new KullaniciİslemleriForm();
        kullaniciİslemleri.setVisible(true);
    }//GEN-LAST:event_kullaniciIslemleriActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton kitapEkle;
    private javax.swing.JButton kitapGoruntuleme;
    private javax.swing.JButton kullaniciEkle;
    private javax.swing.JButton kullaniciIslemleri;
    private javax.swing.JButton oduncTakip;
    private javax.swing.JButton oduncVer;
    private javax.swing.JButton uyeEkle;
    private javax.swing.JButton uyeListeleme;
    // End of variables declaration//GEN-END:variables
}
