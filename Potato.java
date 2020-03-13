public class Potato extends Vegetable{

    public Potato(){
        super("Potato", "Root");
    }

    public String feed(){
    return "No need to feed them!";
    }

    public String water(){
    return "Water them daily!";
    }

    public String harvest(){
        return "Harvest after 8 weeks of planting";
    }
}
