import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int girilen,temp=0;

        Scanner inp=new Scanner(System.in);
        System.out.print("SIRALAMAK İSTEDİĞİNİZ DİZİ BOYUTUNA GİRİNİZ:");
        girilen=inp.nextInt();
        if (girilen>0){
            int[] arr=new int[girilen];
            for (int i=0;i<girilen;i++){
                System.out.printf("DİZİ ELEMANINLARINA GİRİNİZ:",i+1);
                arr[i]=inp.nextInt();
            }
            System.out.println("SIRALANMAMIŞ DİZİ: " + Arrays.toString(arr));
            for (int i=0;i<girilen;i++){
                for (int j=i+1;j<girilen;j++){
                    if (arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;

                    }
                }
            }
            System.out.println("SIRALANMIŞ DİZİ: "+Arrays.toString(arr));
            return;
        }else {
            System.out.print("HATALI GİRİŞ");
            System.exit(0);
        }




    }


}