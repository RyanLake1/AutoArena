/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Pawpatch_Recruit extends CREATURE {
    private char mana[] = {'G'};
    private char kickerMana[] = {'2', 'G'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"counters", "trample"};

    public C_Pawpatch_Recruit(int num) {
        power = 3 - num; // num is 1 for no kicker, 2 for kicker
        toughness = 1;
        tapped = false; // how to program authority of the consul?
    }

    public char[] getMana() {
        return mana;
    }

    public char[] getOffspringMana() {
        return kickerMana;
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
