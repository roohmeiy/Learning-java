package com.anudip.learning;

 class Rectangle {
     //declaring variables
    int length, width;
    int area;

    //parameterized constructor for taking values of length and breadth
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }

    //calculate area
    void area(){
        area=length*width;
    }
     public static void main(String[] args) {
        //creating two objects
        Rectangle Rectangle1=new Rectangle(20,20);
        Rectangle Rectangle2=new Rectangle(20,20);

        //calculating area of both objects
        Rectangle1.area();
        Rectangle2.area();

        //comparing and printing result of comparison of both objects' areas
        if(Rectangle1.area >Rectangle2.area)
            System.out.println("Rectangle1>Rectangle2");
        else if(Rectangle2.area>Rectangle1.area)
            System.out.println("Rectangle2>Rectangle1");
        else
            System.out.println("They are equal");
    }
}


