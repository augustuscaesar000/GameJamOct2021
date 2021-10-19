package game.logic.world;

import java.util.ArrayList;
import java.util.List;

import game.logic.entity.Entity;

public abstract class World {

	List<Entity> entities = new ArrayList<Entity>();
	
	
	public abstract boolean update();


	public void addEntity(Entity entity) {
		entities.add(entity);
	}
	
}
