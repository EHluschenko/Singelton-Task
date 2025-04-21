package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logger {
    // Єдиний екземпляр класу
    private static Logger instance;

    // Список для зберігання логів
    private static List<String> logs;

    // Приватний конструктор, щоб не можна було створити новий екземпляр
    private Logger() {
        logs = new ArrayList<>();
    }

    // Метод для отримання єдиного екземпляра
    public static Logger getInstance() {
        if (instance == null) {
                    instance = new Logger();
                }
        return instance;
    }

    // Метод для додавання логів
    public static void log(String message) {
        logs.add(message);
    }

    // Метод для отримання всіх логів
    public static List<String> getLogs() {
        return Collections.unmodifiableList(logs);
    }

}



