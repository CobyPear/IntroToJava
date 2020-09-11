import java.util.List;
import java.util.ArrayList;

public class Account {
    private long id;
    private String accountType;

    // constructor 
    public Account(long id, String accountType) {
        super();
        this.id = id;
        this.accountType = accountType;
    }

    public static List<Account> createAccounts(int numAccounts) {
        List<Account> accounts = new ArrayList();

        while (numAccounts > 0) {
            Account a = new Account(numAccounts + 10, "savings");
            accounts.add(a);
            numAccounts--;
        }

        return accounts;
        
    }

    @Override
    public String toString() {
        return "Account [id: " + this.id + "] [" + this.accountType +"]";
    }
}
