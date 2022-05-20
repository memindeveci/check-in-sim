import java.util.Scanner;

//Login system

public class Login {
    public int checkPass() {
        System.out.println("You can check in through this machine");
        System.out.println("---------------------------");
        Scanner scanner = new Scanner(System.in);
        int id;

        System.out.println("Please enter your check in code: ");
        id = scanner.nextInt();

        return id;
    }
}