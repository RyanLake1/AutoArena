/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Breeding_Pool extends LAND {
    private char mana[] = {'U', 'G'};
    private char basicLandType[] = {'U', 'G'};
    private boolean tapped;

    public L_Breeding_Pool(boolean etbTapped) {
        tapped = etbTapped;
        // lose two tife if untapped
        // write to input software to take action
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
