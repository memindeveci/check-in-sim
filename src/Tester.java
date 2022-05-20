import java.util.Scanner;
import java.util.ArrayList;


public class Tester
{
    public static void main(String[] args)
    {
        Bilet aliY=new Economy("Ali", "Yılmaz", 35, 5703, false);
        Bilet vedat=new Economy("Vedat", "Tütüncü", 16, 5702, false);
        Business emir=new Business("Emir", "Hürtürk", 16, 5701, false);





        Machine machine=new Machine();
        Login login = new Login();
        int id=login.checkPass();
        if (id==vedat.getIdentity())
        {
            machine.start(vedat);
        } else if (id==aliY.getIdentity()) {
            machine.start(aliY);
        } else if(id==emir.getIdentity()) {
            machine.start(emir);
        }
        else {
            System.out.println("Wrong id");
        }

    }
}