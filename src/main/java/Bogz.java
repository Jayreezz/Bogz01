import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

import static java.lang.Thread.sleep;

public class Bogz {


    public static void main(String args[]) throws AWTException, InterruptedException {
        Robot r = new Robot();
        while(true) {
            System.out.println("Go have fun(Doja) you will catchup later " +new Date());
            r.keyPress(KeyEvent.VK_F12);
            r.keyRelease(KeyEvent.VK_F12);
            sleep(20000);
        }
    }


}
