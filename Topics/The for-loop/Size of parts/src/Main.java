import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int partSize = scanner.nextInt();
            if (partSize == 1) {
                larger++;
            } else if (partSize == -1) {
                smaller++;
            } else if (partSize ==0) {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}