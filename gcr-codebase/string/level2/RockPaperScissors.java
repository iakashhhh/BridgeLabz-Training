import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate computer choice
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);

        if (choice == 0)
            return "Rock";
        else if (choice == 1)
            return "Paper";
        else
            return "Scissors";
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    // Method to calculate average and percentage
    public static String[][] calculateStats(int playerWins, int computerWins, int games) {

        String[][] stats = new String[2][3];

        double playerPercent = (playerWins * 100.0) / games;
        double computerPercent = (computerWins * 100.0) / games;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = playerPercent + "%";

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = computerPercent + "%";

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] stats) {

        System.out.println("\nGame\tPlayer\tComputer\tWinner");

        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                gameResults[i][0] + "\t" +
                gameResults[i][1] + "\t\t" +
                gameResults[i][2]
            );
        }

        System.out.println("\n--- Win Statistics ---");
        System.out.println("Name\tWins\tPercentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(
                stats[i][0] + "\t" +
                stats[i][1] + "\t" +
                stats[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = input.nextInt();

        String[][] gameResults = new String[games][3];

        int playerWins = 0;
        int computerWins = 0;

        for (int i = 0; i < games; i++) {

            System.out.print("\nEnter choice (Rock/Paper/Scissors): ");
            String userChoice = input.next();

            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);

            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;

            if (winner.equals("Player"))
                playerWins++;
            else if (winner.equals("Computer"))
                computerWins++;
        }

        String[][] stats = calculateStats(playerWins, computerWins, games);
        displayResults(gameResults, stats);

        input.close();
    }
}
