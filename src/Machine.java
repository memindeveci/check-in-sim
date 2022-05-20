import java.util.Scanner;
import java.util.Arrays;

public class Machine {
    //code which will execute the check-in system
    public void start(Bilet other){
        boolean a=true;
        boolean c=true;
        int b=0;
        String check= "";
        int[] emptySeats= {2,13,8,6,4,8}; //array for empty seats
        System.out.println("Hello Mr. "+ other.getSurname());
        System.out.println("Welcome to " + other.getAirline());

        while (a)
        {
            System.out.println("Please select one of the options:");
            System.out.println("-----------------------------");
            System.out.println("1: Check-in your seat");
            System.out.println("2: Get access to lounge");
            System.out.println("3: Review ticket");
            System.out.println("4: Quit");
            System.out.println("-----------------------------");
            Scanner scanner = new Scanner(System.in);


            b = scanner.nextInt();
            if (b==1) //check-in code
            {
                if(other.getStatus()==false)
                {
                    Arrays.sort(emptySeats);
                    System.out.println("There are " + emptySeats.length + " empty seats in the plane.");
                    System.out.println("The system will automatically assign you the best seat remaining");
                    System.out.println("Loading...");
                    System.out.println("The seat number "+ emptySeats[0] + " is assigned to you.");

                    emptySeats=Arrays.copyOfRange(emptySeats,1,emptySeats.length);
                    other.setStatus(true);
                } else if (other.getStatus()) {
                    System.out.println("You've already checked-in.");
                    System.out.println("Proceeding back to the menu...");
                    System.out.println("");
                }
            } else if (b==2) /*access for lounge*/ {
                if(other.getPass()) {
                    System.out.println("You already have access to the lounge!");
                    System.out.println("Proceeding back to the menu...");
                    System.out.println("");
                } else if (other.getPass()==false) {
                    System.out.println("You can get a lounge pass by 120TL. Do you want to proceed? (true/false)");
                    c= scanner.nextBoolean();
                    if (c) {
                        System.out.println("Thank you for choosing us");
                        System.out.println("Proceeding back to the menu...");
                        System.out.println("");
                    } else {
                        System.out.println("Proceeding back to the menu...");
                        System.out.println("");
                    }
                }
            } else if (b==3) /* review ticket */ {
                System.out.println("Name of passenger: "+ other.getName()+" "+ other.getSurname());
                System.out.println("Age of passenger: "+ other.getAge());
                if (other.getStatus()) {
                    check= "done";
                } else if (other.getStatus()==false) {
                    check= "not done";
                }
                System.out.println("Check-in status: " + check);

            } else if (b==4) /* quit program */ {
                System.out.println("Thank you");
                a=false;
            }
        }
    }
}