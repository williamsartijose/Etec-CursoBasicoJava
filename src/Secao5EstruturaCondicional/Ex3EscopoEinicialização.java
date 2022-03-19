package Secao5EstruturaCondicional;

import java.util.Scanner;

public class Ex3EscopoEinicialização
{

    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        final double price = sc.nextDouble();
        final double discount;

        if( price > 200.0 ) {
            discount = price * 0.1;
        } else {
            discount = 0;
        }
        System.out.println( discount );

        sc.close();

    }

}