package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {

    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    public Building(int length,int width,int lotLength, int lotWidth){
        mLength=length;
        mWidth=width;
        mLotLength=lotLength;
        mLotWidth=lotWidth;
    }

    //accssor
    public int getLength(){
        return (mLength);
    }
    public int getWidth(){
        return (mWidth);
    }
    public int getLotLength(){
        return (mLotLength);
    }
    public int getLotWidth(){
        return (mLotWidth);
    }

    //mutator
    public void setLength(int length){
        mLength=length;
    }
    public void setWidth(int width){
        mWidth=width;
    }
    public void setLotLength(int lotLength){
        mLotLength=lotLength;
    }
    public  void setLotWidth(int lotWidth){
        mLotWidth=lotWidth;
    }

    public int calcBuildingArea(){
        return (mLength*mWidth);
    }
    public int calcLotArea(){
        return (mLotLength*mLotWidth);
    }

    @Override
    public String toString(){
        String s = mLength + "+" + mWidth +" building";
        return s;
    }
    public boolean equals(Object other){
        boolean flag=false;
        if(other instanceof Building){
            if(this.calcBuildingArea()==((Building) other).calcBuildingArea()){
                flag=true;
            }
        }
        return flag;
    }
}
