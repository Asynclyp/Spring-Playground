package com.yuanpeng.learn_spring_framework;

import com.yuanpeng.learn_spring_framework.game.GameRunner;
import com.yuanpeng.learn_spring_framework.game.MarioGame;
import com.yuanpeng.learn_spring_framework.game.PacmanGame;
import com.yuanpeng.learn_spring_framework.game.SuperContraGame;

public class App01GamingBasic {
    public static void main(String[] args) {
        //Creation of dependencies
        var marioGame = new MarioGame();
        var superContra = new SuperContraGame();
        var pacman = new PacmanGame();
        //Wiring of dependency(GameConsole) into dependant(GameRunner)
        var gameRunner = new GameRunner(pacman);
        gameRunner.run();
    }
}
