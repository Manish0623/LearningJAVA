class Circle {
    private final double radius;

public Circle(double radius) {
    this.radius = radius;
}

public double getRadius(){
    return radius;
}


public double getVolume(){
    return 4 * (Math.PI * radius * radius * radius) /3;
}

public double getSurfaceArea(){
    return Math.PI * radius * radius;
}

}

public class circleUsingConstructor {
    public static void main(String [] args){
        Circle c = new Circle(9.9);

        System.out.println("Radius of Circle:" + c.getRadius());
        System.out.println(" Volume of the circle : " + c.getVolume());
        System.out.println("Surfacearea of circle : " + c.getSurfaceArea());
    }
}
