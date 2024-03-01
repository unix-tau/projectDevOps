package com.reify.restfulwebservice.designpatterns.behavioural.Command;


public class Test {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remoteControl.setCommand(lightOn);
		remoteControl.pressButton();
	}

}
