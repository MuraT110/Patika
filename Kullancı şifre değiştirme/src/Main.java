import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password, UserName, newPassword, oldPassword = "MURAT123";
        Scanner input = new Scanner(System.in);

        System.out.print("KULLANICI ADINIZA GİRİNİZ:");
        UserName = input.nextLine();

        System.out.print("ŞİFRENİZE GİRİNİZ:");
        password = input.nextLine();

        if (UserName.equals("MURAT") && password.equals("MURAT123")) {
            ;
            System.out.println("GİRİŞ YAPILDI:");
        } else {
            System.out.println("BAŞARISIZ GİRİŞ:");
            System.out.println("ŞİFRE SIRIFLMAK İÇİN?:");
            System.out.println("1-EVET: \n2-HAYIR:");
            System.out.println("SEÇİNİZ:");
            int select = Integer.parseInt(input.nextLine());
            switch (select) {
                case 1:
                    System.out.println("YENİ ŞİFRENİZ ESKİ ŞİFREDEN FARKLI OLMALI!");
                    System.out.print("YENİ ŞİFRENİZE GİRİNİZ:");
                    newPassword = input.nextLine();
                    System.out.println("ŞİFRE BAŞARILIYLA DEĞİŞTİRİLDİ");
                    break;
                case  2:
                    System.out.println("TEŞŞEKÜR EDERİM");

                    break;
                default:
                    System.out.println("TEKRAR BEKLERİZ");


            }

        }

    }

}




