
package Frame;

import java.awt.Color;

public class StartDialog extends javax.swing.JDialog {

    MainFrame mainFrame;
    public StartDialog(java.awt.Frame parent, boolean modal, MainFrame mainFrame) {
        super(parent, modal);
        this.mainFrame = mainFrame;
        initComponents();
        setTitle("Snipping Tool");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        lbNew = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCancel = new javax.swing.JLabel();
        lbOption = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar1.setRollover(true);

        lbNew.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnippingIcon.png"))); // NOI18N
        lbNew.setText("New");
        lbNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbNewMousePressed(evt);
            }
        });
        jToolBar1.add(lbNew);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DropDown.png"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jToolBar1.add(jLabel2);

        lbCancel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CancelIcon.png"))); // NOI18N
        lbCancel.setText("Cancel   ");
        lbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbCancelMousePressed(evt);
            }
        });
        jToolBar1.add(lbCancel);

        lbOption.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings.png"))); // NOI18N
        lbOption.setText("Option   ");
        lbOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOptionMousePressed(evt);
            }
        });
        jToolBar1.add(lbOption);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbImage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setText("<html><body>Select a snip type from <br>menu or select New Button</body></html>");
        lbImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbNewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNewMousePressed
        this.setVisible(false);
    }//GEN-LAST:event_lbNewMousePressed

    private void lbCancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCancelMousePressed
        
    }//GEN-LAST:event_lbCancelMousePressed

    private void lbOptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbOptionMousePressed
        
    }//GEN-LAST:event_lbOptionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbCancel;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbNew;
    private javax.swing.JLabel lbOption;
    // End of variables declaration//GEN-END:variables
}
