/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class C_Frenzied_Baloth extends CREATURE {
    private char mana[] = {'G', 'G'};
    private int power;
    private int toughness;
    boolean tapped;
    private String[] keywords = {"haste", "trample", "uncounterable"};
    int value;

    public C_Frenzied_Baloth() {
        power = 3;
        toughness = 2;
        tapped = false; // how to program authority of the consul?
        value = 30;
    }

    public int getValue() {
        return 0;
    }

    public int getValue(CREATURE[] opp_field, CREATURE[] my_field, OTHER[] myOthers, OTHER[] oppOthers) {
        value = 20;
        // start of value in combat
        boolean enters_tapped = false;
        for (int a = 0; a < oppOthers.length; a++) {
            if (oppOthers[a] instanceof E_Authority_of_the_Consul) {
                enters_tapped = true;
            }
        }
        if (!enters_tapped) {
            int blocking_toughness = 0;
            int blocking_power = 0;
            for (int i = 0; i < opp_field.length; i++) {
                if (opp_field[i].getPower() > blocking_power) {
                    blocking_power = opp_field[i].getPower();
                }
                if (opp_field[i].getToughness() > blocking_toughness) {
                    blocking_toughness = opp_field[i].getToughness();
                }
            }
            for (int i = 0; i < myOthers.length; i++) {
                if (myOthers[i] instanceof E_Innkeepers_Talent) {
                    blocking_power--;
                    blocking_toughness--;
                }
            }
            if (blocking_power < this.toughness && blocking_toughness <= this.power) {
                value += 20;
            } 
            else if (blocking_power == this.toughness && blocking_toughness <= this.power) {
                value += 10;
            }
        }
            // end of value in combat
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
        tapped = true;
        return power;
    }

    public void putCounters(int counters) {
        power += counters;
        toughness += counters;
    }

    


    
}
