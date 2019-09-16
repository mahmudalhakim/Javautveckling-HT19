import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {

        // En lista som innehåller element av typen String
        List<String> names = new ArrayList<>();

        // Eller fr.o.m. Java 10
        var cars = new ArrayList<String>();

        // Lägg till nya element
        names.add("Mahmud");
        names.add("Mehdi");
        names.add("Hoda");
        names.add("Mariam");
        names.add("Dania");
        names.add("Yasir");

        // Infoga ett element på plats nr 1
        int i = 1;
        names.add(i, "Yasmin");

        // Skriv ut en lista
        System.out.println(names);
        /*
        Exempel på utskrift
        [Mahmud, Yasmin, Mehdi, Hoda, Mariam, Dania, Yasir]
        */

        // Jämför med "vanliga" arrayer
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(x); // Hashcode visas

        // Foreach-loop
        for (String name : names) {
            System.out.println(name.toUpperCase());
        }

        // Hämta ett element
        String el = names.get(0);
        System.out.println(el);

        // Ändra ett element
        el = names.set(0, "Mahmud Al Hakim");
        System.out.println(el); // före ändringen
        System.out.println(names.get(0)); // efter ändringen

        // Ta bort
        el = names.remove(0);
        System.out.println(el);
        System.out.println(names);

        // Sök efter element
        System.out.println("SÖKNING");
        boolean finns = names.contains("Mariam");
        System.out.println(finns);
        boolean saknas = names.contains("James Gosling");
        System.out.println(saknas);

        // Undersök om listan är tom
        boolean tom = names.isEmpty();
        System.out.println(tom);

        // Visa antal element
        System.out.println("Antal: " + names.size());

        // Hitta index
        System.out.println("indexOf");
        int index = names.indexOf("Dania");
        System.out.println("Dania har index " + index);
        System.out.println("James har index " + names.indexOf("James"));

        // Kopiera en lista
        // Skicka en befintlig lista till konstruktorn
        var namesCopy = new ArrayList<String>(names);

        // Töm en lista
        names.clear();
        System.out.println(names);
        System.out.println(namesCopy);


        // Skicka en enkel array till en lista
        Integer[] a = {1,2,3,4,5};
        var heltal = new ArrayList<>(Arrays.asList(a));
        System.out.println(heltal);

    }
}

