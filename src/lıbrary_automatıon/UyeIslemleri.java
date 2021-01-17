
package lıbrary_automatıon;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static lıbrary_automatıon.Baglanti.con;
import static lıbrary_automatıon.Baglanti.preparedStatement;
import static lıbrary_automatıon.Baglanti.statement;

public class UyeIslemleri extends AGetirVeSil<Uyeler> {
    
    public ArrayList<Uyeler> getir(){
     ArrayList<Uyeler> cikti=new ArrayList<Uyeler>();
        try {
            Baglanti.statement=Baglanti.con.createStatement();
             String sorgu="Select * From uye";
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("uye_id");
            String ad=rs.getString("uye_ad");
            String soyad=rs.getString("uye_soyad");
            java.util.Date dogumDate=rs.getDate("dogum_tarihi");
            String cinsiyet=rs.getString("cinsiyet");
            String telefon=rs.getString("telefon");
            String email=rs.getString("email");
            String adres=rs.getString("adres");
            
            cikti.add(new Uyeler(id, ad, soyad, dogumDate, cinsiyet, telefon, email, adres));
            }
     
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
    
   public void uyeEkleme(String ad, String soyad,String tarih,String cinsiyet,String telefon,String email,String adres){
       String sorgu="Insert Into uye (uye_ad,uye_soyad,dogum_tarihi,cinsiyet,telefon,email,adres) VALUES (?,?,?,?,?,?,?)"; 
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, cinsiyet);
            preparedStatement.setString(5, telefon);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, adres);
   
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
   
   
   public void uyeGuncelle(int id,String ad, String soyad,String tarih,String cinsiyet,String telefon,String email,String adres){
        
       String sorgu="Update uye set uye_ad = ? , uye_soyad= ? , dogum_tarihi = ? , cinsiyet = ? , telefon = ? , email = ? , adres = ? where uye_id = ?";
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, tarih);
            preparedStatement.setString(4, cinsiyet);
            preparedStatement.setString(5, telefon);
            preparedStatement.setString(6, email);
            preparedStatement.setString(7, adres);
            preparedStatement.setInt(8, id);
            
              preparedStatement.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   
   
   
   
   public void sil(int id){
   String sorgu="Delete from uye where uye_id = ? ";
   
        try {
            preparedStatement=con.prepareCall(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       
   
   }
   public ArrayList<Uyeler> arama(String adi,String soyadi){
     ArrayList<Uyeler> cikti=new ArrayList<Uyeler>();
        try {
            Baglanti.statement=Baglanti.con.createStatement();
             String sorgu="Select * From uye where uye_ad ='"+adi+"' and uye_soyad = '"+soyadi+"'"; 
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("uye_id");
            String ad=rs.getString("uye_ad");
            String soyad=rs.getString("uye_soyad");
            java.util.Date dogumDate=rs.getDate("dogum_tarihi");
            String cinsiyet=rs.getString("cinsiyet");
            String telefon=rs.getString("telefon");
            String email=rs.getString("email");
            String adres=rs.getString("adres");
            
            cikti.add(new Uyeler(id, ad, soyad, dogumDate, cinsiyet, telefon, email, adres));
            }
     if(cikti.isEmpty())
     {
     String  mesaj="Aradığınız üye bulunmamaktadır . ";
        JOptionPane.showMessageDialog(null,mesaj);
     }
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
}
