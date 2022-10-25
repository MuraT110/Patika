import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;

        Scanner inp=new Scanner(System.in);
        System.out.print("BİR SAYIYA GİRİNİZ:");
        number=inp.nextInt();

        for (int i=1;i<number;i*=4){
            System.out.println("DÖRTÜN KUVETİ OLAN SAYLAR:"+i);
        }
        System.out.println("++++++++++");

        for (int j=1;j<number;j*=5){
            System.out.println("BEŞİN KUVVETİ OLAN SAYILAR:"+j);
        }



    }
}