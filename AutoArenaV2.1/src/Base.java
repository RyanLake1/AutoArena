/* @author Ryan Lake 9/1/2025
 * Needed:
 * Autotap, auto-order triggers
 * Coding targeting (snakeskin veil, overprotect, innkeeper's talent, manland, pawpatch patrol)
 * Coding choices (innkeeper's talent (level up), manland, surveil land, terrasymbiosis, warden of the grove, multiversal passage)
 * 
 * Am I personally tracking gamestate? 
 *      I should; creating new arrays every time seems like too much, and I do not need to track hidden zones.
 *          What I need for this: seeing and updating when a permanent leaves the battlefield, if my spells resolve, 
 *          if something leaves the stack, if I get discarded
 *          (aren't there numbers on the left that keep track of num of cards in my hand as well?)
 *          
 * 
 *      I shouldn't; I should view the gamestate when I gain priority and rewrite everything
 *          What I need for this: a lot of overhead
 *      I could just do this at the beginning of my turn so that I make sure I am up to date without rewriting all the time.
 * 
 * Figure out values for everything after I write relevant code probably
 * 
 * Figure out how this can interact with arena
 * 
 * First priority: try to kill opp as fast as possible; can code being careful after
 * 
 * Next step in coding process: understand how to take input from a computer screen (arena; use simpler game to test),
 *      then put in input to take action (try to just be able to point and click right now; dragging will be necessary)
 */



public class Base {
    public static void main(String[] args) throws Exception {
        System.out.println("Starting!\n");
        int turn = 0;
        // neg turn is opponents
        CARD myHand[] = {};  
        LAND myLands[] = {};
        CREATURE myCreatures[] = {};
        CARD myOtherPermanents[] = {};
        CARD oppField[] = {}; //create blank creature class where I input keywords, power/toughness, etc
        /*create important things:
        planeswalker, kaito, deep cavern bat, unstoppable slasher, deathtouch creatures in general, flying/reach
        */
        // CARD oppHand[] = {};
        // CARD theStack[] = {};

        /*
         * at beginning of combat:
         * for each creature + otherPermanent, if have beginning_of_combat_trigger
         * I don't need to code this right? I need to code 
         */
    }
}


