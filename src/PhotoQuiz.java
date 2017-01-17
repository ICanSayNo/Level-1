
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
		leedle = "data:image/png;base64,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";
		trolo = createImage(leedle);

		// 11. add the second image to the quiz window
		quizWindow.add(trolo);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		nyannyan = JOptionPane.showInputDialog("What is this");
		// 14+ check answer, say if correct or incorrect, etc.
		if (nyannyan.equals("A cat flying through the sky propelled by the magic of rainbows and love")) {
			JOptionPane.showMessageDialog(null, "Yas u is right");
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