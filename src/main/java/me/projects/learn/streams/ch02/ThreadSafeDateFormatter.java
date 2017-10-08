package me.projects.learn.streams.ch02;

import javax.swing.text.DateFormatter;
import java.util.function.Supplier;

public class ThreadSafeDateFormatter {

    private static final ThreadLocal<DateFormatter> df = ThreadLocal.withInitial((Supplier<DateFormatter>) DateFormatter::new);

    public static String format() {
        // todo df.get()
        return null;
    }

}
