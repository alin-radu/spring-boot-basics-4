package com.dev.spring_basics.game;

public class GameRunner {
    private final GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
