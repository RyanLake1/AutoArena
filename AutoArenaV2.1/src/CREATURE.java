/** @author Ryan Lake 9/1/2025
 * Needed:
 * manaCost
 * cardType
 * attributes? (removal, draw, damage)
 * inHand?
 */
public abstract class CREATURE extends CARD {
    // (X - x cost, 1 - any, W - white, U - blue, B - black, R - red, G - green, C - colorless)
    private int power;
    private int toughness;
    boolean tapped;
    String[] keywords;
    // int value;
    //String attributes[];
    

    abstract boolean isTapped();

    abstract int getPower();

    abstract int getToughness();

    abstract String[] getKeywords();
    
    // abstract int getValue();
    //abstract String[] getAttributes();
}
