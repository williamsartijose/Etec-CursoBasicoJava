package Secao5EstruturaCondicional;

public class a
{

    public static void main(
        String[] args )
    {
        final int a[] = {
            1, 2, 3, 4, 5, 6, 7, 8, 9
        };
        for( final int x : a ) {
            if( x % 2 == 0 )
                continue;
            for( int i = 1; a[ i ] <= x; i += 2 )
                System.out.print( x );
            if( x > 6 )
                break;
        }
    }
}
