package ca.charland.cyclingtimer;

public class AscendingTime extends CountingTime{

	public AscendingTime(int hours, int minutes, int seconds) {
		currentTime = new Time();
		endTime = new Time(hours, minutes, seconds);
	}

	@Override
	public void next() {
		if(!isDone()) {
			currentTime.increment();
		}
	}

	public void reset() {
		currentTime = new Time();
	}
}
