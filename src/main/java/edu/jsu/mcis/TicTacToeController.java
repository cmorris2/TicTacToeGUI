package edu.jsu.mcis;


public class TicTacToeController {
    public TicTacToeController(TicTacToeVIEW view, TicTacToeModel model){
        while (!model.CheckForWinner() && !model.checkForTie()){
        view.xMove();
        while ((!model.SpaceIsAvailable(view.row, view.col))){
        view.xMove();
    }
        model.PlaceX(view.row, view.col);
        view.showBoard();
        if (model.CheckForWinner() || model.checkForTie()){
            return;
        }
        
        view.oMove();
        while ((!model.SpaceIsAvailable(view.row, view.col))){
            view.oMove();
        }
        model.PlaceO(view.row, view.col);
        view.showBoard();
        }
    }
}
