package AnimalPackage;

/**
 * Animal är en superklass
 */
public abstract class Animal {

    // Instansvariabel
    protected String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(){
        this.color="";
    }

    /**
     * En abstrakt instansmetod i klassen Animal
     */
    public abstract void eat();

    /**
     * En instansmetod i klassen Animal
     */
    public void sleep(){
        System.out.println("I can sleep");
    }
}
