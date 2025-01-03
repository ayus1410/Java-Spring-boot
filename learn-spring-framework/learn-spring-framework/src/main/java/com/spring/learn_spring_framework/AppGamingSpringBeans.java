package com.spring.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.learn_spring_framework.game.GameRunner;

public class AppGamingSpringBeans {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
//			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
