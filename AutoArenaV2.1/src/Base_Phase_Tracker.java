/* @author Ryan Lake 9/1/2025
 * Needed:
 * Store values for each decision
 * Do I plan out multiple decision choices? (if I do this, then this, etc, then pick best outcome, take action)
 * Do I make static choices? (pick highest value, take action)
 */



public class Base_Phase_Tracker {
    private int turn = 0;
    private boolean stack;


    public Base_Phase_Tracker() {

    }

    public void onStack(CARD[] cardsOnStack) {
        stack = true;
        // take action - prob don't need to have this variable if nothing else runs while this runs.
        // create a trigger class? ex: put counters (given target, given array of my creatures)


        stack = false;
    }

    public void firstMain() {
        turn++;


    }

    public void beginningOfCombat() {
        // innkeeper's talent, profts memory, ouroboroid
        /*
         * prioritize ouroboroid
         * if innkeeper's talent is level 2 or 3, next prioritize creatures without counters;
         * prioritize creatures that can attack;
         * then if our toughness == opp power or our power + 1 == opp toughness, prio that creature
         * then flying/trample/warden of the grove
         * then balanced distribution (2,1 and 1,1, counter on 1,1)
         */
    }

    public void declareAttackers(CREATURE[] myCreatures, CREATURE[] oppCreatures) {
        // could track my opp mana, num of cards in hand, my cards in hand
        /*
         * make decision what creatures to attack with
         * for (creature I attack with) {
         *      call creature.declareAttacker();
         *       - this function in creature clicks on creature in arena to declare it an attacker,
         *          then updates the creature's status to tapped
         *       - the objects themselves call arena to do specific interactions, like attacking & blocking
         *       - this still has to call arena to pass priority, but? that is the only call to arena this makes?
         * }
         */
    }

    public void afterBlockersDeclared() {
        // overprotect, into the flood maw to push damage/ save my creature, snakeskin veil if kills
        /*
         * auto damage probably (just click ok) - if consistently bad I should code it
         */

        
    }

    public void damageStep() {
        // distribute trample damage

        
    }

    public void secondMain() {
        turn++;

        
    }
}


