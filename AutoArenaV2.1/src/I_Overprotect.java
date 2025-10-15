/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class I_Overprotect extends CARD {
    private char mana[] = {'1', 'G'};
    private String[] keywords = {"hexproof", "indestructible", "trample"};

    public I_Overprotect() {
        
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
