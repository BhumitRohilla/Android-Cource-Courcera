package mooc.vandy.java4android.calculator.logic;

import java.util.HashMap;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    //Here static const. integer are made
    public static final int add=1;
    public static final int substract=2;
    public static final int multiple=3;
    public static final int divide=4;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;
        
    }

    

    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO - Put your code here.

        Object general; //Creating general object which is initialized in swith statement

        //Swith statement is used instead of if-else statement
        switch (operation){
            case add:{
                general=new Add(argumentOne,argumentTwo);
                break;
            }
            case substract:{
                general=new Subtract(argumentOne,argumentTwo);
                break;
            }
            case multiple:{
                general=new Multiply(argumentOne,argumentTwo);
                break;
            }
            case divide: {
                general = new Divide(argumentOne, argumentTwo);
                break;
            }
            default:{
                general=new Dummy(); //Dummy class as default argument is required
            }
        }
        //Printing the result
        mOut.print(general.toString());
    }
}
