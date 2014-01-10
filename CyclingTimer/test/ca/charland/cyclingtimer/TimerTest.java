package ca.charland.cyclingtimer;

import org.junit.Before;
import org.junit.Test;

public class TimerTest {
	
	private Timer timer;
	
	@Before
	public void setup() {
		timer = new Timer();		
	}
	
	private void countDownTimer() {
		timer.next();
		timer.next();
		timer.next();
	}
	
	@Test
	public void alwaysComeWithCountDownTimer() {
		TimeTest.assertTime(0, 0, 3, timer.getCurrentTime());
	}
	
	@Test
	public void canContainMultipleTimes() {
		timer.add(new DescendingTime(0,0,1));
		countDownTimer();
		TimeTest.assertTime(0, 0, 1, timer.getCurrentTime());
	}

	@Test
	public void onlyShowsZeroWhenDone() {
		countDownTimer();
		timer.next();
		TimeTest.assertTime(0, 0, 0, timer.getCurrentTime());
	}
	
	@Test
	public void resetToOrignalNumber() {
		timer.next();
		timer.reset();
		TimeTest.assertTime(0, 0, 3, timer.getCurrentTime());
	}

}
