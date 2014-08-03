import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockMinutesTest {

    @Test
    public void should_give_berlin_representation_of_a_minutes() {
	// Given
	BerlinClockMinutes converter = new BerlinClockMinutes();

	// When
	String[] actualHours = converter.convert(17);

	// Then
	assertThat(actualHours).containsExactly("YYROOOOOOOO", "YYOO");
    }

}
