import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to the Plane Management system");
    }

    static Scanner scanner = new Scanner(System.in);

    // rows
    static int[] seatRow_A = new int[14];
    static int[] seatRow_B = new int[12];
    static int[] seatRow_C = new int[12];
    static int[] seatRow_D = new int[14];

    static Person person;

    public static void displayMenu() {
        System.out.println("bla bla bla");

        int input = getInput();

        switch (input) {
            case 1:
                break;
        }

    }

    public static int getInput() {
        int input = 0;
        try {
            System.out.println("Enter the option here, between 0-7 : ");
            input = scanner.nextInt();
            scanner.nextLine();

            if (input > 6 || input < 0) {
                System.err.println("Invalid input, please enter a number between 0 - 7 or 0 to exit!! ");
                displayMenu();
                }
            }
        catch (Exception error) {
            scanner.nextLine();
            System.err.println("Invalid input, please try again! ");
            displayMenu();
            }
        return input;
        }

    public static void buySeat() {
        System.out.println("Enter row letter - (A/B/C/D) : ");
        String row = scanner.next().toUpperCase();

//        switch (row) {
//            case "A"
//        }
    }

    public static Person getPersonInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Enter your email: ");
        String email = scanner.nextLine();

        person = new Person(name,email);
        return person;
    }

    public static void buyProcess(String row, int[] seatRow){
        System.out.println("Enter a seat number: ");
        scanner.nextLine();

        if (scanner.hasNextInt()) {
            try {
                int seatNum = scanner.nextInt();
                scanner.nextLine();
                if (seatRow[seatNum - 1] == 0) {
                    seatRow[seatNum - 1] = 1;
                }
            }
        }
    }
}