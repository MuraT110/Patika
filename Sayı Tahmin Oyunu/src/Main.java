import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand=new Random();
        int number=rand.nextInt(100);

        Scanner inp=new Scanner(System.in);
        int ring=0;
        int selec;
        int[] wrong=new int[5];
        boolean iswin=false;
        boolean iswrong=false;

        System.out.println(number);

        while (ring<5){
            System.out.print("LÜTFEN TAHMİNİNİZİ GİRİNİZ:");
            selec=inp.nextInt();

            if (selec<0||selec>99){
                System.out.println("LÜTFEN 0-100 ARASINDA BİR SAYIYA GİRİNİZ:");
                if (iswrong){
                    ring++;
                    System.out.println("ÇOK FAZLA HATALI GİRİŞ YAPTINIZ.KALAN HAK:" + (5-ring) );
                }else {
                    iswrong=true;
                    System.out.println("BİR DAHA HATALI GİRİŞİNİZDE HAKKINIZDAN DÜŞÜCEKTİR");
                }
                continue;
            }
            if (selec==number){
                System.out.println("TEBRİKLER DOĞRU TAHMİN! TAHMİN ETİĞİNİZ SAYI " + number);
                iswin=true;
                break;
            }else{
                System.out.println("HATALI BİR SAYI GİRDİNİZ!");
                if (selec>number){
                    System.out.println(+selec +  " SEÇTİĞİN SAYI GİZLİ SAYIDAN BÜYÜKTÜR!");
                }else {
                    System.out.println(+selec +  " SEÇTİĞİN SAYI GİZLİ SAYIDAN KÜÇÜKTÜR!");
                }
                wrong[ring++]=selec;
                System.out.println("KALAN HAK: " + (5-ring));
            }
        }
        if (!iswin){
            System.out.println("KAYBETİNİZ!");
            if (!iswrong){
                System.out.println("TAHMİNLERİNİZ: " + Arrays.toString(wrong));
            }
        }
    }
}