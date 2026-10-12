package MasterMind;

/**
 *
 * GameParticipant interface for both the player and bot
 *
 * @author groep 1
 */
public interface GameParticipant {

    /**
     * The function that returns a candidate move for the next row
     *
     * @param board
     * @return int[] with the numerical values of the colors
     * @post board remains unchanged
     */
    int chooseMove(GameBoard board);
}
