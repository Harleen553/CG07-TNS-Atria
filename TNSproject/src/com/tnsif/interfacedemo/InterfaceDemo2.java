package com.tnsif.interfacedemo;

interface SmartDevice{
	void TurnOn();
	void TurnOff();
	void getStatus();
}

class SmartLight implements SmartDevice{

	@Override
	public void TurnOn() {
		System.out.println("Smart light On");
	}

	@Override
	public void TurnOff() {
		System.out.println("Smart light Off");
	}

	@Override
	public void getStatus() {
		System.out.println("Smart light status : steady mode");
	}
}

public class InterfaceDemo2 {
	public static void main(String[] args) {
		SmartLight sl = new SmartLight();
		sl.TurnOff();
		sl.TurnOn();
		sl.getStatus();
	}
}
