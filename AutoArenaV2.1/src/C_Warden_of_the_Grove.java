/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Warden_of_the_Grove extends CREATURE {
    private char mana[] = {'2', 'G'};
    private int power;
    private int toughness;
    private int counters;
    boolean tapped;
    private String[] keywords = {"counters"};

    public C_Warden_of_the_Grove() {
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
        this.counters = counters;
    }

    public int[] choiceEndure() {
        //return 1 for left choice, 2 for right choice, then number of counters on warden of the grove
        int[] value = {1, counters};
        return value;
    }


    
}
