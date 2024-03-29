public class Main {


    public static void main(String[] args) {

        // Klassvariabel = Statisk variabel
        System.out.println("Alla bilar har "
                + String.format("%2.0f", Car.MOMS * 100)
                + "% moms!");

        // Skapa ett objekt (en instans)
        // Skapa en referensvariabel
        Car car1;
        // Initiera ett objekt med nyckelordet new
        car1 = new Car();

        // Arbeta med instansvariabler med punktnotation (dot notation)
        car1.modelName = "Volvo";
        car1.modelYear = 2018;
        car1.price = 200_000;
        car1.sold = true;

        // Skapa en ny bil
        // Ett bilobjekt = en instans av klassen bil
        Car car2 = new Car();

        // Förvalda värden (default values)
        System.out.println("Förvalda värden (default values)");
        System.out.println(car2.modelYear); // 0
        System.out.println(car2.price);     // 0.0
        System.out.println(car2.modelName); // null
        System.out.println(car2.sold);      // false
        System.out.println(car2.tecken);    //    på Mac. Ingenting på PC 

        car2.modelYear = 2020;
        car2.modelName = "Audi";
        car2.price = 250_000;
        car2.sold = false;

        System.out.println("Mahmud vill ha en "
                + car2.modelName
                + " som kostar "
                + String.format("%,.0f", car2.price)
                + "kr exkl. moms."
                + "\nMahmud måste betala: "
                + String.format("%,.0f", car2.price * (1+ Car.MOMS))
                + " inkl. moms!");

        car2.sold = true;

        if(car2.sold == true){
            System.out.println("Bilen är såld!");
        }else{
            System.out.println("Bilen finns kvar.");
        }


        // Skapa 10 bilar med en for-loop

        // Steg 1: Skapa en array av typen Car
        Car[] cars;
        // Skapa tio platser (10 referenser av typen Car)
        cars = new Car[10];

        // Steg 2: Skapa 10 bilar = bilobjekt = instanser
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
        }

        // Att komma åt den första bilen
        cars[0].modelName = "SAAB";

        // Skapa en person (ett objekt)
        Person p1 = new Person();
        p1.name = "Mahmud";
        p1.weight = 88.1;

        System.out.println(p1.name + " väger " + p1.weight);

        car1.agare = p1;
        System.out.println(car1.modelName + " ägs av " + car1.agare.name);

    }
}
