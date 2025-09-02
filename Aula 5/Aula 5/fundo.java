// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class fundo extends World
{

    /**
     * Constructor for objects of class fundo.
     */
    public fundo()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        formiga formiga =  new  formiga();
        addObject(formiga, 376, 200);
        bomba bomba =  new  bomba();
        addObject(bomba, 250, 305);
    }
}
