import java.util.Map;

public class AccountSearch {
    public int searchAccounts(String searchName) {
        Service s = new Service();
        int count = 0;

        for (Map.Entry<Integer, Account> entry : s.accounts.entrySet()) {
            if (entry.getValue().getFirstName().equals(searchName) || entry.getValue().getSecondName().equals(searchName)) {
                count ++;
            }
        }

        return count;
    }
}
