import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       double kilo,boy;
       Scanner inp=new Scanner(System.in);
        System.out.print("BOYUNUZU GİRİNİZ:");
        boy=inp.nextDouble();
        System.out.print("KİLONUZU GİRİNİZ");
        kilo= inp.nextDouble();
        double vki=kilo/(boy*boy);
        System.out.print("VÜCUT KİTLE İNDEKSİ:"+vki);
    }
}