package AnimalPackage;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        // Animal an = new Animal();

        // En lista som innehåller några djur
        var animals = new ArrayList<Animal>();

        // Lägg till några djur
        animals.add(new Dog());
        animals.add(new Cat());

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getName());
            animal.eat();
        }



    }
}
