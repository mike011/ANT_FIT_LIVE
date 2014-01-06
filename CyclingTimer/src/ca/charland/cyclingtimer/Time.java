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

	public boolean isDone() {
		if(seconds + minutes  + hours > 0) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return getStringTime(hours, minutes, seconds);
	}
	
	private String getStringTime(int hrs, int min, int sec) {
		String time = addZero(hrs) + ":" + addZero(min) + ":" + addZero(sec);
		return time;
	}

	public String addZero(int num) {
		String number = (num < 10) ? ("0" + num) : ("" + num);
		return number;

	}
}
