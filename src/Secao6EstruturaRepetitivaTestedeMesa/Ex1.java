package Secao6EstruturaRepetitivaTestedeMesa;

public class Ex1
{

    public static void main(
        String[] args )
    {

        final int x = 4;
        int y = x + 2;

        for( int i = 0; i < x; i++ ) {
            System.out.println( x + "  " + y );
            y = y + i;

        }

    }

}
