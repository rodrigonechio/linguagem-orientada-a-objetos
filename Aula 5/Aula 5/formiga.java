// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class formiga extends Actor
{

    /**
     * 
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - 5, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + 5, getY());
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        if (isTouching(bomba.class)) {
            Greenfoot.stop();
        }
    }
}
