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
    TreeMap<Integer, CARD> cardCastValue = new TreeMap<>();
    Map<CARD, Integer> castableCards = new HashMap<>();


    public Base_VALUE_TRACKER(CARD card) {
        castableCards.put(card, castableCards.getOrDefault(card, 0) + 1);
        // adds a card to castableCards
        if (!cardCastValue.containsValue(card)) {
            cardCastValue.put(0, card);
        }
    }

    public void castBestCard() {
        if (cardCastValue.lastKey() <= 0) {
            //pass to next phase
            // exit this function
        }
        CARD bestCard = cardCastValue.get(cardCastValue.lastKey());
        castableCards.put(bestCard, castableCards.get(bestCard) - 1);
        // return value means cards left, keep, otherwise remove
    }
}
