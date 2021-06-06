/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notaalunos;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class NotaAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double nota1, nota2, nota3, mediaPond, opcao;
        int codigoAluno;
        mediaPond = 0; nota1 = 0; nota2 = 0; nota3 = 0; opcao = 1;
        
        while(opcao != 0){
            System.out.println("Digite o código do aluno: ");
                codigoAluno = teclado.nextInt();
            System.out.println("Digite a primeria nota:");
                nota1 = teclado.nextDouble();
            System.out.println("Digite a segunda nota:");
                nota2 = teclado.nextDouble();
            System.out.println("Digite a terceira nota:");
                nota3 = teclado.nextDouble();
                if(opcao == 1){
                    if(nota1 > nota2 && nota1 > nota3){
                    mediaPond = (nota1 * 4 + nota2 * 3 + nota3 * 3);
                    System.out.println("Código do aluno: "+codigoAluno);
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Média Ponderada: "+mediaPond);
                    System.out.println("Aprovado!!!!");
                }else if(nota2 > nota1 && nota2 > nota3){
                     mediaPond = (nota1 * 3 + nota2 * 4 + nota3 * 3);
                    System.out.println("Código do aluno: "+codigoAluno);
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Média Ponderada: "+mediaPond);
                    System.out.println("Aprovado!!!!");
                
                }else if(nota3 > nota1 && nota3 > nota2){
                     mediaPond = (nota1 * 3 + nota2 * 3 + nota3 * 4);
                    System.out.println("Código do aluno: "+codigoAluno);
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Média Ponderada: "+mediaPond);
                    System.out.println("Aprovado!!!!");
                }else if(mediaPond < 5){
                     System.out.println("Código do aluno: "+codigoAluno);
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Média Ponderada: "+mediaPond);
                    System.out.println("Reprovado.");
                }else if(opcao ==0){
                    System.out.println("Código do aluno: "+codigoAluno);
                    System.out.println("Nota 1: "+nota1);
                    System.out.println("Nota 2: "+nota2);
                    System.out.println("Nota 3: "+nota3);
                    System.out.println("Média Ponderada: "+mediaPond);
                }       
            }//fim do if.          
        }//fim do loop.
    }
    
}
