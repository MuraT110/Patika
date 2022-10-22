import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        int u;
        int alan;
        Scanner girdi=new Scanner(System.in);
        System.out.print("A KENARINA GİRİNİZ:");
        a=girdi.nextInt();
        System.out.print("B KENARINA GİRİNİZ:");
        b=girdi.nextInt();
        System.out.print("C KENARINA GİRİNİZ:");
        c=girdi.nextInt();
        u=(a+b+c)/2;
        alan=(int) Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("ÜÇGENİN ALANI:"+alan);







    }
}