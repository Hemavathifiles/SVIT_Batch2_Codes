package org.tnsif.acc.c2tc.interfacedemo;

interface Camera
{
	void takePhoto();
}

interface MusicPlayer {
	
	void playMusic();
}

class SmartPhone1 implements Camera, MusicPlayer
{

	@Override
	public void playMusic() {
		System.out.println("Playing a music with smartphone");
		
	}

	@Override
	public void takePhoto() {
		
		System.out.println("Taking a photo with smartphone");
	}
	
}

public class MutipleInterface {

	public static void main(String[] args) {
		SmartPhone1 smartphone=new SmartPhone1 ();
		smartphone.playMusic();
		smartphone.takePhoto();

	}

}
