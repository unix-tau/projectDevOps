package com.reify.restfulwebservice.designpatterns.behavioural.Command;

import com.reify.restfulwebservice.designpatterns.behavioural.Command.Command;
import com.reify.restfulwebservice.designpatterns.behavioural.Command.Light;

public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light){
        this.light = light;
    }
    public void execute(){
        light.on();
    }
}
