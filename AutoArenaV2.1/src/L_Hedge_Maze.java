/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Hedge_Maze extends LAND {
    private char mana[] = {'U', 'G'};
    private char basicLandType[] = {'U', 'G'};
    private boolean tapped;
    int value;

    public L_Hedge_Maze() {
        tapped = true;
        // surveil decision
    }

    public int getValue() {
        return 0;
    }
    
    public char[] getMana() {
        return mana;
    }
    
    public void tapLand() {
        tapped = true;
    }

    public void untapLand() {
        tapped = false;
    }
    
    public boolean isTapped() {
        return tapped;
    }

    public char[] getBasicLandType(){
        return basicLandType;
    }

    
}
