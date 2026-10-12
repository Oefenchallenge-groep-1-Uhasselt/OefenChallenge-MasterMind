package MasterMind;

/**
 * ParticipantVisitor interface to make visit methods
 *
 * @author groep 1
 */
public interface ParticipantVisitor {

    /**
     * Visitor for the humanplayer
     *
     * @pre participant != null
     * @param participant
     * @post participant is unchanged
     * @post The corresponding method is called
     */
    void visitHuman(Human human);

    /**
     * Visitor for the bot
     *
     * @pre participant != null
     * @param participant
     * @post participant is unchanged
     * @post The corresponding method is called
     */
    void visitBot(Bot bot);
}
