public class Main {

    public static void main(String[] args){

        double x = 2.5;
        double y = 3.5;

        // Metodanrop
        // x och y kallas argument
        double medel = medel(x,y); // 3.0
        System.out.println("Medelvärdet av " + x + " och " + y + " är " + medel);
        
        System.out.println("*************************************************");


        double r = 10;
        
        // Anrop av metoden omkrets  (Call By Value)
        double area = Circle.omkrets(r);
        System.out.println("Cirkelns omkrets är " +  area);

        // Anrop av metoden area
        System.out.println("Cirkelns area är " + Circle.area(r) );

        // Anrop av en metod utan returvärde
        info(10);

        // Konstanter
        System.out.println(Math.PI);
        // Math.PI = 5; // Fel

        // Skriv ut en konstant
        System.out.println(Main.COMPANY);
        //  Main.COMPANY = "Alhakim";  // FEl. Varför?

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

    }  // metoden main slutar här


    // En statisk metod = Klassmetod
    // a och b kallas parametrar
    public static double medel(double a, double b){
        return (a+b) / 2;
    }

    // En metod utan returvärde
    public static void info(int n){

        for (int i = 0; i < n ; i++) {
            System.out.print("Hej Mahmud ");
        }

        // return behövs inte här p.g.a. void

    }

    
    // Skapa en konstant med nyckelordet final
    public static final String COMPANY = "Nackademin";

}
