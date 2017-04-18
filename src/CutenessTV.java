import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
		JButton buttin;
		JButton jeff;
		JButton meme;
		JButton Trump;
		JButton jerry;
		String lol;
		JPanel stuffholder=new JPanel();
		JLabel numbers=new JLabel();
		JFrame donaldJTrump = new JFrame();
		
public static void main(String[] args) {
	CutenessTV derp=new CutenessTV();
	derp.showButton();
}
void showButton(){

	buttin=new JButton();
	buttin.setSize(200, 60);
	buttin.setText("press 4 vid");
	jeff=new JButton();
	jeff.addActionListener(this);
	jeff.setSize(200, 60);
	jeff.setText("press 4 vid");
	meme=new JButton();
	meme.addActionListener(this);
	meme.setSize(200, 60);
	meme.setText("press 4 vid");
	Trump=new JButton();
	Trump.addActionListener(this);
	Trump.setSize(200, 60);
	Trump.setText("press 4 vid");
	jerry=new JButton();
	jerry.addActionListener(this);
	jerry.setSize(200, 60);
	jerry.setText("press 4 vid");
	stuffholder.add(buttin);
	stuffholder.add(jeff);
	stuffholder.add(meme);
	stuffholder.add(Trump);
	stuffholder.add(jerry);
	donaldJTrump.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	buttin.addActionListener(this);
	donaldJTrump.setVisible(true);
	donaldJTrump.add(stuffholder);
	donaldJTrump.setSize(500, 500);
}

public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed=(JButton)arg0.getSource();
	if(buttonPressed==buttin){
		playVideo("4PDJcw9oJt0");
	}
	if(buttonPressed==jeff){
		playVideo("GVN17U3Vg34&t=12s");
	}
	if(buttonPressed==meme){
		playVideo("YaBIUwusChQ");
	}
	if(buttonPressed==Trump){
		playVideo("MtN1YnoL46Q");
	}
	if(buttonPressed==jerry){
		playVideo("9g3--WYH8SY&t=5s");
	}
}
void playVideo(String videoID) {
	try {
URI uri = new URI("https://www.youtube.com/watch?v=" + videoID + "?autoplay=1");
		java.awt.Desktop.getDesktop().browse(uri);
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}