package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.Board;
import main.java.com.faelzaga.application.entities.board.Piece;
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

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source,target);
        return (ChessPiece) capturedPiece;
    }

    private Piece makeMove(Position source, Position target) {
        Piece piece = brd.removePiece(source);
        Piece capturedPiece = brd.removePiece(target);
        brd.placePiece(piece, target);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position) {
        if (!brd.thereIsAPiece(position)){
            throw new ChessException("Error positioning piece: There is no piece on source position");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        brd.placePiece(piece, new ChessPosition(column,row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece('c',1, new Rook(brd, Color.WHITE));
        placeNewPiece('c',2, new Rook(brd, Color.WHITE));
        placeNewPiece('d',2, new Rook(brd, Color.WHITE));
        placeNewPiece('e',2, new Rook(brd, Color.WHITE));
        placeNewPiece('e',1, new Rook(brd, Color.WHITE));
        placeNewPiece('d',1, new King(brd, Color.WHITE));

        placeNewPiece('c',7, new Rook(brd, Color.BLACK));
        placeNewPiece('c',8, new Rook(brd, Color.BLACK));
        placeNewPiece('d',7, new Rook(brd, Color.BLACK));
        placeNewPiece('e',7, new Rook(brd, Color.BLACK));
        placeNewPiece('e',8, new Rook(brd, Color.BLACK));
        placeNewPiece('d',8, new King(brd, Color.BLACK));
    }
}
