package ca.charland.cyclingtimer;

public class Time {

    private int seconds;
    private int minutes;
    private int hours;

    public Time() {
    }

    public Time(int hours, int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
        this.hours = hours;
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
}
