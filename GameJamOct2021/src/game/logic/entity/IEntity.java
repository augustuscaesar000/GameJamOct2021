package game.logic.entity;

import game.util.Point3D;

public interface IEntity {

	public Point3D getPosition();
	public Point3D getRotation();
	public Point3D getScale();

	public int getType();
	
}
