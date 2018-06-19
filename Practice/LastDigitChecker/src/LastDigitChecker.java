public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {
        int lastDigita = a % 10;
        int lastDigitb = b % 10;
        int lastDigitc = c % 10;
        return (((a>=10 && b>=10 && c>=10) && (a<=1000 && b<=1000 && c<=1000)) && (((lastDigita == lastDigitb)
                || (lastDigita == lastDigitc) || (lastDigitb == lastDigitc))));
    }
}