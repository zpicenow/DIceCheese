/**
 *
 */
public class DiceGame extends Game {
    private GameBoard gameBoard;
    private PlayerPiece playerPiece1;
    private PlayerPiece playerPiece2;

    private char turnSymbol;
    private char notTurnSymbol;
    private int numRows;
    private int numCols;
    private int numConsecToWin;
    private boolean isWin = false;

    /**
     * constructor that accepts all params
     *
     * @param turnSymbol    symbol of turn
     * @param notTurnSymbol symbol of not turn
     * @param numRows       number of rows
     * @param numCols       number of cols
     */
    public DiceGame(char turnSymbol, char notTurnSymbol, int numRows, int numCols) {
        this.turnSymbol = turnSymbol;
        this.notTurnSymbol = notTurnSymbol;
        this.numRows = numRows;
        this.numCols = numCols;
        this.numConsecToWin = numCols * numRows + 1;
        gameBoard = new GameBoard(setUpEmptyArray(numRows, numCols));
    }

    /**
     * getter for gameBoard
     *
     * @return game Board
     */
    public GameBoard getGameBoard() {
        return gameBoard;
    }

    /**
     * getter for turn
     *
     * @return turn
     */
    public char getTurnSymbol() {
        return turnSymbol;
    }

    /**
     * getter for not turn
     *
     * @return not turn
     */
    public char getNotTurnSymbol() {
        return notTurnSymbol;
    }

    /**
     * getter for number rows
     *
     * @return number of rows
     */
    public int getNumRows() {
        return numRows;
    }

    /**
     * getter for number cols
     *
     * @return number of cols
     */
    public int getNumCols() {
        return numCols;
    }

    /**
     * getter for con
     *
     * @return conWin
     */
    public int getNumConsecToWin() {
        return numConsecToWin;
    }

    /**
     * creates and returns a two dimensional array of GamePieces of size numRows and numCols and is filled with EMPTY GamePiece objects.
     *
     * @param numRows number of rows
     * @param numCols number of columns
     * @return 2D array for gamePieces
     */
    public static GamePiece[][] setUpEmptyArray(int numRows, int numCols) {
        GamePiece[][] gamePieces = new GamePiece[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                gamePieces[i][j] = new GamePiece(GamePiece.EMPTY);
            }
        }
        return gamePieces;

    }

    /**
     * swaps the symbols for turnSymbol and notTurnSymbol.
     */
    public void changeTurn() {
        char temp = turnSymbol;
        turnSymbol = notTurnSymbol;
        notTurnSymbol = temp;
    }

    /**
     * set a piece on the board at the specified location.
     *
     * @param row       number of row
     * @param col       number of col
     * @param gamePiece gamepiece to set
     */
    public void setPiece(int row, int col, GamePiece gamePiece) {
        gameBoard.setPiece(row, col, gamePiece);
    }

    /**
     * the maximum number of consecutive pieces on the board that have this symbol
     *
     * @param playerPiece symbol to be count
     * @return score
     */
    public int getScore(PlayerPiece playerPiece) {
        return playerPiece.getRow() * gameBoard.getBoard().length + playerPiece.getCol() + 1;
    }

    /**
     * returns a true if the score for this symbol is equal to the numConsecToWin
     *
     * @param symbol symbol to be judge
     * @return true if equal;false if not
     */
    public boolean isWinner(PlayerPiece playerPiece) {
        isWin = (getScore(playerPiece) >= numConsecToWin);
        return isWin;

    }

    /**
     * if there are no empty spaces left on the board or there is a winner.
     *
     * @return true if there are no empty spaces left on the board or there is a winner.
     */
    public boolean isEnd() {
        isWin = getScore(notTurnSymbol) == numConsecToWin;
        return getScore('E') == 0 || isWin;
    }

    /**
     * prints a message describing the status of the game.
     */
    public String getStatus() {
        if (isEnd()) {
            if (isWin) {
                return "Player" + turnSymbol + " wins";
            } else {
                return "It is a draw.";
            }
        } else {
            return "It’s Player " + turnSymbol + "’s turn.";
        }
    }

    @Override
    public void performAction(Action action) {
        super.performAction(action);
    }

    @Override
    protected void onPerformAction(Action action) {
        super.onPerformAction(action);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onEnd() {
        super.onEnd();
    }

    /**
     * override the toString() method that returns a string containing the board and the status of the game
     *
     * @return a string containing the board and the status of the game
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < gameBoard.getBoard().length; i++) {
            for (int j = 0; j < gameBoard.getBoard().length; j++) {
                buffer.append(gameBoard.getBoard()[i][j] + " ");
            }
            buffer.append("\n");
        }
        buffer.append(getStatus());
        return buffer.toString();

    }
}
