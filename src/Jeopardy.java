
// Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.File;

/* This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton, fourthButton, fifthButton, sixthButton, seventhButton;

	private JPanel quizPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		frame.setLayout(new BorderLayout());

		// 1. Make the frame show up
		frame.setVisible(true);
		// 2. Give your frame a title
		frame.setTitle("JEFF!");
		// 3. Create a JPanel variable to hold the header using the createHeader method
		JPanel header = new JPanel();
		// 4. Add the header component to the quizPanel
		quizPanel.add(header);
		// 5. Add the quizPanel to the frame
		frame.add(quizPanel);

		// 6. Use the createButton method to set the value of firstButton
		firstButton = createButton("$200");
		quizPanel.add(firstButton);
		secondButton = createButton("$400");
		quizPanel.add(secondButton);
		thirdButton = createButton("$600");
		quizPanel.add(thirdButton);
		fourthButton = createButton("$800");
		quizPanel.add(fourthButton);
		fifthButton = createButton("$1000");
		quizPanel.add(fifthButton);
		sixthButton = createButton("$1500");
		quizPanel.add(sixthButton);
		seventhButton = createButton("$2000");
		quizPanel.add(seventhButton);
		// 11. Add action listeners to the buttons (2 lines of code)
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		// 12. Fill in the actionPerformed() method below

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height, Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	 * 13. Use the method provided to play the Jeopardy theme music
	 * 
	 * 14. Add buttons so that you have $200, $400, $600, $800 and $1000 questions
	 *
	 * [optional] Use the showImage or playSound methods when the user answers a question
	 */

	private JButton createButton(String dollarAmount) {
		// Create a new JButton
		JButton button = new JButton();
		// Set the text of the button to the dollarAmount
		button.setText(dollarAmount);
		// Increment the buttonCount (this should make the layout vertical)
		buttonCount += 1;
		// Return your new button instead of the temporary button

		return button;
	}

	public void actionPerformed(ActionEvent arg0) {
		// Remove this temporary message:

		// Use the method that plays the jeopardy theme music.
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		// If the buttonPressed was the firstButton
		if (buttonPressed == firstButton) {
			// Call the askQuestion() method
askQuestion("Jeff", "What is Jeff?", 200);
			// Fill in the askQuestion() method. When you play the game, the score should change.
		firstButton.setText(null);
		}
		// Or if the buttonPressed was the secondButton
		if (buttonPressed == secondButton) {
		// Call the askQuestion() method with a harder question
			askQuestion("Jeff Jeff Jeff Jeff Jeff", "What is Jeff", 400);
		secondButton.setText(null);
		}
		if (buttonPressed == thirdButton) {
			askQuestion("Jeff Jeff Jeff Jeff Jeff Jeff Jeff Jeff Jeff", "What is Jeff", 600);
		thirdButton.setText(null);
		}
		if (buttonPressed == fourthButton) {
			askQuestion(" Jeff  Jeff", "What is Jeff", 800);
		fourthButton.setText(null);
		}
		if (buttonPressed == fifthButton) {
			askQuestion("Jeff Jeff Jeff Jeff Jeff  Jeff Jeff", "What is Jeff", 1000);
		fifthButton.setText(null);
		}
		if (buttonPressed == sixthButton) {
			askQuestion("Jeff Jeff Jeff Jeff Jeff Jeff  Jeff Jeff  Jeff Jeff \n  Jeff Jeff  Jeff Jeff  Jeff Jeff  Jeff Jeff  Jeff Jeff \n  Jeff Jeff  Jeff Jeff  Jeff Jeff Jeff Jeff Jeff", "What is Jeff", 1500);
		sixthButton.setText(null);
		}
		if (buttonPressed == seventhButton) {
			askQuestion("Jeff Jeff Jeff  Jeff Jeff  Jeff Jeff Jeff Jeff Jeff Jeff Jeff Jeff", "What is San Francisco", 2000);
		seventhButton.setText(null);
		}
		// Clear the button text (set the button text to nothing)
		
	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		// Remove this temporary message
		// Use a pop up to ask the user the question
String useranswer = JOptionPane.showInputDialog(question);
		// If the answer is correct
if(useranswer==correctAnswer){
		// Increase the score by the prizeMoney
score+=prizeMoney;
		// Call the updateScore() method
updateScore();
		// Pop up a message to tell the user they were correct
JOptionPane.showMessageDialog(null, "Jeff");
}
		// Otherwise
else{
		// Decrement the score by the prizeMoney
score-=prizeMoney;
		// Pop up a message to tell the user the correct answer
	JOptionPane.showMessageDialog(null, "no Jeff. the answer is: "+ correctAnswer);
		// Call the updateScore() method
updateScore();
}

	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.CYAN);
		return panel;
	}

	private void updateScore() {
		scoreBox.setText("" + score);
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
