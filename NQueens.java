import java.util.ArrayList;
import java.util.List;

public class NQueens {
    public static boolean isSafe(char[][]boards, int row, int col){
        for(int i=0;i<boards.length;i++){
            if(boards[row][i]=='Q') return false;
        }
        //horizontally
        for(int i=0;i<boards.length;i++){
            if(boards[row][i]=='Q') return false;
        }
        //vertically
        for(int i=0;i<boards.length;i++){
            if(boards[i][col]=='Q') return false;
        }
        //upper left
        int r=row;
        for(int c=col;c>=0 && r>=0;c--,r--){
            if(boards[r][c]=='Q') return false;
        }
        //upper right
        r=row;
        for(int c=col;c<boards.length && r>=0;c++,r--){
            if(boards[r][c]=='Q') return false;
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r< boards.length;c--,r++){
            if(boards[r][c]=='Q') return false;
        }
        //lower right
        r=row;
        for(int c=col;c<boards.length && r< boards.length;c++,r++){
            if(boards[r][c]=='Q') return false;
        }

        return true;
    }
    public static void saveBoards(List<List<String>> allboards,char[][] board){
        List<String> newBoard=new ArrayList<>();
        String queens="";
        for(int i=0;i<board.length;i++){
            queens="";
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='Q') queens+="Q";
                else queens+='.';
            }
            newBoard.add(queens);
        }
        allboards.add(newBoard);
    }
    public static void Helper(char[][]boards, List<List<String>> allboards,int col){
        if(col==boards.length){
            saveBoards(allboards,boards);
            return;
        }
        for(int row=0;row<boards.length;row++){
            if(isSafe(boards,row,col)){
                boards[row][col]='Q';
                Helper(boards,allboards,col+1);
                boards[row][col]='.';
            }
        }
    }
    public static List<List<String>> Queens(int n){
        List<List<String>> allboards = new ArrayList<>();
        char[][] board=new char[n][n];
        Helper(board,allboards,0);
        return allboards;
    }
    public static void main(String[] args){
        int n=4;
        System.out.println(Queens(n));
    }
}
