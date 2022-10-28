import java.util.Scanner;

public class Main {

    static int sun(int a,int b){
     int result=a+b;
     return result;
    }
    static int minius(int a, int b){
        int result=a-b;
        return result;
    }
    static int times(int a,int b){
        int result=a*b;
        return result;
    }
    static int divivded(int a,int b){
        if (b==0)
            return 0;
        int result=a/b;
        return result;
    }
    static int power(int a,int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int mod(int a,int b){
        return a%b;
    }
    static void calc(int a, int b){
        System.out.println("ÇEVRESİ:"+(2*(a+b)));
        System.out.println("ALANI:"+(a*b));
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;
        String menu="1-toplama işmei:\n" +
                "2-çıkarma işlemi:\n" +
                "3-çarpma işlemi:\n" +
                "4-bölme işemi:\n" +
                "5-üslü sayı hesaplama:\n" +
                "6-mod alma işlemi:\n" +
                "7-dikdörtgen alan hesaplama ve çevre hesaplama:\n" +
                "8-çıkış yapma:";
        System.out.println(menu);
    while (true){
        System.out.print("BİR İŞLEM SEÇİNİZ:");
        select=inp.nextInt();
        if(select==0)
            break;
        System.out.print("İLK SAYIYA GİRİNİZ:");
        int a=inp.nextInt();
        System.out.print("İKİNCİ SAYIYA GİRİNİZ:");
        int b=inp.nextInt();

        switch (select){
            case 1:
                System.out.println("TOPLAMA:"+sun(a,b));
                break;
            case 2:
                System.out.println("ÇIKARMA:"+minius(a,b));
                break;
            case 3:
                System.out.println("ÇAROMA:"+times(a,b));
                break;
            case 4:
                System.out.println("BÖLME:"+divivded(a,b));
                break;
            case 5:
                System.out.println("ÜSLÜ SAYI HESABI:"+power(a,b));
                break;
            case 6:
                System.out.println("MOD ALMA:"+mod(a,b));
                break;
            case 7:
               calc(a,b);
                break;
            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ:");

        }
    }
        System.out.println("İYİ GÜNLER:");
    }
}