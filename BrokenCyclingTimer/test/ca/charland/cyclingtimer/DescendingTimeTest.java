package ca.charland.cyclingtimer;

import org.junit.Test;

public class DescendingTimeTest {

	@Test
	public void nextTimeWhenCountingDownForOneSecond() {
		Time time = new DescendingTime(0,0,1);
		time.next();
		TimeTest.assertTime(new Time(0,0,0), time);
	}

	@Test
	public void nextTimeWhenCountingDownForOneMinute() {
		Time time = new DescendingTime(0,1,0);
		time.next();
		TimeTest.assertTime(new Time(0,0,59), time);
	}
	
	@Test
	public void nextTimeWhenCountingDownForOneHour() {
		Time time = new DescendingTime(1,0,0);
		time.next();
		TimeTest.assertTime(new Time(0,59,59), time);
	}
}
