/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testunitaires;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Etudiant
 */
public class calculatorTest {
    
    public calculatorTest() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of multiply method, of class calculator.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 3;
        int b = 4;
        calculator instance = new calculator();
        int expResult = 12;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of divide method, of class calculator.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        float a = 20;
        float b = 0;
        calculator instance = new calculator();
        float expResult = 404;
        float result = instance.divide(a, b);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of add method, of class calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 20;
        int b = 5;
        calculator instance = new calculator();
        int expResult = 25;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of substract method, of class calculator.
     */
    @Test
    public void testSubstract() {
        System.out.println("substract");
        int a = 20;
        int b = 5;
        calculator instance = new calculator();
        int expResult = 15;
        int result = instance.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
