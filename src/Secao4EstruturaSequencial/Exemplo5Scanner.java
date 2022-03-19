package Secao4EstruturaSequencial;
import java.util.Scanner;

public class Exemplo5Scanner
{
    // Para ler uma palavra Scanner sc = new Scanner(System.in)

    public static void main(
        String[] agrs )
    {

        final Scanner sc = new Scanner( System.in );

        String x;
        x = sc.next();
        System.out.println( "Voce digitou: " + x );
        sc.close();

    }

}
