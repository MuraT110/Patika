import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int fizik,kimya,matematik,turkce,muzik;

        Scanner inp=new Scanner(System.in);

        System.out.print("FİZİK NOTUNUZU GİRİNİZ:");
        fizik=inp.nextInt();

        System.out.print("KİMYA NOTUNUZU GİRİNİZ:");
        kimya=inp.nextInt();

        System.out.print("MATEMATİK NOTUNUZU GİRİNİZ:");
        matematik=inp.nextInt();

        System.out.print("TÜRKÇE NOTUNUZU GİRİNİZ:");
        turkce=inp.nextInt();

        System.out.print("MÜZİK NOTUNUZU GİRİNİZ:");
        muzik=inp.nextInt();

        double avarage =(fizik+kimya+matematik+turkce+muzik)/5;
        if(avarage<=50) {
            System.out.println("SINIFTA KALDINIZ SENEYE GÖRÜŞMEK ÜZERE:");
        } else if (avarage<0||avarage>100) {
            System.out.println("LÜTFEN DERS DEĞERİNİ 0 İLE 100 ARASINDA GİRİNİZ:");
        }else {
            System.out.println("SINIFTA KALDINIZ:");
        }
        System.out.println("ORTALAMA:"+avarage);
    }
}
    