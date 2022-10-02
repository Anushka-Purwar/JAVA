public class Advance_patterns {
    public static void main(String[] args){
        //Palindromic number triangle
        // i=5  j=9
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--) System.out.print(" ");
            for(int j=i;j>=1;j--) System.out.print(j);
            for(int j=2;j<=i;j++) System.out.print(j);
            System.out.println();
        }
        //Butterfly pattern
        //for inverted pattern below take the upper half code and inverse the first for loop

        //upper half
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=2*(4-i);j>0;j--) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        //lower half
        for(int i=4; i>=0;i--){
            for(int j=1;j<=i;j++) System.out.print("*");
            for(int j=2*(4-i);j>0;j--) System.out.print(" ");
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
        System.out.println();

        //diamond pattern

        //upper half
        for(int i=1;i<=4;i++){
            for(int j=4;j>i;j--) System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++) System.out.print("*");
            System.out.println();
        }
        //lower half
        for(int i=4;i>=0;i--){
            for(int j=4;j>i;j--) System.out.print(" ");
            for(int j=1;j<=(2*i)-1;j++) System.out.print("*");
            System.out.println();

        }

        //hollow butterfly

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(j==i || j==1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=2*(5-i);j>0;j--) System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(j==i || j==1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==i || j==1) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=2*(5-i);j>0;j--) System.out.print(" ");
            for(int j=1;j<=i;j++){
                if(j==i || j==1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        //hollow rhombus
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) System.out.print(" ");
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

        //inverted half pyramid

        for(int i=1;i<=4;i++){
            for(int j=4;j>=i;j--) System.out.print(i);
            System.out.println();
        }
        System.out.println();

        //half pyramid

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) System.out.print(j);
            System.out.println();
        }

        //Pascal's Triangle????



    }

}

