public class Account {
    private String firstName;
    private String secondName;
    private int accountNum;

    public Account(int accountNum, String firstName, String secondName) {
        setAccountNum(accountNum);
        setFirstName(firstName);
        setSecondName(secondName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
}
