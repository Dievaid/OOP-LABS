package oop.pub.factory.method;

import java.util.List;

public class CommandFactory {
    public static Command getCommand(
            String command, List<String> parameters, String elem) {
        return switch (command) {
            case "add" -> new AddToListCommand(parameters, elem);
            case "remove" -> new RemoveFromListCommand(parameters, elem);
            default -> throw new IllegalArgumentException("Unknown command: " + command);
        };
    }
}
