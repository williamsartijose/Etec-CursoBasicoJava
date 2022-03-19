package Secao4EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

// Faça um programa para ler o valor do raio de um círculo,
// e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// onsidere o valor de π = 3.14159

public class Exercicios2EstruturaSequencial
{

    public static void main(
        String[] agrs )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double raio, area;
        final double Pi = 3.14159;

        raio = sc.nextDouble();

        area = Pi * raio * raio;

        System.out.printf( "A=%.4f%n", area );

        sc.close();

    }
}
