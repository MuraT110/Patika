import java.util.Scanner;

public class ORTALAMA {
    public static void main(String[] args) {
        int mat,fizik,kimya,turlce,tarih,muzik;
        Scanner inp=new Scanner(System.in);
        System.out.println("Matematik Notunuz:");
        mat=inp.nextInt();

        System.out.println("Fizik Notunuz:");
        fizik=inp.nextInt();

        System.out.println("kimya Notunuz:");
        kimya=inp.nextInt();

        System.out.println("Türkçe Notunuz:");
        turlce=inp.nextInt();

        System.out.println("Tarih Notunuz:");
        tarih=inp.nextInt();

        System.out.println("Müzik Notunuz:");
        muzik=inp.nextInt();
        int topla=(mat+fizik+kimya+turlce+tarih+muzik);
        double sonuc= topla / 6;
        System.out.println("Ortalamanız:"+sonuc);
           boolean kosul=topla/6>60;
        String Str =kosul ? "Sınıfı geçti:":"Sınıfta kaldı:";
        System.out.println(Str);
    }

}
