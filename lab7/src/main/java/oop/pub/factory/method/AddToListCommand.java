package oop.pub.factory.method;

import java.util.List;

public class AddToListCommand implements Command {
    private final List<String> list;
    private final String elementToAdd;

    public AddToListCommand(List<String> list, String elementToAdd) {
        this.list = list;
        this.elementToAdd = elementToAdd;
    }

    @Override
    public void execute() {
        list.add(elementToAdd);
    }
}
