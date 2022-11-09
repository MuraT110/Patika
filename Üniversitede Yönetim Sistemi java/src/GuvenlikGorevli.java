public class GuvenlikGorevli extends Memur {
    private String belge;

    public GuvenlikGorevli(String adSoyad, String telefon, String ePosta, String departman, String mesai,String belge) {
        super(adSoyad, telefon, ePosta, departman, mesai);
        this.belge=belge;
    }

    public String getBelge(){
        return belge;
    }
    public void setBelge(String belge){
        this.belge=belge;
    }

    public void nobet(){
        System.out.println(this.getadSoyad() + " NÖBETE BAŞLADI : ");
    }


}
