package game;

import java.util.ArrayList;
import java.util.List;

import game.graphics.Window;
import game.logic.entity.Entity;
import game.logic.entity.IEntity;
import game.logic.world.World;

public class Main {

	public static List<IEntity> entities = new ArrayList<IEntity>();

	public static void main(String[] args) throws Exception {
		Window window = new Window(800, 600, "Hello World");
		entities.add(new Entity());
		Thread logic_thread = new Thread() {
			@Override
			public void run() {
				super.run();
				logic_init();
				while (true) {

					update();
				}
			}
		};
		logic_thread.start();
		Thread graphics_thread = new Thread() {
			@Override
			public void run() {
				super.run();
				graphics_init();
				long cur_time = System.currentTimeMillis();
				long prev_time = cur_time;
				int fps = 0;
				while (true) {
					window.render();
					fps++;
					cur_time = System.currentTimeMillis();
					if (cur_time - prev_time >= 1000) {
						System.out.println(fps);
						fps = 0;
						prev_time = cur_time;
					}

				}
			}
		};
		graphics_thread.start();

		while (true)
			;

	}

	public static void logic_init() {

	}

	public static void graphics_init() {

	}

	public static void update() {

	}

}
