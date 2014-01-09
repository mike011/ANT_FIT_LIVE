package ca.charland.cyclingtimer;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;


public class TimeTest {

	private Time time;
	
	@Test
	public void checkDefaultValues() {
		time = new Time();
		assertThat(time.getSeconds(), is(0));
		assertThat(time.getMinutes(), is(0));
		assertThat(time.getHours(), is(0));
	}
	
	@Test
	public void setTheTime() {
		time = new Time(3,5,6);
		assertThat(time.getSeconds(), is(6));
		assertThat(time.getMinutes(), is(5));
		assertThat(time.getHours(), is(3));
	}
	
	@Test
	public void setSecondsOverOneMinute() {
		time = new Time(0,0,0);
		time.setSeconds(61);
		assertThat(time.getSeconds(), is(0));
		assertThat(time.getMinutes(), is(1));
	}
	
	@Test
	public void setMinutesOverOneHour() {
		time = new Time(0,0,0);
		time.setMinutes(61);
		assertThat(time.getSeconds(), is(0));
		assertThat(time.getMinutes(), is(0));
		assertThat(time.getHours(), is(1));
	}

}
