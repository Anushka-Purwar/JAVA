import java.util.Scanner;

public class towerOfHanoi {
    public static void towerOfHanoi(int n,String source, String helper, String destinatiom){
        if(n==1){ System.out.println("disc tranfered "+source+"to "+destinatiom);
        return;}
        towerOfHanoi(n-1,source,destinatiom,helper);
        System.out.println("transfer disc "+source+"to "+helper+"using "+destinatiom);
        towerOfHanoi(n-1,helper,source,destinatiom);
    }
    public static void main(String[] tower){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D");

    }
}
