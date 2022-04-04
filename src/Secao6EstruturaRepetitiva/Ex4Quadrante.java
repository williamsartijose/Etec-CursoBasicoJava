package Secao6EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

// Problema "quadrante" (adaptado de URI 1115)
// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
// indeterminada de pontos no
// sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence
// (Q1, Q2, Q3 ou Q4). O
// algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
// (nesta situação sem
// escrever mensagem alguma).

public class Ex4Quadrante
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int x, y;

        System.out.println( "Digite os valores das coordenadas X e Y:" );
        x = sc.nextInt();
        y = sc.nextInt();

        while( x != 0 && y != 0 ) {
            if( x > 0 && y > 0 ) {
                System.out.println( "QUADRANTE Q1" );
            } else if( x < 0 && y > 0 ) {
                System.out.println( "QUADRANTE Q2" );
            }

            else if( x < 0 && y > 0 ) {
                System.out.println( "QUADRANTE Q3" );
            } else if( x < 0 && y > 0 ) {

                System.out.println( "QUADRANTE Q4" );
            }

            System.out.println( "Digite os valores das coordenadas X e Y:" );
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}