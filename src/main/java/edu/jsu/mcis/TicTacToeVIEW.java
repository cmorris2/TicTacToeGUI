package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;


public class TicTacToeVIEW extends JFrame implements ActionListener{
    JPanel panel;
	JButton[][] button;
	int count = 0;
	int sign = 0;
	
	public TicTacToeVIEW(){
		panel = new JPanel();
		this.setTitle("TicTacToe");
		panel.setLayout(new GridLayout(3,3));
		panel.setPreferredSize(new Dimension(300,300));
		this.add(panel);
		button = new JButton[3][3];
		for (int i = 0; i<3; i++){
			for (int j = 0; j<3;j++){
			button[i][j] = new JButton();
			panel.add(button[i][j]);
			button[i][j].setEnabled(true);
			button[i][j].addActionListener(this);
			}
		}
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		}
		public void actionPerformed(ActionEvent e){
			count++;
			for (int i =0; i <3; i++){
				for (int j =0; j<3;j++){
				if (button[i][j] == e.getSource()){
					if (sign%2 == 0){
						button[i][j].setText("X");
						button[i][j].setEnabled(false);
					}
					else{
						button[i][j].setText("O");
						button[i][j].setEnabled(false);
					}
				}
				}
			}
			sign++;
		}
}	
	
