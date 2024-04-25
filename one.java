public class one {
    public static void main(String[] args) {
        System.out.println("Factorials of the first 10 numbers:");
        for (int i = 1; i <= 10; i++) {
            long factorial = calculateFactorial(i);
            System.out.println(i + "! = " + factorial);
        }
    }

    // Method to calculate factorial of a number
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
