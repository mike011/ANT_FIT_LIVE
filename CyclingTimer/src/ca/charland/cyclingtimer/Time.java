package ca.charland.cyclingtimer;

public class Time {

	protected int seconds;
    protected int minutes;
    protected int hours;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
    	this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

	public Time getNextTime() {
		next();
		return new Time(hours, minutes, seconds);
	}

	private void next() {
		if(++seconds >= 60) {
			seconds = 0;
			if(++minutes >= 60) {
				minutes = 0;
				++hours;
			}
		}
	}
}
