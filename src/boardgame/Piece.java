package boardgame;

public abstract class Piece {

    protected Position position;
    
    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position position) {
        return true;
    } 

    public boolean isThereAnyPossibleMove() {
        return true;
    }

}
