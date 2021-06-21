/**
 * ====================================================================================================================
 * english description:
 * Ask for the coefficients of a 2nd degree equation, and show its real solutions.
 * If they do not exist, you must indicate it.
 * <p>
 * spanish description:
 * Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
 * ====================================================================================================================
 */

package com.java.programming.exercises.bol01ej01;

import com.java.programming.exercises.utils.Entry;

public class Main {

    public static void main(String[] args) {
        double a, b, c; // coefficients ax^2+bx+c=0
        double x1, x2, d; // solutions and determinant

        System.out.println("Enter first coefficient (a): ");
        a = Entry.real();
        System.out.println("Enter second coefficient (b): ");
        b = Entry.real();
        System.out.println("Enter third coefficient (c): ");
        c = Entry.real();

        // we calculate the determinant
        d = Math.pow(b, 2) - (4 * a * c);
        System.out.println("the value of \"d\" is: " + d);
        if (d < 0) {
            System.out.println("There are no real solutions");
        } else {
            // It remains to confirm that a is different from 0.
            // if a = 0 we find a division by zero.

            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Solution x1: " + x1);
            System.out.println("Solution x2: " + x2);
        }

    }
}
