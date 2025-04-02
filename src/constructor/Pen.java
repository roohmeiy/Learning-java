package constructor;

public class Pen{
    String  brand;
    Color color;
    Pen(String brand,Color color){
        this.brand=brand;
        this.color=color;

    }

    Pen(Pen other){
        this.brand=other.brand;
        //shallow copy
//        this.color=other.color;
        //deep copy
        this.color = new Color(other.color.color);
    }
}
