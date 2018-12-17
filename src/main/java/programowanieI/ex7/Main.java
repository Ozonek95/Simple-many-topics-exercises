package programowanieI.ex7;

import javafx.collections.ObservableList;
import javafx.collections.transformation.SortedList;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Task> queue = new LinkedBlockingQueue<>();

     queue.add(new Task("task1"));
     queue.add(new Task("task2"));
     queue.add(new Task("task3"));
     queue.add(new Task("task4"));
     queue.add(new Task("task5"));


        while (queue.peek()!=null){
            queue.poll().showTask();
        }



    }
}
