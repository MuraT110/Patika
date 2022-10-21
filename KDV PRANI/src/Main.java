import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

double tutar,kdvOran=0.18;

Scanner inport=new Scanner(System.in);
        System.out.println("Ücret Tutarına Giriniz: ");
        tutar=inport.nextDouble();
double kdvTutar=tutar*kdvOran;
double KdvliTutar=tutar+kdvTutar;
        Boolean kosul=tutar>1000;
        double kosul2=tutar*0.8;
        System.out.println("KDV'SİZ TUTAR:"+tutar);
        System.out.println("KDV TUTARI:"+kdvTutar);
        System.out.println("KDV ORANI:"+kdvOran);
        System.out.println("KDV'li TUTAR:"+KdvliTutar);
        System.out.println("1000 tl üstü kdv tutarı:"+kosul2);






    }







}