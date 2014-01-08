package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AscendingTimeTest {

	static void assertTime(Time expected, Time actual) {
		assertThat(actual.getSeconds(), is(expected.getSeconds()));
		assertThat(actual.getMinutes(), is(expected.getMinutes()));
		assertThat(actual.getHours(), is(expected.getHours()));
	}
	
	@Test
	public void counterGoesUp() {
		AscendingTime time = new AscendingTime(0,0,2);
		time.next();
		assertTime(new Time(0,0,1), time.getCurrentTime());
	}
	
	@Test
	public void timeStillLeftToGo() {
		AscendingTime time = new AscendingTime(0,0,1);
		assertFalse(time.isDone());
	}
	
	@Test
	public void nothingToDo() {
		AscendingTime time = new AscendingTime(0,0,0);
		assertTrue(time.isDone());
	}
	
	@Test
	public void finished() {
		AscendingTime time = new AscendingTime(0,0,1);
		time.next();
		assertTrue(time.isDone());
	}
}
