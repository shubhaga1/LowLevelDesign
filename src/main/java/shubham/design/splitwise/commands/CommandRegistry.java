package shubham.design.splitwise.commands;

public interface CommandRegistry {
    boolean registerCommand(Command command);

    Command getCommand(String commandLine);

    boolean removeCommand(Command command);

    boolean executeCommandLine(String commandLine);
}
