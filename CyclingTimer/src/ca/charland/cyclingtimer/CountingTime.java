package ca.charland.cyclingtimer;

public abstract class CountingTime {

	protected Time currentTime;
	protected Time endTime;

	public abstract void next();

	public final Time getCurrentTime() {
		return currentTime;
	}

	public final boolean isDone() {
		return endTime.equals(currentTime);
	}

	public abstract void reset();
}
