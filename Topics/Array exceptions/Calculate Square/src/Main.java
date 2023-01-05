class FixingExceptions {

    public static void calculateSquare(int[] array, int index) {
        // write your code here
        if (array != null && index < array.length && index >= 0) {
            System.out.println((int)Math.pow(array[index], 2));
        } else System.out.println("Exception!");
    }
}