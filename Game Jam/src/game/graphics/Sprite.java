package game.graphics;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Sprite {

	int width, height;
	int[] pixels;

	public Sprite(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];

	}

	public Sprite(int width, int height, int color) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		for (int i = 0; i < pixels.length; i++) {
			if(color==-1)
				pixels[i] = new Random().nextInt();
			else
			pixels[i] = color;
		}
	}
	
	public Sprite(File file) {
		
		try {
			BufferedImage image = ImageIO.read(file);
			this.width=image.getWidth();
			this.height=image.getHeight();
			pixels = image.getRGB(0,0,width,height,pixels,0,width);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int[] getPixels() {
		return pixels;
	}

}
