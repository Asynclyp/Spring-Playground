package com.yuanpeng.learn_spring_framework;

import com.yuanpeng.learn_spring_framework.game.GameConsole;
import com.yuanpeng.learn_spring_framework.game.MarioGame;
import com.yuanpeng.learn_spring_framework.game.PacmanGame;
import com.yuanpeng.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {
    @Bean
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
}
