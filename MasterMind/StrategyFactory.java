package MasterMind;

/**
 * @return strategy
 * @throw IllegalArgumentException if name is not a strategy
 * StrategyFactory
 * @author groep 1
 */
class StrategyFactory {
    public static Strategy create(String name){
        if(name == null){
            throw new IllegalArgumentException("name can not be null");
        }
        if("bot Move".equals(name)){
            return new BotStrategy();
        }else if("player Move".equals(name)){
            return new PlayerStrategy(input);
        }else{
            throw new IllegalArgumentException("Niet gekende strategy" + name);
        }
    }
}
