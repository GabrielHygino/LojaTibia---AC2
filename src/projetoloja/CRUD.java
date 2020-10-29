package projetoloja;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CRUD {
    
    public static void inserir(String nome, String senha, String email, String telefone){
        try {
            
            String comando = "insert into cadastro values (null, ?, ?, ?, ?)";

            //cria o comando
            PreparedStatement stmt = Conexao.con.prepareStatement(comando);
            
            //variaveis
            stmt.setString(1, nome);
            stmt.setString(2, senha);   
            stmt.setString(3, email);
            stmt.setString(4, telefone);
            
            //executa o comando
            stmt.executeUpdate();
            
            stmt.close();
            Conexao.con.close();
   
            System.out.println("INSERIDO");
            
        } catch (SQLException ex) {
            Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
