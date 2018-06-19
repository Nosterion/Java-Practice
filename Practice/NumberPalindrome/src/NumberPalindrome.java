public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        if (number<0) {
            number *= -1;
        }
        int originalNumber = number;

        int reverse = 0;
        int part = 0;
        while (number>0) {
            part = number % 10;
            reverse = reverse * 10 + part;
            number /= 10;
        }
        return originalNumber == reverse;
    }

}