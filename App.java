import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Friendship Bank");
        System.out.println("Are you an existing customer?");
        System.out.println("1 - Yes");
        System.out.println("2 - No");

        int existingCustomer = scanner.nextInt();

        switch(existingCustomer){
            case 1:
                System.out.println("Enter your email.");
                String email1 = scanner.next();

                System.out.println("Enter your password.");
                String password1 = scanner.next().toLowerCase();
                //validate password search database to find match

                System.out.println("Login Successful.");
                break;
            case 2:
                System.out.println("Enter your full name (first and last).");
                String fullName = scanner.next().toLowerCase();
    
                System.out.println("Enter your email.");
                String email2 = scanner.next().toLowerCase();
    
                System.out.println("Enter your password.");
                String password2 = scanner.next().toLowerCase();
    
                System.out.println("Account created.");
                break;
        }
        
        System.out.println("Which action would you like to take?");
        System.out.println("1 - Apply for a new account");
        System.out.println("2 - View account balance");
        System.out.println("3 - Withdraw money");
        System.out.println("4 - Deposit money");
        System.out.println("5 - Transfer money");
        System.out.println("6 - Logout");
        
        int desiredAction = scanner.nextInt();

        
         switch(desiredAction){
            case 1:
                /*write a program that  allows a customer to apply for an account
                    
                    Test Plan: 
                        input: what account would you like to apply for? 1-checkings 2-savings: 2
                        expected result:How much would you like to deposit into your savings? 25
                        expected result: Deposit pending account approval.

                        0) start
                        1) get a value for "accountAppliedFor" by prompting the user with the message
                            'Which account would you like to apply for? 1 - Checkings 2 - Savings'
                        
                            //Checkings
                        2)if "accountAppliedFor" == 1, then print the message 'Enter the amount you want to deposit into your checkings account.'
                        3)get a value for "amountToDepositNC"
                */
            case 2:
            case 3:
                 //3 - View Balance
            System.out.println("Which would you like to view the balance of?");
            System.out.println("1 - Checkings");
            System.out.println("2 - Savings");

            int desiredView = scanner.nextInt();

            switch(desiredView){
                case 1:
                    System.out.println("Your checkings account balance is: ");
                    break;
                case 2:
                    System.out.println("Your Savings account balance is: ");
                    break;

            }
            case 4:
            case 5:
            case 6:
        }

    
    
        
        
       
               
    
       

    }
}
