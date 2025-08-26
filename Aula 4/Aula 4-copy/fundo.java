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
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        formiga formiga =  new formiga();
        addObject(formiga, 440, 196);
        bomba bomba =  new bomba();
        addObject(bomba, 221, 190);
    }
}
