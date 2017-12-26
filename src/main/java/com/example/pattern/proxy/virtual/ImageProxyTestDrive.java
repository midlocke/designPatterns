package com.example.pattern.proxy.virtual;

import com.example.pattern.chenqing.proxy.virtual.*;

import javax.swing.*;
import java.net.URL;

/**
 * Created by lichao on 2017/12/21.
 */
public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    public static void main(String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception{
        JFrame frame = new JFrame("test");
        frame.setSize(800, 600);
        URL url = null;
        Icon icon = new ImageProxy(new URL("http://www.baidu.com/img/bd_logo1.png"));
        ImageComponent imageComponent = new ImageComponent(icon);
        frame.add(imageComponent);
        frame.setVisible(true);

    }
}
