package com.company;

import java.util.Scanner;

public class Main {
    //Función de petición de número con verificación de tipo de dato.
    public static double pideCoeficiente() {
        Scanner coeficiente = new Scanner(System.in);
        while(!coeficiente.hasNextDouble()){
            System.out.println("Introduzca un número: \n");;
            coeficiente = new Scanner(System.in);
        }
        return coeficiente.nextDouble();
    }
    //Función que comprueba si la ecuación tiene soluciones reales, y llama a las funciones de cálculo.
    public static void comprobacionReales (double a, double b, double c){
        if (((b*b)-(4*a*c)>0)){
            System.out.printf("Las posibles soluciones de x son: \n  x1=%f  \n  x2=%f ", solucionValorX1(a, b, c), solucionValorX2(a,b,c));
        } else {
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
    //Funciones para calcular los valores de x.
    public static double solucionValorX1 (double a, double b, double c){
        double x1=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return x1;
    }
    public static double solucionValorX2 (double a, double b, double c){
        double x2=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return x2;
    }
    public static void main(String[] args) {
    //Pedir coeficientes de ecuación de segundo grado "ax^2+bx+c=0" y dar soluciones reales si exísten, indicando también en caso contrario.
        System.out.println("Introduzca un número para el primer coeficiente: \n");
        double coeficiente1=pideCoeficiente();
        System.out.println("Introduzca un número para el segundo coeficiente: \n");
        double coeficiente2=pideCoeficiente();
        System.out.println("Introduzca un número para el término independiente: \n");
        double terminoIndepe=pideCoeficiente();

        comprobacionReales(coeficiente1, coeficiente2, terminoIndepe);
    }
}
