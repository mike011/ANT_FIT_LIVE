package ca.charland.cyclingtimer;

public class DescendingTime extends Time {

	public DescendingTime() {
	}
	
	public DescendingTime(int hours, int minutes, int seconds) {
		super(hours, minutes, seconds);
	}

	@Override
	public void next() {
		if(--seconds < 0) {
			seconds = 59;
			if(--minutes < 0) {
				minutes = 59;
				--hours;
			}
		}
	}
}
