import java.util.Scanner;

public class Main {
    static int ustalma(int a,int b){
        if (a==0){
            return 1;
        }
        int result=(int) Math.pow(a,b);
        return result;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("TABAN DEĞERİNE GİRİNİZ:");
        int a= inp.nextInt();
        System.out.print("ÜT DEĞERİNE GİRİNİZ:");
        int b= inp.nextInt();
        System.out.println("SONUÇ:"+ustalma(a,b));



    }
}