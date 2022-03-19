package Secao4EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia tr�s valores com
// ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
// mostre:
// a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
// b) a �rea do c�rculo de raio C. (pi = 3.14159)
// c) a �rea do trap�zio que tem A e B por bases e C por altura.
// d) a �rea do quadrado que tem lado B.
// e) a �rea do ret�ngulo que tem lados A e B.

public class Exercicios5EstruturaSequencial
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        triangulo = A * C / 2.0;
        circulo = 3.14159 * C * C;
        trapezio = ( A + B ) / 2.0 * C;
        quadrado = B * B;
        retangulo = A * B;

        System.out.printf( "TRIANGULO: %.3f%n", triangulo );
        System.out.printf( "CIRCULO: %.3f%n", circulo );
        System.out.printf( "TRAPEZIO: %.3f%n", trapezio );
        System.out.printf( "QUADRADO: %.3f%n", quadrado );
        System.out.printf( "RETANGULO: %.3f%n", retangulo );

        sc.close();
    }
}
