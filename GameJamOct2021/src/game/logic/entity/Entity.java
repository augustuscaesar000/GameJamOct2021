package game.logic.entity;

import game.util.Point3D;

public class Entity implements IEntity {

	Point3D position;
	Point3D rotation;
	Point3D scale;

	public Entity() {
		position = new Point3D();
		rotation = new Point3D();
		scale = new Point3D();
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
		// TODO Auto-generated method stub
		return 1;
	}

}
