package org.FirstMavenProj;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }

    @Test
    public void method1() {
        System.out.println("Hello it is a test1");
    }
        @Test
                public void add()
        {
            System.out.println("Hello it is test second method");
        }
    @AfterMethod
    public void AfterMethod()
    {
        System.out.println("this block if After method");
    }
    }
