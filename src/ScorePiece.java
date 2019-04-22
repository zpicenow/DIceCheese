/**
 *
 */
public class ScorePiece extends GamePiece {

    private int score;
    /**
     * a constructor that accepts one parameter and sets the symbol
     *
     * @param score a score
     */
    public ScorePiece(int score) {
        super("S");
        this.score = score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
