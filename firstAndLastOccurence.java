public class firstAndLastOccurence {
    public static int first=-1;
    public static int last=-1;
    public static String occur(String s,int indx,char element){
        if(indx==s.length()) return "";
        char currentChar=s.charAt(indx);
        if(currentChar==element){
            if(first==-1) first=indx;
            else last=indx;
        }
        occur(s,indx+1,element);
        return first+" "+last;
    }
    public static void main(String[] args){

        String s="abaacdaefaahh";
        System.out.println(occur(s,0,'a'));
    }
}
