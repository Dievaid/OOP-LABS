package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class JsonReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        File file = new File("data.json");
        List<Todo> todos = mapper.readValue(file, new TypeReference<>() {});

        Random rand = new Random();
        for (var todo : todos) {
            todo.setCompleted(true);
            todo.setUserId(rand.nextInt());
            System.out.println(todo);
        }
    }
}
