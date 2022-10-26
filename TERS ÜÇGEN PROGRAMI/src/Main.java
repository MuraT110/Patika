import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayı;


        Scanner inp=new Scanner(System.in);
        System.out.print("BASAMAK SAYISINA GİRİNİZ:");
        sayı= inp.nextInt();

        for (int i=sayı;i>0;i--){
            for (int k=sayı-i;k>0;k--){
                System.out.print(" ");
            }
        for (int j=(2*i)-1;j>0;j--){
            System.out.print("*");
        }

            System.out.println(" ");

        }
    }
}