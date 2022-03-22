package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Para calcular o imposto de renda que uma pessoa deve pagar,
// um país aplica as seguintes regras:
// 1) Imposto sobre salário: a pessoa paga
// imposto sobre seu salário conforme
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

        System.out.println( "Renda anual com salário:" );
        salarioMensal = sc.nextDouble();

        System.out.println( "Renda anual com prestação de serviço: " );
        prestacaoServico = sc.nextDouble();

        System.out.println( "Renda anual com ganho de capital:" );
        ganhoCapital = sc.nextDouble();

        System.out.println( "Gastos médicos:" );
        gastomedico = sc.nextDouble();

        System.out.println( "Gastos educacionais:" );
        gastomedico = sc.nextDouble();

        sc.close();
    }

}
