package MasterMind;

/**
 *
 * GameParticipant interface for both the player and bot
 *
 * @author groep 1
 */
public interface GameParticipant {

    /**
     * @pre visitor != null
     * @post visitor's visit method for this participant's type is called once.
     * @post the participant is unchanged
     */
    public void accept(ParticipantVisitor visitor);
}
