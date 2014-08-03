import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockHoursTest {

    @Test
    public void should_give_berlin_representation_of_an_hour() {
	// Given
	BerlinClockHours converter = new BerlinClockHours();

	// When
	String[] actualHours = converter.convert(13);

	// Then
	assertThat(actualHours).containsExactly("RROO", "RRRO");
    }

}
