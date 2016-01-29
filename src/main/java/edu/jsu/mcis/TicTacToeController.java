package edu.jsu.mcis;

import javax.swing.JOptionPane;


public class TicTacToeController {
    public TicTacToeController(TicTacToeVIEW view, TicTacToeModel model){
		while ((view.count<9) && (!model.CheckForWinner())){
		for (int i = 0; i < 9; i++){
                if (view.button[i].getText().equals("X")){
					model.PlaceX(i);
					if (model.CheckForWinner()){
						JOptionPane.showMessageDialog(null, "X wins!");
						return;
					}
				}
				if (view.button[i].getText().equals("O")){
					model.PlaceO(i);
					if (model.CheckForWinner()){
						JOptionPane.showMessageDialog(null, "O wins!");
						return;
					}
				}
        }
		}
		JOptionPane.showMessageDialog(null, "It's a tie!");
    
    }
}
