public class GCDCalculator {
    public static int findGCD(int num1, int num2) {
        // Ensure num1 is greater than or equal to num2
        if (num1 < num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        while (num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }

        return num1;
    }

    public static void main(String[] args) {
        int num1 = 48;
        int num2 = 18;

        int gcd = findGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is " + gcd);
    }
}
