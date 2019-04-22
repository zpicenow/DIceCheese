/**
 *
 */
public class PlayerPiece extends GamePiece{
    private int scoreSum;
    private boolean isWait;
    private int row;
    private int col;

    /**
     * a constructor that accepts one parameter and sets the symbol
     *
     * @param symbol a char to set 'symbol'
     */
    public PlayerPiece(String symbol) {
        super(symbol);
        isWait = false;
        scoreSum = 0;
        row = 0;
        col = 0;

    }


    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getScoreSum() {
        return scoreSum;
    }

    public void setScoreSum(int scoreSum) {
        this.scoreSum = scoreSum;
    }

    public boolean isWait() {
        return isWait;
    }

    public void setWait(boolean wait) {
        isWait = wait;
    }
}
