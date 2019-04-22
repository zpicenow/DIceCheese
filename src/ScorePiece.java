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


    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
