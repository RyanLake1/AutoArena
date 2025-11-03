/** @author Ryan Lake 9/1/2025
 * Needed:
 * 
 */
public class E_Authority_of_the_Consul extends OTHER {
    private char mana[] = {'W'};
    private String[] keywords = {"life gain", "hindrance"};
    // could update "give counter" amount based on num of cards drawn this turn minus one
    int value;

    public E_Authority_of_the_Consul() {
        
    }

    public int getValue() {
        return 0;
    }
    
    public char[] getMana() {
        return mana;
    }

    public String[] getKeywords() {
        return keywords;
    }


    
}
