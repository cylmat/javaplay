package com.mycompany.app.Manager;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OutputManagerTest
{
    @Test
    public void shouldGetInMemoryValue()
    {
        OutputManager outManager = new OutputManager();
        outManager.setInMemoryOutput();

        System.out.print("testing");
        String buffer = outManager.getBuffer();

        outManager.reset();

        // buffer == "testing" WILL FAIL
        assertTrue(buffer.equals("testing"));
    }
}
