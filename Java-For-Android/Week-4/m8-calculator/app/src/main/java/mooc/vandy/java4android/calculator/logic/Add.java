package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

import java.io.OutputStream;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Add operation.
 */
public class Add {
    // TODO - add your solution here.
    private int first,second;
    //Constructor
    public Add(int first, int second){
        this.first=first;
        this.second=second;
    }

    @NonNull
    @Override
    public String toString(){
        return Integer.toString(first+second);
    }
}
