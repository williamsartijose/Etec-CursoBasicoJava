package Secao5EstruturaCondicional;

import java.util.Scanner;

public class Exercicio2TrocoVerificado
{

    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        int qunatidade;
        double preco, dinheiro;
        final double troco;
        double resto;

        System.out.print( "Preco unitario do produto: " );
        preco = sc.nextDouble();

        System.out.print( "Quantidade comprada: " );
        qunatidade = sc.nextInt();

        System.out.print( "Dinheiro recebido: " );
        dinheiro = sc.nextDouble();

        if( preco * qunatidade > dinheiro ) {
            resto = preco * qunatidade - dinheiro;
            System.out.printf( "DINHEIRO INSUFICIENTE. FALTAM %.2f\n", resto );
        } else {
            troco = dinheiro - preco * qunatidade;
            System.out.printf( "TROCO = %.2f\n", troco );
        }

        sc.close();
    }

}
