
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rizqi
 */
public class MainClass {
    
    public static void main(String[] args) {
        
        UIManager.getLookAndFeelDefaults().put("defaultFont", new Font("OpenSans", Font.BOLD, 14));
        UIManager.put("ToolTip.background", new Color(230,231,232));
        
        Loading load = new Loading();
        Login login = new Login();

        load.setVisible(true);

        try {
            for (int i = 0; i <= 10; i++) {
                Thread.sleep(120);
                //Thread.sleep(10);
                load.loadingnum.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
                load.text.setText("Menunggu Database....");

            }
        } catch (Exception e) {
        }

        try {
            for (int i = 10; i <= 20; i++) {
                Thread.sleep(200);
                //Thread.sleep(10);
                load.loadingnum.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
                load.text.setText("Menyalin Berkas....");

            }
        } catch (Exception e) {
        }

        try {
            for (int i = 20; i <= 50; i++) {
                Thread.sleep(350);
                //Thread.sleep(10);
                load.loadingnum.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
                load.text.setText("Menghubungkan Database....");

            }
        } catch (Exception e) {
        }

        try {
            for (int i = 50; i <= 70; i++) {
                Thread.sleep(200);
                //Thread.sleep(10);
                load.loadingnum.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
                load.text.setText("Memuat Database....");

            }
        } catch (Exception e) {
        }

        try {
            for (int i = 70; i <= 100; i++) {
                Thread.sleep(10);
                load.loadingnum.setText(Integer.toString(i) + "%");
                load.loadingbar.setValue(i);
                load.text.setText("Membuka Form....");

                if (i == 100) {
                    //Thread.sleep(10);
                    Thread.sleep(2000);
                    load.setVisible(false);
                    Thread.sleep(1000);
                    //Thread.sleep(20);
                    login.setVisible(true);
                }
            }
        } catch (Exception e) {
        }

    }

}
