package projetoloja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    String serverName = "localhost";//caminho do servidor do BD
    String mydatabase = "projetoloja";//nome do BD
    String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
    String username = "root";//nome de usuario do BD
    String password = "1234";//senha do BD
    Connection conexao;
    
    Conexao() throws SQLException{
        conexao = DriverManager.getConnection(url, username, password);
    }
    
}
