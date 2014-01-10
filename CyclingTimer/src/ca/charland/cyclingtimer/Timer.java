package ca.charland.cyclingtimer;

import java.util.ArrayList;
import java.util.List;

public class Timer {

	private List<CountingTime> times;
	private int index;

	public Timer() {
		times = new ArrayList<CountingTime>();
		add(new DescendingTime(0, 0, 3));
	}

	public Time getCurrentTime() {
		return getCountingTime().getCurrentTime();
	}

	private CountingTime getCountingTime() {
		CountingTime countingTime = times.get(index);
		if (countingTime.isDone() && index + 1 < times.size()) {
			++index;
			countingTime = times.get(index);
		}
		return countingTime;
	}

	public void add(CountingTime time) {
		times.add(time);
	}

	public void next() {
		getCountingTime().next();
	}

	public String getTimeThatCounts() {
		next();
		return getCurrentTime().toString();
	}

	public void reset() {
		index = 0;
		for(CountingTime t : times) {
			t.reset();
		}
	}
}
