package shubham.design.splitwise.commands;

public interface Command {
    /**
     *
     * @param commandLine
     * @return
     */
    boolean parse(String commandLine);

    void execute(String commandine);
}
