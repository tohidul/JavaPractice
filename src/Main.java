import com.tohidul.OopPractice.User;
import com.tohidul.OopPractice.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is just for practice;

        String validPassword = "asdjsd124";
        String validAccountNumber = "12345678";
        int attempt = 0;
        int choice;
        boolean isValidUser = false;
        Scanner myScanner = new Scanner(System.in);

        User myNewUser = new User();

        do{
            attempt++;
            System.out.println("Enter your account number");
            String userInputAccountNumber = myScanner.nextLine();
            System.out.println("Enter your password");
            String userInputPassword = myScanner.nextLine();
            myNewUser.setAccountNumber(userInputAccountNumber);
            myNewUser.setPassword(userInputPassword);
            if((validPassword.equals(myNewUser.getPassword())) && (validAccountNumber.equals(myNewUser.getAccountNumber()))){
                System.out.println("Login Successful");
                isValidUser = true;
                attempt = 3;
            }
            else{
                System.out.println("Wrong account number or password");
                System.out.println("You have "+ (3-attempt) + " attempt left");
            }
        }while(attempt<3);

        if(isValidUser) {
            Account myNewAccount = new Account(100);
            do {
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                choice = myScanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is " + myNewAccount.getBalance() + " BDT.");
                        break;
                    case 2:
                        System.out.println("Enter Withdrawal Amount: ");
                        int withdrawalAmount = myScanner.nextInt();
                        myNewAccount.setBalance(myNewAccount.getBalance() - withdrawalAmount);
                        break;
                    case 3:
                        System.out.println("Enter Deposit Amount: ");
                        int depositAmount = myScanner.nextInt();
                        myNewAccount.setBalance(myNewAccount.getBalance() + depositAmount);
                        break;
                    case 4:
                        System.out.println("Exiting from system");
                    default:
                        System.out.println("Wrong input.");
                }
            } while (choice != 4);
        }

    }
}