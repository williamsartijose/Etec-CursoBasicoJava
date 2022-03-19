package Secao5EstruturaCondicional;

import java.util.Scanner;

// Fazer um programa para ler um valor inteiro de 1 a 7 representando um
// dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
// Escrever na tela o dia da semana correspondente, conforme exemplos.

public class Ex2EstruturaSwitchCase
{

    public static void main(
        String[] args )
    {

        final Scanner sc = new Scanner( System.in );

        final int x = sc.nextInt();
        String dia;

        switch( x ) {
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda-Feira";
                break;
            case 3:
                dia = "Terça-feira";
                break;
            case 4:
                dia = "Quarta-feira";
            case 5:
                dia = "Quinta-feira";
                break;
            case 6:
                dia = "Sexta-feira";
            case 7:
                dia = "Sabado";
            default:
                dia = "Valor Invalido, Favor digitar numeros de 01 há 06";
                break;

        }
        System.out.println( "Dia da semana: " + dia );
    }
}

/// Com o IF e Else
// final int x = sc.nextInt();
// String dia;
//
// if( x == 1 ) {
// dia = "domingo";
// } else if( x == 2 ) {
// dia = "segunda";
// } else if( x == 3 ) {
// dia = "terca";
// } else if( x == 4 ) {
// dia = "quarta";
// } else if( x == 5 ) {
// dia = "quinta";
// } else if( x == 6 ) {
// dia = "sexta";
// } else if( x == 7 ) {
// dia = "sabado";
// } else {
// dia = "valor invalido";
// }
// System.out.println( "Dia da semana: " + dia );
// sc.close();
// }
// }
