package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TimeTest {

	static void assertTime(Time expected, Time actual) {
		assertThat(actual.getSeconds(), is(expected.getSeconds()));
		assertThat(actual.getMinutes(), is(expected.getMinutes()));
		assertThat(actual.getHours(), is(expected.getHours()));
	}

	@Test
	public void firstTime() {
		Time time = new Time();
		assertTime(new Time(), time);
	}

	@Test
	public void setTime() {
		Time time = new Time(1, 2, 3);
		assertTime(new Time(1,2,3), time);
	}

	@Test
	public void nextTimeWhenCountingUp() {
		Time time = new Time();
		Time next = time.getNextTime();
		assertTime(new Time(0,0,1), next);
	}
	
	@Test
	public void nextTimeToOneMinute() {
		Time time = new Time(0,0,59);
		Time next = time.getNextTime();
		assertTime(new Time(0,1,0), next);
	}
	
	@Test
	public void nextTimeToOneHour() {
		Time time = new Time(0,59,59);
		Time next = time.getNextTime();
		assertTime(new Time(1,0,0), next);
	}
}
