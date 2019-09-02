/* Övning - sidan 114 - Version 2

1. Skriv ett program som beräknar hur mycket pengar man får
på ett bankkonto om man sätter in 1000kr och låter pengarna
stå inne under ett visst antal år.
2. När man kör programmet frågar det efter räntesatsen, som
anges i procent, och hur många år pengarna skall stå inne.
3 Som resultat visar programmet en tabell där man kan se hur
mycket kapitalet har växt efter varje år.
*/

public class Bank {
    public static void main(String[] args) {

        System.out.println("Övning - Sidan 114 - Version 2");

        double belopp = MinaMetoder.inputNumber("Ange belopp");
        double years = MinaMetoder.inputNumber("Ange antal år");
        double ranta = MinaMetoder.inputNumber("Ange ränta");
        MinaMetoder.kapital(belopp, ranta, years);

    } 

} 