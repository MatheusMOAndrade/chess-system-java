package chess;

public class ChessMatch {

    private int turn;
    private Color currentPlayer;
    private boolean check;
    private boolean checkMate;
    private ChessPiece enPassantVulnerable;
    private ChessPiece promoted;

    public ChessPiece[][] getPieces() {
        return null;
    }
    
    public boolean possibleMoves(ChessPosition sourcePosition) {
        return true;
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        return null;
    }

    public ChessPiece replacePromotedPiece(String type) {
        return null;
    }
}
