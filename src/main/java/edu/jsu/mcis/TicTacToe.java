package edu.jsu.mcis;

public class TicTacToe {





	public static void main(String[] args) {
		
		TicTacToeModel model = new TicTacToeModel();
        TicTacToeVIEW view = new TicTacToeVIEW();
        TicTacToeController controller = new TicTacToeController(view, model);
		
	}
}
