package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.Board;
import main.java.com.faelzaga.application.entities.board.Piece;
import main.java.com.faelzaga.application.entities.chess.enums.Color;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
