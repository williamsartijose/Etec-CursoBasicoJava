package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior
// distância que conseguir.
// Você deve criar um programa para, dadas as medidas das três tentativas de
// lançamento, informar qual
// foi a maior.
public class Ex5dardo
{

    public static void main(
        String[] args )
    {

        final double distancia1, distancia2, distancia3, maior;

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        System.out.println( " Digite as tres distancias: " );
        distancia1 = sc.nextDouble();
        distancia2 = sc.nextDouble();
        distancia3 = sc.nextDouble();

        if( distancia1 > distancia2 && distancia1 > distancia3 ) {
            maior = distancia1;
        } else if( distancia2 > distancia3 && distancia2 > distancia3 ) {
            maior = distancia2;
        } else {
            maior = distancia3;
        }

        System.out.printf( "MAIOR DISTANCIA = %.2f\n", maior );

        sc.close();
    }
}