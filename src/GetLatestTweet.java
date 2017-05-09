import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class GetLatestTweet implements ActionListener{
	JFrame frame1;
	JPanel panel1;
	JTextField text1;
	JButton button1;
	public static void main(String[] args) {
		GetLatestTweet lolverse=new GetLatestTweet();
		lolverse.start();
	}

	void start(){
		frame1=new JFrame();
		panel1=new JPanel();
		text1=new JTextField(20);
		button1=new JButton("Sercsh twetrvrs");
		button1.addActionListener(this);
		panel1.add(text1);
		panel1.add(button1);
		frame1.add(panel1);
		frame1.setSize(800, 500);
		frame1.setVisible(true);
		frame1.pack();
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String item=text1.getText();
		System.out.println(getLatestTweet(item));
	}
		private String getLatestTweet(String searchingFor) {

			Twitter twitter = new TwitterFactory().getInstance();
			AccessToken accessToken = new AccessToken(
					"2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
					"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");
			twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN",
					"6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");
			twitter.setOAuthAccessToken(accessToken);

			Query query = new Query(searchingFor);
			try {
				QueryResult result = twitter.search(query);
				return result.getTweets().get(0).getText();
			} catch (Exception e) {
				System.err.print(e.getMessage());
				return "What the heck is that?";
			}
		}

}
