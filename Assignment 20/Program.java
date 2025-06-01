import java.util.Scanner;
import java.util.Random;

class Program {
    public static Scanner reader = new Scanner(System.in);

    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static boolean insertToBoard(char[][] board, int pos, char symbol) {
        int row = 2 - (pos - 1) / 3;
        int col = (pos - 1) % 3;
        if (board[row][col] == '-') {
            board[row][col] = symbol;
            return true;
        }
        else {
            return false;
        }
    }

    public static int bestMove(char[][] board, char ai, char player) {
        int bestScore = Integer.MIN_VALUE;
        int move = -1;

        for (int pos = 1; pos <= 9; pos++) {
            int row = 2 - (pos - 1) / 3;
            int col = (pos - 1) % 3;
            if (board[row][col] == '-') {
                board[row][col] = ai;
                int score = minimax(board, false, ai, player);
                board[row][col] = '-';
                if (score > bestScore) {
                    bestScore = score;
                    move = pos;
                }
            }
        }
        return move;
    }

    public static int minimax(char[][] board, boolean isMaximizing, char ai, char player) {
        char result = checkWinner(board);
        if (result == ai) return 1;
        if (result == player) return -1;
        if (isBoardFull(board)) return 0;

        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
            for (int pos = 1; pos <= 9; pos++) {
                int row = 2 - (pos - 1) / 3;
                int col = (pos - 1) % 3;
                if (board[row][col] == '-') {
                    board[row][col] = ai;
                    int score = minimax(board, false, ai, player);
                    board[row][col] = '-';
                    bestScore = Math.max(score, bestScore);
                }
            }
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
            for (int pos = 1; pos <= 9; pos++) {
                int row = 2 - (pos - 1) / 3;
                int col = (pos - 1) % 3;
                if (board[row][col] == '-') {
                    board[row][col] = player;
                    int score = minimax(board, true, ai, player);
                    board[row][col] = '-';
                    bestScore = Math.min(score, bestScore);
                }
            }
            return bestScore;
        }
    }

    public static int playerTurn(char[][] board, char playerSymbol) {
        boolean done = false;
        int move = 0;
        while (!done) {
            System.out.println("Enter position:");
            move = reader.nextInt();
            if (insertToBoard(board, move, playerSymbol)) {
                done = true;
            }
            else {
                System.out.println("Invalid, Try again!");
            }             
        }
        return move;
    }

    public static int computerTurn(char[][] board, char computerSymbol, char playerSymbol, int difficulty) {
        int move = -1;
        if (difficulty == 1) { // Easy - random valid move
            Random r = new Random();
            boolean done = false;
            while (!done) {
                move = r.nextInt(9) + 1;
                if (insertToBoard(board, move, computerSymbol)) done = true;
            }
        }
        else { // Impossible - minimax
            move = bestMove(board, computerSymbol, playerSymbol);
            insertToBoard(board, move, computerSymbol);
        }
        return move;
    }

    public static char checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }
        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] != '-' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return board[0][j];
            }
        }
        // Check diagonals
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return board[0][2];
        }
        return '-'; // No winner
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char playerSymbol;
        char computerSymbol;
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
        
        System.out.println("\nDo you want to be X or O?");
        char choice = reader.next().toUpperCase().charAt(0);

        if (choice == 'X') {
            playerSymbol = 'X';
            computerSymbol = 'O';
        } 
        else {
            playerSymbol = 'O';
            computerSymbol = 'X';
        }
        boolean isPlayerTurn = (playerSymbol == 'X');

        System.out.println("Choose computer difficulty (1 - Easy, 2 - Impossible)");
        int difficulty = reader.nextInt();

        System.out.println("Enter a number to place your input on the board:");
        System.out.println("Board layout:");
        System.out.println(" 7 | 8 | 9");
        System.out.println("-----------");
        System.out.println(" 4 | 5 | 6");
        System.out.println("-----------");
        System.out.println(" 1 | 2 | 3");

        boolean gameComplete = false;
        while (!gameComplete) {
            int n;
            if (isPlayerTurn) {
                n = playerTurn(board, playerSymbol);
                System.out.println("Player did " + n);
            }
            else {
                n = computerTurn(board, computerSymbol, playerSymbol, difficulty);
                System.out.println("Computer did " + n);
            }

            printBoard(board);
            char winner = checkWinner(board);
            if (winner != '-') {
                if (winner == playerSymbol) {
                    System.out.println("You win!");
                } else {
                    System.out.println("Computer wins!");
                }
                gameComplete = true;
            }
            else if (isBoardFull(board)) {
                System.out.println("It's a draw!");
                gameComplete = true;
            }
            isPlayerTurn = !isPlayerTurn;
        }
    }
}
