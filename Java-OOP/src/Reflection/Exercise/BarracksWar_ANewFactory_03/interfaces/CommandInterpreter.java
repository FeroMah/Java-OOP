package Reflection.Exercise.BarracksWar_ANewFactory_03.interfaces;

public interface CommandInterpreter {

	Executable interpretCommand(String[] data, String commandName);
}
