/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
     private static Connection kon;

    public static Connection getKon() throws SQLException {
        if (kon == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/db_futsal";
                String user = "root";
                String password = "";

                DriverManager.registerDriver(new com.mysql.jdbc.Driver());

                kon = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                System.out.println("Eror membuat koneksi");
            }
        }
        return kon;
    }
}
