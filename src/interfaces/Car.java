package interfaces;

class Car implements Vehicle{

    public void start() {
        System.out.println("car starts with key");
    }
    public void changeGear(int gears) {
        System.out.println("Car has " + gears + "gears");
    }
}
