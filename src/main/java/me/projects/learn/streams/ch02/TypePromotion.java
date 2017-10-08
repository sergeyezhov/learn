package me.projects.learn.streams.ch02;

import javax.swing.*;
import java.util.function.Predicate;

public class TypePromotion {
    public static void main(String[] args) {
        // 1
        Runnable hw = () -> System.out.println("Hello world");
        hw.run();

        // 2
        JButton button = new JButton();
        button.addActionListener(event -> System.out.println(event.getActionCommand()));

        // 3
        // check(x -> x > 5); //doesn't compile
    }

    private static boolean check(Predicate<Integer> predicate) {
        return predicate.test(1);
    }

    private static boolean check(IntPred predicate) {
        return predicate.test(1);
    }

    private interface IntPred {
        boolean test(Integer value);
    }
}
