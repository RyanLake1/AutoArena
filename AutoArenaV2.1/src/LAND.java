/** @author Ryan Lake 9/1/2025
 * Needed:
 * manaCost
 * cardType
 * attributes? (removal, draw, damage)
 * inHand?
 */
public abstract class LAND extends CARD {
    // (X - x cost, 1 - any, W - white, U - blue, B - black, R - red, G - green, C - colorless)
    char mana[];
    char basicLandType[];
    boolean tapped;
    // int value;
    //String attributes[];
    

    abstract char[] getMana();

    abstract void tapLand();

    abstract void untapLand();

    abstract boolean isTapped();

    abstract char[] getBasicLandType();
    
    // abstract int getValue();
    //abstract String[] getAttributes();
}
