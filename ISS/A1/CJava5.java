import egs.*;
// Encapsulation, Abstraction, Inheritance, and Polymorphism
public class CJava5 {
    
    public static void main(String[] args) {
        System.out.println();
        //overidding
        Animal cat = new Cat("Eddy");//cat obj
        Animal dog = new Dog("Tommy");//dog obj
        //object method call
        dog.makesSound();
        cat.makesSound();
        System.out.println();
        //overloading
        Area area = new Area();
        System.out.println("Area of Rectangle = "+area.calcArea(10.0, 5.0)+" sq.unit");
        System.out.println("Area of Circle = "+area.calcArea(5)+" sq.unit");
        System.out.println();
    }
}
