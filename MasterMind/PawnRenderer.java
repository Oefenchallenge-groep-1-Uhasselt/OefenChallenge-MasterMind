package MasterMind;

/**  
 * PawnRenderer  
 * 
 * Deze klasse bewaart 1 method die ervoor zorgt dat pawns van hun getalvorm omgezet worden tot een string met de beginletter van de kleur die ze hebben.
 * indien de getalwaarde boven 6 ligt, dan returnen we gewoon een string van datzelfde getal.  
**/
public class PawnRenderer {
    
    // method die Integer-representatie van pion omzet naar String-representatie
    public static String RenderPawn(Integer pawn) {         
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

