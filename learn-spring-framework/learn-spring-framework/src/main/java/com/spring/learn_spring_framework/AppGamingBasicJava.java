package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.PacmanGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame(); // 1: Object Creation
		var gameRunner = new GameRunner(game);
		// 2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		gameRunner.run();
	}

}
