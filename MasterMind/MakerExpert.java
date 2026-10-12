package MasterMind;

/**
 *
 * MakerExpert
 *
 * @author groep 1
 */
public class MakerExpert implements ParticipantVisitor {

    private GameBoard $board;
    private PawnRenderer $renderer = new PawnRenderer();
    private int[] $returnArray;

    /**
     * constructor for the Makerexpert
     *
     * @param board
     * @pre board != null
     * @post $board == board
     * @post $returnArray gets initialized
     */
    public MakerExpert(GameBoard board) {
        this.$board = board;
        this.$returnArray = new int[$board.getCols()];
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
     * Inspector for $returnArray
     *
     * @pre a move has been done
     * @return $returnArray
     * @post MakerExpert remains unchanged
     */
    public int[] getNextMove() {
        return $returnArray;
    }
}
