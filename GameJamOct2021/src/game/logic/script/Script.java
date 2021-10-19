package game.logic.script;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import game.logic.entity.Entity;
import game.logic.world.World;

public class Script {

	List<String> commands = new ArrayList<String>();

	public Script(String path) throws Exception {

		Scanner scan = new Scanner(new File(path));
		while (scan.hasNext()) {

			commands.add(scan.nextLine());

		}

		scan.close();

		if (!compile()) {

			throw new Exception();

		}

	}

	public void run(World world) {

		for (String command : commands)

			GetCommand(command.split(" ")[0]).run(world, command.split(" "));

	}

	private Command GetCommand(String string) {

		for (Commands i : Commands.values())
			if (string.equals(i.name))
				return i.command;

		return null;
	}

	private boolean compile() {
		return true;
	}

}
