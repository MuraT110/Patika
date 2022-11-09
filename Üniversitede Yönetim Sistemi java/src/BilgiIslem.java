public class BilgiIslem extends Memur{

    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String ePosta, String departman, String mesai,String gorev) {
        super(adSoyad, telefon, ePosta, departman, mesai);
        this.gorev=gorev;
    }
    public String getGorev(){
        return gorev;
    }
    public void setGorev(String gorev){
        this.gorev=gorev;
    }

    public void netKurulum(){
        System.out.println(this.getadSoyad() + "NET KURULUMUNU BAŞLATTI : ");
    }
}
