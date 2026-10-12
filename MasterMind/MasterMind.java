package MasterMind;

/**
 * @author groep1
 * MasterMind
 */

public class MasterMind {
    private static MasterMind instantie;

    /**
     * Initialized the MasterMind object.
     */
    private MasterMind(){};

    /**
     * Part of the Singelton pattern to have only one MasterMind object at all time and
     * that makes it universally accessible
     * @return the singleton MasterMind object
     */
    public static MasterMind getInstance(){
        if(instantie == null){
            instantie = new MasterMind();
        }
        return instantie;
    }

    public static void main(String[] args) {
        try {
            getInstance().run();
        } catch (java.io.UncheckedIOException e) {
            System.out.println();
            System.out.println("Input closed, goodbye.");
        }
    }

}
