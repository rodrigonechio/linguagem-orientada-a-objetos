// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class pessoa extends Actor
{

    /**
     * Act - do whatever the pessoa wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("right")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            move(-5);
        }
    }
}
