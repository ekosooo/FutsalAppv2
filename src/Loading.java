
import java.awt.Color;
import java.awt.Toolkit;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rizqi
 */
public class Loading extends javax.swing.JFrame {

    /**
     * Creates new form Loading
     */
    public Loading() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        setIcon();
    }
    
    private void setIcon(){
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Image/LOGO.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text = new javax.swing.JLabel();
        loadingnum = new javax.swing.JLabel();
        loadingbar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        bg_loading = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(595, 297));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        text.setBackground(new java.awt.Color(230, 231, 232));
        text.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        text.setForeground(new java.awt.Color(230, 231, 232));
        text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        text.setText("Menunggu Database.....");
        getContentPane().add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 440, -1));

        loadingnum.setBackground(new java.awt.Color(230, 231, 232));
        loadingnum.setFont(new java.awt.Font("Verdana", 0, 22)); // NOI18N
        loadingnum.setForeground(new java.awt.Color(230, 231, 232));
        loadingnum.setText("10%");
        getContentPane().add(loadingnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        loadingbar.setBackground(new java.awt.Color(230, 231, 232));
        loadingbar.setForeground(new java.awt.Color(75, 75, 77));
        loadingbar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 231, 232), 4));
        loadingbar.setBorderPainted(false);
        loadingbar.setPreferredSize(new java.awt.Dimension(440, 15));
        getContentPane().add(loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormLoading/logofutsal.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        bg_loading.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormLoading/Background.png"))); // NOI18N
        bg_loading.setMaximumSize(new java.awt.Dimension(595, 300));
        bg_loading.setMinimumSize(new java.awt.Dimension(595, 300));
        bg_loading.setPreferredSize(new java.awt.Dimension(595, 300));
        getContentPane().add(bg_loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(586, 297));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

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
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg_loading;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JProgressBar loadingbar;
    public javax.swing.JLabel loadingnum;
    public javax.swing.JLabel text;
    // End of variables declaration//GEN-END:variables
}
