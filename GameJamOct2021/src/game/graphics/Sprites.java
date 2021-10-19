package game.graphics;

import java.io.File;

public enum Sprites {
	
	
	DEFAULT(new Sprite(100,100,-1)),TEST(new Sprite(new File("Test.png")));
	
	Sprite s;
	Sprites(Sprite s){this.s=s;};

}
