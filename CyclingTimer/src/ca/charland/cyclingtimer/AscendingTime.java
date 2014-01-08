package ca.charland.cyclingtimer;

public class AscendingTime {

	private Time startTime;
	private Time endTime;

	public AscendingTime(int hours, int minutes, int seconds) {
		startTime = new Time();
		endTime = new Time(hours, minutes, seconds);
	}

	public Time getCurrentTime() {
		return startTime;
	}

	public void next() {
		startTime.setSeconds(startTime.getSeconds() + 1);
	}

	public boolean isDone() {
		return startTime.getSeconds() == endTime.getSeconds();
	}
}
