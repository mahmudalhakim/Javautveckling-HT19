package AnimalPackage;

/**
 * Cat är en subklass
 * Cat ärver från Animal
 */
public class Cat extends Animal{

    public void meow(){
        System.out.println("Meow...");
    }


    /**
     * En instansmetod i klassen Cat
     * som överrider (överskuggar)
     * den abstrakta metoden eat
     * i superklassen Animal
     */
    @Override
    public void eat() {
        System.out.println("I eat cat food!");
    }

    @Override
    public String toString() {
        return "I'm a " + this.getColor() + " cat!";
    }
}
