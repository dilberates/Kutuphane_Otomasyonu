
package lıbrary_automatıon;
import java.sql.*;

public class VeriTabani {
    public static final String kullanici_adi="root";
    public static final String parola ="";
    public static final String db_isim="demo";
    public static final String host="localhost";
    public static final int port =3306; 
    //Yukarıdaki static kullanarak program çalışmaya başladığında itibaren bellekte oluşturup obje oluşturmadan değerlere ulaşılabilmesi ve final ile değiştirilmemesi sağlanmıştırç
    
    public static  Connection con=null; // BAĞLANTI 
    
    public static Statement statement=null; // İFADE 
    
    public static PreparedStatement preparedStatement=null;
}
