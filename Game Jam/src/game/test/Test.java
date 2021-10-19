package game.test;

import static org.junit.Assert.fail;

import game.logic.world.World;


class Test {

	@org.junit.jupiter.api.Test
	void test() {
		//fail("Not yet implemented");
		World w = new World() {

			@Override
			public boolean update() {
				// TODO Auto-generated method stub
				return true;
			}};
		
		if(!w.update())fail("failed update");
		
	}

}
