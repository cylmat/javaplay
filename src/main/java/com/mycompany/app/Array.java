package main.java.com.mycompany.app;

import java.util.ArrayList;  

public class Array 
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

        this.list();

        // Will thorws java.lang.ArrayIndexOutOfBoundsException
        // ret[5] = 9; 
        return ret;
    }

    private void list()
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("3");
        list.Add("4");
        list.Add("5");


        //return list.toArray[3];
    }
}
