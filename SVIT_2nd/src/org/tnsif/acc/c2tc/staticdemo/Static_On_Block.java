package org.tnsif.acc.c2tc.staticdemo;

class Game
{
	static int maxLevel;
	
	static
	{
		System.out.println("Initializing Game Setting");
		maxLevel=50;
	}
	void showLevelInfo()
	{
		System.out.println("Game has "+ maxLevel +" level");
	}
}
public class Static_On_Block {

	public static void main(String[] args) {
		Game g=new Game();
		g.showLevelInfo();

	}

}
