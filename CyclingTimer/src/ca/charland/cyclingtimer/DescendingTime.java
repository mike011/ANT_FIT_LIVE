package ca.charland.cyclingtimer;

public class DescendingTime extends CountingTime {

	private int hours;
	private int minutes;
	private int seconds;

	public DescendingTime(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		this.currentTime = new Time(hours, minutes, seconds);
		this.endTime = new Time();
	}

	@Override
	public void next() {
		if (!isDone()) {
			currentTime.decrement();
		}
	}

	@Override
	public void reset() {
		currentTime = new Time(hours, minutes, seconds);
	}
}
