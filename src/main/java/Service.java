import java.util.HashMap;

class Service {
    static HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

    public void createAccount(Account person) {
        accounts.put(person.getAccountNum(), person);
    }

    public void deleteUser(Account person) {
        accounts.remove(person.getAccountNum(), person);
    }
}
