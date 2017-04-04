import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LotteryNumbers implements ActionListener {
	JButton buttin;
	String lol;
	JPanel stuffholder=new JPanel();
	JLabel numbers=new JLabel();
	JFrame donaldJTrump = new JFrame();
	
public static void main(String[] args) {
	LotteryNumbers lottery=new LotteryNumbers();
	lottery.showButton();
}
	
void showButton(){

	donaldJTrump.setSize(500, 500);
	buttin=new JButton();
	buttin.setSize(200, 60);
	donaldJTrump.setLayout(null);
	numbers.setBounds(200, 200, 200, 60);
	buttin.setText("press to get lottery numbers");
	donaldJTrump.add(buttin);
	donaldJTrump.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	buttin.addActionListener(this);
	donaldJTrump.setVisible(true);
}

public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource().equals(buttin)){
		Random r=new Random();
		int num1=r.nextInt(100);
		int num2=r.nextInt(100);
		int num3=r.nextInt(100);
		int num4=r.nextInt(100);
		int num5=r.nextInt(100);
		int num6=r.nextInt(100);
		
		numbers.setText(num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6);
		donaldJTrump.add(numbers);
		numbers.setVisible(true);
		donaldJTrump.repaint();
		try {
			Runtime.getRuntime().exec("say "+ "wow congrats ur numbers are "+num1+". "+num2+". "+num3+". "+num4+". "+num5+". "+num6);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

}