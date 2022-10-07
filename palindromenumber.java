import java.util.Scanner;

public class palindromeNumber {

    public static boolean isPalindrome(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            sum= (sum*10) +r;
            n=n/10;
        }
        if(sum==temp) return true;
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isPalindrome(n));

    }
}
