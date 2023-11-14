public interface RBI {
    //Implement is present in classes
    //we just define method  only
    //public String createAccount(String name,int  accountNumber,String intial_Amount);

   // String createAccount(String name, String accountNumber, String intial_Amount);

    int  createAccount();

    public String AddMoney(String name, int money , String password);
    public String  withdrawMoney(String name,int money ,String password);
    public int  checkBalance(String name ,String password);

    public double calculateInterest(int year);



}
