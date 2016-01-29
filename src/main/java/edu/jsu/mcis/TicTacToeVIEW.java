package edu.jsu.mcis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;


public class TicTacToeVIEW extends JFrame implements ActionListener{
    JPanel panel;
	JButton[] button;
	int count = 0;
	int sign = 0;
	
	public TicTacToeVIEW(){
		panel = new JPanel();
		this.setTitle("TicTacToe");
		panel.setLayout(new GridLayout(3,3));
		panel.setPreferredSize(new Dimension(300,300));
		this.add(panel);
		button = new JButton[9];
		for (int i = 0; i<=8; i++){
			button[i] = new JButton();
			panel.add(button[i]);
			button[i].setEnabled(true);
			button[i].addActionListener(this);
		}
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		}
		public void actionPerformed(ActionEvent e){
			count++;
			for (int i =0; i <=8; i++){
				if (button[i] == e.getSource()){
					if (sign%2 == 0){
						button[i].setText("X");
						button[i].setEnabled(false);
					}
					else{
						button[i].setText("O");
						button[i].setEnabled(false);
					}
				}
			}
			sign++;
		}
}	
	
