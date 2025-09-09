// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Pontos extends Actor
{
    private int pontos = 0;

    /**
     * Act - do whatever the Pontos wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        atualizar();
    }

    /**
     * 
     */
    public void adicionar(int ponto)
    {
        pontos = pontos + ponto;
    }

    /**
     * 
     */
    public void remover(int ponto)
    {
        pontos = pontos - ponto;
    }

    /**
     * 
     */
    public void atualizar()
    {
        setImage( new  GreenfootImage("Pontos:  " + pontos, 24, Color.BLACK,  new  Color(0, 0, 0, 0)));
    }
}
