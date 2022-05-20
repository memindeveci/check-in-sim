public class Economy extends Bilet {
    private static boolean loungePass=false;
    // Economy class, it doesn't have access to lounge
    public Economy (String name, String surname, int age, int identity, boolean status) {
        super(name, surname, age, identity, status);
    }

    public boolean getPass(){ //method used to evaluate if the passenger has access to lounge
        return loungePass;
    }


}