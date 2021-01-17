
package lıbrary_automatıon;
public class Uyeler {
    private int id;
    private String ad;
    private String soyad ;
    private java.util.Date dogum_tarihi;
    private String cinsiyet;
    private String telefon;
    private String email;
    private String adres;

    public Uyeler(int id, String ad, String soyad, java.util.Date dogum_tarihi, String cinsiyet, String telefon, String email, String adres) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.dogum_tarihi = dogum_tarihi;
        this.cinsiyet = cinsiyet;
        this.telefon = telefon;
        this.email = email;
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public java.util.Date getDogum_tarihi() {
        return dogum_tarihi;
    }

    public void setDogum_tarihi(java.util.Date dogum_tarihi) {
        this.dogum_tarihi = dogum_tarihi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
}
