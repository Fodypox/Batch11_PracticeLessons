package Week6._01_Monday.Practice;

public class BankApp {
    String account;
    String nameOfHolder;
    int balance;

    public BankApp(String account, String nameOfHolder, int balance) {
        this.account = account;
        this.nameOfHolder = nameOfHolder;
        this.balance = balance;
    }

    public void withdrowMoney(int amount){
        if (this.balance>=amount){
            this.balance-=amount;
            System.out.println("the money amount was withdrown");
        }else {
            System.out.println("not enough funds on your balance");
        }

    }
    public void depositMoney(int amount){
        this.balance+=amount;
        System.out.println("the amount was deposited successfully");

    }

    public int showTheBalance(){
        return this.balance;
    }
}
