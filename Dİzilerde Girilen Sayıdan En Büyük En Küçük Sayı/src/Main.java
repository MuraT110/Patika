import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list={14,35,7,-74,-4,65,17};
        int number;

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayıya giriniz:");
        number=inp.nextInt();
        Arrays.sort(list);
        for (int i:list){
            if (i>number){
                int index=Arrays.binarySearch(list,i);
                System.out.println("Girilen sayıdan küçük en yakın sayı : " +list[index-1]);
                System.out.println("girilen sayıdan büyük en yakın sayı:" + i);
                break;
            }
        }
    }
}