import java.util.ArrayList;

public class VegetableGarden {
    public static void main(String[] args) {
        ArrayList<Vegetable> garden = new ArrayList<Vegetable>();
        garden.add(new Broccoli());
        garden.add(new Potato());
        garden.add(new Lettuce());

        for (Vegetable v : garden) {
            System.out.println(v.getInstructions());
        }
    }
}