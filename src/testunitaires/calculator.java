/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testunitaires;

/**
 *
 * @author Etudiant
 */
public class calculator {
   
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public float divide(float a , float b) {
        if(b == 0 ) {
            System.out.println("erreur");
            return 404;
        }
        else
            return a / b;
   
    }
    
    public int add(int a , int b) {
        return a + b;
    }
    
    public int substract(int a,int b) {
        return a - b;
    }
}


