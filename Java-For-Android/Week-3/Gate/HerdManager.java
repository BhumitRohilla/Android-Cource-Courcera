package mooc.vandy.java4android.gate.logic;

import java.util.Random;

import mooc.vandy.java4android.gate.ui.OutputInterface;

/**
 * This class uses your Gate class to manage a herd of snails.  We
 * have supplied you will the code necessary to execute as an app.
 * You must fill in the missing logic below.
 */
public class HerdManager {
    /**
     * Reference to the output.
     */
    private OutputInterface mOut;

    /**
     * The input Gate object.
     */
    private Gate mWestGate;

    /**
     * The output Gate object.
     */
    private Gate mEastGate;

    /**
     * Maximum number of iterations to run the simulation.
     */
    private static final int MAX_ITERATIONS = 10;

    /**
     * Constructor initializes the fields.
     */
    public HerdManager(OutputInterface out,Gate westGate, Gate eastGate) {
        mOut = out;
        mWestGate = westGate;
        mWestGate.open(Gate.IN);

        mEastGate = eastGate;
        mEastGate.open(Gate.OUT);
    }

    // TODO -- Fill your code in here
    public static final int HERD = 24;

    public void simulateHerd(Random rand){
        int pen=HERD;
        int pasture=0;
        mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        for(int i=0;i<10;++i){
            int count=0;
            if(pen==HERD){
                count=mEastGate.thru(rand.nextInt(pen)+1);
                pen+=count;
            }
            else if(pasture==HERD){
                count=mWestGate.thru(rand.nextInt(pasture)+1);
                pen+=count;
            }
            else{
                int randGate=rand.nextInt(2);
                if(randGate==0){
                    count=mWestGate.thru(rand.nextInt(pasture)+1);
                    pen+=count;
                }
                else{
                    count=mEastGate.thru(rand.nextInt(pen)+1);
                    pen+=count;
                }
            }
            pasture=HERD-pen;
            mOut.println("There are currently " + pen + " snails in the pen and " + pasture + " snails in the pasture");
        }
    }
    
}
