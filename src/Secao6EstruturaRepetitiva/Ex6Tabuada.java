package Secao6EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Ex6Tabuada
{

    public static void main(
        String[] args )
    {
        int n, produto;

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        System.out.println( "Deseja a tabuada para qual valor?" );
        n = sc.nextInt();

        for( int i = 0; i <= 10; i++ ) {
            produto = n * i;
            System.out.printf( "%d x %d = %d\n", n, i, produto );
        }

        sc.close();
    }
}