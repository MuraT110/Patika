public class OgretimGorevlisi extends Akademisyen{
    private String kapino;

    public OgretimGorevlisi(String adSoyad, String telefon, String ePosta, String bolum, String unvan,String kapino) {
        super(adSoyad, telefon, ePosta, bolum, unvan);
        this.kapino=kapino;
    }

    public String getKapino(){
        return kapino;
    }
    public void setKapino(String kapino){
        this.kapino=kapino;
    }

    public void senetoToplantisi(){
        System.out.println(this.getadSoyad() + "SENETO TOPLANTISINA KATILDI : ");
    }
    public void sinavYap(){
        System.out.println(this.getadSoyad() + "SINAV BAŞLATTI : ");
    }
}
