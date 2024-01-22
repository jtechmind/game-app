package com.jay.gameapp.game;

public class GameAppVersion1 {
	
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
	}

}
