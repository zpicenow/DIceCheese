/**
 * a class to set pieces server for game
 */
public class GamePiece {
    public static final String EMPTY = "0";   //a public constant
    private String  symbol;

    /**
     * a constructor that accepts one parameter and sets the symbol
     * @param symbol a char to set 'symbol'
     */
    public GamePiece(String  symbol) {
        this.symbol = symbol;
    }

    /**
     * an accessor to  get symbol
     * @return char symbol
     */
    public String  getSymbol() {

        return symbol;
    }

    /**
     * an accessor to get if symbol is empty
     * @return boolean that whether symbol= E
     */
    public boolean isEmpty() {
        return symbol.equals(EMPTY);
    }

    /**
     * Override the toString method to represent this object as the value of symbol
     * @return reserve 'symbol' to String
     */
    @Override
    public String toString() {
        return symbol;
    }

    /**
     * Override the equals method to return true if the symbol’s match
     * @param obj another GamePiece object
     * @return if these two are equal
     */
    @Override
    public boolean equals(Object obj) {
        GamePiece gamePiece = (GamePiece) obj;
        return this.symbol.equals(gamePiece.symbol);
    }

}
