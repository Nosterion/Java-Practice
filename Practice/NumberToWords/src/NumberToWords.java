public class NumberToWords {

    public static int getDigitCount(int number) {
        int count = 0;
        if (number<0) {
            return -1;
        } else {
            do {
                count++;
                number /= 10;
            } while(number>0);
            return count;
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while(number!=0) {
            reversedNumber = reversedNumber*10+(number % 10);
            number /= 10;
        }
        return reversedNumber;
    }

    public static void numberToWords(int number) {
        if (number<0) {
            System.out.println("Invalid Value");
        } else {
            int reversedNumber = reverse(number);
            int count = 0;
            while(reversedNumber>0) {
                int lastDigit = reversedNumber % 10;
                switch(lastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNumber /= 10;
                count++;
            }
            while(count<getDigitCount(number)) {
                System.out.println("Zero");
                count++;
            }
        }
    }

}