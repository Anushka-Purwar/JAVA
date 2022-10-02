import java.util.Scanner;

public class SpiralOrderMatrix {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int arr[][]=new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int row_start=0;
        int row_end=rows-1;
        int col_start=0;
        int col_end=cols-1;

        while(row_start<=row_end && col_start<=col_end){
            for(cols=col_start;cols<=col_end;cols++){
                System.out.print(arr[row_start][cols]+" ");
            }
            row_start++;

            for(rows=row_start;rows<=row_end;rows++){
                System.out.print(arr[rows][col_end]+" ");
            }
            col_end--;

            for(cols=col_end;cols>=col_start;cols--){
                System.out.print(arr[row_end][cols]+" ");
            }
            row_end--;

            for(rows=row_end;rows>=row_start;rows--){
                System.out.print(arr[rows][col_start]+" ");
            }
            col_start++;
            System.out.println();

        }

    }
}
