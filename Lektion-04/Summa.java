import javax.swing.*;

public class Summa {

    public static void main(String[] args) {

        /*
        Steg 1
        Läs in ett heltal n

        Steg 2
        Beräkna summan, dvs. 1+2+3+4+... + n
        Exempel: om talet n är 5 så skall programmet räkna ut 1+2+3+4+5 = 15
        */

        while (true) {

            // Steg 1
            String s = JOptionPane.showInputDialog("Ange ett heltal");

            // Om användaren klickar på kryss eller Cancel/Avbryt avsluta loopen
            if(s == null)
                break;

            if(s.equals("0"))
                break;

            int n = Integer.parseInt(s);

            // Steg 2
            int summa = 0;


            int init = 1;
            while (init <= n) {
                summa = summa + init;
                // Eller, sammansatt tilldelning
                // summa += k;

                init = init + 1;
                // k += 1;
                // k++;
            }

            System.out.println(summa);

            summa = 0;
            for (int i = 1; i <= n; i++) {
                summa += i;
            }

            System.out.println(summa);

        } // Den yttre while-loopen

        System.out.println("Hejdå");

    } // Metoden main
} // klassen Summa
