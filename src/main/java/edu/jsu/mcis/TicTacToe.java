package edu.jsu.mcis;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.*;

public class TicTacToe extends JFrame {





	public static void main(String[] args) {
		
		TicTacToeModel model = new TicTacToeModel();
        TicTacToeVIEW view = new TicTacToeVIEW();
        TicTacToeController controller = new TicTacToeController(view, model);
		
	}
}
