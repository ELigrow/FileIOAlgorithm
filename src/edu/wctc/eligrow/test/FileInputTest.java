package edu.wctc.eligrow.test;

import edu.wctc.eligrow.FileInput;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.*;

public class FileInputTest {

    FileInput good;
    FileInput bad;
    @Before
    public void setUp() throws Exception {
        good = new FileInput("test.txt");
        bad = new FileInput("asdf.txt");
    }

    @After
    public void tearDown() throws Exception {
        good.fileClose();
        bad.fileClose();
    }

    @Test
    public void fileReadLine() {
        assertNotNull("This will return a value", good.fileReadLine());
        assertNull("This will return null", bad.fileReadLine());
    }
}