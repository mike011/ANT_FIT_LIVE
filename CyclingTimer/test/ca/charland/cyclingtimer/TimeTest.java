package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TimeTest {

	private Time time;

	@Test
	public void checkDefaultValues() {
		time = new Time();
		assertTime(0, 0, 0, time);
	}

	@Test
	public void setTheTime() {
		time = new Time(3, 5, 6);
		assertTime(3, 5, 6, time);
	}

	@Test
	public void setSecondsOverOneMinute() {
		time = new Time(0, 0, 0);
		incrementOneMinute();
		assertTime(0, 1, 0, time);
	}

	private void incrementOneMinute() {
		for (int x = 0; x < 60; x++) {
			time.increment();
		}
	}

	@Test
	public void setMinutesOverOneHour() {
		time = new Time(0, 0, 0);
		time.setMinutes(61);
		assertTime(1, 1, 0, time);
	}

	@Test
	public void descrementTheTime() {
		time = new Time(0, 0, 1);
		time.decrement();
		assertTime(0, 0, 0, time);
	}

	@Test
	public void incrementTheTime() {
		time = new Time(0, 0, 0);
		time.increment();
		assertTime(0,0,1, time);
	}

	public static void assertTime(int hours, int min, int sec, Time actual) {
		assertThat(actual.getSeconds(), is(sec));
		assertThat(actual.getMinutes(), is(min));
		assertThat(actual.getHours(), is(hours));
	}
}
