package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    // TODO - add your solution here.
    private int first,second;
    //Constructor
    public Multiply(int first, int second){
        this.first=first;
        this.second=second;
    }

    @Override
    public String toString(){
        return Integer.toString(first*second);
    }
}
