import javax.swing.*;

public class Matematik {

    public static void main(String[] args) {

        // Att räkna

        // Inbyggda numeriska typer i Java
        // Heltal
        byte b = 127;
        // b = 500;  // Fel. Byte ligger mellan -128 till 127
        short s = 32767;
        int i = 2_000_000_000;
        long l = 92_00_000_000_000_000_000L;
        System.out.println(l);
        l =  (long) 9.2e18 ;
        System.out.println(l);

        // Flyttal (tal med decimaler)
        float f = 1.1234567f;
        double d = 1.5467899865789;

        // Inläsning via dialogrutor
        // String data = JOptionPane.showInputDialog("Ange pris");

        // Typomvandla text till int
        // int prisInt = Integer.parseInt(data);
        // System.out.println(prisInt + 10);
        // OBS! Fungerar bara med heltal (ej String)

        // Typomvandla text till double
        // double prisDouble = Double.parseDouble(data);
        // System.out.println(prisDouble * 1.25);

        // Övning
        /*
        1.1 läs in antalet minuter man i genomsnitt ringer per månad.
        1.2 läs in pris per minut.

        2.1 Beräkna kostnaden per månad
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
        // 2.2
        JOptionPane.showMessageDialog(null, "Månadskostand: " +  totalKostnad);

        */

        // Mer om typomvandling
        double d1;
        d1 = 1.5;
        double d2 = d1 + 1.5;

        int i1 = 5;
        d1 = i1; // Implicit typomvandling


        // Cast, OBS! Kan vara farlig
        // Cast på svenska = Explicit typomvandling
        d2 = 1.9;
        System.out.println("Före cast: " + d2);
        i1 = (int) d2;
        System.out.println("Efter Cast : " + i1);


        // Lite om standardklassen Math
        double demo = -5;
        System.out.println("Tal: " + demo);
        System.out.println("Absolutvärde: " + Math.abs(demo));
        demo = 16;
        System.out.println("Kvadratroten: " + Math.sqrt(demo));

        double tal1 = 5;
        double tal2 = 7;
        System.out.println("Max av två tal: " + Math.max(tal1, tal2));
        System.out.println("Min av två tal: " + Math.min(tal1, tal2));

        // Slumptal
        double slump = Math.random();
        System.out.println("Slumptal mellan 0 och 1: " + slump);

        int slump2 = (int) (Math.random() * 100) ;
        System.out.println("Slumptal mellan 0 och 99: " + slump2);


        // Konstanter
        System.out.println("PI " + Math.PI);
        System.out.println("--------------------");

        // Övning 1

        String input = JOptionPane.showInputDialog("Ange cirkelns radie:");
        double radie = Double.parseDouble(input);
        double omkrets = 2 * radie * Math.PI;
        double area = radie * radie * Math.PI;
        area = Math.pow(radie , 2) * Math.PI;

        JOptionPane.showMessageDialog(null, "Cirkelns omkrets är " + omkrets +
                                        "\nCirkelns area är " + area);

        // Övning 2
        input = JOptionPane.showInputDialog("första sidan: ");
        double a = Double.parseDouble(JOptionPane.showInputDialog("första sidan: "));
        input = JOptionPane.showInputDialog("andra sidan:");
        double btusen = Double.parseDouble(input);
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(btusen, 2));
        JOptionPane.showMessageDialog(null, "hypotenusan längd: "
        + c);



    }
}
