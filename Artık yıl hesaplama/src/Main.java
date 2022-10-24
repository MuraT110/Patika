import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        boolean status = true;
        Scanner inp = new Scanner(System.in);

        System.out.print("YIL GİRİNİZ:");
        int yıl = inp.nextInt();


        if (yıl%4==0) {
            if (yıl%100==0&&yıl%400!=0) {
                status=false;
            } else {
                status=true;
            }
        } else {
            status=false;
        }
        if (status==true) {
            System.out.println("GİRDİĞİNİZ SAYI ARTIK SAYIDIR:");
        } else {
            System.out.println("GİRDİĞİNİZ SAYI ARTIK SAYI DEĞİLDİR:");
        }
    }
}