// You are using Java
import java.util.*;
class Main{
    private static final int SIZE=9;
    public static boolean solveSuduko(int board[][]){
        for(int row=0;row<SIZE;row++){
            for(int col=0;col<SIZE;col++){
                if(board[row][col]==0){
                    for(int num=1;num<=SIZE;num++){
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
