/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.jgoodies.animation.Animation;
import com.jgoodies.animation.AnimationListener;
import java.awt.Color;
import java.awt.Container;
import static java.awt.SystemColor.info;
import java.io.*;
import javax.swing.DefaultListModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JScrollPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import AppPackage.AnimationClass;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rizqi
 */
public class Music extends javax.swing.JFrame {

    Playlist pl = new Playlist();
    ArrayList updateList = new ArrayList();
    long total_length;
    long paose;
    FileInputStream fis;

    javazoom.jl.player.Player player;
    File simpan;
    int menit = 0;
    int jam = 0;
    int detik = 0;

    
    /**
     * Creates new form Music
     */
    private UIManager.LookAndFeelInfo looks[];
    public Music() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));

        setIcon();
        
        looks = UIManager.getInstalledLookAndFeels();
        try {
            UIManager.setLookAndFeel(looks[3].getClassName());
            SwingUtilities.updateComponentTreeUI(this);
            
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Image/LOGO.png")));
    }

    /*void ui(){
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {

        }
    } */
    void log() {
        Login log = new Login();
        log.setVisible(false);
    }

    void updateList() {
        updateList = pl.getListSong();
        DefaultListModel<String> model = new DefaultListModel<String>();
        for (int i = 0; i < updateList.size(); i++) {
            int j = i + 1;
            model.add(i, j + ". " + ((File) updateList.get(i)).getName());

        }
        jPlaylist.setModel(model);

    }

    //panel kontrol
    void add() {
        pl.add(this);
        updateList();
    }

    void remove() {
        try {
            int hapus = jPlaylist.getLeadSelectionIndex();
            pl.ls.remove(hapus);
            updateList();
        } catch (Exception e) {

        }

    }

    void up() {
        try {
            int s1 = jPlaylist.getLeadSelectionIndex();
            simpan = (File) pl.ls.get(s1);
            pl.ls.remove(s1);
            pl.ls.add(s1 - 1, simpan);
            updateList();
            jPlaylist.setSelectedIndex(s1 - 1);
        } catch (Exception e) {

        }

    }

    void down() {
        try {
            int s1 = jPlaylist.getLeadSelectionIndex();
            simpan = (File) pl.ls.get(s1);
            pl.ls.remove(s1);
            pl.ls.add(s1 + 1, simpan);
            updateList();
            jPlaylist.setSelectedIndex(s1 + 1);
        } catch (Exception e) {

        }

    }

    void open() {
        pl.openPls(this);
        updateList();
    }

    void save() {
        pl.saveAsPlaylist(this);
        updateList();

    }

    File play1;
    static int a = 0;

    void putar() {
        if (a == 0) {
            try {
                int p1 = jPlaylist.getSelectedIndex();
                play1 = (File) this.updateList.get(p1);
                FileInputStream fis = new FileInputStream(play1);
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                a = 1;
            } catch (Exception e) {
                System.out.println("Tidak dapat memutar file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            a = 0;
            putar();
        }

    }

    void pause() {

    }

    File sa;

    void next() {
        if (a == 0) {
            try {
                int s1 = jPlaylist.getSelectedIndex() + 1;
                sa = (File) this.pl.ls.get(s1);
                FileInputStream fis = new FileInputStream(sa);
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                a = 1;
                jPlaylist.setSelectedIndex(s1);
            } catch (Exception e) {
                System.out.println("Tidak dapat memutar file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            a = 0;
            next();
        }

    }

    void previous() {
        if (a == 0) {
            try {
                int s1 = jPlaylist.getSelectedIndex() - 1;
                sa = (File) this.pl.ls.get(s1);
                FileInputStream fis = new FileInputStream(sa);
                BufferedInputStream bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                a = 1;
                jPlaylist.setSelectedIndex(s1);
            } catch (Exception e) {
                System.out.println("Tidak dapat memutar file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            a = 0;
            previous();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titik = new javax.swing.JLabel();
        lbl_detik = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbl_menit = new javax.swing.JLabel();
        btn_Up = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPlaylist = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_Remove = new javax.swing.JLabel();
        txt_namateam = new javax.swing.JTextField();
        txt_nb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_Save = new javax.swing.JLabel();
        btn_Open = new javax.swing.JLabel();
        btn_Add = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPlay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(471, 384));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titik.setFont(new java.awt.Font("Arial Narrow", 0, 62)); // NOI18N
        titik.setForeground(new java.awt.Color(255, 255, 255));
        titik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titik.setText(":");
        getContentPane().add(titik, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 12, 50, 160));

        lbl_detik.setFont(new java.awt.Font("Arial Narrow", 0, 60)); // NOI18N
        lbl_detik.setForeground(new java.awt.Color(255, 255, 255));
        lbl_detik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_detik.setText("00");
        getContentPane().add(lbl_detik, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 2, 110, 187));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_Below_25px.png"))); // NOI18N
        jLabel6.setToolTipText("Turunkan");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 197, -1, -1));

        lbl_menit.setFont(new java.awt.Font("Arial Narrow", 0, 60)); // NOI18N
        lbl_menit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_menit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_menit.setText("00");
        getContentPane().add(lbl_menit, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 2, 100, 187));

        btn_Up.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_Upward_Arrow_25px.png"))); // NOI18N
        btn_Up.setToolTipText("Naikkan");
        btn_Up.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_UpMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 197, -1, -1));

        jScrollPane1.setForeground(new java.awt.Color(51, 51, 51));

        jPlaylist.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPlaylist.setForeground(new java.awt.Color(75, 75, 77));
        jPlaylist.setToolTipText("Daftar Lagu");
        jPlaylist.setAlignmentX(0.0F);
        jPlaylist.setAlignmentY(0.0F);
        jPlaylist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPlaylist.setSelectionBackground(new java.awt.Color(38, 71, 99));
        jPlaylist.setSelectionForeground(new java.awt.Color(254, 254, 254));
        jPlaylist.setVisibleRowCount(20);
        jScrollPane1.setViewportView(jPlaylist);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 430, 140));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(75, 75, 77));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_Playlist_21px.png"))); // NOI18N
        jLabel2.setText("DAFTAR LAGU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/bar_playlist.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 189, 470, -1));

        btn_Remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/hapus_1.png"))); // NOI18N
        btn_Remove.setToolTipText("Hapus");
        btn_Remove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RemoveMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 58, -1, -1));

        txt_namateam.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txt_namateam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namateamActionPerformed(evt);
            }
        });
        getContentPane().add(txt_namateam, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 65, 90, -1));

        txt_nb.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txt_nb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nbActionPerformed(evt);
            }
        });
        txt_nb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nbKeyReleased(evt);
            }
        });
        getContentPane().add(txt_nb, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 25, 90, -1));

        jLabel11.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama Team");
        jLabel11.setToolTipText("");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 67, -1, -1));

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No Booking");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 26, -1, -1));

        btn_Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/save.png"))); // NOI18N
        btn_Save.setToolTipText("Simpan Playlist");
        btn_Save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 148, -1, -1));

        btn_Open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/open.png"))); // NOI18N
        btn_Open.setToolTipText("Buka File Playlist");
        btn_Open.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_OpenMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Open, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 105, -1, -1));

        btn_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/mp3.png"))); // NOI18N
        btn_Add.setToolTipText("Tambah ");
        btn_Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AddMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/side.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(38, 71, 99));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_Skip_to_Start_24px.png"))); // NOI18N
        jLabel3.setToolTipText("Sebelumnya");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_Play_26px_1.png"))); // NOI18N
        jPlay.setToolTipText("Putar");
        jPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPlay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPlayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPlayMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPlayMousePressed(evt);
            }
        });
        jPanel1.add(jPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/icons8_End_24px.png"))); // NOI18N
        jLabel4.setToolTipText("Selanjutnya");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 141, 192, 49));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/btn_transaksi.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 103, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/AAAA.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image.FormMusic/go.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 0, -1, -1));

        setBounds(900, 350, 471, 384);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Border border = BorderFactory.createEmptyBorder(0, 0, 0, 0);
        jScrollPane1.setBorder(border);
        //jScrollPane1.getVerticalScrollBar().setBackground(new Color(55,55,57));
        jScrollPane1.getVerticalScrollBar().setPreferredSize(new Dimension(10, 10));


    }//GEN-LAST:event_formWindowActivated

    private void jPlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPlayMouseClicked
        putar();
        Timer timer = new Timer(); //new timer
        TimerTask task = new TimerTask() {
            public void run() {
                lbl_detik.setText(Integer.toString(detik)); //the timer lable to counter.
                lbl_menit.setText(Integer.toString(menit));

                if (menit >= 0 && detik == 0) {
                    detik = 59;
                    menit--;
                }
                if (menit >= 0 && detik > 0) {
                    detik--;
                }
                if (menit == 0 && detik == 0) {
                    player.close();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000); // =  timer.scheduleAtFixedRate(task, delay, period);

    }//GEN-LAST:event_jPlayMouseClicked

    private void jPlayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPlayMouseEntered

    }//GEN-LAST:event_jPlayMouseEntered

    private void jPlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPlayMousePressed
        //putar();
        //jPlay.setVisible(false);
        //jStop.setVisible(true);

    }//GEN-LAST:event_jPlayMousePressed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        next();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        previous();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        //next();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        //previous();
    }//GEN-LAST:event_jLabel3MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void btn_AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AddMouseClicked
        add();
    }//GEN-LAST:event_btn_AddMouseClicked

    private void btn_RemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RemoveMouseClicked
        remove();
    }//GEN-LAST:event_btn_RemoveMouseClicked

    private void btn_OpenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OpenMouseClicked
        open();
    }//GEN-LAST:event_btn_OpenMouseClicked

    private void txt_nbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nbActionPerformed

    private void txt_namateamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namateamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namateamActionPerformed

    int xx, xy;
    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void btn_UpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_UpMouseClicked
        up();
    }//GEN-LAST:event_btn_UpMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        down();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void txt_nbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nbKeyReleased
        try {
            Connection c = koneksi.getKon();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from tbl_booking where " + "no_booking=' " + txt_nb.getText() + " ' ");

            while (r.next()) {
                //mengakses data pada database
                txt_namateam.setText(r.getString("nama_tim"));
                jam = (r.getInt("jam"));
            }

            menit = jam * 60;
            lbl_menit.setText("" + (menit));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data tidak ditemukan");
        }
    }//GEN-LAST:event_txt_nbKeyReleased

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Transaksi tr1 = new Transaksi();
        Transaksi.txt_booking.setText(this.txt_nb.getText());
       
        tr1.setVisible(true);
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Image.FormMusic/btn_transaksi1.png"));
        jLabel1.setIcon(I);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Image.FormMusic/btn_transaksi.png"));
        jLabel1.setIcon(I);
    }//GEN-LAST:event_jLabel5MouseEntered

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Music.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Music().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Add;
    private javax.swing.JLabel btn_Open;
    private javax.swing.JLabel btn_Remove;
    private javax.swing.JLabel btn_Save;
    private javax.swing.JLabel btn_Up;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jPlay;
    private javax.swing.JList<String> jPlaylist;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_detik;
    private javax.swing.JLabel lbl_menit;
    private javax.swing.JLabel titik;
    private javax.swing.JTextField txt_namateam;
    public javax.swing.JTextField txt_nb;
    // End of variables declaration//GEN-END:variables
}
