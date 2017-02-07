import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.*;

public class Gridworld {
	public static void main(String[] args) {
		World world = new World();
		Bug bug = new Bug();
		Flower flower = new Flower();
		world.show();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				Location location = new Location((new Random().nextInt(10)),(new Random().nextInt(10)));
				world.add(location, bug);
				Location loc = new Location((new Random().nextInt(10)),(new Random().nextInt(10)));
				world.add(loc, flower);
			}
		}
	}
}