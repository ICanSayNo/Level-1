import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NastySurprise implements ActionListener {
	JFrame frame1;
	JPanel panel1;
	JButton button1;
	JButton button2;
public static void main(String[] args) {
	NastySurprise n = new NastySurprise();
	n.start();
	}

	void start(){
		frame1=new JFrame();
		panel1=new JPanel();
		button2=new JButton("treet");
		button1=new JButton("trik");
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel1.add(button1);
		panel1.add(button2);
		frame1.add(panel1);
		frame1.setSize(800, 500);
		frame1.setVisible(true);
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==button1){
		showPictureFromTheInternet("http://68.media.tumblr.com/07ecc6804302a525ddd3367fd6af6991/tumblr_n6iqabZMZs1s1r5ero1_400.jpg");
	}
	else{
		showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/736x/44/d9/17/44d917f9365f0f3bd3ecfbaf9d833281--cutefunny-animals-animals-memes.jpg");
	}
	}
}

