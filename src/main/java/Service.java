import java.util.HashMap;

class Service {
    HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public void createAccount(Account person) {
        accounts.put(person.getAccountNum(), person);
    }
}
