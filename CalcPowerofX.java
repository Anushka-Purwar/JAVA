public class CalcPowerOfX {
    public static int powerOf(int x,int n){
        if(n==0) return 1;
        else if (x==0) return 0;
        int temp=x*powerOf(x,n-1);
        return temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(powerOf(x,n));

    }
}
