import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockIT {

    @Test
    public void should_convert_0_0_0_to_berlin_clock_representation() {
	// Given
	BerlinClock converter = new BerlinClock();

	// When
	String[] convert = converter.convert(0, 0, 0);

	// Then
	assertThat(convert).hasSize(5);
	assertThat(convert).containsExactly("Y", "OOOO", "OOOO", "OOOOOOOOOOO",
		"OOOO");
    }

    @Test
    public void should_convert_13_17_1_to_berlin_clock_representation() {
	// Given
	BerlinClock converter = new BerlinClock();

	// When
	String[] convert = converter.convert(13, 17, 1);

	// Then
	assertThat(convert).hasSize(5);
	assertThat(convert).containsExactly("O", "RROO", "RRRO", "YYROOOOOOOO",
		"YYOO");
    }
}
