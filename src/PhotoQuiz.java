
// Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.lang.reflect.Constructor;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String leedle = "http://i0.kym-cdn.com/photos/images/facebook/000/988/367/1fb.jpg";
		// 2. create a variable of type "Component" that will hold your image
		Component trolo;
		// 3. use the "createImage()" method below to initialize your Component
		trolo = createImage(leedle);
		// 4. add the image to the quiz window
		quizWindow.add(trolo);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String nyannyan = JOptionPane.showInputDialog("who is dis man");
		// 7. print "CORRECT" if the user gave the right answer
		if (nyannyan.equals("Trump") || nyannyan.equals("Satan")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(trolo);
		// 10. find another image and create it (might take more than one line
		// of code)
		leedle = "https://media.tenor.co/images/2746f1e064fdc7ad0f7daf421822aa40/raw";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("Why does this exist");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("Its the internet")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
		leedle = "http://mrwgifs.com/wp-content/uploads/2013/06/Jimmies-Emotionally-Russeled-Meme-Gif.gif";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("Who is the Gorilla");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("Harambe") || nyannyan.equals("My Mom")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
		leedle = "https://media.giphy.com/media/5kvGTbNJqi5nG/giphy.gif";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("What does this gif show");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("The Food Pyramid")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
		leedle = "https://media.tenor.co/images/57e1e6b2f34f2e8ae9e3aef9950a4878/raw";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("What is Satan Doing");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("Building a trump wall")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		} else if (nyannyan.equals("Building a great wall")) {
			JOptionPane.showMessageDialog(null, "You Suck, but fine...");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
		leedle = "https://media.tenor.co/images/c7c64a1d4e7f85ddc1ebbea28a13c588/raw";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("What caused this");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("Trump")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
		leedle = "https://media.tenor.co/images/38db282c80dc6930b7b38cccde8a5f0e/raw";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("What even");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("Derp")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "No... Just no...");
		}
		quizWindow.remove(trolo);
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}