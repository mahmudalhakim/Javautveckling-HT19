package AnimalPackage;

/**
 * Dog är en subklass som ärver från Animal
 */
public class Dog extends Animal {

    public void bark(){
        System.out.println("I can bark!");
    }

    @Override
    public void eat() {
        System.out.println("I eat dog food!");
    }

    @Override
    public String toString() {
       return ("I'm a " + getColor() + " dog!");
    }
}
