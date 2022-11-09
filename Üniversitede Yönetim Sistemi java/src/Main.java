public class Main {
    public static void main(String[] args) {

        OgretimGorevlisi og1 = new OgretimGorevlisi("Murat", "123","murat@gmail.com","Coğrafya","Prof","145");
        Asistan a1 = new Asistan("Neslihan", "45","ne@gmail.com","Finans","Docent","09.00-17.00");
        LabAsistan l1 = new LabAsistan("Kemal", "14","Kemal@gmail.com","Kimya","Arastirma Gorevlisi","10.00-18.00");
        BilgiIslem b1 = new BilgiIslem("Alattin", "78","AL@gmail.com","veri Bilimci","07.00-18.00","network kurulum");
        GuvenlikGorevli g1 = new GuvenlikGorevli("Zana", "2","Zana@gmail.com","Guvenlik","07.00-18.00","Guvenlik Belgesi");
        Akademisyen ak1 = new Akademisyen("Arda", "21","Arda@gmail.com","yar.Doç","08.00-18.00");
        Calisan ak2 = new Akademisyen("Bilal", "45","Bilal@gmail.com","İstatistik","Prof");

        Calisan[] loginUsers = { og1,a1,l1,b1,g1,ak1,ak2};
        Calisan.loginUsers(loginUsers);

    }
}