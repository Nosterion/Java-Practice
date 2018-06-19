public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int limit=35;
        if (summer) limit+=10;
        return (temperature>=25 && temperature<=limit);
    }
}
