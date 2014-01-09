package ca.charland.cyclingtimer;

public class DescendingTime extends CountingTimer {

	public DescendingTime(int hours, int minutes, int seconds) {
		startTime = new Time(hours, minutes, seconds);
		endTime = new Time();
	}

	@Override
	public void next() {
		startTime.decrement();
	}

}
