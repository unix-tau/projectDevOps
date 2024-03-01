package com.reify.restfulwebservice.designpatterns.behavioural.Command;

import com.reify.restfulwebservice.designpatterns.behavioural.Command.Command;

public class RemoteControl {
    Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
