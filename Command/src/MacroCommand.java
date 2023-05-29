import java.util.ArrayDeque;
import java.util.Deque;

public class MacroCommand implements Command {
    public Deque<Command> commands = new ArrayDeque<>();
    @Override
    public void execute() {
        for (Command cmd: commands) {
            cmd.execute();
        }
    }

    public void append(Command cmd) {
        if (cmd == this) {
            throw new IllegalArgumentException("append, 무한루프");
        }
        commands.push(cmd);
    }

    public void undo() {
        if (!commands.isEmpty()) {
            commands.pop();
        }
    }

    public void clear() {
        commands.clear();
    }
}
