package ca.charland.cyclingtimer;

public abstract class CountingTimer {

	protected Time startTime;
	protected Time endTime;

	public abstract void next();

	public Time getCurrentTime() {
		return startTime;
	}

	public boolean isDone() {
		return endTime.equals(startTime);
	}
}
