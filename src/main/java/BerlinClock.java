public class BerlinClock {

    private BerlinClockHours berlinClockHours;

    private BerlinClockMinutes berlinClockMinutes;

    private BerlinClockSeconds berlinClockSeconds;

    public BerlinClock() {
	berlinClockHours = new BerlinClockHours();
	berlinClockMinutes = new BerlinClockMinutes();
	berlinClockSeconds = new BerlinClockSeconds();
    }

    public String[] convert(int hours, int minutes, int seconds) {
	String[] berlinHours = berlinClockHours.convert(hours);
	String[] berlinMinutes = berlinClockMinutes.convert(minutes);
	String[] berlinSeconds = berlinClockSeconds.convert(seconds);

	return new String[] { berlinSeconds[0], berlinHours[0], berlinHours[1],
		berlinMinutes[0], berlinMinutes[1] };
    }

}
