import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Mazuoyan
 */
class ClearButtonActionListener implements ActionListener{
    Track master;
    public ClearButtonActionListener(Track master) {
        this.master = master;
    }

    public void actionPerformed(ActionEvent e) {
        master.clearTrack();
    }

}
