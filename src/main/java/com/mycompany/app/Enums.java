package com.mycompany.app;

public class Enums
{
    public void run()
    {
        Bottle bottle = new Bottle();
        bottle.size = Bottle.Size.SMALL;
        bottle.sizeEnum = SizeEnum.MEDIUM;

        Types.test();

        String s = "Hello World " + bottle.size + " !";
        short res[] = ( new Arrays() ).run();
    }
}
