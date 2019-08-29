import javax.swing.*;

public class Villkor {

    public static void main(String[] args) {

        // Villkorskonstruktioner (Selektioner)

        // Övning 4.1
        /*
        1.1 läs in antalet minuter man i genomsnitt ringer per månad.
        1.2 läs in pris per minut.

        2.1 Beräkna kostnaden per månad
        2.1.1 Ge 10% rabatt om man ringer över 1000kr per månad
        2.2 Visa resultatet i en dialogruta
        */


        /*

        // Steg 1
        // 1.1
        String indata = JOptionPane.showInputDialog("Ange antal minuter per månad");
        int minuter = Integer.parseInt(indata);

        // 1.2
        indata = JOptionPane.showInputDialog("Ange pris per minut");
        double prisPerMinut = Double.parseDouble(indata);

        // Steg 2
        // 2.1
        double totalKostnad = minuter * prisPerMinut;

        // 2.1.1
        if(totalKostnad > 1000)
            totalKostnad = totalKostnad * 0.9;
            // Eller med enklare syntax
            // totalKostnad *= 0.9;
            // += -= *= /=  (Sammansatta tilldelningsoperatorer, se sidan 118)

        // 2.2
        JOptionPane.showMessageDialog(null,
                "Månadskostand: " +  totalKostnad);


        */

        /* Övning 4.2
        Steg 0 Introduktion
        På ett gym kan man antingen köpa ett årskort eller köpa en biljett vid varje besök.

        Steg 1
        1.1
        Läs in priset för ett årskort.
        1.2
        Läs in priset för en biljett.
        1.3
        Läs in antalet gånger man planerar att besöka gymmet under ett år.

        Steg 2
        Därefter skall programmet ange om det lönar sig att köpa årskort eller inte.

        Om biljett gånger antal besök är större än årskort
        Visa meddelandet "Köp årskort"
        Annars
        Visa meddelandet "Köp biljetter"

        */

        /*

        // Steg 1
        // 1.1
        String input = JOptionPane.showInputDialog("Ange priset för ett årskort");
        double årskort = Double.parseDouble(input);
        // Eller konvertera med metoden valueOf istället för parsDouble
        // årskort = Double.valueOf(input);
        System.out.println("Årskort: " + årskort);

        // 1.2
        input = JOptionPane.showInputDialog("Ange priset för en biljett");
        double biljett = Double.parseDouble(input);
        System.out.println("Biljett: " + biljett);

        // 1.3
        input = JOptionPane.showInputDialog("Ange antal besök per år");
        double antal = Double.parseDouble(input);
        System.out.println("Antal besök per år: " + antal);

        // Steg 2
        if(biljett * antal >= årskort ){
            JOptionPane.showMessageDialog(null, "Köp årskort");
        }
        else {
            JOptionPane.showMessageDialog(null, "Köp biljetter");
        }

        */


        // Mer om dialogrutor
        int svar = JOptionPane.showConfirmDialog(null, "Är du under 18 år?");
        System.out.println("Svar från confirmDialog: " + svar);

        // 0 = YES,  1 = NO , 2 = CANCEL , -1 = ESC
        if (svar == 0) {
            System.out.println("Gå hem");
        } else if (svar == 1) {
            System.out.println("Välkommen till klubben");
        } else {
            System.out.println("Hejdå");
            System.exit(0);
        }


        // Switch
        switch (svar) {
            case 0:
                System.out.println("Gå hem");
                break;
            case 1:
                System.out.println("Välkommen till klubben");
                break;
            default:
                System.out.println("Hejdå");
                System.exit(0);
        }
    }
}
