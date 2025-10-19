/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class E_Innkeepers_Talent extends OTHER {
    private char mana[] = {'1', 'G'};
    private int level;
    private char[] levelCost;
    private String[] keywords = {"give counter", ":1", "give keyword", ":ward", ":1"};

    public E_Innkeepers_Talent() {
        level = 1;
        levelCost[0] = 'G';
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
    
    public void choiceLevel(){

    }

    public int getLevel(){
        return level;
    }

    public char[] getLevelCost(){
        return levelCost;
    }

    public int target(CARD[] my_creatures) {
        int choice = 0;
        for (int i = 0; i < my_creatures.length; i++) {

        }
        return choice;
    }

    


    
}
