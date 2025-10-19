/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Multiversal_Passage extends LAND {
    private char mana[];
    private char basicLandType[];
    private boolean tapped;

    public L_Multiversal_Passage(boolean etbTapped, char color) {
        tapped = etbTapped;
        // lose two tife if untapped: in this or base code?
        mana[0] = color;
        basicLandType[0] = color;
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
