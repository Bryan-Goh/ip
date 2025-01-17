package adam.command;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import adam.Storage;
import adam.TaskList;
import adam.Ui;
import adam.exception.AdamException;
import adam.tasks.Task;

public class EditCommandTest {
    private Ui ui = new Ui();
    private Storage storage = new Storage();
    private TaskList task = new TaskList(new ArrayList<Task>());

    @Test
    public void executeMark_noDescription_exceptionThrown() {
        String li = "mark";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }

    @Test
    public void executeMark_outOfBound_exceptionThrown() {
        String li = "mark 5";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! The number you put in is more than the current item in your list", e.getInfo());
        }
    }

    @Test
    public void executeUnmark_outOfBound_exceptionThrown() {
        String li = "unmark 5";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! The number you put in is more than the current item in your list", e.getInfo());
        }
    }

    @Test
    public void executeDelete_outOfBound_exceptionThrown() {
        String li = "delete 5";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! The number you put in is more than the current item in your list", e.getInfo());
        }
    }

    @Test
    public void executeMark_wrongDescription_exceptionThrown() {
        String li = "mark test";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }

    @Test
    public void executeMark_multipleDescription_exceptionThrown() {
        String li = "mark 1 2 3 ";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }

    @Test
    public void executeUnmark_multipleDescription_exceptionThrown() {
        String li = "unmark 1 2 3 ";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }
    @Test
    public void executeUnmark_wrongDescription_exceptionThrown() {
        String li = "unmark test";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }
    @Test
    public void executeUnmark_noDescription_exceptionThrown() {
        String li = "unmark";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }

    @Test
    public void executeDelete_noDescription_exceptionThrown() {
        String li = "delete";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }
    @Test
    public void executeDelete_wrongDescription_exceptionThrown() {
        String li = "delete test";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }
    @Test
    public void executeDelete_multipleDescription_exceptionThrown() {
        String li = "delete 1 2 3 ";
        String[] tokens = li.split(" ");
        int length = tokens[0].length();
        String item = li.substring(length, li.length());
        try {
            new EditCommand(tokens, item).execute(task, storage, ui);
        } catch (AdamException e) {
            assertEquals("OOPS!!! You need to follow this command by a number", e.getInfo());
        }
    }
}
