public class Broccoli extends Vegetable {

    public Broccoli(){
        super("Broccoli", "Cruciferous");
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
