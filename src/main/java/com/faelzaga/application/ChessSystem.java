package main.java.com.faelzaga.application;

import main.java.com.faelzaga.application.entities.chess.ChessMatch;

public class ChessSystem {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
