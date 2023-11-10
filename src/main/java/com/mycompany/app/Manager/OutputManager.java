package com.mycompany.app.Manager;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputManager
{
    private PrintStream defaults;
    private ByteArrayOutputStream arrayOutput;

    public OutputManager()
    {
        this.defaults = System.out;
        this.arrayOutput = new ByteArrayOutputStream();
    }

    public void setInMemoryOutput()
    {
        System.setOut(new PrintStream(this.arrayOutput));
    }

    public void reset()
    {
        System.setOut(defaults);
    }

    public String getBuffer()
    {
        return this.arrayOutput.toString();
    }
}
