package boardgame;

public class Board {

    private int rows;
    private int columns;

    public Piece piece(int row, int columns) {
        return null;
    }

    public Piece piece(Position position) {
        return null;
    }
    
    public void placePiece(Piece piece, Position position) {

    }

    public Piece removePiece(Position position) {
        return null;
    }

    public boolean positionExists(Position position) {
        return true;
    }

    public boolean  thereIsAPiece(Position position) {
        return true;
    }
}
