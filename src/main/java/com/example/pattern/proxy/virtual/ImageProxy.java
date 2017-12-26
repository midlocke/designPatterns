package com.example.pattern.proxy.virtual;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 * Created by lichao on 2017/12/21.
 */
public class ImageProxy implements Icon {

    private ImageIcon imageIcon;
    private URL imageURL;
    private Thread retrievalThread;
    private boolean retrieving = false;

    @Override
    public void paintIcon(final Component c, Graphics g, int x, int y) {
        if(imageIcon != null){
            imageIcon.paintIcon(c,g,x,y);
        }else {
            g.drawString("Loading image....",x+300,y+300);
            if(!retrieving){
                retrieving = true;
                retrievalThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try{
                            imageIcon = new ImageIcon(imageURL,"CD Cover");
                            c.repaint();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if(imageIcon != null){
            return imageIcon.getIconWidth();
        }else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if(imageIcon != null){
            return imageIcon.getIconHeight();
        }else {
            return 600;
        }
    }
}
