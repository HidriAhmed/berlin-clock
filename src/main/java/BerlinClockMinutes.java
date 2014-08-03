public class BerlinClockMinutes {

    public String[] convert(int minutes) {

	char[] topRow = new char[] { 'O', 'O', 'O', 'O', 'O', 'O', 'O', 'O',
		'O', 'O', 'O' };

	double topRowRedLampsCount = Math.floor(minutes / 5);

	for (int i = 0; i < topRowRedLampsCount; i++) {
	    if ((i + 1) % 3 == 0) {
		topRow[i] = 'R';
	    } else {
		topRow[i] = 'Y';
	    }
	}

	char[] lowerRow = new char[] { 'O', 'O', 'O', 'O' };
	int lowerRowRedLampsCount = minutes % 5;
	for (int i = 0; i < lowerRowRedLampsCount; i++) {
	    lowerRow[i] = 'Y';
	}

	return new String[] { new String(topRow), new String(lowerRow) };
    }

}
