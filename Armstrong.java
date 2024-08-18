public class Armstrong {

    public static void main(String[] args) {
        int number = 154;
        if (isArmstrong(number)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("NA");
        }
    }

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int sum = 0;
        int digits = countDigits(num);
        
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNumber;
    }

    // Function to count the number of digits in the number
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
