package Secao4EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExRetangulo
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double base, altura, area;
        final double perimetro, diagonal;

        System.out.print( "Base do retangulo:" );
        base = sc.nextDouble();

        System.out.println( "Altura do retangulo:" );
        altura = sc.nextDouble();

        area = base * altura;

        System.out.printf( "AREA =  %.4f\n", area );

        perimetro = 2 * ( base + altura );// 2* base = 4.0 + altura=5.0 = 9.0 *
                                          // 2.0 = 18

        System.out.printf( "PERIMETRO = %.4f\n", perimetro );

        diagonal = Math.sqrt( base * base + altura * altura );// base = 4.0 *
                                                              // base = 4.0 =
                                                              // 16.0 + 5.0 = 21
                                                              // *
        System.out.printf( "DIAGONAL = %.4f\n", diagonal );
        sc.close();

    }

}
