import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Variabeldeklarationer
        String namn, adress, tel;

        // Tilldelning
        namn = "Mahmud \"Al\" Hakim\\";
        adress = "Hemfridsvägen 17";
        tel = "076-1659879";

        // Initiering
        String allt = namn + "\n" + adress + '\n' + tel;
        // Konkatenering (Contatenate) = Att slå ihop strängar med +

        // 1. Visa/Skriv ut i terminalen/kommandotolken/Console
        System.out.println(allt);

        // 2. Visa i en dialogruta
        // JOptionPane.showMessageDialog(null, allt);

        // Att läsa från en dialogruta
        // namn = JOptionPane.showInputDialog("Ange ditt namn");
        System.out.println(namn);
        // JOptionPane.showMessageDialog(null, "Hej " +namn);
        //JOptionPane.showMessageDialog(null, "Demo", "Ange ditt namn", JOptionPane.QUESTION_MESSAGE);

        // Visa Copyright-tecken
        char copy = '\u00A9';
        System.out.println(copy);
        // JOptionPane.showMessageDialog(null, copy);

    }
}
