public class Circle {

    // Statiska metoder (klassmetoder)

    // En klassmetod som beräknar cirklens omkrets
    public static double omkrets(double radien){
        return  2 * Math.PI * radien;
    }

    // En klassmetod som beräknar cirklens area
    public static double area(double radien){
        return  radien * radien * Math.PI;
        //      Math.pow(radien, 2) * PI;
    }

}
