package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TimeTest {

	@Test
	public void checkingDefaultValues() {
		Time time = new Time();
		assertThat(time.getSeconds(), is(0));
	}

}
