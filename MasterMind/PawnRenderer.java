package MasterMind;

/**  
 * PawnRenderer  
 * 
 * Deze klasse bewaart 1 method die ervoor zorgt dat pawns van hun getalvorm omgezet worden tot een string met de beginletter van de kleur die ze hebben.
 * indien de getalwaarde boven 6 ligt, dan returnen we gewoon een string van datzelfde getal.  
 * 
 * @author groep 1
**/
public class PawnRenderer {
    /**
     * @pre pawn != null
     * @pre pawn > 0
     * @return pawn or Char
     */
    // method die Integer-representatie van pion omzet naar String-representatie
    public static String RenderPawn(Integer pawn) {  
        if(pawn == null){
            throw new IllegalArgumentException("pawn can not be null");
        }       
        if(pawn <= 0){
            throw new IllegalArgumentException("pawn can not be negative");
        }

        switch (pawn) {             
            case 1:                 
                return "R"; // rood             
            case 2:                 
                return "B"; // blauw             
            case 3:                 
                return "Y"; // geel (yellow)             
            case 4:                 
                return "G"; // groen              
            case 5:                 
                return "O"; // oranje             
            case 6:                 
                return "P"; // paars              
            default:                 
                return String.valueOf(pawn);         
        }     
    }      
}

