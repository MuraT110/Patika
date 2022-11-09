public class Calisan {
    private String adSoyad;
    private String telefon;
    private String ePosta;

    public Calisan(String adSoyad,String telefon,String ePosta){
        this.adSoyad=adSoyad;
        this.telefon=telefon;
        this.ePosta=ePosta;
    }
    public String getadSoyad(){
        return adSoyad;
    }
    public void setAdSoyad(String adSoyad){
        this.adSoyad=adSoyad;
    }

    public String getTelefon(){
        return telefon;
    }
    public void setTelefon(String telefon){
        this.telefon=telefon;
    }

    public String getePosta(){
        return ePosta;
    }
    public void setePosta(String ePosta){
        this.ePosta=ePosta;
    }


    public void giris(){
        System.out.println(this.adSoyad + " ÜNİVERSİTEYE GİRİŞ YAPTI : ");
    }

    public void cikis(){
        System.out.println(this.adSoyad + " ÜNİVERSİTEDEN ÇIKIŞ YAPILDI : ");
    }

    public void yemekHane(){
        System.out.println(this.adSoyad + " YEMEKHANEYE GİRİŞ YAPILDI : ");
    }

    public static void loginUsers(Calisan[] loginUser) {
        for (Calisan c : loginUser) {
            c.giris();
        }
    }
}


