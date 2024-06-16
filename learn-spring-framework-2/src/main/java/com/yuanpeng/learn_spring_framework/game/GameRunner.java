package com.yuanpeng.learn_spring_framework.game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game: " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
