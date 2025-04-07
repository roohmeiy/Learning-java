package interfaces;

public class Scooty implements Vehicle{
    public void start() {
        System.out.println("scooty starts with kick");
    }
    public void changeGear(int gears) {
        System.out.println("Scooty  has " + gears + "gears");
    }
}
