public class App {
    public static void main(String[] args) {
        System.out.println("Hello world to the standard out");
        printAccounts();
    }

    public static void printAccounts() {
        Service s = new Service();
        s.createAccount();
        System.out.println(s.accounts.toString());
    }
}
