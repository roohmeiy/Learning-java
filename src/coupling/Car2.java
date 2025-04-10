package coupling;

//loose coupling
public class Car2 {
    Engine engine;
    Car2(Engine engine){
        this.engine=engine;
    }

    //tight coupling
//    Car2(){
//        DieselEngine de= new DieselEngine();
//        de.start();
//    }
    void startCar(){
        engine.start();
        System.out.println("Car started");
    }
}
