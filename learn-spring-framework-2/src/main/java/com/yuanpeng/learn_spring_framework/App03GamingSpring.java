package com.yuanpeng.learn_spring_framework;

import com.yuanpeng.learn_spring_framework.game.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class GameConfiguration {
    @Bean
    @Qualifier("mario")
    public GameConsole mario(){
        return new MarioGame();
    }

    @Bean
    public GameConsole superContra(){
        return new SuperContraGame();
    }

    @Bean
    public GameConsole pacman(){
        return new PacmanGame();
    }

    @Bean
    public GameRunner marioRunner(@Qualifier("mario")GameConsole mario){
        return new GameRunner(mario);
    }

}

public class App03GamingSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfiguration.class);

        GameRunner pacmanRunner = new GameRunner(context.getBean("pacman", GameConsole.class));
        pacmanRunner.run();

        GameRunner marioRunner = context.getBean("marioRunner", GameRunner.class);
        marioRunner.run();
    }
}
