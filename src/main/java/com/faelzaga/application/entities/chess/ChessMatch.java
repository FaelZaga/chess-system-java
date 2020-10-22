package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.Board;
import main.java.com.faelzaga.application.entities.board.Position;
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

    private void initialSetup() {
        brd.placePiece(new Rook(brd, Color.WHITE), new Position(2,1));
        brd.placePiece(new King(brd, Color.BLACK), new Position(0,4));
        brd.placePiece(new King(brd, Color.WHITE), new Position(7,4));
    }
}
