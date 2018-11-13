import org.junit.Assert;
import org.junit.Test;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Tests {
    @Test
    public void createDeleteUsers() {
        Service service = new Service();

        Account Dan = new Account(1, "Dan", "Higgins");
        Account Paul = new Account(2, "Paul", "Higgins");
        service.createAccount(Dan);
        service.createAccount(Paul);
        Assert.assertEquals(2, Service.accounts.size());

        Account Fay = new Account(3, "Fay", "Higgins");
        service.createAccount(Fay);
        Assert.assertEquals(3, Service.accounts.size());

        service.deleteUser(Paul);
        Assert.assertEquals(2, Service.accounts.size());
    }

    @Test
    public void searchForUsers() {
        Service service = new Service();
        AccountSearch search = new AccountSearch();

        Assert.assertEquals(0, search.searchAccounts("Higgins"));

        Account Dan = new Account(1, "Dan", "Higgins");
        Account Paul = new Account(2, "Paul", "Higgins");
        service.createAccount(Paul);
        service.createAccount(Dan);

        Assert.assertEquals(2, search.searchAccounts("Higgins"));
        Assert.assertEquals(2, search.searchAccountJava8("Higgins"));
    }

    @Test
    public void checkJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        Service service = new Service();

        Account Paul = new Account(1, "Paul", "Higgins");
        service.createAccount(Paul);

        try {
            String accountAsString = objectMapper.writeValueAsString(Paul);
            Assert.assertEquals("{\"firstName\":\"Paul\",\"secondName\":\"Higgins\",\"accountNum\":1}", accountAsString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
