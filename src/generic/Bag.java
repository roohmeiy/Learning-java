package generic;

public class Bag <T>{
    T box;
    Bag (T box){
        this.box=box;
    }
     T getBox(){
        return box;
    }
     void display(){
        System.out.println(box);
    }
}
