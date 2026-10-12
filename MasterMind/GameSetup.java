package MasterMind;

/**
 * @author groep 1
 * GameSetup
 */
public final class GameSetup {
    private final int ColorAmount;
    private final int CodeLength;
    private final int MaxAttemps;

    /**
     * @pre colorAmount > && CodeLenght > 0 && MaxAttemps > 0
     * @param ColorAmount
     * @param codeLength
     * @param MaxAttemps
     */
    GameSetup(int ColorAmount, int CodeLength, int MaxAttemps){
        if(ColorAmount <= 0 || CodeLength <= 0 || MaxAttemps <= 0){
            throw new IllegalArgumentException("Ongeldige GameSetup");
        }
        this.ColorAmount = ColorAmount;
        this.CodeLength = CodeLength;
        this.MaxAttemps = MaxAttemps;
    }

    public int getCodeLenght(){
        return CodeLength;
    }

    public int getColorAmount(){
        return ColorAmount;
    }

    public int getMaxAttemps(){
        return MaxAttemps;
    }

    @Override 
    public String toString(){
        return ColorAmount + " colors, " + CodeLength + " pawns, " + MaxAttemps + " attempts";
    }
}
