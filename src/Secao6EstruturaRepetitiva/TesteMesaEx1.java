package Secao6EstruturaRepetitiva;

public class TesteMesaEx1
{

    public static void main(
        String[] args )
    {

        int x = 5;
        int y = 0;
        while( x < 2 ) {

            System.out.print( x );
            y = y + x;
            x = x - 1;
        }

    }
}
