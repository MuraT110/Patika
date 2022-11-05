import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Matrisim satır sayısına giriniz:");
        int row=inp.nextInt();
        System.out.print("Matrisim sütun sayısına giriniz:");
        int col=inp.nextInt();

        int[][] matris=new int[row][col];
        int[][] transpoze=new int[col][row];

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.println( (i+1) + " . satır : " + (j+1) + " . sütun : ");
                matris[i][j]=inp.nextInt();
            }
        }
        System.out.println();

        System.out.println("Matris : ");
        System.out.println();

        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matris[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println();

        System.out.println("Transpoze : ");
        System.out.println();

        for (int i=0;i<col;i++){
            for (int j=0;j<row;j++){
                transpoze[i][j]=matris[j][i];
                System.out.print(transpoze[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}