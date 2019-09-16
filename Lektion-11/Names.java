import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Names {
    public static void main(String[] args) throws FileNotFoundException {

        var nameList = new ArrayList<String>();

        try {
            BufferedReader file = new BufferedReader(new FileReader("names.txt"));
            while (true) {
                String name = file.readLine();
                if (name == null)
                    break;
                nameList.add(name);
            }

            // Eller läs filen med en scanner
            //Scanner file = new Scanner(new File("names.txt"));
            //while (file.hasNextLine()) {
            //    String name = file.nextLine();
            //    nameList.add(name);
            //}

        } catch (FileNotFoundException e) {
            System.out.println("Filen saknas!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Skapa en ny lista för att spara namnen i omvänd ordning
        var nameListReverese = new ArrayList<String>();
        for (String name : nameList) {
            nameListReverese.add(0, name);
        }


        // Antal "Al Hakim"
        int count = 0;
        for (String s : nameList) {
            if (s.contains("Al Hakim"))
            // Eller använd metoden indexOf
            // if (s.indexOf("Al Hakim") >= 0)
                count++;
        }

        System.out.println(nameListReverese);
        System.out.println("Antal personer: " + nameList.size());
        System.out.println("Antal \"Al Hakim\": " + count);

    }
}