public class InheritanceTester {


    public static void main(String[] args){
        Car c = new Car(2, 150);
        System.out.println(c);
        Sedan s = new Sedan(4, 130);
        System.out.println(s);
        Accord a = new Accord(20);
        System.out.println(a);
        System.out.println(s.calcMPG(200, 10));
        System.out.println(s.getHeight());
        System.out.println(c.calcPassengers());
        System.out.println(c.getSpeed());
    }
}
