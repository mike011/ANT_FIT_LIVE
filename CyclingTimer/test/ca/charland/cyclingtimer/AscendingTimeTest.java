package ca.charland.cyclingtimer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AscendingTimeTest {

	private AscendingTime time;

	@Test
	public void counterGoesUp() {
		time = new AscendingTime(0, 0, 2);
		time.next();
		TimeTest.assertTime(0, 0, 1, time.getCurrentTime());
	}

	@Test
	public void timeStillLeftToGo() {
		time = new AscendingTime(0, 0, 1);
		assertFalse(time.isDone());
	}

	@Test
	public void nothingToDo() {
		time = new AscendingTime(0, 0, 0);
		assertTrue(time.isDone());
	}

	@Test
	public void finished() {
		time = new AscendingTime(0, 0, 1);
		time.next();
		assertTrue(time.isDone());
	}

	@Test
	public void cannotGoBeyondTheEnd() {
		time = new AscendingTime(0, 0, 1);
		time.next();
		time.next();
		TimeTest.assertTime(0, 0, 1, time.getCurrentTime());
		assertTrue(time.isDone());
	}
	
	@Test
	public void resetToOriginal() {
		time = new AscendingTime(0, 0, 1);
		time.next();
		time.reset();
		TimeTest.assertTime(0, 0, 0, time.getCurrentTime());
	}
}
