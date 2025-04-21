package app;

public class Main {

    public static void main(String[] args) {
        (Logger.getInstance()).log("start");
        (Logger.getInstance()).log("first proces");
        (Logger.getInstance()).log("finish");
        System.out.println("got these logs: ");
        Logger.getLogs().forEach(System.out::println);
    }
}
