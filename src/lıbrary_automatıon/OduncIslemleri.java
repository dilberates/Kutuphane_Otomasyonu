
package lıbrary_automatıon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lıbrary_automatıon.VeriTabani.con;
import static lıbrary_automatıon.VeriTabani.preparedStatement;
import static lıbrary_automatıon.VeriTabani.statement;

public class OduncIslemleri  extends AGetirVeSil<OduncKitaplar> {

    public ArrayList<OduncKitaplar> getir(){
     ArrayList<OduncKitaplar> cikti=new ArrayList<OduncKitaplar>();
        try {
            Baglanti.statement=Baglanti.con.createStatement();
             String sorgu="Select c.odunc_id , p.uye_ad , p.uye_soyad , d.kitap_adi , c.alim_tarihi , c.teslim_tarihi From uye p , kitap d , odunc c where p.uye_id=c.uye_id and d.kitap_id=c.kitap_id";
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int odunc_id=rs.getInt("odunc_id");
            String ad=rs.getString("uye_ad");
            String soyad=rs.getString("uye_soyad");
            String kitap_ad=rs.getString("kitap_adi");
            java.util.Date verilis_tarihi=rs.getDate("alim_tarihi");
            java.util.Date teslim_tarihi=rs.getDate("teslim_tarihi");
           
            
            cikti.add(new OduncKitaplar(odunc_id,ad, soyad, kitap_ad, verilis_tarihi, teslim_tarihi));
            }
     
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    public ArrayList<OduncKitaplar> teslimEdilmemisGetir(){
     ArrayList<OduncKitaplar> cikti=new ArrayList<OduncKitaplar>();
        try {
            Baglanti.statement=Baglanti.con.createStatement();
             String sorgu="Select c.odunc_id , p.uye_ad , p.uye_soyad , d.kitap_adi , c.alim_tarihi , c.teslim_tarihi From uye p , kitap d , odunc c where p.uye_id=c.uye_id and d.kitap_id=c.kitap_id and c.teslim_tarihi < now()";
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int odunc_id=rs.getInt("odunc_id");
            String ad=rs.getString("uye_ad");
            String soyad=rs.getString("uye_soyad");
            String kitap_ad=rs.getString("kitap_adi");
            java.util.Date verilis_tarihi=rs.getDate("alim_tarihi");
            java.util.Date teslim_tarihi=rs.getDate("teslim_tarihi");
           
            
            cikti.add(new OduncKitaplar(odunc_id,ad, soyad, kitap_ad, verilis_tarihi, teslim_tarihi));
            }
     
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
  public void oduncVer(int kitap_id,int uye_id,String ver_tarih,String teslim_tarih){
       String sorgu="Insert Into odunc (kitap_id,uye_id,alim_tarihi,teslim_tarihi) VALUES (?,?,?,?)"; 
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setInt(1, kitap_id);
            preparedStatement.setInt(2,uye_id );
            preparedStatement.setString(3, ver_tarih);
            preparedStatement.setString(4, teslim_tarih);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
  public void sureUzat(int id,String yeniTarih){
        
       String sorgu="Update odunc set teslim_tarihi = ? where odunc_id = ?";
       try {
            preparedStatement=con.prepareStatement(sorgu);
            
            preparedStatement.setString(1,yeniTarih);
            preparedStatement.setInt(2, id);
            
            
          preparedStatement.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    public void sil(int id) {
        String sorgu="Delete from odunc where odunc_id = ? ";
   
        try {
            preparedStatement=con.prepareCall(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
