package Per;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;

import RE.DAO_Show;

public class PerResearchCeleb {

	public JFrame frame;
	private ArrayList<DAO_Show> list2;

	/**
	 * Launch the application.
	 */
	public void setList(ArrayList<DAO_Show> list2) {
		this.list2 = list2;
		
	}
//	public void setList(ArrayList<String> list) {
//		this.list = list;
//		String[] value = new String[list.size()];
//		for (int i = 0; i < value.length; i++) {
//			value[i] = list.get(i);
//		}

	/**
	 * Create the application.
	 */
	public PerResearchCeleb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


}
