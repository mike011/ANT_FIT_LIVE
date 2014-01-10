package ca.charland.cyclingtimer;

import org.junit.Before;
import org.junit.Test;

public class TimerTest {
	
	private Timer timer;
	
	@Before
	public void setup() {
		timer = new Timer();		
	}
	
	@Test
	public void alwaysComeWithCountDownTimer() {
		TimeTest.assertTime(0, 0, 3, timer.getCurrentTime());
	}
	
	@Test
	public void canContainMultipleTimes() {
		timer.add(new DescendingTime(0,0,1));
		countDownTimer(timer);
		TimeTest.assertTime(0, 0, 1, timer.getCurrentTime());
	}

	private void countDownTimer(Timer timer) {
		timer.next();
		timer.next();
		timer.next();
	}
	
	@Test
	public void onlyShowsZeroWhenDone() {
		countDownTimer(timer);
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
