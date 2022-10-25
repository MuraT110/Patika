import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int adet=0,toplam=0;


        Scanner inp=new Scanner(System.in);
        System.out.print("BİR SAYIYA GİRİNİZ:");
        number=inp.nextInt();

        while (number!=0)
        {
            toplam+=number%10;
            number/=10;

            ++adet;

        }
        System.out.println("BASAMAK SAYOSI :"+adet);
        System.out.println("BASAMAK TOPLAMI:"+toplam);





    }
}