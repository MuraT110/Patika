import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Double armutKilo=2.14,elmaKilo=3.67,domatesKilo=1.11,muzKilo=0.95,patlicanKilo=5.00;
        double armutMiktar,elmaMiktari,domatesMiktar,muzMiktar,patlicanMiktar;
        Scanner inp=new Scanner(System.in);
        System.out.print("ARMUT MİKTARINA GİRİNİZ KG:");
        armutMiktar=inp.nextDouble();
        System.out.print("ELMA MİKTARINA GİRİNİZ KG:");
        elmaMiktari=inp.nextDouble();
        System.out.print("DOMATES MİKTARINA GİRİNİZ KG:");
        domatesMiktar=inp.nextDouble();
        System.out.print("MUZ MİKTARINA GİRİNİZ KG:");
        muzMiktar=inp.nextDouble();
        System.out.print("PATLICAN MİKTARINA GİRİNİZ KG:");
        patlicanMiktar=inp.nextDouble();
        double toplamTutar=(armutKilo*armutMiktar)+(elmaKilo+elmaMiktari)+
                (domatesKilo+domatesMiktar)+(muzKilo+muzMiktar)+(patlicanKilo+patlicanMiktar);
        System.out.print("TOPLAM TUTAR:"+toplamTutar);

    }
}