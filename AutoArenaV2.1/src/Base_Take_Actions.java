/* @author Ryan Lake 9/1/2025
 * Needed:
 * This is what executes output (control mouse and click) hopefully
 * All decision making is finished when reaching this point; this is just the execution
 */

public class Base_Take_Actions {
    
    public Base_Take_Actions(CARD card) {
        // if this is called, it casts cards
        if (card instanceof LAND) {
            //play card as land for turn
            //say land was played for turn - stored value is used to set value of playing lands this turn to 0
        }
        if (card instanceof CREATURE) {
            //cast creature
            //aka move mouse to card, move card to battlefield, make option
        }
    }

    public void choose(CARD card, int choice) {
        //base choice is 0, second is 1, etc
    }

    public void passPriority() {
        
    }

    public void mulligan() {
        
    }


}
