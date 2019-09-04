public class MetodenFormat {

    public static void main(String[] args){

        double pi = Math.PI;
        System.out.println(pi);

        String ut = String.format("%.2f" , pi);
        System.out.println(ut);

        ut = String.format("%.4f" , pi);
        System.out.println(ut);

        // Inga decimaler. Använd metoden round() i Math
        double test = 3.9;
        System.out.println(Math.round(test)); // 4
        // Ta bort alla decimaler
        System.out.println((int) test);  // 3
        System.out.println(Math.floor(test));  // 3.0

        System.out.println("*****************");







    }

}
