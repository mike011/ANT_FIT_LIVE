package ca.charland.cyclingtimer;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TimerTest {

    @Test
    public void getTheTimeThatWillBeShownOnTheUI() {
        Timer timer = new Timer();
        assertThat(timer.getTime(), is("0:0:3"));
    }
    
    @Test
    public void thereShouldBeACountDownTimerByDefault() {
    	Timer timer = new Timer();
    	assertFalse(timer.getEvents().isEmpty());
    	assertThat(timer.getEvents().size(), is(1));
    }
    
    @Test
    public void addingInMultipleTimerEventsOfDifferentTypes() {
    	Timer timer = new Timer();
    	timer.addEvent(new Time(1,2,3));
    	timer.addEvent(new DescendingTime(3,2,1));
    	assertThat(timer.getEvents().size(), is(3));
    }
}
