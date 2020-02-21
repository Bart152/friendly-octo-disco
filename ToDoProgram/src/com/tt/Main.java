package com.tt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("podaj imię:");
        String userName = input.nextLine();

        System.out.println("podaj nazwę zadania: ");
        String name = input.nextLine();

        System.out.println("podaj opis zadania: ");
        String description = input.nextLine();

        Task task = new Task(userName, name, description);

        System.out.println(task.toString());

        List<Task> toDoTask = new ArrayList<>();
        System.out.println(toDoTask.size());
        toDoTask.add(task);
        System.out.println(toDoTask.size());

        for (Task task3: toDoTask){
            System.out.println(task3.toString());
        }

        toDoTask.forEach(task1 -> );

    }
}
