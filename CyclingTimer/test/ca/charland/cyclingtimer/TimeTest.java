package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TimeTest {

	@Test
	public void checkDefaultValues() {
		Time time = new Time();
		assertThat(time.getSeconds(), is(0));
		assertThat(time.getMinutes(), is(0));
		assertThat(time.getHours(), is(0));
	}
	
	@Test
	public void setTheTime() {
		Time time = new Time(3,5,6);
		assertThat(time.getSeconds(), is(6));
		assertThat(time.getMinutes(), is(5));
		assertThat(time.getHours(), is(3));
	}

}
