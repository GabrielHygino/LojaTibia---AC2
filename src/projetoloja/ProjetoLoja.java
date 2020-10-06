package projetoloja; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProjetoLoja {
    public static void main(String[] args) throws SQLException {
        
     Conexao con = new Conexao();
     
     Statement st = con.conexao.createStatement();
     
     st.executeUpdate("insert into teste values (null, 'Henrique', '18')");
     
     st.executeQuery("select * from teste");
     
     ResultSet rs = st.getResultSet();
     
     while(rs.next()){
         System.out.println(rs.getString("nome") + ", " + rs.getString("idade"));
         
     }
    }
    
    
}
