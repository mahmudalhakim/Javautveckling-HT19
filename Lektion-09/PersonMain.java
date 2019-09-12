public class PersonMain {

    public static void main(String[] args) {

        // En instans av klassen Person
        // Skapa ett objekt
        Person p1 = new Person();

        // p1.firstname = "Mahmud";
        // Error:(8, 11) java: firstname has private access in Person

        // Anrop av instansmetoder
        p1.setFirstname("Mahmud");
        p1.setLastname("Al Hakim");

        try {
            // p1.setAge(0);
            p1.setAge(46);
        } catch (IllegalArgumentException e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(p1.getFirstname());
        System.out.println(p1.getLastname());
        System.out.println(p1.getName());
        System.out.println("Ålder: " + p1.getAge());

        Person p2 = new Person();
        p2.setName("James" , "Gosling");
        System.out.println(p2.getName());

        Person p3 = new Person();
        try{
            p3.setName("Kalle , Anka");
        } catch (IllegalArgumentException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println(p3.getName());

        Person p4 = new Person();
        p4.setName("Steve;Jobs", ';');
        System.out.println(p4.getName());

        Person p5 = new Person();
        System.out.println(p5.getName());

        Person p6 = new Person("Bill" , "Gates");
        System.out.println(p6.getName());

        Person p7 = new Person("Elon ; Musk" , ';');
        System.out.println(p7.getName());

    }
}
