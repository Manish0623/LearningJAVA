class cylinder{
    private double radius;
    private double height;



    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getHeight(){
        return height;
    }

public void setheight(double height){
    this.height = height;
}

public double getVolume(){
    return   (Math.PI * radius *radius * height);
}

public double getSurfaceArea(){
    return 2*Math.PI * radius * (height + radius);
}

}




public class Cylinder {
public static void main(String[] args) {
    cylinder c = new cylinder();

    c.setRadius(5.2);
    c.setheight(6.5);

    System.out.println("Radius : " + c.getRadius());
    System.out.println("Height : " + c.getHeight());


System.out.println("volume : " + c.getVolume());
System.out.println("Surface area : " + c.getSurfaceArea());


}}    

