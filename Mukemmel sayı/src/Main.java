import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int toplam=0,sayı;

       Scanner inp=new Scanner(System.in);
        System.out.print("SAYIYA GİRİNİZ;");
        sayı=inp.nextInt();

        int i=1;
        while (i<sayı){
            if (sayı%i==0){
                toplam+=i;

            }
            i++;
        }
    if (toplam==sayı){
        System.out.println("MÜKEMMEL SAYI:"+toplam);

    }else {
        System.out.println("MÜKEMMEL SAYI DEĞİLDİR:"+sayı);
    }

    }
}