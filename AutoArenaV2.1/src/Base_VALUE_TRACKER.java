import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* @author Ryan Lake 9/1/2025
 * Needed:
 * Store values for each decision
 * Do I plan out multiple decision choices? (if I do this, then this, etc, then pick best outcome, take action)
 * Do I make static choices? (pick highest value, take action)
 * 
 * This is going to be hard coded; I am going to make it generic when easy to, but don't expect a lot of that.
 */



public class Base_VALUE_TRACKER {
    TreeMap<Integer, CREATURE> creatureCastValueMap = new TreeMap<>();
    TreeMap<Integer, LAND> landPlayValueMap = new TreeMap<>();
    TreeMap<Integer, OTHER> otherCastValueMap = new TreeMap<>();
    Map<CARD, Integer> cardsInHandMap = new HashMap<>();
    private int turn;
    private LAND[] myLands;
    private CREATURE[] myCreatures;
    private OTHER[] myOther;
    

    public Base_VALUE_TRACKER() {
        turn = 0;
    }
    /*
     * adds a card to playable cards, then adds it to corresponding Map for its type
     */
    public void addCard(CARD card) {
        cardsInHandMap.put(card, cardsInHandMap.getOrDefault(card, 0) + 1);
        if (card instanceof LAND) {
            if (!landPlayValueMap.containsValue(card)) {
                landPlayValueMap.put(0, (LAND) card);
            }
        }
        else if (card instanceof CREATURE) {
            if (!creatureCastValueMap.containsValue(card)) {
                creatureCastValueMap.put(0, (CREATURE) card);
            }
        }
        else if (card instanceof OTHER) {
            if (!landPlayValueMap.containsValue(card)) {
                otherCastValueMap.put(0, (OTHER) card);
            }
        }
    }
    /* Pseudocode for updating a value:
     * LANDS:
     * 1) Calculate potential mana (current mana or current mana + 1 if play untapped land)
     * how much mana do I have?
     * can I play a land for turn?
     * how many untapped lands do I have?
     * how many tapped lands do I have?
     * if I have both:
     *      if all my untapped lands will enter tapped next turn, play untapped land
     * 2)
     * 3)
     * CREATURES:
     * 
     * OTHER:
     * if no creatures, reduce value of all 'other' by set amount
     */
    public void updateValues() {
        //updates values of all cards in creatureCastValueMap
        for (CREATURE i : creatureCastValueMap.values()) {
            creatureCastValueMap.put(i.getValue(), i);
        }
    }
    public void castBestCard() {
        if (creatureCastValueMap.lastKey() <= 0) {
            //pass to next phase
            // exit this function
        }
        CARD bestCard = creatureCastValueMap.get(creatureCastValueMap.lastKey());
        if (cardsInHandMap.put(bestCard, cardsInHandMap.get(bestCard) - 1) <= 1) {
            cardsInHandMap.remove(bestCard);
        }
        // return value means cards left, keep, otherwise remove
    }
}
