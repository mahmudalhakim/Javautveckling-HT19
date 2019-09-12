package AnimalPackage;

public class AnimalMain {

    public static void main(String[] args) {

        System.out.println("--- Animal ---");
        //Animal a1 = new Animal();
        // Error: Animal is abstract; cannot be instantiated



        System.out.println("--- dog1 ---");
        Dog dog1 = new Dog();
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println(dog1);

        System.out.println("--- cat1 ---");
        Cat cat1 = new Cat();
        cat1.eat();
        cat1.sleep();
        cat1.setColor("yellow");
        cat1.meow();
        System.out.println(cat1);

    }
}
