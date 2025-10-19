/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Azure_Beastbinder extends CREATURE {
    private char mana[] = {'1', 'U'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"vigilance", "unblockable"};
    int value;

    public C_Azure_Beastbinder() {
        power = 1;
        toughness = 3;
        tapped = false; // how to program authority of the consul?
        value = 0;
    }

    public int getValue() {
        return value;
    }
    public int getValue(CREATURE[] opp_field) {
        return value;
    }

    public char[] getMana() {
        return mana;
    }
    
    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }

    public boolean isTapped() {
        return tapped;
    }

    public String[] getKeywords() {
        return keywords;
    }

    public int declareAttacker() {
        if (tapped)
            return 0;
        return power;
    }

    public void putCounters(int counters) {
        power += counters;
        toughness += counters;
    }

    public boolean unblockable() {
        // if no creatures or 1 or 0 creatures with power 1 or less, is true
        return false;
    }

    public int target(CARD[] opp_field) {
        int choice = 0;
        for (int i = 0; i < opp_field.length; i++) {

        }
        return choice;
    }

    


    
}
