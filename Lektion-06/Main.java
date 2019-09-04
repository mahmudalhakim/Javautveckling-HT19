import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // Att läsa från terminalen (konsolfönster)
        // Se sidan 186
        BufferedReader input = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Vad heter du?");

        // Läs en rad från terminalen
        String data = input.readLine();

        System.out.println("Hej " + data);

        // Arbeta med standardklassen Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Skriv lite text: ");
        String in = scan.nextLine();

        System.out.println("Du har skrivit...");
        System.out.println(in);

        while (true) {
            try {
                // OBS! Vid oändlig loop vid felaktig inmatning
                // Lösning 1: Skapa ett nytt scanner-objekt
                scan = new Scanner(System.in);
                // Eller
                // Lösning 2: läs en tom rad efter catch (eller inne i catch) se rad 52
                System.out.println("Ange ett decimaltal, d: ");
                double d = scan.nextDouble();
                System.out.println("d = " + d);
                System.out.println("Ange ett heltal, n: ");
                int n = scan.nextInt();
                System.out.println("n = " + n);

            } catch (InputMismatchException error) {
                System.out.println("Felaktig inmatning");
                // scan.next();
            }

        }

    }
}
