package egs;

// Abstraction
abstract public class Animal implements LivingBeing{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makesSound();

    public String getName() {
        return name;
    }
}
