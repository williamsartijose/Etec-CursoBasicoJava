package Secao4EstruturaSequencial;

import java.util.Locale;

public class ExercícioDeFixação
{

    public static void main(
        String[] args )
    {
        final String product1 = "Computer";
        final String product2 = "Office desk";

        final int age = 30;
        final int code = 5290;
        final char gender = 'F';

        final double price1 = 2100.0;
        final double price2 = 650.50;
        final double measure = 53.234567;

        System.out.println( "Products:" );
        System.out.printf( "%s, which price is $ %.2f%n", product1, price1 );
        System.out.printf( "%s, which price is $ %.2f%n", product2, price2 );
        System.out.println();
        System.out.printf( "Record: %d years old, code %d and gender: %c%n", age, code, gender );
        System.out.println();
        System.out.printf( "Measue whit eight decimal places: %.8f%n", measure );
        System.out.printf( "Measue whit eight decimal places: %.3f%n", measure );
        Locale.setDefault( Locale.US );
        System.out.printf( "US decimal point: %.3f%n", measure );

    }

}
