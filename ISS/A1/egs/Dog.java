package egs;
//Inheritance - Overiding
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makesSound() {
        System.out.println("Woof Woof");
    }
}