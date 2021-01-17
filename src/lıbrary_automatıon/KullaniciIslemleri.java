
package lıbrary_automatıon;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;
import javax.swing.JOptionPane;
import static lıbrary_automatıon.VeriTabani.con;
import static lıbrary_automatıon.VeriTabani.preparedStatement;
import static lıbrary_automatıon.VeriTabani.statement;

public class KullaniciIslemleri extends AGetirVeSil<Kullanicilar> implements Iarama<Kullanicilar> {

    
    
    public boolean kullaniciGiris(String kullanici_ad,String kullanici_sifre){
        
             String sorgu="SELECT * From kullanici where kullanici_adi = ? and sifre = ?";
        try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullanici_ad);
            preparedStatement.setString(2, kullanici_sifre);
            ResultSet rs= preparedStatement.executeQuery();
            return rs.next();
                
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        }
      public ArrayList<Kullanicilar> getir(){
     ArrayList<Kullanicilar> cikti=new ArrayList<Kullanicilar>();
        try {
            statement=con.createStatement();
             String sorgu="Select * From kullanici";
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("kullanic_id");
            String kullaniciAd=rs.getString("kullanici_adi");
            String kullaniciSifre=rs.getString("sifre");
            cikti.add(new Kullanicilar(id, kullaniciAd, kullaniciSifre));
            }
     
     return cikti;
     
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
  public void kullaniciEkleme(String ad, String sifre){
       String sorgu="Insert Into kullanici (kullanici_adi,sifre) VALUES (?,?)"; 
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, sifre);
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
  
  public void kullaniciGuncelle(int id,String ad, String sifre){
        
       String sorgu="Update kullanici set kullanici_adi = ? , sifre= ? where kullanic_id = ?";
       try {
            preparedStatement=con.prepareStatement(sorgu);
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, sifre);
            preparedStatement.setInt(3, id);
            
          preparedStatement.executeUpdate();
              
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
  
    public void sil(int id) {
       String sorgu="Delete from kullanici where kullanic_id = ? ";
   
        try {
            preparedStatement=con.prepareCall(sorgu);
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Kullanicilar> arama(String adi){
     ArrayList<Kullanicilar> cikti=new ArrayList<Kullanicilar>();
        try {
            statement=con.createStatement();
             String sorgu="Select * From kullanici where kullanici_adi ='"+adi+"'"; 
            ResultSet rs=statement.executeQuery(sorgu);
     
            while(rs.next()){
            int id=rs.getInt("kullanic_id");
            String ad=rs.getString("kullanici_adi");
            String sifre=rs.getString("sifre");
            cikti.add(new Kullanicilar(id, ad, sifre));
            }
      if(cikti.isEmpty())
     {
         String  mesaj="Aradığınız kullanıcı bulunmamaktadır . ";
        JOptionPane.showMessageDialog(null,mesaj);
     }
     return cikti;

        } catch (SQLException ex) {
             Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
     }
    
}

