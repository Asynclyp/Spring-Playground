package com.yuanpeng.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yuanpeng.learn_spring_framework.game")
public class GameLauncherApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameLauncherApplication.class);

        context.getBean("pacmanGame", GameConsole.class).up();

        GameRunner marioRunner = context.getBean(GameRunner.class);
        marioRunner.run();
    }
}
