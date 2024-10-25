package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todo {
    private int id;
    private int userId;
    private String title;
    private boolean completed;
}
