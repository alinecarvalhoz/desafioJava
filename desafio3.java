/*

Você está na feira com a sua sacola e parou em uma banca.
O feirante lhe entregou pimentões amarelos e vermelhos.
Agora iremos somar os pimetões amarelos e vermelhos para descobrir o total de pimentões na sacola.
Você receberá 2 inteiros que devem ser lidos e armazenados nas variáveis A (pimentões amarelos)
e B (pimentões vermelhos). Faça a soma de A e B atribuindo o seu resultado na 
variável X (total de pimentões).
Apresente X como descrito na mensagem de exemplo abaixo.
Não apresente outra mensagem além da mensagem especificada.

*/

import java.util.Scanner;


public class Main {
  public static void main(String[] args){
    
    Scanner leitor = new Scanner(System.in);
    
    
    int a = leitor.nextInt();
    int b = leitor.nextInt();
    int X;

  X = a + b;
  System.out.println("X = "+ X);
  
  }
}
