import java.util.HashMap;

public class Service {
    HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public void createAccount() {
        Account Dan = new Account();
        Dan.setFirstName("Dan");
        Dan.setSecondName("Higgins");
        Dan.setAccountNum(1);

        accounts.put(1, Dan);
    }
}
