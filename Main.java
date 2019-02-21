
/*
 * This program represents calculator
 */

import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Calculator");
		frame.setSize(800, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Calculator c = new Calculator();
		frame.add(c);
		frame.setVisible(true);
	}
}
