package adam.command;

import adam.Storage;
import adam.Ui;
import adam.TaskList;
import adam.exception.NumberException;

public class EditCommand implements Command {
    String[] tokens;
    String text;
    public EditCommand(String[] tokens, String text) {
        this.tokens =  tokens;
        this.text = text;
    }
    public void execute(TaskList tasks, Storage storage, Ui ui) {
        if (tokens.length != 2) {
            throw new NumberException();
        }
        if (!tokens[1].matches("[0-9]+")) {
            throw new NumberException();
        }
        int number = Integer.valueOf(tokens[1]);
        switch (text) {
            case "mark":
                tasks.markAsDone(number);
                break;
            case "unmark":
                tasks.unMarkAsDone(number);
                break;
            case "delete":
                tasks.deleteTask(number);
                break;
            default:
                System.out.println("Wrong input");
        }
        tasks.save(storage);
    }
}
