public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking) {
            if ((hourOfDay >= 0 && hourOfDay < 8)  || (hourOfDay > 22 && hourOfDay <= 23)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
