/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class T_Map extends CARD {
    private char mana[] = {'1'};
    private String[] keywords = {"counter", "card draw"};

    public T_Map() {
        
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
