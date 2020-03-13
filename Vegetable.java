public abstract class Vegetable implements Growable {
    private String name;
    private String type;
    private String instructions;

    public Vegetable(String name, String type){
        this.name = name;
        this.type = type;
        setInstructions("Feeding" + feed() + " Watering" + water() + " Harvest" + harvest());
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public String getInstructions(){
        return instructions;
    }

    private void setInstructions(String instructions){
        this.instructions = instructions;
    }

    public String getType(){
        return type;
    }

}
