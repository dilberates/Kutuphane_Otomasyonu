
package lıbrary_automatıon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;
import static lıbrary_automatıon.VeriTabani.con;
import static lıbrary_automatıon.VeriTabani.preparedStatement;
import static lıbrary_automatıon.VeriTabani.statement;

public class KitapIslemleri extends AGetirVeSil<Kitaplar>  implements Iarama<Kitaplar> {


  public ArrayList<Kitaplar> getir(){
     ArrayList<Kitaplar> cikti=new ArrayList<Kitaplar>();
        try {
            statement=con.createStatement();
             String sorgu="Select * From kitap";
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("kitap_id");
            String ad=rs.getString("kitap_adi");
            String yazar=rs.getString("kitap_yazari");
            String tur=rs.getString("kitap_turu");
            int sayfa=rs.getInt("kitap_sayfasi");
            String basim=rs.getString("kitap_basim_yili");
            String yayin=rs.getString("kitap_yayin_evi");
            int adet=rs.getInt("kitap_adet");
            cikti.add(new Kitaplar(id, ad, yazar, tur, sayfa, basim, yayin, adet));
            }
     
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
  public void kitapEkleme(String ad, String yazar,String tur,int sayfa,String basim_yili,String yayin_evi,int adet){
       String sorgu="Insert Into kitap (kitap_adi,kitap_yazari,kitap_turu,kitap_sayfasi,kitap_basim_yili,kitap_yayin_evi,kitap_adet) VALUES (?,?,?,?,?,?,?)"; 
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, yazar);
            preparedStatement.setString(3, tur);
            preparedStatement.setInt(4, sayfa);
            preparedStatement.setString(5, basim_yili);
            preparedStatement.setString(6, yayin_evi);
            preparedStatement.setInt(7, adet);
   
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
  
  public void kitapGuncelle(int id,String ad, String yazar,String tur,int sayfa,String basim_yili,String yayin_evi,int adet){
        
       String sorgu="Update kitap set kitap_adi = ? , kitap_yazari= ? , kitap_turu = ? , kitap_sayfasi = ? , kitap_basim_yili = ? , kitap_yayin_evi = ? , kitap_adet = ? where kitap_id = ?";
       try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, yazar);
            preparedStatement.setString(3, tur);
            preparedStatement.setInt(4, sayfa);
            preparedStatement.setString(5, basim_yili);
            preparedStatement.setString(6, yayin_evi);
            preparedStatement.setInt(7, adet);
            preparedStatement.setInt(8, id);
            
          preparedStatement.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    public void sil(int id) {
       String sorgu="Delete from kitap where kitap_id = ? ";
   
        try {
            preparedStatement=con.prepareCall(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Kitaplar> arama(String adi){
     ArrayList<Kitaplar> cikti=new ArrayList<Kitaplar>();
        try {
            statement=con.createStatement();
             String sorgu="Select * From kitap where kitap_adi ='"+adi+"'"; 
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("kitap_id");
            String ad=rs.getString("kitap_adi");
            String yazar=rs.getString("kitap_yazari");
            String tur=rs.getString("kitap_turu");
            int sayfa=rs.getInt("kitap_sayfasi");
            String basim=rs.getString("kitap_basim_yili");
            String yayin=rs.getString("kitap_yayin_evi");
            int adet=rs.getInt("kitap_adet");
            cikti.add(new Kitaplar(id, ad, yazar, tur, sayfa, basim, yayin, adet));
            }
      if(cikti.isEmpty())
     {
         String  mesaj="Aradığınız kitap bulunmamaktadır . ";
        JOptionPane.showMessageDialog(null,mesaj);
     }
     return cikti;

        } catch (SQLException ex) {
             Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
}
