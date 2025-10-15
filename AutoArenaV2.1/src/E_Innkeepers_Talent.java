/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class E_Innkeepers_Talent extends CARD {
    private char mana[] = {'1', 'G'};
    private int level;
    private char[] levelCost;

    public E_Innkeepers_Talent() {
        level = 1;
        levelCost[0] = 'G';
    }

    public char[] getMana() {
        return mana;
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
