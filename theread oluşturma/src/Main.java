public class Main {
    public static void main(String[] args) {

        kronometreTheread thread1=new kronometreTheread("thrname1");
        kronometreTheread thread2=new kronometreTheread("thrname2");
        kronometreTheread thread3=new kronometreTheread("thrname3");

        thread1.start();
        thread2.start();
        thread3.start();


    }
}