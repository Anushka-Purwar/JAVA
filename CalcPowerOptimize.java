 public static int recupower(int x,int n){

        if(n==0) return 1;
        else if (x==0) return 0;
        //for even
        if(n%2==0)
        return recupower(x,n/2)*recupower(x,n/2);
        //odd
        else return recupower(x,n/2)*recupower(x,n/2)*x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n= sc.nextInt();
        System.out.println(recupower(x,n));

    }

}
