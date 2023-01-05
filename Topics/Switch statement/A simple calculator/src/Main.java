import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        long firstInt = scanner.nextLong();
        String sign = scanner.next();
        long secondInt = scanner.nextLong();
        long result;
        switch (sign) {
            case "+":
                result = firstInt + secondInt;
                System.out.println(result);
                break;
            case "-":
                result = firstInt - secondInt;
                System.out.println(result);
                break;
            case "*":
                result = firstInt * secondInt;
                System.out.println(result);
                break;
            case "/":
                if (secondInt == 0) {
                    System.out.println("Division by 0!");
                } else {
                    result = firstInt / secondInt;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }

    }
}