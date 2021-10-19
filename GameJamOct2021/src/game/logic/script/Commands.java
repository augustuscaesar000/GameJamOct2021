package game.logic.script;

import static game.logic.script.Command.addActionToEntity;
import static game.logic.script.Command.addBasicEntity;
public enum Commands {

	AddBasicEntity(addBasicEntity,"AddBasicEntity"),AddActionToEntity(addActionToEntity,"AddActionToEntity");
	
	Command command;
	String name;
	Commands(Command c,String n){
		command=c;name=n;
	}
	
	
}
