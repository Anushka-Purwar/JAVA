import java.util.Scanner;

public class reverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringBuilder sb= new StringBuilder(sc.nextLine());
//        sb.append(sc.nextLine());

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char front_char=sb.charAt(front);
            char back_char=sb.charAt(back);

            sb.setCharAt(front,back_char);
            sb.setCharAt(back,front_char);
        }
        System.out.println(sb);


    }
}
