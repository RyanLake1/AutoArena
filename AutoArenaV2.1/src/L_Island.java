/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Island extends LAND {
    private char mana[] = {'U'};
    private char basicLandType[] = {'U'};
    private boolean tapped;

    public L_Island() {
        tapped = false;
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
