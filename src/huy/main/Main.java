/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huy.main;

import huy.util.MathUtility;

/**
 *
 * @author Shi
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("5! = " + MathUtility.getFactorial(5));
        System.out.println("0! = " + MathUtility.getFactorial(0));
        System.out.println("-5! = " + MathUtility.getFactorial(-5));
    }
}
