/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class S_Winternight_Stories extends OTHER {
    private char mana[] = {'1', '1', 'U'};
    private String[] keywords = {"card", ":draw"};

    public S_Winternight_Stories() {
        
    }
    public S_Winternight_Stories(boolean thing) {
        // choice: harmonize
        mana[2] = '1';
        mana[3] = '1';
        mana[4] = 'U';
    }

    public int getValue() {
        return 0;
    }
    
    public char[] getMana() {
        return mana;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int choiceHarmonize(CREATURE[] myCreatures) {
        int choice = -1;
        for (int i = 0; i < myCreatures.length; i++) {

        }
        return choice; //if -1, don't tap a creature to cast
    }

    


    
}
