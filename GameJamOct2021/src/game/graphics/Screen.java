package game.graphics;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.List;

import game.Main;
import game.logic.entity.IEntity;

public class Screen extends Canvas {

	int width, height;
	BufferedImage image;
	int[] pixels;

	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		this.setPreferredSize(new Dimension(width, height));
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();
	}

	public void init() {

	}

	public void renderEntities(List<IEntity> entities) {

		for (IEntity e : entities) {

			renderSprite(e.getPosition().getX(), e.getPosition().getY(), e.getPosition().getZ(),
					Sprites.values()[e.getType()].s);

		}

	}

	public void render() {
		clear();

		renderSprite(0, 10, 0, Sprites.TEST.s);

		renderEntities(Main.entities);

		if (this.getBufferStrategy() == null) {
			this.createBufferStrategy(3);
			return;
		}
		BufferStrategy bus = this.getBufferStrategy();
		Graphics g = bus.getDrawGraphics();
		g.drawImage(image, 0, 0, width, height, null);
		g.dispose();
		bus.show();

	}

	private void clear() {
		for (int i = 0; i < pixels.length; i++)
			pixels[i] = 0;

	}

	public void renderSprite(float x, float y, float h, Sprite sprite) {

		for (int ya = 0; ya < sprite.getHeight(); ya++) {

			for (int xa = 0; xa < sprite.getWidth(); xa++) {
					
					int xt=(int) (x + xa);
				int yt= (int) (y + ya);

				if(xa<sprite.getWidth()&&ya<sprite.getHeight()&&xt<width&&yt<height&&xt>=0&&yt>=0)
					
				pixels[xt+yt * width] = sprite.getPixels()[xa + ya * sprite.getWidth()];

			}
		}

	}

}
