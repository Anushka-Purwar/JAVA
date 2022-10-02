import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp1 = 0;
        int temp2=1;
        System.out.print(temp1+" "+temp2+" ");
        for(int i=2;i<=n;i++){
            int rel=temp2;
            temp2=temp1+temp2;
            temp1=rel;
            System.out.print(temp2+" ");
        }
    }
}
