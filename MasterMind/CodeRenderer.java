package MasterMind;
/**
 * @author groep 1
 * CodeRenderer
 */
public class CodeRenderer {

    /**
     * @pre code != null
     * @pre code.lenght != 0
     * @post Gives a stringarray back
     * @return codeString
     */
    public String[] RenderCode(int[] code) {
        if(code == null){
            throw new IllegalArgumentException("Code can not be null");
        }
        if(code.length == 0){
            throw new IllegalArgumentException("Code lenght can not be 0");
        }
        int codeLength = code.length;
        String[] codeString = new String[codeLength];
        PawnRenderer pawnRenderer = new PawnRenderer();

        for(int codeIndex = 0; codeIndex < codeLength; codeIndex++) {
            codeString[codeIndex] = pawnRenderer.RenderPawn(code[codeIndex]);
        }

        return codeString;
    }
}
