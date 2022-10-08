import java.util.concurrent.LinkedBlockingDeque;

public class removeDupl {

    public static boolean[] map=new boolean[26];
    public static void duplictae(String s, int indx, String newstring){
        char currchar=s.charAt(indx);
        if(indx==s.length()-1){
            System.out.println(newstring );
            return;
        }
        if(map[currchar-'a']==true){
            duplictae(s,indx+1,newstring);
        }
        else{
            newstring+=currchar;
            map[currchar-'a']=true;
            duplictae(s,indx+1,newstring);
        }
    }
    public static void main(String[] srhs){

        String s="aabbhhhccdd";
        duplictae(s,0,"");
    }
}
