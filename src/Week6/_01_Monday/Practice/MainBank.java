package Week6._01_Monday.Practice;

public class MainBank {
    public static void main(String[] args) {
        BankApp myAccount = new BankApp("Saving","Aslanbek Turganbayev", 200);
        System.out.println(myAccount.showTheBalance());
        myAccount.depositMoney(100);
        System.out.println(myAccount.showTheBalance());
        myAccount.withdrowMoney(250);
        System.out.println(myAccount.showTheBalance());
        myAccount.withdrowMoney(100);
        System.out.println(myAccount.showTheBalance());

    }
}
