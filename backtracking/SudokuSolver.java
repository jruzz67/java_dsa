// You are using Java
import java.util.*;

public class SudokuSolver{
    private static final int SIZE=9;
    public static boolean solveSuduko(int board[][]){
        for(int row=0;row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                if(board[row][col]==0){ //is the cell empty?
                    for(int num=1;num<=SIZE;num++){ //insert what value
                        if(isValid(board,row,col,num)){
                            board[row][col]=num;
                            if(solveSuduko(board))
                            return true;
                        }
                        board[row][col]=0;
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(int board[][],int row,int col,int num){
        //check row
        for(int j=0;j<SIZE;j++){
            if(board[row][j]==num)
            return false;
        }
        //check column
        for(int i=0;i<SIZE;i++){
            if(board[i][col]==num)
            return false;
        }
        //check grid
        int startrow=row-row%3;
        int startcol=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[startrow+i][startcol+j]==num)
                return false;
            }
        }
        return true;
    }
    public static void printboard(int board[][]){
        for(int row=0;row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                System.out.print(board[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String aaa[]){
        Scanner s=new Scanner(System.in);
        int board[][]=new int[SIZE][SIZE];
        for(int i=0;i<SIZE;i++){
            for(int j=0;j<SIZE;j++){
                board[i][j]=s.nextInt();
            }
        }
        if(solveSuduko(board)){
            printboard(board);
        }else{
            System.out.print("No Solution exists");
        }
    }
}

/*
 * Testcase:
 * Input: 
 * 5 3 0 0 7 0 0 0 0
 * 6 0 0 1 9 5 0 0 0
 * 0 9 8 0 0 0 0 6 0
 * 8 0 0 0 6 0 0 0 3
 * 4 0 0 8 0 3 0 0 1
 * 7 0 0 0 2 0 0 0 6
 * 0 6 0 0 0 0 2 8 0
 * 0 0 0 4 1 9 0 0 5
 * 0 0 0 0 8 0 0 7 9
 * Output: 
 * 5 3 4 6 7 8 9 1 2 
 * 6 7 2 1 9 5 3 4 8 
 * 1 9 8 3 4 2 5 6 7 
 * 8 5 9 7 6 1 4 2 3 
 * 4 2 6 8 5 3 7 9 1 
 * 7 1 3 9 2 4 8 5 6 
 * 9 6 1 5 3 7 2 8 4 
 * 2 8 7 4 1 9 6 3 5 
 * 3 4 5 2 8 6 1 7 9 
 */
