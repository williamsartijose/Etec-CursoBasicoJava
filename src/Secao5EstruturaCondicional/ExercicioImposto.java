package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Para calcular o imposto de renda que uma pessoa deve pagar,
// um pa�s aplica as seguintes regras:
// 1) Imposto sobre sal�rio: a pessoa paga
// imposto sobre seu sal�rio conforme
// tabela ao lado
// 2) Se a pessoa obteve renda com presta��o de servi�os, o imposto cobrado � de
// 15%.
// 3) Se a pessoa obteve ganho de capital (im�veis, a��es, etc.), o imposto
// cobrado � de 20%.
// 4) A pessoa pode abater at� 30% do seu imposto bruto devido com gastos
// m�dicos ou educacionais. Mas
// se seus gastos m�dicos e educacionais forem abaixo desses 30%, apenas os
// gastos m�dicos e
// educacionais podem ser abatidos.
// Fazer um programa para ler quanto a pessoa obteve de renda anual com sal�rio,
// presta��o de servi�o e
// ganho de capital. Leia tamb�m quando a pessoal teve de gastos m�dicos e
// educacionais no ano. Seu
// programa dever� ent�o produzir um relat�rio de imposto de renda dessa pessoa
// conforme exemplos.
// Considere a renda mensal com sal�rio como sendo a renda anual dividida por
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
