package mcbe;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RecordButtonActionListener implements ActionListener {

	Track track;

	public RecordButtonActionListener(Track track){
		this.track = track;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
            track.startRecording();
	}

}
