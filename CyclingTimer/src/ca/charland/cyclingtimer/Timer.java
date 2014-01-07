package ca.charland.cyclingtimer;

import java.util.ArrayList;
import java.util.List;

public class Timer {

    private ArrayList<Time> events;
	private boolean notFirst;
	private int index;

    public Timer() {
    	events = new ArrayList<Time>();
    	events.add(new DescendingTime(0,0,3));
    	index = 0;
    }
	
    public String getTimeThatCounts() {
		Time time = events.get(index);
        if(notFirst) {
        	if(time.isDone()) {
        		if(index < events.size() -1) {
        			time = getNextTime();
        		}
        	} else {
        		time.next();
        	}
        }
        notFirst = true;
		return time.toString();
    }

	private Time getNextTime() {
		return events.get(++index);
	}

	public List<Time> getEvents() {
		return events;
	}

	public void addEvent(Time time) {
		events.add(time);
	}
}
