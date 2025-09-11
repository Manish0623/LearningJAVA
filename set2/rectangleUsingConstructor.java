
class rectangle{
    private int length;
    private int breadth;


public rectangle(int length , int breadth){
    this.length = length;
    this.breadth = breadth;
}

public int getLength(){
    return length;
}

public int getBreadth(){
    return breadth;
}


public double getArea(){
    return length * breadth;
}

public double getPerimeter(){
    return 2 * (length + breadth);
}

}



public class rectangleUsingConstructor {
    public static void main(String[] args) {
        rectangle r = new rectangle( 5,10);


        System.out.println(" Length of rectangle : " + r.getLength());
         System.out.println(" Breadth of rectangle : " + r.getBreadth());

System.out.println("Area of the rectangle : "+  r.getArea());
System.out.println("perimeter of the rectangle : "+  r.getPerimeter());
    }}

