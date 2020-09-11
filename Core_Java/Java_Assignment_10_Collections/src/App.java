import java.util.List;

public class App {

    public static void main(String[] args) {
        List <Account> newAccounts = Account.createAccounts(5);


        for (int i = 0; i < 5; i++) {
            System.out.println(newAccounts.get(i));
        }

    }
}
