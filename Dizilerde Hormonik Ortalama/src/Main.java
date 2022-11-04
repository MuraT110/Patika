public class Main {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5,6,7,8,9,10};
        double hormonic;
        float sum=0;

        for (int j:array){
            sum+=1.0/j;

        }
        hormonic=array.length/sum;
        System.out.println("HORMONİK ORTALAMA : " + hormonic);

    }
}