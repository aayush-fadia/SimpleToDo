package com.simpletodo.aayushf.simpletodo;

import java.sql.Date;

/**
 * Created by ayfadia on 4/17/17.
 */

public class Task {
    String task;
    int priority;
    Date dateadded, datedone;
    String category;
    int primk;
    boolean done;
    int colour;
    public static  int[] colours = {0xFFFFFFFF, 0xFFD50000, 0xFFF4511E, 0xFFF6BF26, 0xFF0B8043, 0xFF33B679, 0xFF039BE5, 0xFF3F51B5, 0xFF7986CB, 0xFF8E24AA, 0xFFE67C73, 0xFF616161};
    public static final String[] coloursnames = {"White", "Tomato", "Tangerine", "Banana", "Basil", "Sage", "Peacock", "Blueberry", "Lavender", "Grape", "Flamingo", "Graphite"};

    public Task(String task, int priority, String category, int colour, boolean done) {
        this.task = task;
        this.priority = priority;
        this.category = category;
        this.done = false;
        this.colour = colour;
    }
    public Task(String task, int priority, String  category, int primk, int colour, boolean done) {
        this.task = task;
        this.priority = priority;
        this.category = category;
        this.primk = primk;
        this.done = false;
        this.colour = colour;
    }


}
