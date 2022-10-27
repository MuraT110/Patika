public class Main {
    public static void main(String[] args) {

        int total=0,result=0,veriable=1;
        for (int i=0;i<10;i++){
            System.out.print(result+" ");
            total=total+veriable;
            veriable=total-veriable;
            result=total;
        }



    }
}