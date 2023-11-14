import java.util.Random;


public class LotakBank implements RBI{
    private String name;
    private String userName;
    private String password;
    private int accountNumber;
    private int balance;
    public static double rateOfInterest=8.5;
    public static int minimumBalance=5000;
    private Random rand;
 ;



    public LotakBank(String name, String password, int balance) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        //this.accountNumber =accountNumber;
        this.balance = balance;
    }



    @Override
    public int  createAccount() {
        int rand_int1 = rand.nextInt(1000);



        return rand_int1;
    }

    @Override
    public String AddMoney(String name, int money, String password) {
        if(password.equals(this.password)){
            balance=money+balance;
            return "Money has been added, new Balance is "+balance;

        }
        else {
            return "OOPs password is wrong ";
        }

    }

    @Override
    public String withdrawMoney(String name, int money, String password) {
        if (password.equals(this.password))
        {

            int newbalance=balance-money;
            if(newbalance>=5000)
            {
                balance=balance-money;
                return " Money withdrawn successfully, new balance is "+balance;
            }
            else{
                return "Minimum balance criteria is not supported";
            }

        }
        else
        {

            return "OOPs password is wrong ";

        }

    }

    @Override
    public int  checkBalance(String name, String password) {
        if(password.equals(password)){
            return balance;
        }
        else{
            return -1;
        }

    }

    @Override
    public double calculateInterest(int year) {

        double totalInterest = (balance*rateOfInterest*year)/100;
        return totalInterest;
    }
}
