package cinema;

import java.util.Scanner;

public class Cinema {

    public static Scanner scanner = new Scanner(System.in);
    public static int numOfRows;
    public static int numOfSeatsEach;
    public static int clientChoice;
    public static int chosenRow;
    public static int chosenSeat;
    public static int purchasedTickets = 0;
    public static int totalIncome;
    public static int currentIncome = 0;
    public static int totalSeats;

    public static String[][] textBlueprint = new String[0][0];


    public static void main(String[] args) {
        // Write your code here

        System.out.println("Enter the number of rows:");
        numOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        numOfSeatsEach = scanner.nextInt();
        int income;
        if (numOfRows * numOfSeatsEach <= 60) {
            income = numOfRows * numOfSeatsEach * 10;
        } else {
            if (numOfRows % 2 == 0) {
                income = numOfRows * numOfSeatsEach * 9;
            } else {
                income = ((numOfRows / 2 + 1) * 8 + numOfRows / 2 * 10) * numOfSeatsEach;
            }
        }
        totalIncome = income;
        totalSeats = numOfRows * numOfSeatsEach;
        initializeBlueprint();
        menu();



    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Show the seats
                2. Buy a ticket
                3. Statistics
                0. Exit
                """);
        clientChoice = scanner.nextInt();

        switch (clientChoice) {
            case 1:
                displayCinema();
                menu();
            case 2:
                chooseSeat();
                menu();
            case 3:
                showIncome();
                menu();
            case 0:
                break;
        }
    }

    public static void chooseSeat () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        chosenRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        chosenSeat = scanner.nextInt();
        if (chosenRow > numOfRows || chosenSeat > numOfSeatsEach) {
            System.out.println("Wrong input!");
            chooseSeat();
        }
        if (textBlueprint[chosenRow][chosenSeat] == "B") {
            System.out.println("That ticket has already been purchased!");
            chooseSeat();
        }
        int ticketPrice;
        if (numOfRows * numOfSeatsEach <= 60) {
            ticketPrice = 10;
        } else {
            if (chosenRow <= numOfRows / 2) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }
        currentIncome += ticketPrice;
        purchasedTickets++;
        updateBlueprint();
        System.out.println("Ticket price: $" + ticketPrice);
        System.out.println("Cinema:");
        for (String[] row:textBlueprint) {
            for (String seat:row) {
                System.out.print(seat + " ");
            }
            System.out.println();
        }
    }

    public static void displayCinema() {
        System.out.println("Cinema:");
        for (String[] allSeat : textBlueprint) {
            for (String s : allSeat) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public static void updateBlueprint() {
        textBlueprint[chosenRow][chosenSeat] = "B";
    }

    public static void initializeBlueprint() {
        textBlueprint = new String[numOfRows + 1][numOfSeatsEach + 1];
        for (int i = 0; i <= numOfRows; i++) {
            for (int j = 0; j <= numOfSeatsEach; j++) {
                if (j == 0) {
                    textBlueprint[i][j] = Integer.toString(i);
                } else {
                    textBlueprint[i][j] = "S";
                }
                if (i == 0) {
                    textBlueprint[i][j] = Integer.toString(j);
                }
            }
        }
        textBlueprint[0][0] = " ";
    }

    public static void showIncome() {
        double bookPercentage = ((double) purchasedTickets / (double) totalSeats)* 100;


        String statistics = "Number of purchased tickets: %d%nPercentage: %.2f%%%nCurrent income: $%d %nTotal income: $%d"
                .formatted(purchasedTickets, bookPercentage, currentIncome, totalIncome);
        System.out.println(statistics);
    }
}
