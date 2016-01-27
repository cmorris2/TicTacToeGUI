package edu.jsu.mcis;

import java.util.Scanner;

public class TicTacToeVIEW {
    
    int row = 0;
    int col = 0;
    char[][] play = new char[3][3];
    
    
    public TicTacToeVIEW(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                play[i][j] = ' ';
            }
        }
        System.out.println("\t  0    1    2");
        System.out.println("\t0 " + play[0][0] + " |  " + play[0][1] + " |  " + play[0][2] + "\t");
        System.out.println("\t --------------");
        System.out.println("\t1 " + play[1][0] + " |  " + play[1][1] + " |  " + play[1][2] + "\t");
        System.out.println("\t --------------");
        System.out.println("\t2 " + play[2][0] + " |  " + play[2][1] + " |  " + play[2][2] + "\t");
        
    }
    
    public void showBoard(){
        System.out.println("\t  0    1    2");
        System.out.println("\t0 " + play[0][0] + " |  " + play[0][1] + " |  " + play[0][2] + "\t");
        System.out.println("\t --------------");
        System.out.println("\t1 " + play[1][0] + " |  " + play[1][1] + " |  " + play[1][2] + "\t");
        System.out.println("\t --------------");
        System.out.println("\t2 " + play[2][0] + " |  " + play[2][1] + " |  " + play[2][2] + "\t");
    }
    
    public void xMove(){
        Scanner sc = new Scanner(System.in);
		int x =1;
		do{
		System.out.println("Player X, please enter the X row: ");
		row = sc.nextInt();	
		System.out.println("Player X, please enter the X column: ");
		col = sc.nextInt();
		if ((row >= 0) && (row < 3) && (col >= 0) && (col < 3) && (play[row][col] == ' ')){
			x = 2;
		}
		}while(x==1);
        System.out.println("X placing at: [" + row + "," + col + "]");
        play[row][col] = 'X';
        
    }
    public void oMove(){
        Scanner sc = new Scanner(System.in);
		int y = 1;
		do{
        System.out.println("Player O, please enter the O row: ");
        row = sc.nextInt();
        System.out.println("Player O, please enter the O column: ");
        col = sc.nextInt();
		if ((row >= 0) && (row < 3)&&(col >= 0) && (col < 3) && (play[row][col] == ' ')){
			y = 2;
		}
		}while(y==1);
        System.out.println("O placing at: [" + row + "," + col + "]");
        play[row][col] = 'O';
        
    }
    
}
