package ca.charland.cyclingtimer;

import java.util.ArrayList;
import java.util.List;

public class Timer {

    private ArrayList<Time> events;

    public Timer() {
    	events = new ArrayList<Time>();
    	events.add(new DescendingTime(0,0,3));
    }
	
    public String getTime() {
        return events.get(0).toString();
    }

	public List<Time> getEvents() {
		return events;
	}

	public void addEvent(Time time) {
		events.add(time);
	}
}
