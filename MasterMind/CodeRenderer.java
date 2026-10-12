package MasterMind;

/**
 * 
 * CodeRenderer
 * 
 * Deze klasse bewaart 1 method die ervoor zorgt dat codes van hun getalvorm omgezet kunnen worden tot een string waarbij voor elke pawn geldt dat het de beginletter van de kleur die ze hebben is.
 *  
 */
public class CodeRenderer {
    public String[] RenderCode(Integer[] code) {
        int codeLength = code.length;
        String[] codeString = new String[codeLength];

        for(int pawnIndex = 0; pawnIndex < codeLength; pawnIndex++) {
            codeString[pawnIndex] = PawnRenderer.RenderPawn(code[pawnIndex]);
        }

        return codeString;
    }
}
