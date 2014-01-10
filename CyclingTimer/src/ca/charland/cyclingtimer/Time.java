package ca.charland.cyclingtimer;


public class Time {

	private int seconds;
	private int minutes;
	private int hours;

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

	public void setMinutes(int minutes) {
		if (minutes >= 60) {
			++hours;
			minutes -= 60;
		}
		this.minutes = minutes;
	}

	public boolean equals(Time time) {
		boolean sec = seconds == time.getSeconds();
		boolean min = minutes == time.getMinutes();
		boolean hrs = hours == time.getHours();
		return sec && min && hrs;
	}

	public void decrement() {
		--seconds;
	}

	public void increment() {
		++seconds;
		if (seconds == 60) {
			++minutes;
			seconds = 0;
		}
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
