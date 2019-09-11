/**
 * En klass som beskriver rektanglar.
 *
 * Klassen innehåller instansvariabler som beskriver
 * rektangels höjd och bredd.
 *
 * Klassen innehåller instansmetoder som
 * 1. sätter höjden
 * 2. sätter bredden
 * 3. beräknar arean
 * 4. beräknar omkretsen
 */
public class Rectangle {

    // Privata instansvariabler

    private double height;
    private double width;

    // Publika instansmetoder


    /**
     * En instansmetod som sätter höjden
     * @param height höjd
     */
    public void setHeight(double height){
        if(height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("Felaktig höjd");
            // System.out.println("Felaktig höjd");
    }

    /**
     * En instansmetod som sätter bredden
     * @param width bredd
     */
    public void setWidth(double width){
        if(width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Felaktig bredd");
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double perimeter(){
        return this.height * 2 + this.width * 2;
    }

    public double area(){
        return this.height * this.width;
    }

    // En klassmetod
    public static double area(double height, double width){
        return  height *width;
    }
}
