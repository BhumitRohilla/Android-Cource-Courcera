package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to fill the corral with snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class FillTheCorral {
    /**
     * Reference to the OutputInterface.
     */
    private OutputInterface mOut;

    /**
     * Constructor initializes the field.
     */
    FillTheCorral(OutputInterface out) {
        mOut = out;
    }

    // TODO -- Fill your code in here
    public void setCorralGates(Gate[] gate,Random rand){
        mOut.println("Initial gate setup:");
        for(int i=0;i<gate.length;++i){
            gate[i].setSwing(rand.nextInt(3)-1);
            mOut.println("Gate "+i+": "+gate[i].toString());
        }
    }
    public boolean anyCorralAvailable(Gate[] corral){
        boolean flag=false;
        for(int i=0;i<corral.length;++i){
            if(corral[i].getSwingDirection()==Gate.IN){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public int corralSnails(Gate[] corral, Random rand){
        int pasture=5;
        int count=0;
        int gateIndex;
        int randNum=0;
        while (pasture>0){
            gateIndex=rand.nextInt(corral.length);
            randNum=rand.nextInt(pasture)+1;
            mOut.println(randNum+" are trying to move through corral "+gateIndex);
            pasture-=corral[gateIndex].thru(randNum);
            count++;
        }
        mOut.println("It took "+count+" attempts to corral all of the snails.");
        return count;
    }
}
