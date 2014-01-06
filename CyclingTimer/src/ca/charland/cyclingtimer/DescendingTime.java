package ca.charland.cyclingtimer;

public class DescendingTime extends Time {

	public DescendingTime() {
	}
	
	public DescendingTime(int hours, int minutes, int seconds) {
		super(hours, minutes, seconds);
	}

	@Override
	public Time getNextTime() {
		previous();
		return new Time(hours, minutes, seconds);
	}

	private void previous() {
		if(--seconds < 0) {
			seconds = 59;
			if(--minutes < 0) {
				minutes = 59;
				--hours;
			}
		}
	}
}
