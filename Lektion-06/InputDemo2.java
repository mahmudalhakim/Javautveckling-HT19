import java.util.Scanner;

/*  (OBS! Ny version av InputDemo)
Skriv ett program som läser in ett godtyckligt antal tal
från kommandofönstret (terminalen).
Programmet får anta att alla tal skrivs in på en rad.
Användaren skall kunna trycka på Enter (tom rad) för
markera att man inte tänker skriv in fler tal.
Programmet skall som avslutning skriva ut det största av de inlästa talen.
*/


public class InputDemo2 {
    public static void main(String[] args) {

        double d;
        double maxNum = -Double.MAX_VALUE;

        System.out.println("Ange ett antal tal på en rad och avsluta med Enter");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        Scanner rad = new Scanner(s);
        while (rad.hasNextDouble()) {
            d = rad.nextDouble();
            if (maxNum < d)
                maxNum = d;
        }
        System.out.println("Det största talet var:" + maxNum);
    }
}