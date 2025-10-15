/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Forest extends LAND {
    private char mana[] = {'G'};
    private char basicLandType[] = {'G'};
    private boolean tapped;

    public L_Forest() {
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
