package com.reify.restfulwebservice.designpatterns.behavioural.Command;


import com.reify.restfulwebservice.designpatterns.behavioural.Command.Light;
import com.reify.restfulwebservice.designpatterns.behavioural.Command.LightOnCommand;
import com.reify.restfulwebservice.designpatterns.behavioural.Command.RemoteControl;

public class RestfulWebServiceApplication {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remoteControl.setCommand(lightOn);
		remoteControl.pressButton();
	}

}
