
import java.awt.Color;
import AppPackage.AnimationClass;
import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Rizqi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Home Home;
    public Connection con;
    public Statement stt;
    

    public Login() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
       
        //icontaskbar
        setIcon();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_futsal", "root", "");
            stt = con.createStatement();
            System.out.println("Koneksi Sukses");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak  Berhasil koneksi");
        }
    }


    private void setIcon() {
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

        btn_Simpan = new javax.swing.JLabel();
        txt_katasandidaftar = new javax.swing.JLabel();
        txt_sandi = new javax.swing.JPasswordField();
        iconpass4 = new javax.swing.JLabel();
        txt_namapenggunaDaftar = new javax.swing.JLabel();
        txt_user = new javax.swing.JTextField();
        iconpass3 = new javax.swing.JLabel();
        txt_namaandaDaftar = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        iconpass2 = new javax.swing.JLabel();
        sidelogin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        iconuser = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        iconpass1 = new javax.swing.JLabel();
        katasandi = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        loginbar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(657, 455));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/simpan.png"))); // NOI18N
        btn_Simpan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_SimpanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_SimpanMouseEntered(evt);
            }
        });
        getContentPane().add(btn_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, -1, -1));

        txt_katasandidaftar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txt_katasandidaftar.setForeground(new java.awt.Color(150, 152, 154));
        txt_katasandidaftar.setText("Kata Sandi");
        getContentPane().add(txt_katasandidaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 270, -1, -1));

        txt_sandi.setBackground(new java.awt.Color(230, 231, 232));
        txt_sandi.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_sandi.setText("jPasswordField1");
        txt_sandi.setBorder(null);
        txt_sandi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_sandiMouseClicked(evt);
            }
        });
        txt_sandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_sandiActionPerformed(evt);
            }
        });
        txt_sandi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sandiKeyTyped(evt);
            }
        });
        getContentPane().add(txt_sandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 160, 20));

        iconpass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/iconpass.png"))); // NOI18N
        getContentPane().add(iconpass4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        txt_namapenggunaDaftar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txt_namapenggunaDaftar.setForeground(new java.awt.Color(150, 152, 154));
        txt_namapenggunaDaftar.setText("Nama Pengguna");
        getContentPane().add(txt_namapenggunaDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, -1, -1));

        txt_user.setBackground(new java.awt.Color(230, 231, 232));
        txt_user.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txt_user.setForeground(new java.awt.Color(75, 75, 77));
        txt_user.setText("Nama Pengguna");
        txt_user.setBorder(null);
        txt_user.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txt_user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_userMouseEntered(evt);
            }
        });
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        txt_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_userKeyTyped(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 160, 20));

        iconpass3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/iconusername.png"))); // NOI18N
        getContentPane().add(iconpass3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 220, -1, -1));

        txt_namaandaDaftar.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        txt_namaandaDaftar.setForeground(new java.awt.Color(150, 152, 154));
        txt_namaandaDaftar.setText("Nama Anda");
        getContentPane().add(txt_namaandaDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        txt_nama.setBackground(new java.awt.Color(230, 231, 232));
        txt_nama.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txt_nama.setForeground(new java.awt.Color(75, 75, 77));
        txt_nama.setText("Nama Anda");
        txt_nama.setBorder(null);
        txt_nama.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txt_nama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_namaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_namaMouseEntered(evt);
            }
        });
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });
        txt_nama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_namaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 145, 160, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Gares.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 167, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Gares.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 245, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Gares.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 325, -1, -1));

        iconpass2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/icons8_Name_Tag_25px_1.png"))); // NOI18N
        getContentPane().add(iconpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, -1, -1));

        sidelogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/newLoginSide.png"))); // NOI18N
        getContentPane().add(sidelogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/SignIn.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, -8, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/masuk_off.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Daftar_off.png"))); // NOI18N
        jLabel8.setToolTipText("");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, -1, -1));

        iconuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/iconpass.png"))); // NOI18N
        getContentPane().add(iconuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 288, -1, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/close.png"))); // NOI18N
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, -1, -1));

        iconpass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/iconusername.png"))); // NOI18N
        getContentPane().add(iconpass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 198, -1, -1));

        katasandi.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        katasandi.setForeground(new java.awt.Color(150, 152, 154));
        katasandi.setText("Password");
        getContentPane().add(katasandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        nama.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        nama.setForeground(new java.awt.Color(150, 152, 154));
        nama.setText("Username");
        getContentPane().add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        txt_name.setBackground(new java.awt.Color(230, 231, 232));
        txt_name.setFont(new java.awt.Font("Open Sans", 0, 15)); // NOI18N
        txt_name.setForeground(new java.awt.Color(75, 75, 77));
        txt_name.setText("Nama Pengguna");
        txt_name.setBorder(null);
        txt_name.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_nameMouseEntered(evt);
            }
        });
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        getContentPane().add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 160, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Gares.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Gares.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, -1, -1));

        txt_pass.setBackground(new java.awt.Color(230, 231, 232));
        txt_pass.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        txt_pass.setText("passwor");
        txt_pass.setBorder(null);
        txt_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_passMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_passMouseEntered(evt);
            }
        });
        txt_pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passKeyTyped(evt);
            }
        });
        getContentPane().add(txt_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 160, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/txtMASUK.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 60, -1, -1));

        loginbar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/FormLogin/Login.png"))); // NOI18N
        loginbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbarMouseEntered(evt);
            }
        });
        getContentPane().add(loginbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 2, -1, -1));

        setSize(new java.awt.Dimension(655, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void clear() {
        txt_name.setText(null);
        txt_pass.setText(null);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AnimationClass anim = new AnimationClass();
        AnimationClass animm = new AnimationClass();
        try {
            Thread.sleep(400);
            //anim.jLabelXLeft(390, 220, 10, 5, sidelogin);

            animm.jLabelXRight(190, 470, 10, 5, loginbar);
        } catch (InterruptedException ex) {

        }


    }//GEN-LAST:event_formWindowOpened

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed

    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        txt_name.setText("");
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseClicked
        txt_pass.setText("");
    }//GEN-LAST:event_txt_passMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
        //Login log = new Login();

    }//GEN-LAST:event_closeMouseClicked

    private void txt_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseEntered
        //spratoruser.setForeground(new Color(54, 55, 56));
        //nama.setForeground(new Color(51, 51, 52));


    }//GEN-LAST:event_txt_nameMouseEntered

    private void loginbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbarMouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Image/FormLogin/masuk_off.png"));
        jLabel7.setIcon(I);

        ImageIcon aI = new ImageIcon(getClass().getResource("/Image/FormLogin/Daftar_off.png"));
        jLabel8.setIcon(aI);

        //spratoruser.setForeground(new Color(160, 160, 160));
        //nama.setForeground(new Color(150, 152, 154));
    }//GEN-LAST:event_loginbarMouseEntered

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped

        nama.setForeground(new Color(51, 51, 52));
        txt_name.setForeground(new Color(51, 51, 52));

        katasandi.setForeground(new Color(150, 152, 154));

    }//GEN-LAST:event_txt_nameKeyTyped

    private void txt_passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passKeyTyped

        katasandi.setForeground(new Color(51, 51, 52));
        txt_pass.setForeground(new Color(51, 51, 52));

        nama.setForeground(new Color(150, 152, 154));

    }//GEN-LAST:event_txt_passKeyTyped

    private void txt_passMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_passMouseEntered
        //spratorpass.setForeground(new Color(54, 55, 56));
        //katasandi.setForeground(new Color(51, 51, 52));


    }//GEN-LAST:event_txt_passMouseEntered

    private void txt_namaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_namaKeyTyped
        txt_namaandaDaftar.setForeground(new Color(51, 51, 52));
        txt_nama.setForeground(new Color(51, 51, 52));

        txt_namapenggunaDaftar.setForeground(new Color(150, 152, 154));
        txt_katasandidaftar.setForeground(new Color(150, 152, 154));
    }//GEN-LAST:event_txt_namaKeyTyped

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_namaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_namaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaMouseEntered

    private void txt_namaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_namaMouseClicked
        txt_nama.setText("");
    }//GEN-LAST:event_txt_namaMouseClicked

    private void txt_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_userKeyTyped
        txt_namapenggunaDaftar.setForeground(new Color(51, 51, 52));
        txt_user.setForeground(new Color(51, 51, 52));

        txt_namaandaDaftar.setForeground(new Color(150, 152, 154));
        txt_katasandidaftar.setForeground(new Color(150, 152, 154));
    }//GEN-LAST:event_txt_userKeyTyped

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_userMouseEntered

    private void txt_userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_userMouseClicked
        txt_user.setText("");
    }//GEN-LAST:event_txt_userMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        try {
            String sql = "select * from tbl_login where user = ' " + txt_name.getText() + " ' and password= ' " + String.valueOf(txt_pass.getPassword()) + " ' ";
            ResultSet rss = stt.executeQuery(sql);
            if (rss.next()) {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                Home = new Home();

                Home.setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Gagal Login");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Salah procedure");
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        AnimationClass animm = new AnimationClass();
        animm.jLabelXLeft(680, 250, 1, 10, jLabel1);

        animm.jLabelXLeft(770, 370, 1, 10, txt_namaandaDaftar);
        animm.jTextFieldXLeft(770, 370, 1, 10, txt_nama);
        animm.jLabelXLeft(770, 370, 1, 10, txt_namapenggunaDaftar);
        animm.jTextFieldXLeft(770, 370, 1, 10, txt_user);
        animm.jLabelXLeft(770, 370, 1, 10, txt_katasandidaftar);
        animm.jTextFieldXLeft(770, 370, 1, 10, txt_sandi);

        animm.jLabelXLeft(930, 530, 1, 10, iconpass2);
        animm.jLabelXLeft(930, 530, 1, 10, iconpass3);
        animm.jLabelXLeft(930, 530, 1, 10, iconpass4);

        animm.jLabelXLeft(770, 370, 1, 10, jLabel2);
        animm.jLabelXLeft(770, 370, 1, 10, jLabel3);
        animm.jLabelXLeft(770, 370, 1, 10, jLabel4);

        animm.jLabelXLeft(800, 370, 1, 10, btn_Simpan);

        //kalau daftar ditekan yang ini ilang soalnye tetimpak
        //nntik misal udh dikasik showmassage pas oke di true kan
        txt_pass.setVisible(false);
        txt_name.setVisible(false);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        ImageIcon I = new ImageIcon(getClass().getResource("/Image/FormLogin/masuk_on.png"));
        jLabel7.setIcon(I);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        ImageIcon IId = new ImageIcon(getClass().getResource("/Image/FormLogin/Daftar_on.png"));
        jLabel8.setIcon(IId);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void txt_sandiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sandiKeyTyped
        txt_katasandidaftar.setForeground(new Color(51, 51, 52));
        txt_user.setForeground(new Color(51, 51, 52));

        txt_namaandaDaftar.setForeground(new Color(150, 152, 154));
        txt_namapenggunaDaftar.setForeground(new Color(150, 152, 154));
    }//GEN-LAST:event_txt_sandiKeyTyped

    private void txt_sandiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_sandiMouseClicked
        txt_sandi.setText("");
    }//GEN-LAST:event_txt_sandiMouseClicked

    private void txt_sandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_sandiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sandiActionPerformed

    private void btn_SimpanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SimpanMouseEntered
        // ImageIcon IId = new ImageIcon(getClass().getResource("/Image/FormLogin/Daftar_on.png"));
        //jLabel8.setIcon(IId);
    }//GEN-LAST:event_btn_SimpanMouseEntered

    private void btn_SimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_SimpanMouseClicked
        // TODO add your handling code here:
        String nama = txt_nama.getText();
        String user = txt_user.getText();
        String pass = txt_sandi.getText();
        try {
            Connection c = koneksi.getKon();
            Statement s = c.createStatement();
            s.executeUpdate("Insert into tbl_login VALUES (' " + nama + " ', ' " + user + " ' , ' " + pass + " ');");

            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");

            AnimationClass animm = new AnimationClass();
            animm.jLabelXRight(250, 680, 1, 10, jLabel1);

            animm.jLabelXRight(370, 770, 1, 10, txt_namaandaDaftar);
            animm.jTextFieldXRight(370, 770, 1, 10, txt_nama);
            animm.jLabelXRight(370, 770, 1, 10, txt_namapenggunaDaftar);
            animm.jTextFieldXRight(370, 770, 1, 10, txt_user);
            animm.jLabelXRight(370, 770, 1, 10, txt_katasandidaftar);
            animm.jTextFieldXRight(370, 770, 1, 10, txt_sandi);

            animm.jLabelXRight(530, 930, 1, 10, iconpass2);
            animm.jLabelXRight(530, 930, 1, 10, iconpass3);
            animm.jLabelXRight(530, 930, 1, 10, iconpass4);

            animm.jLabelXRight(370, 770, 1, 10, jLabel2);
            animm.jLabelXRight(370, 770, 1, 10, jLabel3);
            animm.jLabelXRight(370, 770, 1, 10, jLabel4);

            animm.jLabelXRight(370, 800, 1, 10, btn_Simpan);

            //kalau daftar ditekan yang ini ilang soalnye tetimpak
            //nntik misal udh dikasik showmassage pas oke di true kan
            txt_pass.setVisible(true);
            txt_name.setVisible(true);

            txt_nama.setText("");
            txt_user.setText("");
            txt_sandi.setText("");

        } catch (Exception t) {

            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
        }
    }//GEN-LAST:event_btn_SimpanMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Windows look and feel */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_Simpan;
    private javax.swing.JLabel close;
    private javax.swing.JLabel iconpass1;
    private javax.swing.JLabel iconpass2;
    private javax.swing.JLabel iconpass3;
    private javax.swing.JLabel iconpass4;
    private javax.swing.JLabel iconuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel katasandi;
    private javax.swing.JLabel loginbar;
    private javax.swing.JLabel nama;
    private javax.swing.JLabel sidelogin;
    private javax.swing.JLabel txt_katasandidaftar;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JLabel txt_namaandaDaftar;
    private javax.swing.JLabel txt_namapenggunaDaftar;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JPasswordField txt_sandi;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}