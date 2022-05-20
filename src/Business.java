public class Business extends Bilet {
    private static boolean loungePass=true;
    //Buiness class has access to lounge
    public Business (String name, String surname, int age, int identit, boolean status) {
        super(name, surname, age, identit, status);

    }

    public boolean getPass(){ //method used to evaluate if the passenger has access to lounge
        return loungePass;
    }



}