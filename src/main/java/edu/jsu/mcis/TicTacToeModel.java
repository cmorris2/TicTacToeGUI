
package edu.jsu.mcis;


public class TicTacToeModel {
    private static final int X = 1;
    private final int O = 2;
    
    int[][] board = new int[3][3];
    
    public TicTacToeModel(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                board[i][j] = 0;
            }
        }
    }
    public void PlaceX(int buttonNumber){
        if (buttonNumber == 0){
			board[0][0] = X;
		}
		if (buttonNumber == 1){
			board[0][1] = X;
		}
		if (buttonNumber == 2){
			board[0][2] = X;
		}
		if (buttonNumber == 3){
			board[1][0] = X;
		}
		if (buttonNumber == 4){
			board[1][1] = X;
		}
		if (buttonNumber == 5){
			board[1][2] = X;
		}
		if (buttonNumber == 6){
			board[2][0] = X;
		}
		if (buttonNumber == 7){
			board[2][1] = X;
		}	
		if (buttonNumber == 8){
			board[2][2] = X;
		}
    }
	
	public void PlaceO(int buttonNumber){
		if (buttonNumber == 0){
			board[0][0] = O;
		}
		if (buttonNumber == 1){
			board[0][1] = O;
		}
		if (buttonNumber == 2){
			board[0][2] = O;
		}
		if (buttonNumber == 3){
			board[1][0] = O;
		}
		if (buttonNumber == 4){
			board[1][1] = O;
		}
		if (buttonNumber == 5){
			board[1][2] = O;
		}
		if (buttonNumber == 6){
			board[2][0] = O;
		}
		if (buttonNumber == 7){
			board[2][1] = O;
		}	
		if (buttonNumber == 8){
			board[2][2] = O;
		}
	}
    
    public boolean SpaceIsAvailable(int row, int column){
        if (board[row][column] != 0){
            return false;
        }
        return true;
    }
    
 
    public boolean CheckForWinner(){
        for (int i = 0; i < 3; i++){
            if ((board[i][0]==2)&&(board[i][1]==2)&&(board[i][2]==2)){
                System.out.println("O is the winner!");
            return true;
			}
            if ((board[i][0]==1) && (board[i][1]==1) && (board[i][2]==1)){
                System.out.println("X is the winner!");
                return true;
            }
			
			if ((board[0][i] ==2)&& (board[1][i]==2) && (board[2][i] ==2)){
				System.out.println("O is the winner!");
				return true;
			}
			if ((board[0][i] ==1)&& (board[1][i]==1) && (board[2][i] ==1)){
				System.out.println("X is the winner!");
				return true;
			}
			if ((board[0][0]==1) && (board[1][1] ==1) && (board[2][2]==1)){
				System.out.println("X is the winner!");
				return true;
			}
			if ((board[0][0]==2) && (board[1][1] ==2) && (board[2][2]==2)){
				System.out.println("O is the winner!");
				return true;
			}
			if ((board[2][0]==2) && (board[1][1]==2) && (board[0][2]==2)){
				System.out.println("O is the winner!");
				return true;
			}
			if ((board[2][0]==1) && (board[1][1]==1) && (board[0][2]==1)){
				System.out.println("X is the winner!");
				return true;
			}
			
    
    }
	return false;
	}
	
	
	public boolean checkForTie(){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				if (board[i][j] == 0){
					return false;
				}
				
			}
		}
		return true;
	}
	
	public boolean checkForValidEntry(int row, int col){
		if ((row > 2) || (row < 0) || (col>2) || (col<0)){
			return false;
		}
	return true;
	}
}
 
        