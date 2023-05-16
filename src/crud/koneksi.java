/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crud;

/**
 *
 * @author Adam Marwadi
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    Connection con ;
    Statement st;
    

    public void config (){
      try {
            String url ="jdbc:mysql://localhost:3306/crud";
            String user="root";
            String pass="";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con =DriverManager.getConnection(url,user,pass);
            st = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Tidak Konek", "Gagal", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
