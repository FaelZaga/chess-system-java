package main.java.com.faelzaga.application.entities.chess;

import main.java.com.faelzaga.application.entities.board.BoardException;

public class ChessException extends BoardException {

    public ChessException(String msg) {
        super(msg);
    }
}
