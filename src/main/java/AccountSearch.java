import java.util.Map;

public class AccountSearch {
    public int searchAccounts(String searchName) {
        int count = 0;

        for (Map.Entry<Integer, Account> entry : Service.accounts.entrySet()) {
            if (entry.getValue().getFirstName().equals(searchName) || entry.getValue().getSecondName().equals(searchName)) {
                count ++;
            }
        }

        return count;
    }

    public long searchAccountJava8(String searchName) {
        return
                Service.accounts.values().stream()
                .filter(entry -> entry.getFirstName().equals(searchName) || entry.getSecondName().equals(searchName))
                .count();
    }
}
