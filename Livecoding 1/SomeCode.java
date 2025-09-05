import java.util.Scanner;

class ATM2{
    public static void main(String[] args){
        //deposit, withdraw, balance
        int balance;
        int userChoice;
        boolean isRunning = true;
        balance = 1000;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Velkommen til ITU's bank!");

        while (isRunning){
            System.out.println("Tryk 1 for at se din saldo; 2 for at indsætte penge; 3 to withdraw; 0 to close");
            userChoice = scanner.nextInt();
            if (userChoice == 1){
                System.out.println("Din balance er: " + balance + " kr.");
            } else if (userChoice == 2){
                System.out.println("Hvor meget vil du gerne indsætte?");
                int deposit = scanner.nextInt();
                balance = balance + deposit;
                System.out.println("Din nye saldo er: " + balance + " kr.");
            } else if (userChoice == 3){
                System.out.println("Hvor meget vil du gerne hæve?");
                int withdraw = scanner.nextInt();
                if (balance - withdraw < 0){
                    System.out.println("Du har ikke så mange penge, you silly goose");
                    System.out.println("Din saldo er stadig: " + balance + " kr.");
                } else{
                    balance = balance - withdraw;
                    System.out.println("Din nye saldo er: " + balance + " kr.");
                }
            } else if (userChoice == 0){
                isRunning = false;
            } else{
                System.out.println("That was not an option");
            }
        }
    }
}
