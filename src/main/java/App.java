public class App {
    public static void main(String[] args) {
        System.out.println("Hello world to the standard out");
        printAccounts();
    }

    private static void printAccounts() {
        Service s = new Service();

        Account Dan = new Account(1, "Dan", "Higgins");
        s.createAccount(Dan);

        System.out.println(s.accounts.toString());
    }
}
