
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Acer
 */
public class Koneksi {
    public static Connection Konek;
    public static Statement stmt;
    public static PreparedStatement prstmt;
    
    public Koneksi (){
        
        try {
        String url="jdbc:mysql://localhost/book";
        String user= "root";
        String password= "";
        Class.forName("com.mysql.jdbc.Driver");
        Konek=DriverManager.getConnection(url, user, password);
        stmt=Konek.createStatement();
        System.out.println("database berhasil terkoneksi");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
}
