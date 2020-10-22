package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.Board;
import main.java.com.faelzaga.application.entities.chess.enums.Color;
import main.java.com.faelzaga.application.entities.chess.pieces.King;
import main.java.com.faelzaga.application.entities.chess.pieces.Rook;

public class ChessMatch {
    private Board brd;

    public ChessMatch() {
        brd = new Board(8,8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        brd.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('b',6,new Rook(brd, Color.WHITE));
        placeNewPiece('e',8,new King(brd, Color.BLACK));
        placeNewPiece('e',1,new King(brd, Color.WHITE));
    }
}
