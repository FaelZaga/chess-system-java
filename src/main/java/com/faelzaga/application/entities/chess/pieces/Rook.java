package main.java.com.faelzaga.application.entities.chess.pieces;

import main.java.com.faelzaga.application.entities.board.Board;
import main.java.com.faelzaga.application.entities.chess.ChessPiece;
import main.java.com.faelzaga.application.entities.chess.enums.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
