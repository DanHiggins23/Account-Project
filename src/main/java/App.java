import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world to the standard out");
        printAccounts();
    }

    private static void printAccounts() {
        Service s = new Service();
        ObjectMapper objectMapper = new ObjectMapper();

        Account Dan = new Account(1, "Dan", "Higgins");
        Account Paul = new Account(2, "Paul", "Higgins");
        s.createAccount(Dan);
        s.createAccount(Paul);

        try {
            String accountAsString1 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(Dan);
            String accountAsString2 = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(Paul);
            System.out.println(accountAsString1);
            System.out.println(accountAsString2);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        System.out.println(s.accounts);
    }
}
