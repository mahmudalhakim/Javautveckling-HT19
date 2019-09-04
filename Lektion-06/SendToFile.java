import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SendToFile {

    public static void main(String[] args) throws IOException {

        // Steg 1: Skapa en textfil
        String fileName = "text.txt";
        PrintWriter file = new PrintWriter(
                             new BufferedWriter(
                               new FileWriter(fileName)));

        // Steg 2: Skicka data till textfilen
        for (int i = 0; i < 10 ; i++) {
            file.println(i);
        }

        // Steg 3: Stäng filen
        file.close();

    }
}
