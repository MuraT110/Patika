import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int yıl,kalan=0;

       Scanner inp=new Scanner(System.in);

        System.out.print("DOĞUM YILINIZA GİRİNİZ:");
        yıl=inp.nextInt();

        kalan=yıl%12;

        if (kalan==1){
            System.out.println("ÇİN ZODYAK YILINIZ MAYMUN:");

        } else if (kalan==2) {
            System.out.println("ÇİN ZODYAK YILINIZ HORUZ:");

        } else if (kalan==3) {
        System.out.println("ÇİN ZODYAK YILINIZ KÖPEK:");

        } else if (kalan==4) {
        System.out.println("ÇİN ZODYAK YILINIZ DOMUZ:");

        } else if (kalan==5) {
        System.out.println("ÇİN ZODYAK YILINIZ FARE:");

        }else if (kalan==6) {
            System.out.println("ÇİN ZODYAK YILINIZ ÖKÜZ:");

        }else if (kalan==7) {
            System.out.println("ÇİN ZODYAK YILINIZ KAPLAN:");

        }else if (kalan==8) {
            System.out.println("ÇİN ZODYAK YILINIZ TAVŞAN:");

        }else if (kalan==9) {
            System.out.println("ÇİN ZODYAK YILINIZ EJDERHA:");

        }else if (kalan==10) {
            System.out.println("ÇİN ZODYAK YILINIZ YILAN:");

        }else if (kalan==11) {
            System.out.println("ÇİN ZODYAK YILINIZ AT:");

        }else if (kalan==12) {
            System.out.println("ÇİN ZODYAK YILINIZ KOYUN:");

        }

    }
}