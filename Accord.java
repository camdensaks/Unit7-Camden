public class Accord extends Sedan{
    public static final int height = 5;
    public int mpg;

    public Accord(){
    super(4,130);
    }

    public Accord(int mpg){
        super(4,130);
        this.mpg = mpg;
    }

    public int getHeight(){
        return height;
    }

    public String toString(){
        return super.toString() + "[Accord]";
    }


}
