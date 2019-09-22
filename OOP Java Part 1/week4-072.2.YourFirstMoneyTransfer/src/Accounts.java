
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account matsAccount = new Account("Matt's account", 1000);
        Account myAccount = new Account("My account", 0);
        double money = 100.0;
        
        matsAccount.withdrawal(money);
        myAccount.deposit(money);
        
        System.out.println(matsAccount);
        System.out.println(myAccount);
    }
}
