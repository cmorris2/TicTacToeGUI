package edu.jsu.mcis;

import javax.swing.JOptionPane;


public class TicTacToeController {
    public TicTacToeController(TicTacToeVIEW view, TicTacToeModel model){
		while ((view.count<9) && (!model.CheckForWinner())){
		for (int i = 0; i < 3; i++){
			for (int j = 0; j<3; j++){
                if (view.button[i][j].getText().equals("X")){
					model.PlaceX(i,j);
					if (model.CheckForWinner()){
						JOptionPane.showMessageDialog(null, "X wins!");
						return;
					}
				}
				if (view.button[i][j].getText().equals("O")){
					model.PlaceO(i,j);
					if (model.CheckForWinner()){
						JOptionPane.showMessageDialog(null, "O wins!");
						return;
					}
				}
        }
		}
		}
		JOptionPane.showMessageDialog(null, "It's a tie!");
		return;
    
    }
}
