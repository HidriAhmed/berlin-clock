import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BerlinClockTest {

    @InjectMocks
    private BerlinClock clock;

    @Mock
    private BerlinClockHours berlinClockHoursMock;
    @Mock
    private BerlinClockMinutes berlinClockMinutesMock;
    @Mock
    private BerlinClockSeconds berlinClockSecondsMock;

    @Test
    public void should_give_berlin_representation_of_a_time() {
	// Given
	when(berlinClockHoursMock.convert(13)).thenReturn(
		new String[] { "RROO", "RRRO" });
	when(berlinClockMinutesMock.convert(17)).thenReturn(
		new String[] { "YYR00000000", "YYOO" });
	when(berlinClockSecondsMock.convert(1))
		.thenReturn(new String[] { "O" });

	// When
	String[] actualBerlinTime = clock.convert(13, 17, 1);

	// Then
	assertThat(actualBerlinTime).containsExactly("O", "RROO", "RRRO",
		"YYR00000000", "YYOO");
    }
}
