import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int month,day;

        Scanner inp=new Scanner(System.in);
        System.out.print("DOĞDUĞUNUZ AY:");
        month=inp.nextInt();

        System.out.print("DOĞDUĞUNUZ  GÜN:");
        day=inp.nextInt();

        if((month<=12)&&(month>=1)){
            if((day<=31) && (day>=1)) {

                if (month == 1) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 22) {
                            System.out.println("OĞLAK BURCU:");
                        } else {
                            System.out.println("KOVA BURCU:");
                        }
                    }

                }
                if (month == 2) {
                    if ((day >= 1) && (day <= 28)) {
                        if (day < 20) {
                            System.out.println("OĞLAK BURCU:");
                        } else {
                            System.out.println("BALIK BURCU:");
                        }
                    }

                }

                if (month == 3) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 21) {
                            System.out.println("BALIK BURCU:");
                        } else {
                            System.out.println("KOÇ BURCU:");
                        }
                    }

                }

                if (month == 4) {
                    if ((day >= 1) && (day <= 30)) {
                        if (day < 21) {
                            System.out.println("KOÇ BURCU:");
                        } else {
                            System.out.println("BOĞA BURCU:");
                        }
                    }

                }
                if (month == 5) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 22) {
                            System.out.println("BOĞA BURCU:");
                        } else {
                            System.out.println("İKİZLER BURCU:");
                        }
                    }

                }
                if (month == 6) {
                    if ((day >= 1) && (day <= 30)) {
                        if (day < 23) {
                            System.out.println("İKİZLER BURCU:");
                        } else {
                            System.out.println("YENGEÇ BURCU:");
                        }
                    }

                }
                if (month == 7) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 23) {
                            System.out.println("YENGEÇ BURCU:");
                        } else {
                            System.out.println("ASLAN BURCU:");
                        }
                    }

                }
                if (month == 8) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 23) {
                            System.out.println("ASLAN BURCU:");
                        } else {
                            System.out.println("BAŞAK BURCU:");
                        }
                    }

                }
                if (month == 9) {
                    if ((day >= 1) && (day <= 30)) {
                        if (day < 23) {
                            System.out.println("BAŞAK BURCU:");
                        } else {
                            System.out.println("TERAZİ BURCU:");
                        }
                    }

                }
                if (month == 10) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 23) {
                            System.out.println("TERAZİ BURCU:");
                        } else {
                            System.out.println("AKREP BURCU:");
                        }
                    }

                }
                if (month == 11) {
                    if ((day >= 1) && (day <= 30)) {
                        if (day < 22) {
                            System.out.println("AKREP BURCU:");
                        } else {
                            System.out.println("YAY BURCU:");
                        }
                    }

                }

                if (month == 12) {
                    if ((day >= 1) && (day <= 31)) {
                        if (day < 22) {
                            System.out.println("YAY BURCU:");
                        } else {
                            System.out.println("OĞLAK BURCU:");
                        }
                    }

                }
            }
        }else {
            System.out.println("HATALI GİRİŞ YAPTINIZ:");
        }
    }
}