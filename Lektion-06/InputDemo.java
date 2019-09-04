import java.util.Scanner;

/*
Skriv ett program som läser in ett godtyckligt antal tal
från kommandofönstret (terminalen).
Programmet får anta att varje tal skrivs in på en egen rad.
Användaren skall kunna trycka på Enter (tom rad) för
markera att man inte tänker skriv in fler tal.
Programmet skall som avslutning skriva ut det största av de inlästa talen.
*/


public class InputDemo {
    public static void main(String[] args) {

        double d, maxNum = 0;
        System.out.println("Ange ett tal per rad och avsluta med Enter+Enter");
        while (true){
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            // Vid tom rad avsluta while
            if (s.length() == 0)   // Eller s.isEmpty()
                break;
            try {
                d = Double.parseDouble(s);
                if (maxNum < d)
                    maxNum = d;
            } catch (NumberFormatException e){
                System.out.println("Felaktigt format!");
            }
        }
        System.out.println("Det största talet var:" + maxNum);
    }
}