public class subsequencees {
    public static void printSequencees(String s, int indx, String newstring){
        if(indx==s.length()){
            System.out.println(newstring);
            return;
        }
        //choose to be
        printSequencees(s,indx+1,newstring+s.charAt(indx));
        //choose not to be
        printSequencees(s,indx+1,newstring);
    }
    public static void main(String[] args){
        String s="abc";
        printSequencees(s,0,"");

    }
}
