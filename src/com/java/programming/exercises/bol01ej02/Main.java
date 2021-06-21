/**
 * ====================================================================================================================
 * english description:
 * Ask for the radius of a circle and find:
 * 1) its area. A = PI * r ^ 2.
 * 2) circumference.
 * 3) diameter.
 * <p>
 * spanish description:
 * Pedir el radio de un círculo y calcular:
 * 1) su área. A=PI*r^2.
 * 2) La circunferencia.
 * 3) diametro.
 * <p>
 * ====================================================================================================================
 */

package com.java.programming.exercises.bol01ej02;

import com.java.programming.exercises.utils.Entry;

public class Main {

    public static void main(String[] args) {
        double area, radio, circumference, d, length; // area and radius
        double D = 2 * Math.PI;

        System.out.println("Enter the radius of a circle: ");
        radio = Entry.real();

        System.out.println("the radius is:  " + radio + " square meter");

        area = Math.PI * (Math.pow(radio, 2));
        System.out.println("The area of a circumference of radius: " + radio + " is: " + area + " meter");

        circumference = D * radio;
        System.out.println("The circumference is: " + circumference + " meter");

        d = 2 * radio;
        System.out.println("The diameter is: " + d + " meter");

        length = 2 * Math.PI * radio;
        System.out.println("The length of a circumference of radius: " + radio + " is " + length);
    }
}
