package client_side;

import java.util.HashMap;

import client_side.command.*;

public class CommandsMap {
public HashMap<String,Command> CommandsMapper;
public CommandsMap()
{
	CommandsMapper=new HashMap<String,Command>();
	CommandsMapper.put("connect",new ConnectCommand());
	CommandsMapper.put("openDataServer",new OpenServerCommand());
	CommandsMapper.put("var",new DefineVarCommand());
	CommandsMapper.put("sleep",new SleepCommand());
	CommandsMapper.put("print",new PrintCommand());
	CommandsMapper.put("return",new ReturnCommand());
}

public Command get(String key)
{
	return CommandsMapper.get(key);
}


}
