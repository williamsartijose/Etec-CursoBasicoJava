package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Uma lanchonete possui v�rios produtos. Cada produto possui um c�digo
// e um pre�o. Voc� deve fazer um programa para ler o c�digo e a
// quantidade comprada de um produto (suponha um c�digo v�lido), e da�
// informar qual o valor a ser pago, com duas casas decimais, conforme
// tabela de produtos ao lado.

public class Ex7lanchonete
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int codProd, qtdCompra;
        double pagar;

        System.out.println( "Codigo do produto comprado: " );
        codProd = sc.nextInt();

        System.out.println( "Quantidade comprada:" );
        qtdCompra = sc.nextInt();

        pagar = 0;
        if( codProd == 1 ) {
            pagar = qtdCompra * 5.00;
        } else if( codProd == 2 ) {
            pagar = qtdCompra * 3.50;
        } else if( codProd == 3 ) {
            pagar = qtdCompra * 4.80;
        } else if( codProd == 4 ) {
            pagar = qtdCompra * 8.90;
        } else if( codProd == 5 ) {
            pagar = qtdCompra * 7.32;
        }

        System.out.printf( "Valor a pagar: R$ %.2f\n", pagar );

        sc.close();
    }
}