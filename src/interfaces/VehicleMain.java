package interfaces;

public class VehicleMain {
    public static void main(String[] args) {
        Scooty b= new Scooty();
        b.start();
        b.changeGear(0);
        Car c= new Car();
        c.start();
        c.changeGear(6);

    }
}
