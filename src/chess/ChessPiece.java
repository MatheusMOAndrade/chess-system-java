package chess;

import boardgame.Position;

public abstract class ChessPiece {

    private Color color;
    private int moveCount;

    public ChessPosition getChessPosition() {
        return null;
    }

    protected boolean isThereOpponentPiece(Position position) {
        return true;
    }

    protected void increaseMoveCount() {

    }
    
    protected void decreaseMoveCount() {

    }

}
