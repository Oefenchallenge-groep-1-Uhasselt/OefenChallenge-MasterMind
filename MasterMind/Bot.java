package MasterMind;

public class Bot implements GameParticipant {
    public void accept(ParticipantVisitor visitor) {
        visitor.visitBot(this);
    }
}
