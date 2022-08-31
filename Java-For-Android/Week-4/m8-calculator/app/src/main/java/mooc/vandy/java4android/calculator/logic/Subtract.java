package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Subtract operation.
 */
public class Subtract {
    // TODO - add your solution here.
    private int first,second;
    //Constructor
    public Subtract(int first, int second){
        this.first=first;
        this.second=second;
    }


    @Override
    public String toString(){
        return Integer.toString(first-second);
    }
}
