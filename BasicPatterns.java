public class Basic_patterns {
    public static void main(String[] args) {
        //print a solid rectangle row=4 and column=5
        for(int i=1;i<5;i++){
            for(int j=1;j<6;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        //print hollow rectangle
        //ya toh i ki value 1 hogi yani top wali row
        //ya toh i ki value 4 hogi yani last wali row
        //ya toh j ki value 1 hogi ya j ki value 5 hogi

        for(int i=1;i<5;i++){
            for(int j=1; j<6;j++){
                if(i==1 || j==1 || i==4 || j==5) System.out.print("* ");//yhn pe 2 caharcter the space h
                else System.out.print("  ");// toh yhn bhi 2 ka space hoga
            }
            System.out.println();
        }
        System.out.println();
        //to print half pyramid
        //logic - i=j
        for(int i=0;i<4;i++){
            for(int j=0; j<=i; j++) System.out.print("* ");
            System.out.println();
        }
        System.out.println();
        // inverse the pyramid
        for(int i=0;i<4;i++){
            for(int j=4; j>i; j--) System.out.print("* ");
            System.out.println();
        }

        // inverted pyramid rotated by 180 degree
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print("  ");
            for(int j=0;j<i;j++) System.out.print("* ");
            System.out.println();
        }
        //print numbers in half pyramid
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i; j++) System.out.print(j+" ");
            System.out.println();
        }

        System.out.println();
        //inverted half pyramid with numbers

        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++) System.out.print(j+" ");
            System.out.println();
        }
        //floyd's triangle
        /* 1
           2 3
           4 5 6
           7 8 9 10
           11 12 13 14 15
        */
        System.out.println();
        int num=1;
        for(int i=1;i<=5;i++){
            for(int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

        //0-1 triangle

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        //solid rhombus
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--) System.out.print(" ");
            for(int j=0;j<5;j++) System.out.print("*");
            System.out.println();
        }

        //number pyramid

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++) System.out.print(i);
            System.out.println();
        }





    }
}
