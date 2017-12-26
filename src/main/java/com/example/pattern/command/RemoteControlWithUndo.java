package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public class RemoteControlWithUndo {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    public RemoteControlWithUndo(){
        Command noCommand = new NoCommand();
        onCommands = new Command[7];
        offCommands = new Command[7];
        for (int i = 0; i<7 ;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        undoCommand = onCommands[slot];
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        undoCommand = offCommands[slot];
        offCommands[slot].execute();
    }

    public void undoButtonWasPressed(){
        undoCommand.undo();
    }
}
