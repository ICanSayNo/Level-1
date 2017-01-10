import javax.swing.JOptionPane;

public class Cat {

	private String name;
	private static int lives = 9;

	Cat(String name) {
		this.name = name;
	}

	void meow() {
		System.out.println("meeeeeooooooooooowwwwwwwww!!");
	}

	public void printName() {
		if (name == null)
			System.out.println("i don't know my own name!");
		else
			System.out.println("my name is " + name);
	}

	void kill() {
		lives-=1;
		if (lives > 0)
			System.out.println("nice try, but I still have " + lives + " lives left");
		else if (lives < 0)
			System.out.println("that's overkill yo!");
		else
			System.out.println("DEAD CAT :(");
	}

	public static void main(String[] args) {
		/* Do the following things without changing the Cat class */
		for (int i = 0; i > -1; i++) {
			Cat jerry = new Cat("JEERRREEAH");
			String action = JOptionPane.showInputDialog("What can i do");
			// 1. Make the Cat meow
			if (action.equals("meow")) {
				jerry.meow();
			}
			// 2. Get the Cat to print it's name
			if (action.equals("name")) {
				jerry.printName();
			}
			// 3. Kill the Cat!
			if (action.equals("kill")) {
				jerry.kill();
			}
		}
	}

}
