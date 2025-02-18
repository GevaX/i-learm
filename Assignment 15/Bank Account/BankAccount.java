public class BankAccount {
    private String number;
    private String name;
    private int money;
    public BankAccount (String number, String name, int money) {
        this.number = number;
        this.name = name;
        this.money = money;
    }
    public String getNumber() {
        return number;
    }
    public String getName() {
        return name;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public void setName(String name) {
        this.name = name;
    }
}