/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Llanowar_Elves extends CREATURE {
    private char mana[] = {'G'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"mana dork", ":G"};

    public C_Llanowar_Elves() {
        power = 1;
        toughness = 1;
        tapped = false; // how to program authority of the consul?
    }

    public int getValue() {
        return 0;
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
        tapped = true;
        return power;
    }

    public void putCounters(int counters) {
        power += counters;
        toughness += counters;
    }

    


    
}
