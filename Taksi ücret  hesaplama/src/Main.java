import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm=2.20,total,starPrice=10;
        Scanner inpurt=new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz:");
        km=inpurt.nextInt();
        total=km*perKm;
        total+=starPrice;
       total=(total<20) ? 20:total;
        System.out.print("Toplam TUTAR:"+total);

    }
}