import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("N SAYISINA GİRİNİZ:");
        int n=inp.nextInt();
        double rasult=0;
        for (double i=1;i<=n;i++){

            rasult+=1/i;
        }
        System.out.println(rasult);



    }
}