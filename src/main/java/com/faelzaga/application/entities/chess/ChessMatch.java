package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.Board;

public class ChessMatch {
    private Board brd;

    public ChessMatch() {
        brd = new Board(8,8);
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[brd.getRows()][brd.getColumns()];
        for (int i=0; i< brd.getRows(); i++){
            for (int j=0; j<brd.getColumns(); j++){
                mat[i][j] = (ChessPiece) brd.piece(i,j);
            }
        }
        return mat;
    }
}
