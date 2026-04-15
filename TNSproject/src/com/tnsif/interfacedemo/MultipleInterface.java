package com.tnsif.interfacedemo;

interface Camera{
	void takephoto();
}

interface MusicPlayer{
	void playmusic();
}

class SmartPhone implements Camera, MusicPlayer{

	@Override
	public void playmusic() {
		System.out.println("I want to listen POP with my smartphone");	
	}

	@Override
	public void takephoto() {
		System.out.println("Lets take a vintage photo with phone");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.playmusic();
		sp.takephoto();
	}
}
