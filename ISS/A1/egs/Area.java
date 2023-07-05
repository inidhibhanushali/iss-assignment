package egs;
//Overloading - Polymorphism
public class Area {
    final double pi=3.14;
    public double calcArea(double radius){
        return radius*radius*pi;
    }
    public double calcArea(double len,double width){
        return len*width;
    }
}
