// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    private Pontos score;

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
        score =  new  Pontos();
        addObject(score, 50, 20);
    }

    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        balao balao =  new  balao();
        addObject(balao, 439, 197);
        balao balao2 =  new  balao();
        addObject(balao2, 360, 147);
        balao balao3 =  new  balao();
        addObject(balao3, 208, 150);
        balao balao4 =  new  balao();
        addObject(balao4, 180, 258);
        balao balao5 =  new  balao();
        addObject(balao5, 90, 305);
        balao balao6 =  new  balao();
        addObject(balao6, 227, 69);
    }

    /**
     * 
     */
    public Pontos getScore()
    {
        return score;
    }
}
