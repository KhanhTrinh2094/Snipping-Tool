package Frame;

import java.awt.AWTException;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MainFrame extends javax.swing.JFrame {

    public JPanel mainPanel;
    private Point actionPoint, currentPoint;
    private Rectangle2D rect;
    private RenderingHints render;
    private Robot robot;

    public MainFrame() {
        try {
            this.robot = new Robot();
        } catch (AWTException ex) {
        }
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setTitle("Snipping Tool");
        setLocation(0, 0);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/Snipping.png")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        mainPanel = new JPanel();
        mainPanel.setSize(Toolkit.getDefaultToolkit().getScreenSize());
        mainPanel.setBackground(new Color(0, 255, 0, 0));
        mainPanel.setBounds(0, 0, getWidth(), getHeight());
        setContentPane(mainPanel);

        Map<RenderingHints.Key, Object> hintsMap = new HashMap<>();
        hintsMap.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        hintsMap.put(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
        hintsMap.put(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        render = new RenderingHints(hintsMap);
        dialog();
    }

    private void actMouseDragged(MouseEvent e) {
        actionPoint = e.getPoint();
        if (currentPoint != null) {
            rect = null;
            Graphics2D g = (Graphics2D) mainPanel.getGraphics();
            g.setRenderingHints(render);
            g.setColor(Color.RED);

            if (currentPoint.x > actionPoint.x) {
                if (currentPoint.y > actionPoint.y) {
                    rect = new Rectangle2D.Float(actionPoint.x, actionPoint.y, currentPoint.x - actionPoint.x, currentPoint.y - actionPoint.y);
                } else {
                    rect = new Rectangle2D.Float(actionPoint.x, currentPoint.y, currentPoint.x - actionPoint.x, actionPoint.y - currentPoint.y);
                }
            } else {
                if (currentPoint.y > actionPoint.y) {
                    rect = new Rectangle2D.Float(currentPoint.x, actionPoint.y, actionPoint.x - currentPoint.x, currentPoint.y - actionPoint.y);
                } else {
                    rect = new Rectangle2D.Float(currentPoint.x, currentPoint.y, actionPoint.x - currentPoint.x, actionPoint.y - currentPoint.y);
                }
            }

            g.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1.7f));
            g.drawRect((int) rect.getX(), (int) rect.getY(), (int) rect.getWidth(), (int) rect.getHeight());
            g.dispose();
            mainPanel.repaint();
        }
    }

    private void actMousePress(MouseEvent e) {
        currentPoint = e.getPoint();
    }

    private void actMouseReleased(MouseEvent e) {
        if (rect != null) {
            BufferedImage biScreen = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            biScreen = biScreen.getSubimage((int) rect.getX(), (int) rect.getY(), (int) rect.getWidth(), (int) rect.getHeight());
            ImageDialog image = new ImageDialog(this, true, biScreen);
            image.setVisible(true);
            image.setLocationRelativeTo(this);
            setOpacity(1.0f);
            setBackground(new Color(0, 255, 0, 0));
            mainPanel.setBackground(new Color(0, 255, 0, 0));
            if(image.isVisible() == false){
                System.exit(0);
            }
        }
    }

    public final void dialog() {
        StartDialog dialog = new StartDialog(this, true, this);
        dialog.setLocationRelativeTo(this);
        dialog.setAlwaysOnTop(true);
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        dialog.setVisible(true);
        if (dialog.isVisible() == false) {
            mainPanel.setBackground(Color.WHITE);
            this.setOpacity(0.4f);
            mainPanel.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    actMousePress(e);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    actMouseReleased(e);
                }
            });

            mainPanel.addMouseMotionListener(new MouseMotionAdapter() {

                @Override
                public void mouseDragged(MouseEvent e) {
                    actMouseDragged(e);
                }

            });
            this.setAlwaysOnTop(true);
        }
    }

    public void setBackround() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
