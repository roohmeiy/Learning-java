package coupling;
public class LooseCouplingMain {
    public static void main(String[] args) {
        DieselEngine de=new DieselEngine();
        Car2 car2=new Car2(de);
//        Car2 car2= new Car2();
        car2.startCar();

    }
}
