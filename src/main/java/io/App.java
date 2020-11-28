package io;

import services.GuitarService;
import services.SneakerService;

public class App {
    private SneakerService sneakerService = new SneakerService();
    private GuitarService guitarService = new GuitarService();

    public static void main(String[] args) {
        App application = new App();
        application.init();

    }

    private void init() {
        Console.Console();

    }
}
