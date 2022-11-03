public class Main {
    public static void main(String[] args) {
        Fighter yabanciTakim=new Fighter("YABANCI TAKIM",50,60,80,90);
        Fighter bizimTakim=new Fighter("BİZİM TAKIM",50,60,80,120);
        Ring r=new Ring(yabanciTakim,bizimTakim,60,90);
        r.Run();


    }
}