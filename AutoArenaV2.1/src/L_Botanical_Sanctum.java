/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Botanical_Sanctum extends LAND {
    private char mana[] = {'U', 'G'};
    private char basicLandType[] = {'\0'};
    private boolean tapped;

    public L_Botanical_Sanctum(int otherLands) {
        if (otherLands < 3)
            tapped = false;
        else
            tapped = true;
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
