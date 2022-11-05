import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list={10,10,20,60,60,80,40,10,30,50,10,20,80,10,30};
        int count=0;
        Arrays.sort(list);

        for (int i=0;i<list.length;i++){
            count=0;
            for (int j=0;j<list.length;j++){
                if (list[i]==list[j]){
                    count++;
                }
            }
            if (i==0&&list[i+1]==list[i]){
                System.out.println(String.format("%d'dan %d tane var.", list[i], count));
            }
            if (i==0&&list[i+1]!=list[i]){
                System.out.println(String.format("%d'dan %d tane var.", list[i], count));
            }
            if (i!=0&&list[i-1]!=list[i]){
                System.out.println(String.format("%d'dan %d tane var.", list[i], count));
            }
        }


    }
}