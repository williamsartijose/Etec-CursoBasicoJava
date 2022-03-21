package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler dois números inteiros,
// e dizer se um número é múltiplo do outro. Os
// números podem ser digitados em qualquer ordem.

public class Ex8multiplos
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int n1, n2;
        final int multiplos;

        System.out.println( "Digite dois numeros inteiros:" );
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        if( n1 % n2 == 0 || n2 % n1 == 0 ) {
            System.out.println( "Sao multiplos" );
        }

        else {
            System.out.println( "Nao sao multiplos" );
        }
        sc.close();

    }

}
