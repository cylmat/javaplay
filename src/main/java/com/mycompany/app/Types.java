package com.mycompany.app;

public class Types
{
    // instance variable
    int one, two = 10;
    byte b = 22;

    int decimal = 100;
    int octal = 0144;
    int hexa =  0x64;

    String string = "\new \return \form \back \tab \080 \u0064"; // \space 

    public static void test()
    {
        String s = "s", y = "y";
        boolean result = s instanceof String;
        if ( result && s == y ) {
            s = "azerty";
        }
    }
}
