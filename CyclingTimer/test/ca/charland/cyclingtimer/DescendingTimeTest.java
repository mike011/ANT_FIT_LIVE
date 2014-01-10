package ca.charland.cyclingtimer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DescendingTimeTest {

	private CountingTime time;

	@Test
	public void nextGoesDown() {
		time = new DescendingTime(0, 0, 2);
		time.next();
		TimeTest.assertTime(0, 0, 1, time.getCurrentTime());
	}

	@Test
	public void notDoneCounting() {
		time = new DescendingTime(0, 0, 2);
		time.next();
		assertFalse(time.isDone());
	}

	@Test
	public void doneCounting() {
		time = new DescendingTime(0, 0, 1);
		time.next();
		assertTrue(time.isDone());
	}

	@Test
	public void notDoneAtOneMinute() {
		time = new DescendingTime(0, 1, 0);
		assertFalse(time.isDone());
	}
	
	@Test
	public void tryToCountDownBelowZero() {
		time = new DescendingTime(0, 0, 0);
		time.next();
		TimeTest.assertTime(0, 0, 0, time.getCurrentTime());
	}
	
	@Test
	public void resetToOriginal() {
		time = new DescendingTime(0, 0, 1);
		time.next();
		time.reset();
		TimeTest.assertTime(0, 0, 1, time.getCurrentTime());
	}
	
	// @Test
	public void countingDownAcrossOneMinute() {
		time = new DescendingTime(0, 1, 0);
		assertFalse(time.isDone());
		time.next();
		TimeTest.assertTime(0, 0, 59, time.getCurrentTime());
	}
}
