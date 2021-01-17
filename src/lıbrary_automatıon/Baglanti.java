
package lıbrary_automatıon;
import java.sql.*;

public class Baglanti extends VeriTabani{
    
    public Baglanti(){
    
    String url="jdbc:mysql://" + host + ":" + port + "/" + db_isim +"?useUnicode=true&characterEncoding=utf8";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı .");
        }
        
        try {
            con=DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı başarılı .");
            } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız .");
        }
    }
    
     
}
