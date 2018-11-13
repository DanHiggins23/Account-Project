import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void searchUser1() {
        Service service = new Service();
        AccountSearch search = new AccountSearch();

        Account Dan = new Account(1, "Dan", "Higgins");
        service.createAccount(Dan);

        Assert.assertEquals(1, search.searchAccounts("Dan"));
    }

    @Test
    public void searchUser2() {
        Service service = new Service();
        AccountSearch search = new AccountSearch();

        Account Paul = new Account(1, "Paul", "Higgins");
        Account Dan = new Account(2, "Dan", "Higgins");
        service.createAccount(Paul);
        service.createAccount(Dan);

        Assert.assertEquals(2, search.searchAccounts("Higgins"));
    }
}
