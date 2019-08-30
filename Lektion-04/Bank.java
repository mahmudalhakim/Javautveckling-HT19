/* Övning - sidan 114

1. Skriv ett program som beräknar hur mycket pengar man får
på ett bankkonto om man sätter in 1000kr och låter pengarna
stå inne under ett visst antal år.
2. När man kör programmet frågar det efter räntesatsen, som
anges i procent, och hur många år pengarna skall stå inne.
3 Som resultat visar programmet en tabell där man kan se hur
mycket kapitalet har växt efter varje år.

*/


import javax.swing.*;

/*

Steg 1: Ange belopp (1000)

Steg 2:
2.1. Läs in år
2.2. Läs in ränta (anges i procent)

Steg 3: Beräkna kapitalet

Steg 4: Visa en tabell i en dialogruta


*/
public class Bank {
    public static void main(String[] args) {

        System.out.println("Övning - Sidan 114");

        // Steg 1 - Ange belopp
        int belopp = 1000;

        // Steg 2
        // 2.1 Läs in år
        String input;
        int years;

        while (true) {

            input = JOptionPane.showInputDialog("Ange antal år");
            if (input == null)
                System.exit(0);

            // Felhantering
            try {
                years = Integer.parseInt(input);
                // Vid fel hoppar programmet till catch (rad 49)
                if (years > 0) {
                    break;  // avsluta while, hoppa till rad 53
                } else {
                    System.out.println("År måste vara större än 0");
                }

            } catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning");
            }

        } // while

        // 2.2 Läs in ränta
        double ranta;
        while (true) {

            input = JOptionPane.showInputDialog("Ange räntesats t.ex. 2.5");
            if (input == null)
                System.exit(0);

            // Felhantering
            try {
                ranta = Double.parseDouble(input);
                if (ranta > 0) {
                    break;
                } else {
                    System.out.println("Ränta måste vara större än 0");
                }

            } catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning");
            } catch (Exception e) {
                System.out.println("Okänt fel");
            }

        } // while

        // Steg 3: Beräkna kapitalet
        double kapital = belopp;

        String table = "";

        for (int år = 1; år <= years; år++) {
            kapital += kapital * ranta * 0.01;
            System.out.println("År " + år + " Kapital: " + Math.round(kapital));
            table += "År " + år + " Kapital: " + Math.round(kapital) + '\n';
        }


        JOptionPane.showMessageDialog(null, table);

    } // Metoden main


} // Klassen Bank
