import java.util.Scanner;

public class Prime_num {
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        boolean isprime=true;
//         int n=sc.nextInt();
//
//         for(int i=2; i<=n/2; i++){
//             if(n%i==0){
//                 isprime=false;
//             }
//         }
//         if(isprime){
//             if(n==1) System.out.println("neither prime nor composite");
//             else System.out.println("prime number");
//         }
//         else System.out.println("not prime");
//
//    }
    public static boolean isPrime(int n){
        boolean prime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0) prime=false;
        }
        if(prime) return prime;
        else return prime;

//        return prime;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) System.out.println("neither prime nor composite");
        else if(isPrime(n)) System.out.println("prime");
        else System.out.println("not prime");

    }
}
