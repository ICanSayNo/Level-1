
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AnimalJumping {
	 public static void main(String[] args) throws MalformedURLException {

	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */
		 JFrame frame=new JFrame();
		 JLabel label=new JLabel();
		 label.setText("nope. I dont jump");
		 frame.add(label);
		 label.setVisible(true);
		 frame.setVisible(true);
		 	String urlOfAnimalSuckingAtJumping = "http://68.media.tumblr.com/4f1d1f6ae34b0f59821ed72f455afc7d/tumblr_n3tmfh6S4s1s612eao1_400.gif";
		 	JLabel gif=createImage(urlOfAnimalSuckingAtJumping);
			 frame.add(gif);
	 frame.pack();
	 }
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}
