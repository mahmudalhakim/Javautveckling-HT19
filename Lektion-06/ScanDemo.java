import java.util.Scanner;

public class ScanDemo {

    public static void main(String[] args ){

        // Läs in ett antal heltal via terminalen
        // Summera alla tal och visa resultatet

        System.out.println("Ange ett antal heltal på en rad och tryck på Enter");
        System.out.println("Avsluta med CTRL+Z eller CTRL+D (Win), CMD+D (Mac)");

        // Skapa ett scanner-objekt och koppla en input-ström (terminalen)
        Scanner scan = new Scanner(System.in);

        // Skapa en variabel som lagrar summa
        int sum = 0;

        // Testa om det finns ett heltal i scanner-objektet
        while (scan.hasNextInt()){
            sum += scan.nextInt();
        }

        System.out.println("Summan av alla tal är " + sum);
    }
}
