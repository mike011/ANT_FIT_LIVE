package ca.charland.cyclingtimer;

public class AscendingTime extends CountingTimer{

	public AscendingTime(int hours, int minutes, int seconds) {
		startTime = new Time();
		endTime = new Time(hours, minutes, seconds);
	}

	public Time getCurrentTime() {
		return startTime;
	}

	@Override
	public void next() {
		int seconds = startTime.getSeconds() + 1;
		if(seconds <= endTime.getSeconds()) {
			startTime.increment();
		}
	}

	@Override
	public boolean isDone() {
		return startTime.getSeconds() == endTime.getSeconds();
	}
}
