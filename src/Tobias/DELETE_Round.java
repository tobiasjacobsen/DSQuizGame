/**
 * @author Tobias
 */
package Tobias;

public class DELETE_Round {
    private int round = 10;
    
    public int getRound() {
        return round;
    }
    
    public int subtractRound(int input) {
        round = round + input;
        return round;
    }
    
}