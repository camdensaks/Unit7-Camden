public class Sedan extends Car{
public static final int height = 5;

    public Sedan(){
        super(4, 130);
    }

    public int getHeight(){
        return height;
    }

    public int calcMPG(int miles, int gallon){
        int mpg = 0;
        mpg = miles * gallon;
        return mpg;
    }

    public String toString(){
        return super.toString() + "[Sedan]";
    }
}
