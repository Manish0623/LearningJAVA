//package com.example;


class vehicle{
void move(){
    System.out.println(" the vehicle is moving ");
}
}
class car extends vehicle{
    @Override
    void move(){
        System.out.println(" the bike is moving. ");
    }
}

class bike extends vehicle{
    @Override
    void move(){
        System.out.println(" the bike is moving");
    }
}



public class Main {
    public static void main(String[] args){
        vehicle v = new vehicle();
        vehicle b = new bike();
        vehicle c = new car();

        v.move();
         b.move();
          c.move();
    }
}
