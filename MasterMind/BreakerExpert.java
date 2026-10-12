package MasterMind;

/**
 *
 * BreakerExpert (The visitor for CodeBreaker)
 *
 * @author groep 1
 */
public class BreakerExpert implements ParticipantVisitor {

    private PawnRenderer $renderer = new PawnRenderer();
    private int[] $returnArray = new int[GameBoard.COLS];

    /**
     * the visitor function for the human codebreaker
     *
     * @pre human != null
     * @param human
     * @return $returnArray
     * @post result = $returnArray
     * @post human remains unchanged
     */
    public int[] visitHuman(Human human) {
        for (int i = 0; i < GameBoard.$ColorAmount; i++) {
            $returnArray[i] = getNextCell();
        }
        return $returnArray;
    }

    /**
     * The function that get's the next cell and returns it as an int
     *
     * @pre $renderer != null
     * @return int
     * @post $renderer remains unchanged
     * @post result == resolved inputColor;
     */
    private int getNextCell() {
        System.out.print("Enter a color for the next cell: ");
        String inputColor = System.console().readLine();
        return $renderer.resolve(inputColor);
    }

    public int[] visitBot(Bot bot) {

    }
}
