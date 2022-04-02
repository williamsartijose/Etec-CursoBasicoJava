package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Para calcular o imposto de renda que uma pessoa deve pagar,
// um país aplica as seguintes regras:
// 1) Imposto sobre salário: a pessoa paga
// imposto sobre seu salário conforme
// tabela ao lado
// 2) Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de
// 15%.
// 3) Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto
// cobrado é de 20%.
// 4) A pessoa pode abater até 30% do seu imposto bruto devido com gastos
// médicos ou educacionais. Mas
// se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os
// gastos médicos e
// educacionais podem ser abatidos.
// Fazer um programa para ler quanto a pessoa obteve de renda anual com salário,
// prestação de serviço e
// ganho de capital. Leia também quando a pessoal teve de gastos médicos e
// educacionais no ano. Seu
// programa deverá então produzir um relatório de imposto de renda dessa pessoa
// conforme exemplos.
// Considere a renda mensal com salário como sendo a renda anual dividida por
// 12.

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
