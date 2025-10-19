/** @author Ryan Lake 9/1/2025
 * Needed:
 * **BLANK OUTLINE OF CREATURE**
 */
public class C_Creature extends CREATURE {
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords;

    public C_Creature(int power, int toughness, String[] keywords) {
        this.power = power;
        this.toughness = toughness;

        tapped = false; // how to program authority of the consul?
    }
    
    public int getValue() {
        return 0;
    }
    
    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public boolean isTapped() {
        return tapped;
    }

    public String[] getKeywords() {
        return keywords;
    }

    


    
}
