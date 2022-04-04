package Secao6EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

//Problema "validacao_de_nota" (adaptado de URI 1117)
//Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a 
//média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao 
//intervalo [0,10]). Cada nota deve ser validada separadamente. 

public class Ex5Validacao_de_Nota
{

    public static void main(
        String[] args )
    {
        Locale.setDefault( Locale.US );
        final Scanner sc = new Scanner (System.in);
        
        double nota1, nota2;
        final double media;
        double notafinal;
        
        System.out.println( "Digite a primeira nota:" );
        nota1 = sc.nextDouble();
        
        System.out.println( "Digite a primeira nota:" );
        nota2 = sc.nextDouble();
        
        notafinal = nota1 + nota2;
        
        System.out.printf("NOTA FINAL = %.1f\n", notafinal);
        
        if (notafinal < 60.0) {
            System.out.println("REPROVADO");
        }

        sc.close();
    }
}
        
        if ()
            
        }
            
        

    }

}
