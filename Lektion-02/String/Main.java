import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        String textOrg = "      Mahmud Al Hakim     ";

        // Hämta antal tecken från strängen textOrg
        System.out.println(textOrg.length());

        // Rensa blanka tecken före och efter strängen
        String text = textOrg.trim();
        System.out.println(text);

        // Hämta antal tecken från stängen text (obs! helt ny sträng)
        System.out.println(text.length());

        // Omvandla till versaler och lagra i variablen text
        text = text.toUpperCase();
        System.out.println(text);

        // Omvandla till gemener (små bokstäver)
        // OBS! Glöm inte att göra en ny tilldelning!
        text = text.toLowerCase();
        System.out.println(text);

        // Byt ut ett specifikt tecken överallt
        text = text.replace('a', 'b');
        System.out.println(text);

        // Hämta deltext av en sträng
        textOrg = textOrg.trim();  // "Mahmud Al Hakim"
                                   //  012345678910
        text = textOrg.substring(7);
        System.out.println(text);

        text = textOrg.substring(7, 9);
        System.out.println(text);

        // Att jämföra strängar
        String t1 = new String("Lite text och annat");
        String t2 = new String("Lite text och annat");
        System.out.println(t1 == t2); // OBS! Två likhetstecken
        // Ovanstående jämförelse returnerar false
        // Referenserna t1 och t2 jämförs. Det är ju två olika referenser
        // OBS! Detta kan vara farlig om man skapar strängar med =
        // T.ex.
        String t3 = "Demo";
        String t4 = "Demo";
        System.out.println(t3 == t4); // Ger true!!!

        // Använd alltid metoden equals för att jämföra stängar
        System.out.println(t1.equals(t2)); // Ger true
        System.out.println(t3.equals(t4)); // Ger true

        // Lite om StringBuilder
        StringBuilder t5 = new StringBuilder("Demo på StringBuilder");
        System.out.println(t5);
        //t5.reverse();

        t5.append(" och lite annat smått och gott");
        System.out.println(t5);

        // Lite om klassen Calendar
        String date = Calendar.getInstance().getTime().toString();
        System.out.println(date);
    }
}
