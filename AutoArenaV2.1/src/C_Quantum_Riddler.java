/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Quantum_Riddler extends CREATURE {
    private char mana[] = {'1', '1', '1', '1', 'U'};
    private char warpMana[] = {'1','U'};
    private int power;
    private int toughness;
    boolean tapped;
    boolean summoningSick;  //how to program summoning sick? do for all
    private String[] keywords = {"card", ":draw", "flying"};

    public C_Quantum_Riddler() {
        power = 4;
        toughness = 6;
        tapped = false; // how to program authority of the consul?
    }

    public int getValue() {
        return 0;
    }
    
    public char[] getMana() {
        return mana;
    }

    public char[] getChoiceMana() {
        return warpMana;
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

    


    
}
