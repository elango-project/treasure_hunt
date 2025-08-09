import java.util.Scanner;

public class Treasure_Hunt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Health =  100;
        int Coins = 0;
        boolean gameOver = false;

        System.out.println("===== Welcome to Treasure Hunt! =====");
        System.out.println("Starting Health: " + Health);
        System.out.println("Starting Coins: " + Coins);

        while (!gameOver) {
            System.out.println("\nWhat will you do?\n"+
                    "1. Fight\n"+
                    "2. Search\n"+
                    "3. Rest\n"+
                    "4. Check Status\n"+
                    "5. Exit\n"
                    );
            System.out.print("Enter your choice: ");
            int n = sc.nextInt();

            if (n == 1) {
                Health = Health - 20;
                Coins = Coins + 10;
                System.out.println("Your Health: " + Health + " | Coins left: " + Coins);

            } else if (n == 2) {
                Health = Health - 10;
                Coins = Coins + 20;
                System.out.println("Your Health: " + Health + " | Coins left: " + Coins);
            } else if (n == 3) {
                Health = Health + 15;
                Coins = Coins + 5;
                System.out.println("Your Health: " + Health + " | Coins left: " + Coins);
            } else if (n == 4) {
                System.out.println("Your Health: " + Health + " | Coins left: " + Coins);
            } else if (n == 5) {
                System.out.println("The Game is Over\n"+"Your Health: " + Health + " | Coins left: " + Coins);
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Try again");
            }

            if (!gameOver) {
                if (Health >= 100) {
                    gameOver = true;
                    System.out.println("Congratulations! You Win!");
                } else if (Health <= 0) {
                    System.out.println("Sorry, you lost!");
                    gameOver = true;
                }
            }
        }
        sc.close();
    }
}