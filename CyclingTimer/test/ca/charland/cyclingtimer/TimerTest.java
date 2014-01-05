package ca.charland.cyclingtimer;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TimerTest {

    @Test
    public void firstTime() {
        Timer timer = new Timer();
        assertThat(timer.getFirstTime(), is("0:0:0"));
    }
}
