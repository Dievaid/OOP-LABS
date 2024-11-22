package oop.pub.factory.method;

import java.util.List;

public class RemoveFromListCommand implements Command {
    private final List<String> list;
    private final String elementToRemove;

    public RemoveFromListCommand(List<String> list, String elementToRemove) {
        this.list = list;
        this.elementToRemove = elementToRemove;
    }

    @Override
    public void execute() {
        list.remove(elementToRemove);
    }
}
