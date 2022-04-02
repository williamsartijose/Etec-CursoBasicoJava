package Secao6EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex1Crescente
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int X;
        int Y;

        System.out.println( "Digite dois numeros: " );
        X = sc.nextInt();
        Y = sc.nextInt();

        while( X != Y ) {
            if( X > Y ) {
                System.out.println( "DECRESENTE" );

            }

            else {
                System.out.println( "CRESCENTE!" );
            }

            System.out.println( "Digite outros dois numeros:" );
            X = sc.nextInt();
            Y = sc.nextInt();
        }

        sc.close();
    }
}