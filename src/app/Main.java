package app;

public class Main {

    public static void main(String[] args) {
        (Logger.getInstance()).log("log level info: start process");
        (Logger.getInstance()).log("log level info: finish process");
        System.out.println("got these logs: ");
        Logger.getLogs().forEach(System.out::println);
    }
}
