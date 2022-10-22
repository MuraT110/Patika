import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1,n2,select;

        Scanner input=new Scanner(System.in);
        System.out.print("İLK SAYIYA GİRİNİZ:");
        n1=input.nextInt();
        System.out.print("İKİNCİ SAYIYA GİRİNİZ:");
        n2=input.nextInt();

        System.out.println("1-TOPLAMA:\n2-ÇIKARMA:\n3-ÇARPMA:\n4-BÖLME:");
        System.out.print("SEÇİNİZ:");
        select=input.nextInt();

        switch (select){
            case 1:
                 System.out.println("TOPLAM:"+(n1+n2));
            break;

            case 2:
                 System.out.println("ÇIKARMA" + (n1 - n2));
            break;

            case 3:
                 System.out.println("ÇARPMA:"+(n1*n2));
            break;
            case 4:
                 if (n2!=0){
                 System.out.println("BÖLME:"+(n1/n2));
                 }else{
                     System.out.println("BİR SAYI 0'BÖLÜNEMEZ!");
                 }
            break;
            default:
                System.out.println("YANLIŞ SAYI GİRDİNİZ:");

        }



    }
}