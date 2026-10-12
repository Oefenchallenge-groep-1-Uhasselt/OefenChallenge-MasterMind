package MasterMind;

public class Human implements GameParticipant {
    public void accept(ParticipantVisitor visitor) {
        visitor.visitHuman(this);
    }
}
