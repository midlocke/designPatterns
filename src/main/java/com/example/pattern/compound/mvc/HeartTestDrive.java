package com.example.pattern.compound.mvc;

/**
 * Created by lichao on 2017/12/25.
 */
public class HeartTestDrive {
    public static void main(String[] args) {
        HeartModel heartModel = new HeartModel();//首先创建模型
        ControllerInterface model = new HeartController(heartModel);//然后创建控制器，控制器中创建了视图
    }
}
