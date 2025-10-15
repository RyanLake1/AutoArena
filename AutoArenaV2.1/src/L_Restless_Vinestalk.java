/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Restless_Vinestalk extends LAND {
    private char mana[] = {'U', 'G'};
    private char basicLandType[] = {'\0'};
    private boolean tapped;
    private char manlandActivation[] = {'3', 'U', 'G'};

    public L_Restless_Vinestalk() {
        tapped = true;
    }

    public char[] getMana() {
        return mana;
    }

    public char[] getManlandCost() {
        return manlandActivation;
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
