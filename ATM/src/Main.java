import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String userName,password;
        int ring=3,seleck,vSeleck=0;
        int balencel=1500;

        do {
            System.out.print("LÜTFEN KULLANICI ADINIZA GİRİNİZ:");

            userName = inp.nextLine();
            System.out.print("LÜRFEN ŞİFRENİZE GİRİNİZ:");
            password = inp.nextLine();

            if (userName.equals("murat") && password.equals("murat123")) {
                System.out.println("KODLUYORUZ BANKASINA HOŞ GELDİNİZ:");

                do {
                    System.out.print("1-PARA YATIRMA:\n2-PARA ÇEKME:\n3-BAKİYE SORGULAMA:\n4-ÇIKIŞ YAPMA:\n" +
                            "YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ:");
                    seleck = inp.nextInt();

                    switch (seleck) {
                        case 1:
                            System.out.print("YATIRMAK İSTEDİĞİNİZ TUTAR:");
                            int price = inp.nextInt();
                            balencel += price;
                            System.out.println("BAKİYENİZ"+balencel);
                            break;
                        case 2:
                            System.out.println("ÇEKMEK İSTEDİĞİNİZ TUTARI YAZINIZ:");
                            price = inp.nextInt();
                            if (price > balencel) {
                                System.out.println("YETERSİZ BAKİYE:");
                                break;
                            } else {
                                balencel -= price;
                                System.out.println("BAKİYENİZ:" + balencel);
                            }
                        case 3:
                            System.out.println("MEVCUT BAKİYENİZ:" + balencel);
                            break;
                        case 4:
                            System.out.println("İYİ GÜNLER YİNE BEKLERİZ:");
                            vSeleck++;
                            break;
                        default:
                            System.out.println("HATALI TUŞA BASTINIZ:");

                    }

                } while (seleck != 4);

            } else {
                ring--;
                System.out.println("HATALI GİRİŞ YAPTINIZ:");
                System.out.println("KALAN HAKKINIZ:" + ring);
                if (ring == 0) {
                    System.out.println("KATINIZ BLOKE OLDU LÜTFEN BANKA İLE İLETİŞİME GEÇİNİZ:");
                }
            }
        }while (ring>0&&vSeleck!=1);



    }
}