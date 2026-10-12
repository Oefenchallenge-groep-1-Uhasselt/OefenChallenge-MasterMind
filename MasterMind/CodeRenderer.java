package MasterMind;

public class CodeRenderer {
    public String[] RenderCode(int[] code) {
        int codeLength = code.length;
        String[] codeString = new String[codeLength];

        for(int codeIndex = 0; codeIndex < codeLength; codeIndex++) {
            codeString[codeIndex] = PawnRenderer.RenderPawn(code[codeIndex]);
        }

        return codeString;
    }
}
