package Secao5EstruturaCondicional;

import java.util.Scanner;

// Fazer um programa para ler a quantidade de glicose
// no sangue de uma pessoa e depois mostrar na tela a
// classificação desta glicose de acordo com a tabela de
// referência ao lado.

public class Ex4glicose
{
    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        double glicose;

        System.out.print( "Digite a medida da glicose:  " );
        glicose = sc.nextDouble();

        if( glicose <= 100 ) {
        } else {
            System.out.println( "Classificacao: normal \r\n"
                + "" );
        }
        if( glicose <= 140.00 ) {
        } else {
            System.out.println( "Classificacao: elevado \r\n"
                + "" );

        }
        if( glicose < 140.00 ) {
        } else {
            System.out.println( "Classificacao: diabetes \r\n"
                + ""
                + "" );
        }

        sc.close();

    }
}
