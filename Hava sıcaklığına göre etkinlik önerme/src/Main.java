import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int heat;

        Scanner inp=new Scanner(System.in);
        System.out.print("SICAKLIK GİRİNİZ:");
        heat=inp.nextInt();

        if (heat<=5){
            System.out.println("KAYAK YAPABİLİRSİN:");
            
        } else if (heat>5 && heat<=15) {
            System.out.println("SİNEMAYA GİDEBİLİRSİN:");
            
        } else if (heat>15 && heat<=25) {
            System.out.println("PİKNİK YAPABİLİRSİN:");

        }else if (heat>25 && heat<=45){
            System.out.println("YÜZMEYE GİDEBİLİN:");

        } else if (heat>45) {
            System.out.println("EVDEN ÇIKMAYINIZ:");

        }


    }
}