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


        // Övning 9.6
        // http://www.skansholm.com/javasteg/ovningar/kap9/ovn9-6.txt
        int r = 2;
        for (int n = 1; n <= 30; r *= 2, n++)
            System.out.format("%2d%,25d\n", n, r);


    }

}
