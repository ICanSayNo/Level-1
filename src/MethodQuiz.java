import javax.swing.JOptionPane;

public class MethodQuiz {
	public static void main(String[] args) {
		name("Aidan \n");
		String num = JOptionPane.showInputDialog("Number?");
		int num1 = Integer.parseInt(num);
		manyNames(num1);
		num = JOptionPane.showInputDialog("Number 1?");
		int num2 = Integer.parseInt(num);
		num = JOptionPane.showInputDialog("Number 2?");
		int num3 = Integer.parseInt(num);
		int num4 = Math(num2, num3);
		System.out.println(num4);
		num = JOptionPane.showInputDialog("Number?");
		int num5 = Integer.parseInt(num);
		String lol = Vague(num5);
		System.out.println(lol);
	}

	private static String Vague(int num5) {
		return ("bekfest ceriul");
	}

	private static int Math(int num2, int num3) {
		return (num2 - num3);
	}

	private static void manyNames(int num1) {
		for (int i = 0; i < num1; i++) {
			System.out.println("Aidan");
		}
	}

	static void name(String name) {
		System.out.println(name);
	}

}
