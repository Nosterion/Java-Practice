public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {
        if (a<10 || a>99 || b<10 || b>99) {
            return false;
        } else {
            int digit = 0;
            int digitOne = 0;
            int digitTwo = 0;
            while(a>0) {
                digitOne = digitTwo;
                digitTwo = a % 10;
                a /= 10;
            }
            while(b>0) {
                digit = b % 10;
                if((digit == digitOne) || (digit == digitTwo)) {
                    return true;
                }
                b /= 10;
            }
            return false;
        }
    }
}