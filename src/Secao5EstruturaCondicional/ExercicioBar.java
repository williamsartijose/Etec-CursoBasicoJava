package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioBar
{
    public static void main(
        String[] agrs )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        char sexo;
        int quantidadeCerveja, quantidadeRefrigerante, quantidadeespetinho;
        final Double total;
        final Double cerveja = 5.00;
        final Double refrigerante = 3.00;
        final Double espetinho = 7.00;
        final Double consumo;
        final Double couvert = 4.00;
        final Double ingresso;

        System.out.println( "Sexo: " );
        sexo = sc.next().charAt( 0 );

        System.out.println( "Quantidade de cervejas: " );
        quantidadeCerveja = sc.nextInt();

        System.out.println( "Quantidade de refrigerantes:" );
        quantidadeRefrigerante = sc.nextInt();

        System.out.println( "Quantidade de espetinhos: " );
        quantidadeespetinho = sc.nextInt();

        if( sexo == 'F' ) {
            ingresso = 8.00;
        } else if( sexo == 'M' ) {
            ingresso = 10.00;

            {

                consumo = quantidadeCerveja * cerveja + quantidadeRefrigerante * refrigerante + quantidadeespetinho * espetinho;
                System.out.println( "RELATÓRIO: " );

                System.out.print( "Consumo = " + " R$ " + consumo );

                if( consumo >= 30.00 ) {
                } else {

                    System.out.println( "Insento de Couvert" );

                    System.out.println( "Couvert:  R$ " + couvert );
                }

            }

            System.out.println( "Ingresso = " + " R$ " + ingresso );

            total = consumo + couvert + ingresso;
            System.out.println( "Valor a pagar = " + " R$ " + total );
            sc.close();
        }
    }

}
