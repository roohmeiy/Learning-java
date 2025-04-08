package interfaces;

interface I1 {
    void show1();
    default void play(){ //can be default or public
        System.out.println("This is default fun");
    } //now don't need to provide body for these fun (default and static)

}
