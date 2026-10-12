package MasterMind;

/**
 *
 * BreakerExpert (The visitor for CodeBreaker)
 *
 * @author groep 1
 */
public class BreakerExpert implements ParticipantVisitor {

    private GameBoard $board;
    private PawnRenderer $renderer = new PawnRenderer();
    private int[] $returnArray;

    /**
     * Constructor for the BreakerExpert
     *
     * @pre board != null;
     * @param board
     * @post $board == board;
     *
     */
    public BreakerExpert(GameBoard board) {
        this.$board = board;
        $returnArray = new int[$board.getCols()];
    }

    /**
     * the visitor function for the human codebreaker
     *
     * @pre human != null
     * @param human
     * @return $returnArray
     * @post result = $returnArray
     * @post human remains unchanged
     */
    @Override
    public void visitHuman(Human human) {
        for (int i = 0; i < $board.getColorAmount(); i++) {
            $returnArray[i] = getNextCell();
        }
    }

    /**
     * The function that gets the next cell and returns it as an int
     *
     * @pre $renderer != null
     * @return int
     * @post $renderer remains unchanged
     * @post result == resolved inputColor;
     */
    private int getNextCell() {
        System.out.print("Enter a color for the next cell: ");
        String inputColor = System.console().readLine();
        return $renderer.ResolvePawn(inputColor);
    }

    /**
     * The function that gets the next cell from the bot according to its strategy
     * and returns it
     *
     * @pre botstrat != null
     * @param botstrat
     * @post bot remains unchanged
     * @post result == botstrat.doMove();
     */
    private int getNextBotCell(Strategy botstrat) {
        return botstrat.doMove();
    }

    /**
     * Visitor function for our Bot player
     *
     * @pre bot != null
     * @param bot
     * @post bot remains unchanged
     * @post result = $returnArray
     */
    @Override
    public void visitBot(Bot bot) {
        for (int i = 0; i < $board.getColorAmount(); i++) {
            $returnArray[i] = getNextBotCell(bot.getStrat());
        }
    }

    /**
     * Inspector for $returnArray
     *
     * @pre a move has been done
     * @return $returnArray
     * @post BreakerExpert remains unchanged
     */
    public int[] getNextMove() {
        return $returnArray;
    }
}
