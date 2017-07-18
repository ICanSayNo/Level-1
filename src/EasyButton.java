import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
 
public class EasyButton implements MouseListener {
 
	/*
	 * Use the methods below to make an easy button show on the screen. 
	 * When clicked, it says some very annoying words.
	 */
 
	JLabel easyButtonImage;
	JFrame quizWindow;
	
	public static void main(String[] args) {
		EasyButton button = new EasyButton();
		button.showEasyButton();
		
	}
 
	private void showEasyButton() {
		quizWindow=new JFrame();
		quizWindow.setVisible(true);
		quizWindow.addMouseListener(this);
		URL imageURL = null;
		try {
			imageURL = new File("/Users/league/Google Drive/league-images/easy_button.jpg").toURI().toURL();
		} catch (MalformedURLException e) {
			System.err.println("Could not load file: " + imageURL);
		}
		Icon icon = new ImageIcon(imageURL);
		this.easyButtonImage = new JLabel(icon);
		quizWindow.add(easyButtonImage);
		quizWindow.pack();
	}
 
	
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e1) {
		// TODO Auto-generated method stub
		int random= new Random().nextInt(15);	
		if(random==0){
			speak("can we reach seven hundred ninety three, four hundred fifty six thousand, one hundred forty eight point two likes for fidget spinners");
		}
if(random==1){
	speak("push this button again and you die");
		}
if(random==2){
	speak("jeff");
}
if(random==3){
	speak("that was Easy");
}
if(random==4){
	speak("that was easy");
}
if(random==5){
	speak("lets play a game of mario kart");
}
if(random==6){
	speak("wanna come inside my clubhouse?");
}
if(random==7){
	speak("come into the white van kids");
}
if(random==8){
	speak("cookies");
}
if(random==9){
	speak("welcom to the nugget cave");
}
if(random==10){
	speak("like if you cree evr tim");
}
if(random==11){
	speak("meme");
}
if(random==12){
	speak("That was easy");
}
if(random==13){
	speak("i like to play, dance, annndddddd, have fun fun fun fun fun fun fun fun fun fun");
}
if(random==14){
	speak("die");
}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
 
}