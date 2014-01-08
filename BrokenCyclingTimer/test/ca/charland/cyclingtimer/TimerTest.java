package ca.charland.cyclingtimer;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;


public class TimerTest {

    private Timer timer;
    
    @Before 
    public void setup() {
    	timer = new Timer();
    }

	@Test
    public void getTheFirstCountDownTimeWhatWillBeShown() {
        assertThat(timer.getTimeThatCounts(), is("00:00:03"));
    }
    
    @Test
    public void getTheSecondSecondOfTheCountDownTimeWhatWillBeShown() {
        timer.getTimeThatCounts();
        assertThat(timer.getTimeThatCounts(), is("00:00:02"));
    }
    
    @Test
    public void thereShouldBeACountDownTimerByDefault() {
    	assertFalse(timer.getEvents().isEmpty());
    	assertThat(timer.getEvents().size(), is(1));
    }
    
    @Test
    public void addingInMultipleTimerEventsOfDifferentTypes() {
    	timer.addEvent(new Time(1,2,3));
    	timer.addEvent(new DescendingTime(3,2,1));
    	assertThat(timer.getEvents().size(), is(3));
    }
    
    @Test
    public void whenTimerFinishesShouldMoveOnToNextTimer() {
    	timer.addEvent(new Time(1,2,3));
    	countDownTimer(3);
    	assertThat(timer.getTimeThatCounts(), is("01:02:03"));
    }

	private void countDownTimer(int amount) {
		for(int x = 0; x < amount+1; x++) {
			timer.getTimeThatCounts();
		}
	}
    
    @Test
    public void timerEventsAllDone() {
    	timer.addEvent(new DescendingTime(0,0,1));
    	countDownTimer(3);
    	countDownTimer(1);
    	assertThat(timer.getTimeThatCounts(), is("00:00:00"));
    	assertThat(timer.getTimeThatCounts(), is("00:00:00"));
    	
    }
}
