public class RectangleMain {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();

        // r1.height = -10;
        // System.out.println(r1.height);
        // Error: height has private access in Rectangle


        try{
            r1.setHeight(20);
            r1.setWidth(10);
        }catch (IllegalArgumentException e){
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("Omkretsen är: " + r1.perimeter());
        System.out.println("Arean är: " + r1.area());


        // Exempel 2
        System.out.println(" ------  r2 ------");
        Rectangle r2 = new Rectangle();
        try{
            r2.setHeight(-5);
            r2.setWidth(-6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());;
        }

        // Anrop av en klassmetod
        // OBS! Du behöver inte skapa ett objekt
        double area = Rectangle.area(5,7);
        System.out.println("Area: " + area);

    }
}
