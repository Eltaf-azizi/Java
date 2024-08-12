
import java.util.TooManyListenersException;


public class driver {
    public static void main(String a[]) {
        BankAccount tom = new BankAccount("Tom");
        tom.deposit(400.0);
        BankAccount sandy = new BankAccount("Sandy"); 
        sandy.deposit(200.0);
        tom.transfer(100.0, sandy);
        sandy.withdraw(40.0);
        sandy.withdraw(700.0);
        System.out.println(sandy.getBalance());

    }
    
}
