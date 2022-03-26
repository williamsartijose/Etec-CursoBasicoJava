package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExerciciImposto
{

    public static void main(
        String[] args )
    {

        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double salMensal, salAnual, servAnual, capAnual, medGast, eduGast, impSal, impServ, impCap, impBruTotal, maxDedutivel,
            gastDedutivel, impostoDevido;

        System.out.println( "Renda anual com sal�rio:" );
        salAnual = sc.nextDouble();

        System.out.println( "Renda anual com presta��o de servi�o:" );
        servAnual = sc.nextDouble();

        System.out.println( "Renda anual com ganho de capital: " );
        capAnual = sc.nextDouble();

        System.out.println( "Gastos m�dicos: " );
        medGast = sc.nextDouble();

        System.out.println( "Gastos educacionais:  " );
        eduGast = sc.nextDouble();

        salMensal = salAnual / 12;

        if( salMensal <= 3000 ) {

            impSal = 0.00;

        } else if( salMensal <= 5000 ) {

            impSal = ( salAnual * 10 ) / 100;

        } else {

            impSal = ( salAnual * 20 ) / 100;

        }

        impServ = ( servAnual * 15 ) / 100;
        impCap = ( capAnual * 20 ) / 100;
        impBruTotal = impSal + impServ + impCap;
        maxDedutivel = ( impBruTotal * 30 ) / 100;
        gastDedutivel = medGast + eduGast;

        System.out.println( "RELAT�RIO DE IMPOSTO DE RENDA:" );

        System.out.printf( "Imposto sobre sal�rio: = R$ %.2f\n", impSal );
        System.out.printf( "Imposto sobre servi�os:= R$ %.2f\n", impServ );
        System.out.printf( "Imposto sobre ganho de capital:=  %.2f\n", impCap );

        System.out.println( "DEDU��ES:" );

        System.out.printf( "M�ximo dedut�vel: = R$ %.2f\n", maxDedutivel );
        System.out.printf( "Gastos dedut�veis: = R$ %.2f\n", gastDedutivel );

        System.out.println( "RESUMO:" );

        System.out.printf( "Imposto bruto total: = R$ %.2f\n", impBruTotal );

        if( maxDedutivel < gastDedutivel ) {

            impostoDevido = impBruTotal - maxDedutivel;
            System.out.println( "Abatimento: " + maxDedutivel );

            impostoDevido = impBruTotal - gastDedutivel;
            System.out.println( "Imposto devido:  " + impostoDevido );

        }

        sc.close();
    }

}
