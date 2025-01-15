package com.dev.spring_basics_2;

import com.dev.spring_basics_2.game.GameRunner;
import com.dev.spring_basics_2.game.GamingConsole;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.dev.spring_basics_2.game")
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        context.getBean("marioGame", GamingConsole.class).up();

        context.getBean(GameRunner.class).run();
    }

}


