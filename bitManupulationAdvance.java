import java.util.Scanner;

public class powerOf2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /* if we AND n with n-1 then we will get all 0 because n-1 will have all one expect for the
        * position of n which contains one
        * eg- 8-1000 and 7-0111   */
        if((n & n-1) ==0) System.out.println("yes,in the power of two");
        else System.out.println("not in the power of 2");
      
      
      int n=sc.nextInt();
        int pos=sc.nextInt();
        int bitMask=1<<pos;
        if((bitMask & n)==0){
            int setBit=bitMask|n;
            System.out.println(setBit);
        }
        else{
            int negatebitMask=~(bitMask);
            int clrBit=negatebitMask & n;
            System.out.println(clrBit);
        }
      
      
      int n=sc.nextInt();
        int count=0;
        for(int i=0;i<=n;i++){
            int bitMask=1<<i;
            int newNumber=n&bitMask;
            if(newNumber!=0) count++;

        }
        System.out.println(count);
        
    }
}
