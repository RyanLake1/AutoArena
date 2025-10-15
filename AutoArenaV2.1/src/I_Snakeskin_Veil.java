/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class I_Snakeskin_Veil extends CARD {
    private char mana[] = {'G'};
    private String[] keywords = {"hexproof"};

    public I_Snakeskin_Veil() {
        // +1 counter (damage calc and ouroboroid)
    }

    public char[] getMana() {
        return mana;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int target(CARD[] my_creatures) {
        int choice = 0;
        for (int i = 0; i < my_creatures.length; i++) {

        }
        return choice;
    }

    


    
}
