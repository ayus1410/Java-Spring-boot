package com.spring.learn_spring_framework;

import com.spring.learn_spring_framework.game.GameRunner;
import com.spring.learn_spring_framework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
	}

}