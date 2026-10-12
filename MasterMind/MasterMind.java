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

    public void run() {
        // main game-loop

        boolean stopProgram = false;
        while(!stopProgram) {
            boolean PVPmode = askYNquestion("PVP?");
            if(PVPmode) { // 1v1 maker vs breaker
                // hier voert de human vs human code zich uit
            }
            else { // 1ve
                boolean HumanIsBreaker = askYNquestion("Breaker zijn?");
                if(HumanIsBreaker) { 
                    // hier voert de human vs bot code zich uit
                }
                else{
                    // hier voert de bot vs hum code zich uit
                }
            }
        }
    }

    private boolean askYNquestion(String prompt) {
        while (true) {
            String answer = System.console().readLine("%s (Y/N): ", prompt);

            if (answer.equalsIgnoreCase("Y")) {
                return true;
            }

            if (answer.equalsIgnoreCase("N")) {
                return false;
            }

            System.out.println("Invalid input. Please enter Y or N.");
        }
    }

}
