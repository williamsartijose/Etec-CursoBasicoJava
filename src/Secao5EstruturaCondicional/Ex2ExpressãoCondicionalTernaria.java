package Secao5EstruturaCondicional;

import java.util.Scanner;

public class Ex2Express�oCondicionalTernaria
{

    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        // Estrutura opcional ao if-else quando se deseja
        // decidir um VALOR com base em uma condi��o.

        final double preco = 34.5;
        final double desconto = ( preco < 20.0 ) ? preco * 0.1 : preco * 0.05;

        // double preco = 34.5;
        // double desconto;
        // if (preco < 20.0) {
        // desconto = preco * 0.1;
        // }
        // else {
        // desconto = preco * 0.05;
        // }
        //
        // System.out.println( desconto );
        //
        // sc.close();
    }
}
