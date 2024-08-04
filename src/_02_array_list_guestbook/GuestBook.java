package _02_array_list_guestbook;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements MouseListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();

	ArrayList<String> guests = new ArrayList<String>();

	public void setup() {

		frame.setVisible(true);
		frame.setSize(200, 100);
		frame.add(panel);

		panel.add(add);
		panel.add(view);

		add.setText("Add name");
		add.addMouseListener(this);

		view.setText("View names");
		view.addMouseListener(this);

	}

	public static void main(String[] args) {
		GuestBook b = new GuestBook();

		b.setup();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// When the add name button is clicked, display an input dialog that asks the
		// user to enter a name. Add
		// that name to an ArrayList. When the "View Names" button is clicked, display a
		// message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners

		if (e.getSource() == add) {
			String people = JOptionPane.showInputDialog("who would you like to add to your list");
			guests.add(people);

		}
		if (e.getSource().equals(view)) {
			String guest = "";
			for (int x = 1; x < guests.size() + 1; x++) {
				guest += "Guest #" + x + ":" + guests.get(x - 1);
				guest += "\n";

			}
JOptionPane.showMessageDialog(null, guest);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
