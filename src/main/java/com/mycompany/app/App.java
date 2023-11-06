package com.mycompany.app;

import java.io.*; 
import java.lang.*; 
import java.util.*; 

public class App 
{
    public static void main( String[] args )
    {
        Bottle bottle = new Bottle();
        bottle.size = Bottle.Size.SMALL;
        bottle.sizeEnum = SizeEnum.MEDIUM;

        Types.test();

        String s = "Hello World " + bottle.size + " !";
        short res[] = (new Array()).run();

        System.out.println( "ok " + res[1] );
    }
}
