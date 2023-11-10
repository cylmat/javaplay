package com.mycompany.app;

// @ee https://junit.org/junit4/javadoc/4.12/org/junit/Assert.html

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.mycompany.app.Manager.OutputManager;

public class AppTest
{
    @Test
    public void shouldAnswerWithTrue()
    {   
        OutputManager out = new OutputManager();
        out.setInMemoryOutput();
        
        String[] args = {""};
        App.main(args);

        out.reset();

        assertTrue(out.getBuffer().contains("done"));
    }
}
