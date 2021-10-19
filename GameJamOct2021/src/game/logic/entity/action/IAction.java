package game.logic.entity.action;

import game.logic.entity.IEntity;
import game.logic.world.World;

public interface IAction {

	public boolean init(World world, IEntity source);

	public boolean condition(World world, IEntity source);

	public boolean effect(World world, IEntity source);

	public boolean terminate(World world, IEntity source);
	
	public boolean isAlive();
}
