
package Frame;

import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

public class ImageDialog extends javax.swing.JDialog {

    BufferedImage bi;
    public ImageDialog(java.awt.Frame parent, boolean modal, BufferedImage bi) {
        super(parent, modal);
        this.bi = bi;
        initComponents();
        lbImage.setIcon(new ImageIcon(bi));
        lbImage.setText("");
        tbOne.setSize(bi.getWidth(), tbOne.getHeight());
        pnMain.setSize(bi.getWidth() + 10, bi.getHeight() + 10);
        setSize(bi.getWidth() + 20 + 12, bi.getHeight() + 10 + tbOne.getHeight() + 33);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbOne = new javax.swing.JToolBar();
        lbNew = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCancel = new javax.swing.JLabel();
        lbOption = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbOne.setRollover(true);

        lbNew.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnippingIcon.png"))); // NOI18N
        lbNew.setText("New");
        lbNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbNewMousePressed(evt);
            }
        });
        tbOne.add(lbNew);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DropDown.png"))); // NOI18N
        jLabel2.setText(" ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        tbOne.add(jLabel2);

        lbCancel.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CancelIcon.png"))); // NOI18N
        lbCancel.setText("Cancel   ");
        lbCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbCancelMousePressed(evt);
            }
        });
        tbOne.add(lbCancel);

        lbOption.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        lbOption.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Settings.png"))); // NOI18N
        lbOption.setText("Option   ");
        lbOption.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbOptionMousePressed(evt);
            }
        });
        tbOne.add(lbOption);

        pnMain.setBackground(new java.awt.Color(255, 255, 255));

        lbImage.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setText("<html><body>Select a snip type from <br>menu or select New Button</body></html>");
        lbImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbOne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    private javax.swing.JLabel lbCancel;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbNew;
    private javax.swing.JLabel lbOption;
    private javax.swing.JPanel pnMain;
    private javax.swing.JToolBar tbOne;
    // End of variables declaration//GEN-END:variables
}
