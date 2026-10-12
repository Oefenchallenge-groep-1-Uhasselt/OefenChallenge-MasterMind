package MasterMind;

/**
 * @return strategy
 * @throw IllegalArgumentException if name is not a strategy
 * StrategyFactory
 */
class StrategyFactory {
    public static Strategy create(String name){
        if("bot Move".equals(name)){
            return new BotStrategy();
        }else if("player Move".equals(name)){
            return new PlayerStrategy();
        }else{
            throw new IllegalArgumentException("Niet gekende strategy" + name);
        }
    }
}
