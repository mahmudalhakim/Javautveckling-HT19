import java.util.Arrays;

public class Arrayer {

    public static void main(String[] args) {

        // Arbeta med fält (arrayer)

        // Steg 1
        // Skapa en fältvariabel av typen int
        int[] a;

        // Skapa en fältvariabel av typen double
        double[] d;

        // Skapa en fältvariabel av typen String
        String[] s;

        // Steg 2
        // Skapa utrymme med nyckelordet new
        a = new int[5];
        d = new double[10];
        s = new String[50];

        // Steg 1 och 2 i samma sats
        byte[] b = new byte[8];
        char[] c = new char[16];

        // Automatiskt initierat array
        int[] n = {1,2,3,4,5} ;
        String[] languages = {"Java", "C++", "C#", "JavaScript"};

        // Visa antal komponenter
        System.out.println("Det finns " + languages.length +  " språk!");

        // Indexering
        System.out.println(n[0]);    // Första komponent (element) item
        System.out.println(n[n.length-1]);    // Sista komponent

        try{
            System.out.println(n[n.length]); // Genererar felsignal
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Utanför arrayen!");
            e.printStackTrace();
        }

        System.out.println("Efter try-catch");

        // Ändra innehåll i en array
        n[0] = 10;
        n[1] = 20;
        // n[3] = "Hej";  // Inte tillåtet

        for (int i = 0; i < n.length ; i++) {
            System.out.println(n[i]);
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.print (a[i] + " ");
        }

        System.out.println("\n--------------");

        for (int i = 0; i < b.length ; i++) {
            System.out.print (b[i] + " ");
        }

        System.out.println("\n--------------");

        for (int i = 0; i < d.length ; i++) {
            System.out.print (d[i] + " ");
        }

        System.out.println("\n--------------");

        for (int i = 0; i < s.length ; i++) {
            System.out.print (s[i] + " ");
        }
        System.out.println("\n--------------");

        for (int i = 0; i < c.length ; i++) {
            System.out.print (c[i] + " ");
        }

        System.out.println("\n--------------");


        // Skapa en array som innehåller heltal från 1 till 10
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        // Skriv ut med en foreach-sats
        for (int item:array)
            System.out.print(item + " ");

        System.out.println("\n--------------");

        // Jämförelse av två arrayer
        int[] ar1 = {1,5,6,0,2};
/*
        Ovanstående sats är samma som allt nedan
        int[] ar1 = new int[5];
        ar1[0] = 1;
        ar1[1] = 5;
        ar1[2] = 6;
        ar1[3] = 0;
        ar1[4] = 2;
*/

        int[] ar2 = {1,2,3,4,5};
        System.out.println(ar1 == ar2);
        // Alltid false, varför?
        // Referenserna jämförs
        // Det är alltid två olika referenser

        // Vill du jämföra innehållet
        // använd metoden equals()
        // som finns i klassen Arrays
        System.out.println(Arrays.equals(ar1,ar2)); // false

        int[] ar3 = {1,2,3,4,5};
        int[] ar4 = {1,2,3,4,5};
        System.out.println(Arrays.equals(ar3,ar4)); // true

        // Att jämföra två komponenter
        System.out.println(ar3[0]==ar4[0]); // true
        System.out.println(ar3[0]==ar4[1]); // false

    }
}
