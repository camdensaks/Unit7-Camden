public class Car {
    public int numDoors;
    public int topSpeed;

    public Car(int door, int speed){
        numDoors = door;
        topSpeed = speed;
    }

    public int getDoors(){
        return numDoors;
    }

    public int getSpeed(){
        return topSpeed;
    }

    public int calcPassengers(){
        int numPassengers = 0;
        if(numDoors == 2){
            numPassengers = 2;
        }
        if(numDoors == 4){
            numPassengers = 5;
        }
        return numPassengers;
    }

    public String toString(){
        return "Car, number of doors: " + numDoors + " top speed: " + topSpeed ;
    }


}
