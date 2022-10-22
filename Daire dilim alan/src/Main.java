import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r,m;
        double pi=3.14,dilAlani;
        Scanner inp=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz:");
        r= inp.nextInt();
        System.out.print("Daire dilim alanı giriniz:");
        dilAlani=inp.nextDouble();
        System.out.print("Merkes açısının ölçüsü:");
        m= inp.nextInt();
        double daireDilim=(pi*(r*r)*m)/360;
        System.out.print("Daire dilim alanı:"+daireDilim);
    }
}