import javax.swing.JOptionPane;

public class Rocket {
	int fuel;
	String name;

	Rocket() {
		System.out.println("Contructing Rocket");
		String sFuel = JOptionPane.showInputDialog("How much fuel?");
		fuel = Integer.parseInt(sFuel);
		name = JOptionPane.showInputDialog("What is the Rocket's name?");
	}

	void launch() {
		while (fuel >= 0) {
			System.out.println(fuel);
			fuel--;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Out of fuel.");
	}
}