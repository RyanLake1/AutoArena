/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class L_Willowrush_Verge extends LAND {
    private char mana[] = {'U'};
    private char basicLandType[] = {'\0'};
    private boolean tapped;

    public L_Willowrush_Verge() {
        tapped = false;
        // surveil decision
    }

    public char[] getMana() {
        return mana;
    }

    public char[] getMana(LAND[] myLands) {
        for (int i = 0; i < myLands.length; i++) {
            char[] landTypes = myLands[i].getBasicLandType();
            for (int j = 0; j < landTypes.length; j++) {
                if (landTypes[j] == 'G' || landTypes[j] == 'U') {
                    mana[1] = 'G';
                    return mana;
                }
            }
        }
        mana[1] = '\0';
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
