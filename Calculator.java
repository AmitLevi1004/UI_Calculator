package gadi_mmn15_mavo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JPanel {
	JTextField btnOperator1 = new JTextField(15);
	JTextField btnOperator2 = new JTextField(15);
	JButton cal = new JButton("=");
	JTextField result = new JTextField(7);

	public Calculator() {
		String[] option = { "+", "-", "*" };
		JComboBox operation = new JComboBox(option);
		add(btnOperator1);
		add(operation);
		add(btnOperator2);
		add(cal);
		add(result);
		cal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				double num1 = 0;
				double num2 = 0;

				try {
					num1 = Double.parseDouble(btnOperator1.getText());
					num2 = Double.parseDouble(btnOperator2.getText());
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "error");
				}
				if (operation.getSelectedItem() == "+")
					result.setText("" + (num1 + num2));
				else if (operation.getSelectedItem() == "-")
					result.setText("" + (num1 - num2));
				else if (operation.getSelectedItem() == "*")
					result.setText("" + (num1 * num2));
			}
		});

	}
}
