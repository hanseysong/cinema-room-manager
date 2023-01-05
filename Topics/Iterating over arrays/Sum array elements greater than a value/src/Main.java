import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] elements = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            elements[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int sum = 0;
        for (int element: elements) {
            if (element > n) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}