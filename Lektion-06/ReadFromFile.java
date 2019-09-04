import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {


        // Hämta aktuell mapp
        String folder = System.getProperty("user.dir");
        System.out.println(folder);

        // Skapa en filväljare
        JFileChooser fc = new JFileChooser(folder);

        // Visa dialogrutan Öppna
        int result = fc.showOpenDialog(null);

        // Test om man öppnar fil
        if(result != JFileChooser.APPROVE_OPTION){
            System.out.println("Ingen fil valdes!");
            System.exit(0);
        }

        // Hämta filsökväg
        String f = fc.getSelectedFile().getAbsolutePath();
        System.out.println(f);

        // Öppna en filström
        BufferedReader file = new BufferedReader(new FileReader(f));

        // Läs från textfilen och spara i en variabel
        String text = "";
        while (true){
            String rad = file.readLine();
            // Är filen slut?
            if(rad == null)
                break;
            text += rad + '\n';
        }

        System.out.println(text);
    }
}
