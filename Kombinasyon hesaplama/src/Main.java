import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,r,hesaplama;
        int facn=1,facr=1,facnr=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("LÜTFEN KOMBİNASYON ALINACAK SAYIYA GİRİNİZ:");
        n=inp.nextInt();
        System.out.print("LÜTFEN PERMÜYASYON ALINACAK SAYIYA GİRİNİZ:");
        r=inp.nextInt();

        for (int i=1;i<=n;i++){
            facn*=i;
        }for (int i=1;i<=r;i++){
            facr*=i;
        }for (int i=1;i<=(n-r);i++){
            facn*=i;
        }
        hesaplama=facn/(facr*facnr);
        System.out.println("KOMBİNASYON:"+hesaplama);


    }
}