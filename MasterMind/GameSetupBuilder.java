package MasterMind;

public class GameSetupBuilder {
    public static final int default_color = 6;
    public static final int default_code_lenght = 4;
    public static final int default_max_attemps = 10;

    private int colorAmount = default_color;
    private int codeLength = default_code_lenght;
    private int MaxAttemps = default_max_attemps;

    /**
     * @pre ColorAmount > 0
     * @post de builder gebruikt colorAmount voor de volgende build
     * @param ColorAmount
     * @return
     */
    public GameSetupBuilder setColorAmount(int ColorAmount){
        if(colorAmount <= 0){
            throw new IllegalArgumentException("ColorAmount can not be less than or equel to zero");
        }
        this.colorAmount = ColorAmount;
        return this;
    }

    /**
     * @pre codeLength > 0
     * @post de builder gebruikt codeLength voor de volgende build
     * @param codeLength
     * @return
     */
    public GameSetupBuilder setCodeLength(int codeLength){
        if(codeLength <= 0){
            throw new IllegalArgumentException("codeLength can not be less than or equel to zero");
        }
        this.codeLength = codeLength;
        return this;
    }

    public GameSetupBuilder setMaxAttemps(int MaxAttemps){
        if(MaxAttemps <= 0){
            throw new IllegalArgumentException("MaxAttemps can not be less than or equel to zero");
        }
        this.MaxAttemps = MaxAttemps;
        return this;
    }
}
