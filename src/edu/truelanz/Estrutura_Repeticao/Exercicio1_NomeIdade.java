package edu.truelanz.Estrutura_Repeticao;

import java.util.Scanner;

public class Exercicio1_NomeIdade {

    /*
     * FAÇA UM PROGRAMA QUE LEIA CONJUNTOS DE DOIS VALORES, O PRIMEIRO REPRESENTANDO O NOME
     * DE UM ALUNO, E O SEGUNDO A SUA IDADE. (PARE O PROGRAMA INSERINDO O VALOR ZERO NO QUINTO NOME).
     */

     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    while(true){
        System.out.println("Nome: ");
         String nome = scan.next();
        if(nome.equals("0")) break;

        System.out.println("Idade: ");
        int idade = scan.nextInt();
    }    

    System.out.println("Continua aqui, porque o 'break' parou com a condicional 'if'.");
  }
    
}
