import java.io.IOException;

import javax.swing.JOptionPane;

public class SpaceRocket {
public static void main(String[] args) throws InterruptedException, IOException {
for (int i = 1; i > 0; i++) {
	String Say= JOptionPane.showInputDialog("What can I say?");
	Runtime.getRuntime().exec("say "+ Say);
}
}
}