package game.logic.script;

import game.logic.entity.Entity;
import game.logic.world.World;

public abstract class Command {

	String keyword;

	public abstract boolean run(World world, Object[] args);

	public static Command addBasicEntity = new Command() {

		@Override
		public boolean run(World world, Object[] args) {
			world.addEntity(new Entity());
			return true;
		}
	};
	public static Command addActionToEntity = new Command() {

		@Override
		public boolean run(World world, Object[] args) {
			return true;
		}
	};

}
