import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        int firstCol = scanner.nextInt();
        int secondCol = scanner.nextInt();
        int temp;
        for (int k = 0; k < matrix.length; k++) {
            temp = matrix[k][secondCol];
            matrix[k][secondCol] = matrix[k][firstCol];
            matrix[k][firstCol] = temp;
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}