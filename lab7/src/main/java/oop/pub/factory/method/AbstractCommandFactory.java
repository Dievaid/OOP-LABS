package oop.pub.factory.method;

import java.util.List;

public interface AbstractCommandFactory {
    Command createAddToListCommand(List<String> parameters, String elem);
    Command createRemoveFromListCommand(List<String> parameters, String elem);
}
