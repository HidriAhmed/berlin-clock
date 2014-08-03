public class BerlinClockSeconds {

    public String[] convert(int seconds) {
	if (seconds % 2 == 0) {
	    return new String[] { "Y" };

	} else {
	    return new String[] { "O" };

	}
    }

}
