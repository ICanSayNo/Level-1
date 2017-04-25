import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame1;
	JPanel panel1;
	JTextField text1;
	JTextField text2;
	JButton button1;
	public static void main(String[] args) {
		BinaryConverter b=new BinaryConverter();
		b.start();
	}

	void start(){
		frame1=new JFrame();
		panel1=new JPanel();
		text1=new JTextField(20);
		text2=new JTextField(20);
		button1=new JButton("Cuvrt teh numrs boiiis");
		button1.addActionListener(this);
		panel1.add(text1);
		panel1.add(button1);
		panel1.add(text2);
		frame1.add(panel1);
		frame1.setSize(800, 500);
		frame1.setVisible(true);
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	 String convert(String binary) {
	   	 int asciiValue = Integer.parseInt(binary, 2);
	   	 char theLetter = (char) asciiValue;
	   	 return "" + theLetter;
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String bin=text1.getText();
		String text3=convert(bin);
		text2.setText(text3);
	}

}

//s
//m
//a
//r
//t
//y
//p
//a
//n
//t
//s

//n
//e
//r
//d
//s
//4
//u