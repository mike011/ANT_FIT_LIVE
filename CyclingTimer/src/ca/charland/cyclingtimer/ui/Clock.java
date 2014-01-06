package ca.charland.cyclingtimer.ui;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;

import ca.charland.cyclingtimer.Timer;

class Clock extends JFrame implements Runnable {
	private static final long serialVersionUID = 2452895417378600827L;
	private Thread runner; 
	private Font clockFont;
	private Timer timer;

	public Clock() {
		super("Java clock");
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false); 

		clockFont = new Font("Serif", Font.BOLD, 40); 

		Container contentArea = getContentPane();
		ClockPanel timeDisplay = new ClockPanel(this);

		contentArea.add(timeDisplay);
		setContentPane(contentArea);
		
		timer = new Timer();
		start(); 
	}

	public String getCurrentTime() {
		return timer.getTime();
	}

	public void start() {
		if (runner == null)
			runner = new Thread(this);
		runner.start();
	}

	public void run() {
		while (runner == Thread.currentThread()) {
			repaint();
			sleepForOneSecond();
		}
	}

	private void sleepForOneSecond() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread failed");
		}
	}

	public static void main(String[] args) {
		new Clock();
	}

	public Font getClockFont() {
		return clockFont;
	}
}