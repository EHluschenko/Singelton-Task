package app;

public class Main {

    public static void main(String[] args) {
        (Logger.getInstance()).log("log level info: start process");
        (Logger.getInstance()).log("log level info: finish process");
        System.out.println("got these logs: ");
        Logger.getLogs().forEach(System.out::println);
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println("--------------------------------------");
        System.out.println(" - checking if it is same instance");
        // Перевірка, чи це той самий об'єкт
        if (logger1 == logger2) {
            System.out.println("These are the same instance.");
        } else {
            System.out.println("These are different instances!");
        }
    }
}
