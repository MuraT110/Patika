import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("BİR SAYIYA GİRİNİZ:");
        int number=inp.nextInt();
        asal(number,2);
    }
    static void asal(int number,int i){
        if (i==number){
            System.out.println(number+"-Asal sayıdır:");
            return;
        } else if (number%i==0) {
            System.out.println(number+"-Asal sayı değildir:");
            return;
        }
        asal(number,i+1);
    }

}
