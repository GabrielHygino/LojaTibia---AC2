package projetoloja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    public Conexao () {    
    }

    public static Connection con = null;

    public static void conectar() {
        String serverName = "localhost";
        String myDataBase = "tibia";
        String url = "jdbc:mysql://" + serverName + "/" + myDataBase;
        String userName = "root";
        String password = "";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection(url,userName,password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        } catch(SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}
