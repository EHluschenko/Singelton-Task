package app;

import static app.Logger.log;

public class main {

    public static void main(String[] args) {
        (Logger.getInstance()).log("start");
        (Logger.getInstance()).log("first proces");
        (Logger.getInstance()).log("finish");
        Logger.getLogs().forEach(System.out::println);
    }
}
