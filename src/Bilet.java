abstract class Bilet {
    private String name;
    private String surname;
    private int age;
    private int identity;
    private boolean status;
    private static String airline="MED airlines";


    public Bilet(String name, String surname, int age, int identity, boolean status ) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.identity = identity;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }
    public int getIdentity ()
    {
        return identity;
    }

    public static String getAirline()
    {
        return airline;
    }

    public static void setAirline(String airline)
    {
        Bilet.airline=airline;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public boolean getStatus(){
        return status;
    }



    public abstract boolean getPass();

}