/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class I_Into_the_Flood_Maw extends OTHER {
    private char mana[] = {'U'};
    private String[] keywords = {"removal", ":bounce"};
    int value;
    

    public I_Into_the_Flood_Maw() {
        // choice: gift a fish
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

    public int target(CARD[] oppCards) {
        int choice = 0;
        for (int i = 0; i < oppCards.length; i++) {

        }
        return choice;
    }

    


    
}
