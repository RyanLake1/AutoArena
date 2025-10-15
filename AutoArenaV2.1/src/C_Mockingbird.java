/** @author Ryan Lake 9/1/2025
 * Needed:
 * **NOT IN USE**
 */
public class C_Mockingbird extends CREATURE {
    private char mana[] = {'X', 'U'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"flying"};
    private CREATURE copiedCreature;

    public C_Mockingbird() {
        power = 1;
        toughness = 1;
        tapped = false; // how to program authority of the consul?
    }

    public C_Mockingbird(CREATURE copy) {
        // creature a new version of copied creature with flying 
            // - flying variable for all my creatures?
            // can you ask if a class/ object has a variable called reach, flying, menace, etc?
        copiedCreature = copy;
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
