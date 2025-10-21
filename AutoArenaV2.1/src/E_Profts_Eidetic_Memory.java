/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class E_Profts_Eidetic_Memory extends OTHER {
    private char mana[] = {'1', 'U'};
    private String[] keywords = {"card", ":draw", "give counter", ":var", "beginning of combat trigger"};
    // could update "give counter" amount based on num of cards drawn this turn minus one
    int value;

    public E_Profts_Eidetic_Memory() {
        
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

    public int beginningOfCombatTrigger(CREATURE[] my_creatures) {
        int choice = 0;
        for (int i = 0; i < my_creatures.length; i++) {

        }
        return choice;
    }


    
}
