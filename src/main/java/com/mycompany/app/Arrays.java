package com.mycompany.app;

import java.util.ArrayList;
// import java.io.*;
// import java.util.*;

public class Arrays
{
    public short[] run()
    {
        // Arrays are size fixed !
        short[] numbers = {5, 8, 4, 2};
        short ret[] = new short[4];
        String[] arrayString = new String[]{"a"};
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};

        short i = 0;
        for (short x : numbers) {
            ret[i++] = x;
        }

        System.out.println( this.list() );

        short inc = 0;
        for ( ;; ) {
            if ( inc++ > 3 ) {
                break;
            }
        }

        // Will throw java.lang.ArrayIndexOutOfBoundsException
        // ret[5] = 9;
        return ret;
    }

    private String list()
    {
        /** @see https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/ArrayList.html */
        ArrayList<String> list = new ArrayList<String>();
        list.add( "3" );
        list.add( "4" );
        list.add( "5" );

        int item = list.indexOf( "3" );
        String test = list.get( 0 );
        
        String[] tryCast = list.toArray( new String[0] );
        String str = tryCast[0];

        return "";
    }
}
