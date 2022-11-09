public class LabAsistan extends Asistan{
    public LabAsistan(String adSoyad, String telefon, String ePosta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, ePosta, bolum, unvan, ofisSaati);
    }

    public void labGirdi(){
        System.out.println(this.getadSoyad() + "LABARATUVARA GİRDİ : ");
    }
}
