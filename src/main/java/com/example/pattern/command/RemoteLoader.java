package com.example.pattern.command;

/**
 * 命令模式：将请求封装成对象，以便使用不同的请求，队列或者日志来参数化其他对象。支持可撤销
 * 将“动作的执行者”  和  “动作的请求者”  解耦
 * 用途：队列请求，日志请求
 */
public class RemoteLoader {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("living room");
        Light kitchenLight = new Light("kitchen");
        CeilingFan ceilingFan = new CeilingFan("ceilingfan");
        Stereo stereo = new Stereo();
        stereo.setCd("taylor swift");

        Command livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOffCommand = new LightOffCommand(livingRoomLight);
        Command kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        Command kitchenLightOffCommand = new LightOffCommand(kitchenLight);
        Command ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        Command ceilingFanMediumComman = new CeilingFanMediumCommand(ceilingFan);
        Command ceilingFanLowCommand = new CeilingFanLowComman(ceilingFan);
        Command ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
        Command stereoOnCommand = new StereoOnCommand(stereo);
        Command stereoOffCommand = new StereoOffCommand(stereo);

        RemoteControlWithUndo remoteControlWithUndo = new RemoteControlWithUndo();
        remoteControlWithUndo.setCommand(0,livingRoomLightOnCommand,livingRoomLightOffCommand);
        remoteControlWithUndo.setCommand(1,kitchenLightOnCommand,kitchenLightOffCommand);
        remoteControlWithUndo.setCommand(2,ceilingFanHighCommand,ceilingFanMediumComman);
        remoteControlWithUndo.setCommand(3,ceilingFanLowCommand,ceilingFanOffCommand);
        remoteControlWithUndo.setCommand(4,stereoOnCommand,stereoOffCommand);

        remoteControlWithUndo.onButtonWasPressed(0);
        remoteControlWithUndo.offButtonWasPressed(0);
        remoteControlWithUndo.undoButtonWasPressed();
        remoteControlWithUndo.onButtonWasPressed(1);
        remoteControlWithUndo.offButtonWasPressed(1);
        remoteControlWithUndo.undoButtonWasPressed();
        remoteControlWithUndo.onButtonWasPressed(2);
        remoteControlWithUndo.offButtonWasPressed(2);
        remoteControlWithUndo.undoButtonWasPressed();
        remoteControlWithUndo.onButtonWasPressed(3);
        remoteControlWithUndo.offButtonWasPressed(3);
        remoteControlWithUndo.undoButtonWasPressed();
        remoteControlWithUndo.onButtonWasPressed(4);
        remoteControlWithUndo.offButtonWasPressed(4);
        remoteControlWithUndo.undoButtonWasPressed();

    }

}
