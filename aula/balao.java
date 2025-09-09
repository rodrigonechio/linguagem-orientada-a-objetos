// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class balao extends Actor
{

    /**
     * Act - do whatever the balao wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)) {
            setLocation(Greenfoot.getRandomNumber(599), Greenfoot.getRandomNumber(399));
            MyWorld world = (MyWorld)getWorld();
            world.getScore().adicionar(1);
        }
    }

    /**
     * 
     */
    public void removeThis()
    {
        getWorld().removeObject(this);
    }
}
