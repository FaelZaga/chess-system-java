package main.java.com.faelzaga.application;

import main.java.com.faelzaga.application.entities.chess.ChessMatch;
import main.java.com.faelzaga.application.entities.chess.ChessPiece;
import main.java.com.faelzaga.application.entities.chess.ChessPosition;

import java.util.Scanner;

public class ChessSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source,target);
        }
    }
}
