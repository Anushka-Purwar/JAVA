import java.util.HashSet;

public class uniquesSequences {
    public static void printSequencees(String s, int indx, String newstring,HashSet<String> set) {
        if (indx == s.length()) {
            if(set.contains(newstring)) return;
            else {
                System.out.println(newstring);
                set.add(newstring);
                return;
            }
        }
        //choose to be
        printSequencees(s, indx + 1, newstring + s.charAt(indx),set);
        //choose not to be
        printSequencees(s, indx + 1, newstring, set);
    }
    public static void main(String[] args){
        String s="aaa";
        HashSet<String> set=new HashSet<>();
        printSequencees(s,0,"",set);

    }
}
