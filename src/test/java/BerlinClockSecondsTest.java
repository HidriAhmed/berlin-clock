import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class BerlinClockSecondsTest {

    @Test
    public void should_give_berlin_representation_of_a_seconds() {
	// Given
	BerlinClockSeconds converter = new BerlinClockSeconds();

	// When
	String[] actualEven = converter.convert(0);
	String[] actualOdd = converter.convert(3);

	// Then
	assertThat(actualEven).containsExactly("Y");
	assertThat(actualOdd).containsExactly("O");
    }
}
