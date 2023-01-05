import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] alphabet = scanner.nextLine().split(" ");
        boolean comparison = true;
        for (int i = 0; i < alphabet.length - 1; i++) comparison = alphabet[i].compareTo(alphabet[i + 1]) <= 0;
        System.out.println(comparison);
    }
}
