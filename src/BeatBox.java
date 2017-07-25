import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeatBox implements ActionListener {
	JButton butt;
	JButton anotherButt;
	JButton oneMoreButt;
	
public static void main(String[] args) {
	BeatBox beatbox=new BeatBox();
	beatbox.showButton();
}
	
void showButton(){
	JPanel shrek=new JPanel();
	JFrame donaldJTrump = new JFrame();
	donaldJTrump.setVisible(true);
	donaldJTrump.setSize(500, 100);
	butt=new JButton();
	anotherButt=new JButton();
	oneMoreButt=new JButton();
	shrek.add(butt);
	butt.addActionListener(this);
	shrek.add(anotherButt);
	anotherButt.addActionListener(this);
	shrek.add(oneMoreButt);
	oneMoreButt.addActionListener(this);
	butt.setOpaque(true);
	anotherButt.setOpaque(true);
	oneMoreButt.setOpaque(true);
	butt.setBackground(Color.BLUE);
	anotherButt.setBackground(Color.YELLOW.darker());
	oneMoreButt.setBackground(Color.RED.brighter().brighter());
	donaldJTrump.add(shrek);
	donaldJTrump.pack();
}


public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==(butt)){	
			try {
				Runtime.getRuntime().exec("say " + "leedle leedle leedle leedle leedle leedle leedle leedle leedle weedle leedle leedle leedle");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
}
	if(arg0.getSource()==(anotherButt)){	
		try {
			Runtime.getRuntime().exec("say " + "sdghaghhhjasfcyvasjchkaazwgvhnjmiok,jsdfkbhzdhbsduvgugvsafbzbdhipst.hvauvfbanfoasjmfaioniubnnjyuuugeass gsfdhj");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
	if(arg0.getSource()==(oneMoreButt)){	
		try {
			Runtime.getRuntime().exec("say " + "do I annoy you at all, because if I don't, I could always be worse. In fact, I am going to keep saying, build a wall, until you yell at me. build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall build a wall . . . . . . . lol fooled you. build a wall build a wall build a wall build a wall.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
}
}
}