package com.example.pattern.command;

/**
 * Created by lichao on 2017/12/18.
 */
public interface Command {

    void execute();

    void undo();
}
