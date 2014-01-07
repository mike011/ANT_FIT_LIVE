package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TimeTest {

	/**
	 * The time specified should be the time that you count up too not from
	 */
	private Time time;

	static void assertTime(Time expected, Time actual) {
		assertThat(actual.getSeconds(), is(expected.getSeconds()));
		assertThat(actual.getMinutes(), is(expected.getMinutes()));
		assertThat(actual.getHours(), is(expected.getHours()));
	}
	
	@Before 
	public void setup() {
		time = new Time();		
	}

	@Test
	public void firstTime() {
		assertTime(new Time(), time);
	}

	@Test
	public void setTime() {
		time = new Time(1, 2, 3);
		assertTime(new Time(1,2,3), time);
	}

	@Test
	public void nextTimeWhenCountingUp() {
		time.next();
		assertTime(new Time(0,0,1), time);
	}
	
	@Test
	public void nextTimeToOneMinute() {
		time = new Time(0,0,59);
		time.next();
		assertTime(new Time(0,1,0), time);
	}
	
	@Test
	public void nextTimeToOneHour() {
		time = new Time(0,59,59);
		time.next();
		assertTime(new Time(1,0,0), time);
	}
	
	@Test
	public void theTimerIsDoneRunning() {
		assertTrue(time.isDone());
	}
	
	@Test
	public void timerIsStillRunning() {
		time = new Time(0,0,1);
		assertFalse(time.isDone());
	} 
	
	@Test
	public void correctFormatting() {
		time = new Time(12,3,25);
		assertThat(time.toString(), is("12:03:25"));
	}
}
