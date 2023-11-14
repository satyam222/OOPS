import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your userName");
        String userName = sc.next();
        System.out.println("Enter your initial balance for account opening");
        int initialBalance = sc.nextInt();
        System.out.println("Enter your Password !!");
        String password = sc.next();
        /// object of lotak bank------------------------------
        System.out.print("WELLCOME TO LOTAK BANK\n");
        LotakBank bankAccount = new LotakBank(userName,password,initialBalance);
        System.out.println("Enter the name for add money ");
        String name=sc.next();

        System.out.println("Enter the money you want to withdraw ");

        int money = sc.nextInt();
        System.out.println("Enter your password ");
        String enteredPassword = sc.next();

        String response = bankAccount.withdrawMoney(name,money,enteredPassword);
        System.out.println(response);



        //Add Money function
        System.out.println("Enter the name for add money ");
        name=sc.next();
        System.out.println("Enter the money you want to Add into account ");

        money = sc.nextInt();
        System.out.println("Enter your password ");
        enteredPassword = sc.next();


        response = bankAccount.AddMoney(name,money,enteredPassword);

        if(response.equals( "OOPs password is wrong ")){
            System.out.println(response);
            System.out.println("Enter you password again");
            enteredPassword = sc.next();

            response = bankAccount.AddMoney(name,money,enteredPassword);
            System.out.println(response);

        }

        //Check balance
        System.out.println("Enter the name for add money ");
        name=sc.next();

        System.out.println("Enter your password to check balance");
        enteredPassword = sc.next();
        int finalBalance = bankAccount.checkBalance(name,enteredPassword);
        System.out.println("The final balance is "+finalBalance);



        //rate of interest calculation
        System.out.println("Enter no. of years you want to save this money");

        int years = sc.nextInt();
        double totalInterest = bankAccount.calculateInterest(years);

        System.out.println("The totalInterest is "+totalInterest);




        //object of no bank--------------------------------


        System.out.print("WELLCOME TO NOBANK \n");

        NoBank bankAccount2 = new NoBank(userName,password,initialBalance);
        System.out.println("Enter the name for withdraw money ");
         name=sc.next();

        System.out.println("Enter the money you want to withdraw ");

         money = sc.nextInt();
        System.out.println("Enter your password ");
         enteredPassword = sc.next();

        response = bankAccount.withdrawMoney(name,money,enteredPassword);
        System.out.println(response);



        //Add Money function
        System.out.println("Enter the name for add money ");
        name=sc.next();
        System.out.println("Enter the money you want to Add into account ");

        money = sc.nextInt();
        System.out.println("Enter your password ");
        enteredPassword = sc.next();


        response = bankAccount.AddMoney(name,money,enteredPassword);

        if(response.equals( "OOPs password is wrong ")){
            System.out.println(response);
            System.out.println("Enter you password again");
            enteredPassword = sc.next();

            response = bankAccount2.AddMoney(name,money,enteredPassword);
            System.out.println(response);

        }

        //Check balance
        System.out.println("Enter the name for check balance");
        name=sc.next();

        System.out.println("Enter your password to check balance");
        enteredPassword = sc.next();
         finalBalance = bankAccount2.checkBalance(name,enteredPassword);
        System.out.println("The final balance is "+finalBalance);



        //rate of interest calculation
        System.out.println("Enter no. of years you want to save this money");

         years = sc.nextInt();
         totalInterest = bankAccount2.calculateInterest(years);

        System.out.println("The totalInterest is "+totalInterest);



    }
    }