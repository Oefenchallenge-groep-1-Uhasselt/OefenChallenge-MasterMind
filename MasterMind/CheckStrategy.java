package MasterMind;
/**
 * @author groep 1
 * CheckStrategy
 */
public class CheckStrategy implements Strategy{
    private final Strategy wrapped;

    public CheckStrategy(Strategy wrapped){
        if(wrapped == null){
            throw new IllegalArgumentException( "Wrapped can not be null")
        }
        this.wrapped = wrapped;
    }

    @Override 
    public int eval(GameBoard gameBoard){}
}
