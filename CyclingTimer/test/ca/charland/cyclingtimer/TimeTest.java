package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TimeTest {

    @Test
    public void firstTime(){
        Time time = new Time();
        assertThat(time.getSeconds(), is(0));
        assertThat(time.getMinutes(), is(0));
        assertThat(time.getHours(), is(0));
    }
    
    @Test
    public void setTime(){
        Time time = new Time(1,2,3);
        assertThat(time.getSeconds(), is(3));
        assertThat(time.getMinutes(), is(2));
        assertThat(time.getHours(), is(1));
    }
}
