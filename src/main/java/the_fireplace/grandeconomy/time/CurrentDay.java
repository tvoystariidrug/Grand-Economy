package the_fireplace.grandeconomy.time;

public class CurrentDay {
    public static long getCurrentDay() {
        return timeToDays(getCurrentServerTime());
    }

    private static long getCurrentServerTime() {
        return System.currentTimeMillis();
    }

    private static long timeToDays(long time) {
        long day = 1000 * 60 * 24 * 60;
        return time / day;
    }
}
