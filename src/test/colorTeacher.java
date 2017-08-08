package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorTeacher implements ActionListener {
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	JPanel panel;
	JFrame frame;

	public static void main(String[] args) {
		colorTeacher x = new colorTeacher();
		x.showButtons();
	}

	void showButtons() {
		panel = new JPanel();
		frame = new JFrame();
		frame.setVisible(true);
		frame.setTitle("The Color Teacher");
		frame.setSize(500, 100);
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		panel.add(button);
		button.addActionListener(this);
		panel.add(button2);
		button2.addActionListener(this);
		panel.add(button3);
		button3.addActionListener(this);
		panel.add(button4);
		button4.addActionListener(this);
		button.setOpaque(true);
		button2.setOpaque(true);
		button3.setOpaque(true);
		button4.setOpaque(true);
		button.setBackground(Color.YELLOW);
		button2.setBackground(Color.RED);
		button3.setBackground(Color.BLUE);
		button4.setBackground(Color.GREEN);
		frame.add(panel);
		frame.pack();
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == (button)) {
			try {
				Runtime.getRuntime().exec("say " + "yellow");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (arg0.getSource() == (button2)) {
			try {
				Runtime.getRuntime().exec("say " + "red");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (arg0.getSource() == (button3)) {
			try {
				Runtime.getRuntime().exec("say " + "blue");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (arg0.getSource() == (button4)) {
			try {
				Runtime.getRuntime().exec("say " + "green");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}