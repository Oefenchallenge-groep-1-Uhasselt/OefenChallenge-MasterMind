package MasterMind;

/**
 *
 * GameBoard of the MasterMind game
 *
 * @author groep 1
 */
public class GameBoard {

    private int[][] $board;
    public final int ROWS; // The amount of rows we have
    public final int COLS; // the amount of cols we have
    private int $ColorAmount; // the amount of colors we can play with
    private int $nextRow; // the next guessing row

    /**
     * Constructor of the GameBoard
     *
     * @pre rows > 0
     * @pre cols > 0
     * @pre ColorAmount > 0
     * @param rows
     * @param cols
     * @param ColorAmount
     * @post this.$ROWS = rows
     * @post this.$COLS = cols
     * @post this.$ColorAmount = ColorAmount
     *
     */
    public GameBoard(int rows, int cols, int ColorAmount) {
        if (rows <= 0 || cols <= 0 || ColorAmount <= 0)
            throw new IllegalArgumentException("Ongeldige GameBoard");
        this.$ROWS = rows;
        this.$COLS = cols;
        this.$ColorAmount = ColorAmount;
        this.$board = new int[ROWS][COLS];
    }

    /**
     * Inspector for the amount of rows
     *
     * @return $ROWS
     * @post the board remains unchanged
     */
    public int getRows() {
        return ROWS;
    }

    /**
     * Inspector for the amount of cols
     *
     * @return $COLS
     * @post board remains unchanged
     */
    public int getCols() {
        return COLS;
    }

    /**
     * Inspector for amount of colors
     *
     * @return $ColorAmount
     * @post board remains unchanged
     */
    public int getColorAmount() {
        return $ColorAmount;
    }

    /**
     * Inspector for $nextRow;
     *
     * @return $nextRow
     * @post board remains unchanged
     */
    public int getNextRow() {
        return $nextRow;
    }

}
