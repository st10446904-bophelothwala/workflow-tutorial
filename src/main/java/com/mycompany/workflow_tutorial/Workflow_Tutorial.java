/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.workflow_tutorial;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Workflow_Tutorial {
    
    public static double Add(double x, double y) {
        return x + y;
    }
    
    public static double Subtract(double x, double y) {
        return x - y;
    }
    
    public static double Multiply(double x, double y) {
        return x * y;
    }
    
    public static double Divide(double x, double y) {
        if (y == 0) {
            System.out.println("CANNOT DIVIDE BY ZERO!");
        }
        
        return x / y;
    }

    public static void main(String[] args) {
        double x = 2025;
        double y = 2005;
        double addAnswer = Add(x, y);
        double subtractAnswer = Subtract(x, y);
        double multiplyAnswer = Multiply(x, y);
        double divideAnswer = Divide(x, y);
        
        System.out.println(
                "\nAddition: " + x + " + " + y + " = " + addAnswer +
                "\nSubtraction: " + x + " - " + y + " = " + subtractAnswer +
                "\nMutiplication: " + x + " x " + y + " = " + multiplyAnswer +
                "\nDivision: " + x + " / " + y + " = " + divideAnswer
        );
    }
}
