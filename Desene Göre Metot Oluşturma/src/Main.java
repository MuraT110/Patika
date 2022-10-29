import java.util.Scanner;

public class Main {
    static int negative(int x){
        if(x<=0){
            return x;
        }else {
            System.out.print(x+" ");
            return (negative(x-5));
        }
    }
    static int pozitive(int x,int y){
        if(x>y){
            return x;
        }else {
            System.out.print(x+" ");
            return pozitive(x+5,y);
        }
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        while (true){
            System.out.print("SAYIYA GİRİNİZ:");
            int sayi= inp.nextInt();
            pozitive(negative(sayi),sayi);
            if (sayi==0){
                break;
            }
            System.out.println("\nÇIKMAK İÇİN 0 BASINIZ:");
        }
    }
}