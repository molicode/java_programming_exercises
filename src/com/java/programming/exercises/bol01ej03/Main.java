/**
 * ====================================================================================================================
 * english description:
 * Ask for the radius of a circle and calculate its length.
 * <p>
 * spanish description:
 * Pedir el radio de una circunferencia y calcular su longitud.
 * <p>
 * ====================================================================================================================
 */
package com.java.programming.exercises.bol01ej03;

import com.java.programming.exercises.utils.Entry;

public class Main {

    public static void main(String[] args){
        double length,radio; // length and radius

        System.out.println("Enter the radius of a circle: ");
        radio = Entry.real();

        length = 2 * Math.PI * radio;
        System.out.println("The length of a circumference of radius: " + radio + " is " + length);
    }
}
