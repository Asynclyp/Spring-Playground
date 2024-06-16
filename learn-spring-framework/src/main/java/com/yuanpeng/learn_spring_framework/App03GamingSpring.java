package com.yuanpeng.learn_spring_framework;

import com.yuanpeng.learn_spring_framework.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        GameRunner pacmanRunner = new GameRunner(context.getBean("pacman", GameConsole.class));
        pacmanRunner.run();

        GameRunner marioRunner = context.getBean("marioRunner", GameRunner.class);
        marioRunner.run();
    }
}
