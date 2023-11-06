package com.mycompany.app;

/**
 * Access Modifiers − default, public , protected, private
 * Non-access Modifiers − final, abstract, strictfp (floating point, < v.17)
 */

/** Hello world! */
public class App 
{
    Bottle size;

    public static void main( String[] args )
    {
        Bottle bottle = new Bottle();
        bottle.size = Bottle.Size.SMALL;

        System.out.println( "Hello World " + bottle.size + " !" );
    }
}
