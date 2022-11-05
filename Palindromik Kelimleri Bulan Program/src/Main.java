import java.util.Scanner;

public class Main {

    static boolean ispaolindrome (String str){
        int i=0,j=str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
                i++;
                j--;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        String input;

        System.out.print("BİR KELİME GİRİNİZ:");
        input=inp.next();

        if (ispaolindrome(input)){
            System.out.println("\nPOLİNDROMİK KELİME! ");
        }else {
            System.out.println("\nPOLİNDROMİK KELİME DEĞİLDİR! ");
        }


    }
}