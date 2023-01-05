

class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i" + i);
            if (i < 3) {
                continue;
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.println("j" + j);
                }
            }
        }
    }
}