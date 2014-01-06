package ca.charland.cyclingtimer.ui;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

class ClockPanel extends JPanel {
	private static final long serialVersionUID = 3769584646283823496L;
	private final Clock clock;

	ClockPanel(Clock clock) {
		this.clock = clock;
	}

	public void paintComponent(Graphics painter) {
		painter.setFont(this.clock.getClockFont());
		painter.setColor(Color.black);
		painter.drawString(this.clock.getCurrentTime(), 60, 40);

	}
}