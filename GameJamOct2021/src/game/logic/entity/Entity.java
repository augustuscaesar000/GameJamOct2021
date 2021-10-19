package game.logic.entity;

import java.util.ArrayList;
import java.util.List;

import game.logic.entity.action.IAction;
import game.logic.world.World;
import game.util.Point3D;

public class Entity implements IEntity {

	Point3D position;
	Point3D rotation;
	Point3D scale;
	int type;

	List<IAction> brain = new ArrayList<IAction>();

	public Entity() {
		position = new Point3D();
		rotation = new Point3D();
		scale = new Point3D();
		type = 0;
	}

	@Override
	public Point3D getPosition() {
		return position;
	}

	@Override
	public Point3D getRotation() {
		return rotation;
	}

	@Override
	public Point3D getScale() {
		return scale;
	}

	@Override
	public int getType() {
		return type;
	}

	public boolean update(World world) {

		for(IAction a:brain)
		{
			if(a.condition(world, this))
				a.effect(world, this);
			if(!a.isAlive())
				a.terminate(world, this);
		}
		
		return true;
	}

}
