/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author Usuario
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("operadores aritmeticos:");
        int a=1+2;
        int b=a*4;
        int c=b / 2;
        int d=c-a;
        int e= -d;
        System.out.println("aaaaa="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("e="+e);
System.out.println("\nOperador MÃ³dulo (residuo):");
        System.out.println("x mod 10 = " + a % 2);
        System.out.println("\nOperador Compuesto:");
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\nOperador Incremento:");
       
        a++;
        System.out.println("a = " + a);

         c = ++a;
        
        d = b++;
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println("\nOperador relacional:");
        
        boolean res = a < b;
        System.out.println("res = " + res);

        System.out.println("\nOperador Ternario:");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);

        System.out.println("\nOperador de AsignaciÃ³n:");
        int i, j, k;
        
        i = j = k = 100; // valor de x, y, and z igual a 100
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
    }
    
}
