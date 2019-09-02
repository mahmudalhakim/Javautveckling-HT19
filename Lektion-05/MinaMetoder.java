import javax.swing.*;

public class MinaMetoder {

    // Metoden visar en dialogruta
    // Konverterar text till double
    // Returnerar ett tal
    public static double inputNumber(String  message){
        String input;
        double number;

        while (true) {

            input = JOptionPane.showInputDialog(message);
            if (input == null)
                System.exit(0);

            // Felhantering
            try {
                number = Double.parseDouble(input);
                return number;

            } catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning");
            } catch (Exception e) {
                System.out.println("Okänt fel");
            }

        } // while
    }

    // Metoden beräknar kapitalet och visar en tabell
    public static void kapital(double belopp, double ranta, double years){

        double kapital = belopp;

        String table = "";

        for (int year = 1; year <= years; year++) {
            kapital += kapital * ranta * 0.01;
            System.out.println("År " + year + " Kapital: " + Math.round(kapital));
            table += "År " + year + " Kapital: " + Math.round(kapital) + '\n';
        }

        JOptionPane.showMessageDialog(null, table);

    }

}