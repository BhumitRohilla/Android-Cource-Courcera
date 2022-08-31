package mooc.vandy.java4android.calculator.logic;

import androidx.annotation.NonNull;

/**
 * Perform the Divide operation.
 */
public class Divide {
    // TODO - add your solution here.
    private int first,second;
    //Constructor
    public Divide(int first, int second){
        this.first=first;
        this.second=second;
    }

    @NonNull
    @Override
    public String toString(){
        String str=Integer.toString(first/second);
        str+=" R: ";
        str+=Integer.toString(first%second);
        return str;
    }
}
