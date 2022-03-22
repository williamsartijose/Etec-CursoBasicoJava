package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Para calcular o imposto de renda que uma pessoa deve pagar,
// um pa�s aplica as seguintes regras:
// 1) Imposto sobre sal�rio: a pessoa paga
// imposto sobre seu sal�rio conforme
// tabela ao lado

public class ExercicioImposto
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double salarioMensal, prestacaoServico, ganhoCapital, gastomedico;
        final double gastoEducacional;

        System.out.println( "Renda anual com sal�rio:" );
        salarioMensal = sc.nextDouble();

        System.out.println( "Renda anual com presta��o de servi�o: " );
        prestacaoServico = sc.nextDouble();

        System.out.println( "Renda anual com ganho de capital:" );
        ganhoCapital = sc.nextDouble();

        System.out.println( "Gastos m�dicos:" );
        gastomedico = sc.nextDouble();

        System.out.println( "Gastos educacionais:" );
        gastomedico = sc.nextDouble();

        sc.close();
    }

}
