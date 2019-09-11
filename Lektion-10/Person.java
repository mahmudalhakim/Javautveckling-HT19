public class Person {

    // Privata instansvariabler
    private String firstname;
    private String lastname;
    private int age;

    /**
     * Default konstruktor
     */
    public Person(){
        this.firstname = "Guest";
        this.lastname = "";
    }

    /**
     * En konstruktor som initierar förnamn och efternamn
     * @param firstname förnamn
     * @param lastname efternamn
     */
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * En konstruktor som initierar hela namnet
     * @param name namnet skickas i detta format
     *             förnamn, efternamn
     */
    public Person(String name){
        setName(name);
    }

    /**
     * En konstruktor som initierar hela namnet
     * @param name
     * @param c
     */
    public Person(String name, char c){
        setName(name, c);
    }

    // Publika instansmetoder

    /**
     * Metoder sätter förnamnet
     * @param firstname
     */
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    /**
     * Metoder sätter efternamnet
     * @param lastname
     */
    public void setLastname(String lastname){
        this.lastname = lastname;
    }


    /**
     * Metoden sätter ålder
     * @param age ålder
     */
    public void setAge(int age){
        if(age > 0)
            this.age = age;
        else
            throw new IllegalArgumentException("Felaktig ålder");
    }


    /**
     * Metoder sätter hela namnet
     * @param firstname förnamn
     * @param lastname efternamn
     */
    public void setName(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Överlagrade metoder

    /**
     * Metoden sätter hela namnet.
     * Namnet måste skickas i detta format:
     * förnamn, efternamn (obs! kommatecken)
     * @param name hela namnet inkl. kommatecken
     */
    public void setName(String name){
        int comma = name.indexOf(',');
        if(comma <= 0)
            throw new IllegalArgumentException(
                    "Namnet måste anges i detta format: förnamn, efternamn");

        this.firstname = name.substring(0,comma).trim();
        this.lastname = name.substring(comma+1).trim();
    }

    /**
     * Metoden sätter hela namnet.
     * Namnet måste skickas i detta format:
     * förnamn (valfitt tecken) efternamn
     * @param name hela namnet inkl. ett valfritt tecken
     * @param c är ett valfritt tecken
     */
    public void setName(String name, char c){
        int index = name.indexOf(c);
        if(index <= 0)
            throw new IllegalArgumentException("Felaktig format");

        this.firstname = name.substring(0,index).trim();
        this.lastname = name.substring(index+1).trim();
    }

    /**
     * Metoden hämtar förnamnet
     * @return firstname
     */
    public String getFirstname(){
        return this.firstname;
    }

    /**
     * Metoden hämtar efternament
     * @return lastname
     */
    public String getLastname(){
        return this.lastname;
    }

    /**
     * Metoden returnerar ålder
     * @return age
     */
    public int getAge(){
        return this.age;
    }

    /**
     * Metoden returnerar hela namnet
     * @return fistname + lastname
     */
    public String getName(){
        // return getFirstname() + " " + getLastname();
        return this.firstname + " " + this.lastname;
    }
}
