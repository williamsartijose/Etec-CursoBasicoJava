package Secao4EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário,
// seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir,
// mostre o número e o salário do funcionário, com duas casas
// decimais.

public class Exercicios4EstruturaSequencial
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        int numero, HoraTrabalhada;
        double HoraValor, CalSalario;

        numero = sc.nextInt();
        HoraTrabalhada = sc.nextInt();
        CalSalario = sc.nextDouble();
        HoraValor = sc.nextDouble();

        System.out.println( "NUMBER = " + numero );
        System.out.printf( "SALARY = U$ %.2f%n", CalSalario );

        sc.close();

    }

}
