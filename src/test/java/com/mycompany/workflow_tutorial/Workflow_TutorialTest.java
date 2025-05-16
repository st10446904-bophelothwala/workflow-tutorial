/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.workflow_tutorial;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lab_services_student
 */
public class Workflow_TutorialTest {
    
    public Workflow_TutorialTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of Add method, of class Workflow_Tutorial.
     */
    @Test
    public void testAdd() {
        System.out.println("Add");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = Workflow_Tutorial.Add(x, y);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Subtract method, of class Workflow_Tutorial.
     */
    @Test
    public void testSubtract() {
        System.out.println("Subtract");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = Workflow_Tutorial.Subtract(x, y);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Multiply method, of class Workflow_Tutorial.
     */
    @Test
    public void testMultiply() {
        System.out.println("Multiply");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = Workflow_Tutorial.Multiply(x, y);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of Divide method, of class Workflow_Tutorial.
     */
    @Test
    public void testDivide() {
        System.out.println("Divide");
        double x = 2024.0;
        double y = 2005.0;
        double expResult =  1.0099750623441397;
        double result = Workflow_Tutorial.Divide(x, y);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of main method, of class Workflow_Tutorial.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Workflow_Tutorial.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
