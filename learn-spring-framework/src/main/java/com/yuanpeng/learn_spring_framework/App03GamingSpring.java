package com.yuanpeng.learn_spring_framework;

import com.yuanpeng.learn_spring_framework.game.GameRunner;
import com.yuanpeng.learn_spring_framework.game.MarioGame;
import com.yuanpeng.learn_spring_framework.game.PacmanGame;
import com.yuanpeng.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main(String[] args) {
        //Creating Spring context for dependency management
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);
        //Injecting dependency(GameConsole) into the dependant(GameRunner)
        var gameRunner = new GameRunner(context.getBean("pacman", PacmanGame.class));
        gameRunner.run();
    }
}
