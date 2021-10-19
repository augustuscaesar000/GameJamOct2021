package game.graphics;

import javax.swing.JFrame;

public class Window extends JFrame{

	
	Screen screen;
	
	public Window(int width,int height,String title) {
		screen = new Screen(width,height);
		screen.init();
		this.add(screen);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public void render() {
		
		screen.render();
		
	}
	
	
	
}
