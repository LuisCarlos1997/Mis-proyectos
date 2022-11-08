package com.co.bombonite.interaction;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Robot {

    public static void robots (){
        try {
            java.awt.Robot robot = new java.awt.Robot();
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_DOWN);
            robot.keyPress(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
    }
}
