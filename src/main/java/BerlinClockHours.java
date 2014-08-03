public class BerlinClockHours {

    public String[] convert(int hours) {

	char[] topRow = new char[] { 'O', 'O', 'O', 'O' };
	double topRowRedLampsCount = Math.floor(hours / 5);
	for (int i = 0; i < topRowRedLampsCount; i++) {
	    topRow[i] = 'R';
	}

	char[] lowerRow = new char[] { 'O', 'O', 'O', 'O' };
	int lowerRowRedLampsCount = hours % 5;
	for (int i = 0; i < lowerRowRedLampsCount; i++) {
	    lowerRow[i] = 'R';
	}

	return new String[] { new String(topRow), new String(lowerRow) };

    }
}
