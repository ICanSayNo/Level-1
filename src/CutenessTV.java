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
		JButton sparta;
		JButton lols;
		JButton thomas;
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
	buttin.setText("derp, derpity derp");
	jeff=new JButton();
	jeff.addActionListener(this);
	jeff.setSize(200, 60);
	jeff.setText("do u wanna build a wall?");
	meme=new JButton();
	meme.addActionListener(this);
	meme.setSize(200, 60);
	meme.setText("illuminatissss");
	Trump=new JButton();
	Trump.addActionListener(this);
	Trump.setSize(200, 60);
	Trump.setText("teh duck song");
	jerry=new JButton();
	jerry.addActionListener(this);
	jerry.setSize(200, 60);
	jerry.setText("This are jeffpardy");
	sparta=new JButton();
	sparta.addActionListener(this);
	sparta.setSize(200, 60);
	sparta.setText("dis r sperta");
	lols=new JButton();
	lols.addActionListener(this);
	lols.setSize(200, 60);
	lols.setText("bing bong");
	thomas=new JButton();
	thomas.addActionListener(this);
	thomas.setSize(200, 60);
	thomas.setText("choo choo bruh");
	stuffholder.add(buttin);
	stuffholder.add(jeff);
	stuffholder.add(meme);
	stuffholder.add(Trump);
	stuffholder.add(jerry);
	stuffholder.add(sparta);
	stuffholder.add(lols);
	stuffholder.add(thomas);
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
	if(buttonPressed==sparta){
		playVideo("eZeYVIWz99I");
	}
	if(buttonPressed==lols){
		playVideo("E08GwewVl9E");
	}
	if(buttonPressed==thomas){
		playVideo("b8HO6hba9ZE");
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