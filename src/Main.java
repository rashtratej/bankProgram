import java.util.Scanner;
public class Main {
     static double balance = 10000.0;
    public static void main(){
        //banking program
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning){
            System.out.println("-------------------------");
            System.out.println("a simple banking program");
            System.out.println("1. CHECK BALANCE ");
            System.out.println("2. WITHDRAW MONEY ");
            System.out.println("3. DEPOSIT MONEY ");
            System.out.println("4. EXIT ");
            System.out.println("-------------------------");
            System.out.println(" ");
            System.out.println(" ");
            System.out.print("please choose your action: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1 -> checkBalance();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> isRunning = false;
            }

        }
    }
    public static void checkBalance(){
        System.out.println("the ACCOUNT has "+ balance);
    }
    public static void withdraw(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount of money you'd like to withdraw");
        double amount = scanner.nextDouble();
        if(balance > amount){
            balance = balance - amount;
            checkBalance();
        }else{
            System.out.println("balance LOW!!!");
            System.out.printf("current balance: %f",balance);
        }

    }
    public static void deposit(){
        System.out.println("enter the amount of money you'd like to deposit");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        balance = balance + amount;
        checkBalance();
        }
    }



