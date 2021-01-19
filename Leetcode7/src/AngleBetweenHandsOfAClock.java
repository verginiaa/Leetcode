public class AngleBetweenHandsOfAClock {
    public double angleClock(int hour, int minutes) {
        double hours = hour * 30 % 360 + minutes * 0.5;
        double minute = minutes * 6;

        double tot = Math.abs(minute - hours);

        return Math.min(tot, 360 -tot);
    }
}
