import java.util.Scanner;

public class Converter {
    public static String decimalToBinary(int n) {
        int temp = 0;
        String h="";
        while (n!= 0) {
            temp = n % 2;
            n = n / 2;
            h=temp+h;
        }
        return h;
    }

    public static int binaryToDecimal(String s){
        int decimal=Integer.parseInt(s,2);
        return decimal;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=new String(sc.next());
        System.out.println(decimalToBinary(n));
        System.out.println(binaryToDecimal(s));
    }
}
