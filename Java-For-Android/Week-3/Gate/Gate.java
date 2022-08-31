package mooc.vandy.java4android.gate.logic;

import androidx.annotation.NonNull;

/**
 * This file defines the Gate class.
 */
public class Gate {
    // TODO -- Fill in your code here
    public static final int IN=1;
    public static final int OUT=-1;
    public static final int CLOSED=0;

    private int mSwing;
    //Constructor
    public Gate(){
        mSwing=0;
    }

    //modifier
    public boolean setSwing(int dir){
        boolean flag= false;
        if(dir==IN || dir==OUT || dir==CLOSED){
            mSwing=dir;
            flag=true;
        }
        return flag;
    }
    public boolean open(int dir){
        boolean flag=false;
        if(dir!=CLOSED){
            flag=setSwing(dir);
        }
        return flag;
    }
    public void close(){
        setSwing(CLOSED);
    }

    //Accesser
    public int getSwingDirection(){
        return mSwing;
    }
    public int thru(int count){
        switch (getSwingDirection()){
            case IN:{
                return count;
            }
            case OUT:{
                return (-1*count);
            }
            default:{
                return 0;
            }
        }
    }


    @NonNull
    @Override
    public String toString() {
        String result;
        switch (getSwingDirection()) {
            case CLOSED:
                result = ("This gate is closed");
                break;
            case IN:
                result = ("This gate is open and swings to enter the pen only");
                break;
            case OUT:
                result = ("This gate is open and swings to exit the pen only");
                break;
            default:
                result = ("This gate has an invalid swing direction");
                break;
        }
        return result;
    }
}
