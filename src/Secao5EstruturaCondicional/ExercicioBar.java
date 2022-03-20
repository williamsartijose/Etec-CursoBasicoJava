package Secao5EstruturaCondicional;

import java.util.Scanner;

public class ExercicioBar
{
    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        int quantidadeCerveja;
        int quantidadeRefrigerante;
        final int quantidadeespetinho;
        String sexo;
        final Double total;
        final Double cerveja = 5.00;
        final Double refrigerante = 3.00;
        final Double espetinho = 7.00;
        final Double consumo;
        final Double couvert = 4.00;
        final Double ingresso = 8.00;

        System.out.println( "Sexo: " );
        sexo = sc.next();

        System.out.println( "Quantidade de cervejas: " );
        quantidadeCerveja = sc.nextInt();

        System.out.println( "Quantidade de refrigerantes:" );
        quantidadeRefrigerante = sc.nextInt();

        System.out.println( "Quantidade de espetinhos: " );
        quantidadeespetinho = sc.nextInt();

        if( sexo.equalsIgnoreCase( "f" ) || sexo.equalsIgnoreCase( "f" ) ) {
        } else {

            if( sexo.equalsIgnoreCase( "m" ) || sexo.equalsIgnoreCase( "m" ) ) {
            } else {

            }

        }

        consumo = quantidadeCerveja * cerveja + quantidadeRefrigerante * refrigerante + quantidadeespetinho * espetinho;
        System.out.printf( "Consumo  = ", consumo );

        if( consumo >= 30.00 ) {
            System.out.println( "Insento de Couvert" );
        } else {

            System.out.printf( "Couvert = ", " R$ ", couvert );
        }

        System.out.printf( "Ingresso = ", " R$ ", ingresso );
        total = consumo + couvert + ingresso;

        System.out.printf( "Valor a pagar = ", " R$ ", total );
    }

}