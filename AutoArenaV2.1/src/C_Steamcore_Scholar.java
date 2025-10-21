/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Steamcore_Scholar extends CREATURE {
    private char mana[] = {'1', '1', 'U'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"card",":loot", "flying", "vigilance"};
    int value;

    public C_Steamcore_Scholar() {
        power = 2;
        toughness = 2;
        tapped = false; // how to program authority of the consul?
    }

    public char[] getMana() {
        return mana;
    }
    
    public int getPower() {
        return power;
    }

    public int getValue() {
        return 0;
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

    public void choiceDiscard() {
        //choose what to discard with etb;
        //probably lowest sum of value of cards to be discarded
    }

    


    
}
