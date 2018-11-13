import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world to the standard out");
        printAccounts();
        objectToJson();
    }

    private static void printAccounts() {
        Service s = new Service();

        Account Dan = new Account(1, "Dan", "Higgins");
        Account Paul = new Account(2, "Paul", "Higgins");
        s.createAccount(Dan);
        s.createAccount(Paul);

        System.out.println(s.accounts);
    }

    private static void objectToJson() {
        Service s = new Service();
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            String accountAsString = objectMapper.writeValueAsString(s.accounts);
            System.out.println(accountAsString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}
