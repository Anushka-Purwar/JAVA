import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //get number from user
        int n=sc.nextInt();
        //get position from user
        int pos= sc.nextInt();

        //get bit
        int bitMask=1<<pos;
        if((bitMask & n)==0) System.out.println("bit is zero");
        else System.out.println("bit is one");


        //set bit
        int newNumber=bitMask | n;
        System.out.println(newNumber);

        //clear bit

        int negationOfBitMask= ~(bitMask);
        int finalNumber=negationOfBitMask & n;
        System.out.println(finalNumber);

        //update bit
        //to update 1 to 0

        int update1to0=negationOfBitMask & n;
        System.out.println(update1to0);

        //to update 0 to 1

        int update0to1=bitMask|n;
        System.out.println(update0to1);

    }
}
