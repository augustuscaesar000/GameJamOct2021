package game;

import java.util.ArrayList;
import java.util.List;

import game.graphics.Window;
import game.logic.entity.Entity;
import game.logic.entity.IEntity;

public class Main {

	public static List<IEntity> entities = new ArrayList<IEntity>();

	public static void main(String[] args) throws Exception{
		Window window = new Window(800, 600, "Hello World");

		entities.add(new Entity());
		Thread thread = new Thread() {
			@Override
			public void run() {
				super.run();
				while (true) {

					entities.get(0).getPosition().increment(1f, 1f, 0);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
		while (true) {
			window.render();

			Thread.sleep(10);
		}

	}

}
