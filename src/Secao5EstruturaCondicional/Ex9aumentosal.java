package Secao5EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

// Uma empresa vai conceder um aumento percentual de
// salário aos seus funcionários dependendo de quanto
// cada pessoa ganha, conforme tabela ao lado. Fazer um
// programa para ler o salário de uma pessoa, daí mostrar
// qual o novo salário desta pessoa depois do aumento,
// quanto foi o aumento e qual foi a porcentagem de
// aumento.

public class Ex9aumentosal
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner( System.in );

        double salPessoa, novosalario, aumento;
        int porcentagem;

        System.out.println( "Digite o salario da pessoa:" );
        salPessoa = sc.nextDouble();

        if( salPessoa <= 1000 ) {

            porcentagem = 20;
            aumento = salPessoa * porcentagem / 100;
            novosalario = salPessoa + aumento;

        } else if( salPessoa <= 3000 ) {

            porcentagem = 15;
            aumento = salPessoa * porcentagem / 100;
            novosalario = salPessoa + aumento;
        } else if( salPessoa <= 8000 ) {

            porcentagem = 10;
            aumento = salPessoa * porcentagem / 100;
            novosalario = salPessoa + aumento;
        }

        else {
            porcentagem = 5;
            aumento = salPessoa * porcentagem / 100;
            novosalario = salPessoa + aumento;
        }

        System.out.printf( "Novo salario = R$ %.2f\n", novosalario );
        System.out.printf( "Aumento = R$ %.2f\n", aumento );
        System.out.printf( "Porcentagem = %d %%\n", porcentagem );

        sc.close();
    }
}
