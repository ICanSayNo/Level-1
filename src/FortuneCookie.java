import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	JButton butt;
	
public static void main(String[] args) {
	FortuneCookie fortuneCookie=new FortuneCookie();
	fortuneCookie.showButton();
}
	
void showButton(){
	JFrame donaldJTrump = new JFrame();
	donaldJTrump.setVisible(true);
	donaldJTrump.setSize(500, 500);
	butt=new JButton();
	donaldJTrump.add(butt);
	butt.addActionListener(this);
}

public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource().equals(butt)){
		int random= new Random().nextInt(15);	
		if(random==0){
			try {
				Runtime.getRuntime().exec("say "+ "ur gonna be rich");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
if(random==1){
	try {
		Runtime.getRuntime().exec("say "+ "i dont care what your fortune is");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
		}
if(random==2){
	try {
		Runtime.getRuntime().exec("say "+ "youre gonna get a sandwich for christmas");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==3){
	try {
		Runtime.getRuntime().exec("say "+ "chickens are made of the immluminati. its all a big coverup");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==4){
	try {
		Runtime.getRuntime().exec("say "+ "your going to die in 10, 9, 8, 7, 6, 5, 4, oops, sorry, that was for someone on Mars");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==5){
	try {
		Runtime.getRuntime().exec("say "+ "photobooth");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==6){
	try {
		Runtime.getRuntime().exec("say "+ "you dont get a fortune. or a fortune cookie");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==7){
	try {
		Runtime.getRuntime().exec("say "+ "yee");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==8){
	try {
		Runtime.getRuntime().exec("say "+ "jeff");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==9){
	try {
		Runtime.getRuntime().exec("say "+ "you will win the one million dollar lottery, after spending $999,999");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==10){
	try {
		Runtime.getRuntime().exec("say "+ "no");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==11){
	try {
		Runtime.getRuntime().exec("say "+ "donald trump will be reelected 17 times, causing the end of the world");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==12){
	try {
		Runtime.getRuntime().exec("say "+ "you are going to eat a piece of food within the next 420 hours");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==13){
	try {
		Runtime.getRuntime().exec("say "+ "you are going to use the internet within the next 624 hours");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
if(random==14){
	try {
		Runtime.getRuntime().exec("say "+ "you will lose all ur friends");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	}
	
}
	
}
