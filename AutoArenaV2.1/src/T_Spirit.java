/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class T_Spirit extends CREATURE {
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords;

    public T_Spirit(int endureValue) {
        power = endureValue;
        toughness = endureValue;
        tapped = false; // how to program authority of the consul?
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
