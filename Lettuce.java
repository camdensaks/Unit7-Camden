public class Lettuce extends Vegetable {

    public Lettuce(){
        super("Lettuce", "Leafy Greens");
    }

    public String feed(){
    return "No need to feed them!";
    }

    public String water(){
    return "Water on a daily basis!";
    }

    public String harvest(){
        return "Harvest after 8 weeks of planting";
    }
}
