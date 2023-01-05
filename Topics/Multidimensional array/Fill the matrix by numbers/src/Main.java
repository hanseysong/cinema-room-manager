import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[][] twoDimArray = new int[length][length];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = Math.abs(i - j);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}