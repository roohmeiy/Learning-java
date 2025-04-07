package interfaces;

public interface I1 {
    void show1();
    default void play(){ //can be default or public
        System.out.println("This is default fun");
    }
}
