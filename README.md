<<<<<<< HEAD
Tic Tac Toe
===========

********************PURPOSE*********************
This project provides a game of Tic Tac Toe. Two players take turns marking a 
spot on the board as either an X or an O. The objective of the game is to get
three X's or three O's in a row. You can do so either horizontally, vertically,
or diagonally. The first to get three in a row is the winner. In the even that
all of the spaces become occupied and neither player has three marks in a row,
it is a tie game.

*****************IMPLEMENTATION*****************
In order to execute the program from the command line, simply navigate to the
directory in which the project is located. Once you are there you must first 
compile the project. This can be achived by using the javac command. Next, the
program can be executed by using the "java" command followed by the name of the
main class TicTacToe.java. You may have to also include the classpath.

*******************LIBRARIES********************
This program consists of four different classes. The main class is 
"TicTacToe.java" and it just instantiates a data object from each of the other
classes. The "TicTacToeVIEW.java" file is where the graphical user interface is
created. This is accomplished by importing the "java.awt" and "java.swing"
libraries. Next, is the "TicTacToeModel.java" file. This file contains a double
array of integers representing the game board. It also has all of the necessary
methods to play the game such as placing the X's and O's on the board and checking
if there is a winner. Finally, the "TicTacToeController.java" is the file that
brings it all together. It takes the information received from the "TicTacToeVIEW.java"
class and manipulates the "TicTacToeModel.java" class accordingly. 

********************API************************
TicTacToeVIEW.java
    -public TicTacToeVIEW()
    //Constructor with no parameters. Initializes the game board with JPanel,
    //adds buttons the panel, and sets the panel so that it is visible
    
    -public void actionPerformed(actionevent e)
    //Checks to see if any of ther buttons were pressed. If so, it finds out
    //which button was clicked and marks that button with either an X or an O
    
TicTacToeModel.java
    -public TicTacToeModel()
    //Constructor with no parameters. Initializes the game board so that all of the
    //spaces are equal to 0.
    
    -public int PlaceX(int row, int col)
    //Places a 1 on the game board representing that there is an X there
    
    -public int PlaceO(int row, int col)
    //Place a 2 on the game board representing that there is an O there
    
    -public boolean CheckForWinner()
    //loops through the game board checking for three 1's or three 2's in a
    //row, which means that there is a winner. If it finds that, it returns true.
    
TicTacToeController.java
    -public TicTacToeController(TicTacToeVIEW view, TicTacToeModel model)
    //Constructor with two parameters of the view class and model class. This
    //takes information from the TicTacToeVIEW.java class and passes it onto
    //the TicTacToeController.java class. The controller class stores and analyzes 
    //this information by placing the players marks on the gameboard and checking
    //for a winner. Once the outcome of the game is determined, the model class
    //lets the view class know to display it to the user.

=======
>>>>>>> 1eae4aa6a3a3dbf2cabb87b22e15bd1e460c4bc4
