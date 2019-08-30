/* Övning - sidan 114

1. Skriv ett program som beräknar hur mycket pengar man får
på ett bankkonto om man sätter in 1000kr och låter pengarna
stå inne under ett visst antal år.
2. När man kör programmet frågar det efter räntesatsen, som
anges i procent, och hur många år pengarna skall stå inne.
3 Som resultat visar programmet en tabell där man kan se hur
mycket kapitalet har växt efter varje år.

*/

import javax.swing.JOptionPane;

public class Bank {

    public static void main(String[] args) {

        // Beloppet som ska sparas på bankkontot
        int belopp = 1000; // eller double


        // Läsa in antal år
        String input;
        int years;
        while(true){
            input = JOptionPane.showInputDialog("Ange antal år");
            if(input==null)
                System.exit(0);
            try{
                years = Integer.parseInt(input);
                if(years == 0)
                    System.out.println("År måste vara större än 0");
                else if(years > 0)
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Felaktig inmatning!");
            }
        }

        // Läsa in räntesatsen
        double ranta;
        while(true){
            input = JOptionPane.showInputDialog("Ange räntesatsen t.ex. 2.5");
            if(input == null)
                System.exit(0);
            try{
                ranta = Double.parseDouble(input);
                if(ranta == 0)
                    System.out.println("År måste vara större än 0");
                else if(ranta > 0)
                    break;
            }catch (NumberFormatException e){
                System.out.println("Felaktig inmatning!");
            }
        }

        // Resultat lagras här
        double resultat = belopp;

        // En tabell som visar resultatet
        String tabell = "";

        // Skapa en tabell där man ser hur
        // mycket kapitalet har växt efter varje år
        for(int i=1 ; i<=years ; i++){

            // Beräkna resultat varje år
            resultat = resultat + resultat * 0.01 * ranta; //sidan 115
            // Eller
            // resultat +=  resultat * (ranta/100);
            // resultat *= 1 + ranta/100;

            // Skapa tabellen här
            tabell += "År "+ i  + ": " + Math.round(resultat) + "\n" ;
        }

        // Visa tabellen
        System.out.println(tabell);

    }

}
