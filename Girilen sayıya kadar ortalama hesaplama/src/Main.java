import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayı,toplam=0,adet=0;
        double ort;

        Scanner inp=new Scanner(System.in);

        System.out.print("LÜTFEN SAYI GİRİNİZ:");
        sayı=inp.nextInt();

        for (int i=0;i<=sayı;i++){
            if (i%12==0){
                toplam+=i;
                adet=sayı/12;
                ort=toplam/adet;
                System.out.println(ort);
            }
        }



    }
}