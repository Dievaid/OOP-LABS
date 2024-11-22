package oop.pub.factory.method;

import java.util.List;

public class CommandFactoryImpl implements AbstractCommandFactory {
    @Override
    public Command createAddToListCommand(List<String> parameters, String elem) {
        return new AddToListCommand(parameters, elem);
    }

    @Override
    public Command createRemoveFromListCommand(List<String> parameters, String elem) {
        return new RemoveFromListCommand(parameters, elem);
    }
}
